package com.technoabinash.models;

import java.util.HashSet;
import java.util.Set;

public class Users {
	private Long id;
	private String username;
	private String passwordHash;
	private String fullName;
	private Set<Post> posts = new HashSet<>();
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Long id, String username, String passwordHash, String fullName, Set<Post> posts) {
		super();
		this.id = id;
		this.username = username;
		this.passwordHash = passwordHash;
		this.fullName = fullName;
		this.posts = posts;
	}
	
	public Users(Long id, String username, String fullName) {
		super();
		this.id = id;
		this.username = username;
		this.fullName = fullName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

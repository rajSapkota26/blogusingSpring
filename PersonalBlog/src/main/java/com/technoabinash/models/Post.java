package com.technoabinash.models;

import java.util.Date;

public class Post {
	private Long id;
	private String title;
	private String body;
	private Users author;
	private Date date = new Date();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Users getAuthor() {
		return author;
	}
	public void setAuthor(Users author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Long id, String title, String body, Users author) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.author = author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

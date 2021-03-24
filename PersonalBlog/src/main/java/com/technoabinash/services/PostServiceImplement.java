package com.technoabinash.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.technoabinash.models.Post;
import com.technoabinash.models.Users;

@Service
public class PostServiceImplement implements PostService{
	private List<Post> posts = new ArrayList<>() {
		{
		add(new Post(1L, "Java Programming Language", "When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed that they are actually wrapped up in args array by checking the length of args using args.length",
				new Users(1L, "SP raj", "drs sapkota"))); 
		add(new Post(2L, "Introduction to Java", "When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed that they are actually wrapped up in args array by checking the length of args using args.length", 
				new Users(10L, "Raj", "Sp abinash")));
		add(new Post(3L, "Setting up the environment in Java", "When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed that they are actually wrapped up in args array by checking the length of args using args.length", 
				new Users(10L, "SP", "dr sapkota"))); 
		add(new Post(4L, "Beginning Java programming", "When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed that they are actually wrapped up in args array by checking the length of args using args.length",
				new Users(2L, "SP", " sapkota"))); 
		add(new Post(5L, "Command Line arguments in Java", "When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed that they are actually wrapped up in args array by checking the length of args using args.length",
				new Users(10L, "SP", "dr sapkota")));
		add(new Post(6L, "How JVM Works", "When command line arguments are supplied to JVM, JVM wraps these and supply to args[]. It can be confirmed that they are actually wrapped up in args array by checking the length of args using args.length",
				new Users(10L, "SP", "dr sapkota")));
		}
		};
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return this.posts;
	}

	@Override
	public List<Post> findLatest5() {
		// TODO Auto-generated method stub
		return this.posts.stream() 
				.sorted((a, b) -> b.getDate()
						.compareTo(a.getDate())) 
				.limit(5) .collect(Collectors.toList());
	}

	@Override
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return this.posts.stream() 
				.filter(p -> Objects.equals(p.getId(), id))
				.findFirst() 
				.orElse(null);
	}

	@Override
	public Post create(Post post) {
		post.setId(this.posts.stream().mapToLong( p -> p.getId()).max().getAsLong() + 1);
        this.posts.add(post);
		return post;
	}

	@Override
	public Post edit(Post post) {
		for (int i = 0; i < this.posts.size(); i++) {
			if (Objects.equals(this.posts.get(i).getId(), post.getId())) { 
				this.posts.set(i, post); 
				return post; 
				} 
			}
		throw new RuntimeException("Post not found: " + post.getId());	}

	@Override
	public void deleteById(Long id) {
		for (int i = 0; i < this.posts.size(); i++) { 
			if (Objects.equals(this.posts.get(i).getId(), id)) {
				this.posts.remove(i);
				return;
		}
		}
		throw new RuntimeException("Post not found: " + id);
		
	}

}

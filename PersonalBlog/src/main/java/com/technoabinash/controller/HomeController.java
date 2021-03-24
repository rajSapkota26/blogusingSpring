package com.technoabinash.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.technoabinash.models.Post;
import com.technoabinash.services.PostService;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;
	@RequestMapping("/")
	public String HomePage(Model model) {
		List<Post> latest5Posts = postService.findLatest5();
		
		model.addAttribute("latest5posts", latest5Posts);
		List<Post> latest3Posts = latest5Posts.stream()
		.limit(3).collect(Collectors.toList());
		model.addAttribute("latest3posts", latest3Posts);
		
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "Login";
	}
	@RequestMapping("/register")
	public String register() {
		return "Register";
	}
}

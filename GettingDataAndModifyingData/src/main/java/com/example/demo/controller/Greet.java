package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.MessagingService;

@Controller
public class Greet {
	@Autowired
	MessagingService service;
	
	@GetMapping("/")
	String home() {
		return "index";
	}
	@RequestMapping("/show")
	String show(@RequestParam("username") String name, Model model) {
		 String msg = service.greet(name);
		 model.addAttribute("msg",msg);
		 return "greeting";
	}
}

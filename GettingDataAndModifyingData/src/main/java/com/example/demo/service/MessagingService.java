package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessagingService {
	public String greet(String name) {
		return "Hello "+name+" Welcome to Our Webapp";
	}
}

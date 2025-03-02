package com.example.length.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.length.service.StringLength;

@Controller
public class LengthController {
	
	@Autowired
	StringLength service;
	@GetMapping("/")
	String home() {
		return "index";
	}
	
	@RequestMapping("/disp")
	String dispLen(@RequestParam("username") String name,Model model ) {
		String res=service.stringLength(name);
		  model.addAttribute("display",res);
		  return "display";
	}
}

package com.example.length.service;

import org.springframework.stereotype.Service;

@Service
public class StringLength {
  public String stringLength(String str) {
	  int n = str.length();
	  return"Your Name has "+n+"letters";
  }
}

package com.makemytrip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping
	public String testing()
	{
		return "Working";
	}
}

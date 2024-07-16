package com.example.gitgradespring;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
}

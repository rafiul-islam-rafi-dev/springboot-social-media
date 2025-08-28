package com.rafi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//AIP banano
@RestController
public class HomeController {

	//database theke data read korar jonno @GetMapping and "/home" holo endpoint.
	@GetMapping
	public String homeController(){
		return "this is home controller";
	}
	
	//"/home" holo endpoint.
	@GetMapping("/home")
	public String homeController2(){
		return "this is home controller 2";
	}
}
package com.atool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping( { "/", "/home" } )
public class RedirectionHandler {

	@GetMapping
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}
	
	@GetMapping(value = "/welcome")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome");
	}
	
}

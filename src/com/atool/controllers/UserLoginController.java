package com.atool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atool.utils.AESCryptography;

@Controller
@RequestMapping( "/login" )
public class UserLoginController {

	@GetMapping
	protected ModelAndView loginPage( @RequestParam( value = "error", required = false ) boolean error ) {
		ModelAndView mav = new ModelAndView("userLogin");
		mav.addObject("_cryptokey", AESCryptography.KEY);
		if (error)
			mav.addObject("serverResponse", "Login failed!");
		else
			mav.addObject("serverResponse", "");
		return mav;
	}
	
	@RequestMapping(value = "/processLogin")
	public ModelAndView processLogin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/welcome");
		return mav;
	}

}

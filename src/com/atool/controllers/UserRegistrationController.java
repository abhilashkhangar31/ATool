package com.atool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atool.config.securityconfig.DBPasswordEncryptor;
import com.atool.pojos.UserRegistration;
import com.atool.services.RegistrationService;

@Controller
@RequestMapping( "/register" )
public class UserRegistrationController {

	@Autowired private DBPasswordEncryptor pe;
	@Autowired private RegistrationService rs;

	@GetMapping(value = "/user")
	public ModelAndView userRegistrationPage() {
		return new ModelAndView("userRegistration", "registrationModel", new UserRegistration());
	}

	@PostMapping(value = "/user")
	public ModelAndView registerUser(@ModelAttribute("registrationModel") UserRegistration register) {
		register.getUserCredential()
				.setPassword(pe.encode(register.getUserCredential().getPassword()));
		rs.registerUser(register);
		return new ModelAndView("userRegistration");
	}
	
	@ResponseBody
	@GetMapping(value = "/getUserIdStatus")
	public boolean isUserIdTaken(@RequestParam String userId) {
		return rs.isUserIdTaken(userId);
	}
}

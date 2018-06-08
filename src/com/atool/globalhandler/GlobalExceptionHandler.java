package com.atool.globalhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NoHandlerFoundException.class)
	public ModelAndView handlePageNotFoundException(NoHandlerFoundException ex) {
		return new ModelAndView("error").addObject("sresponse", "Sorry, Resource Not Available");
	}

}
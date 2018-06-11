package com.atool.globalhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.atool.exceptions.ResourceNotAvailableException;

@ControllerAdvice
public class GlobalExceptionHandler {

	public static final String ERROR_PAGE = "error";
	
	@ExceptionHandler(value = NoHandlerFoundException.class)
	public ModelAndView handlePageNotFoundException(NoHandlerFoundException ex) {
		return new ModelAndView(ERROR_PAGE).addObject("sresponse", "Sorry, Resource Not Available");
	}

	@ExceptionHandler( value = ResourceNotAvailableException.class )
	public ModelAndView handleResourceNotAvailableException( ResourceNotAvailableException ex ) {
		return new ModelAndView(ERROR_PAGE).addObject("sresponse", ex.getMessage());
	}
}
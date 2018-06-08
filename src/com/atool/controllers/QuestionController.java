package com.atool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atool.exceptions.ResourceNotAvailableException;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@GetMapping(value = "/{questionType}")
	public ModelAndView questionCreationPage(@PathVariable String questionType) {
		if( QuestionType.contains(questionType) ) return new ModelAndView(questionType);
		throw new ResourceNotAvailableException("Sorry, Resource Not Available");
	}
	
	@ExceptionHandler(value = ResourceNotAvailableException.class)
	public ModelAndView handleResourceNotAvailableException(ResourceNotAvailableException ex) {
		return new ModelAndView("error").addObject("sresponse", ex.getMessage());
	}
	
	/**
	 * 
	 * @author ABHILASH
	 *
	 */
	enum QuestionType {
		
		multipleChoice, fillInTheBlanks, trueAndFalse, matchThePair;
		
		protected static boolean contains(String questionType) {
			for (QuestionType type : QuestionType.values()) {
		        if (type.name().equals(questionType)) {
		            return true;
		        }
		    }
		    return false;
		}
	}
}

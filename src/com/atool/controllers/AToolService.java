package com.atool.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.atool.models.MultipleChoice;
import com.atool.models.Question;

public interface AToolService {

	void createQuestion(@RequestBody Question question, Errors errors, @RequestHeader HttpHeaders header);

	public static <T extends Question> void validate(T object) {
		
		if (object instanceof MultipleChoice) {
			MultipleChoice multipleChoice = (MultipleChoice) object;
		} 
		else if(object instanceof MultipleChoice) {
			
		}
		else if(object instanceof MultipleChoice) {
			
		}
		else if(object instanceof MultipleChoice) {
	
		}
		
	}
}

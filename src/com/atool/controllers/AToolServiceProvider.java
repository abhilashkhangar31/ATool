package com.atool.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.atool.models.Question;
import com.atool.models.ResponseMessage;
import com.atool.utils.ResourceURI;

@RestController
@RequestMapping( "/api/service/question" )
public class AToolServiceProvider implements AToolService {

	@PostMapping(path = ResourceURI.CREATE_QUESTION, consumes = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public @ResponseBody void createQuestion(@Valid @RequestBody Question question, Errors errors, @RequestHeader HttpHeaders header) {
		if (errors.hasErrors()) {
			System.out.println(errors);
			return;
		}
		AToolService.validate(question.getMultipleChoice());
	}

	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<ResponseMessage> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
		ResponseMessage message = new ResponseMessage(HttpStatus.BAD_REQUEST, ex.getMessage(), ex.getLocalizedMessage());
		ResponseEntity<ResponseMessage> response = new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		return response;
	}
}

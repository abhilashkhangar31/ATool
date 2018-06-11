package com.atool.models;

import org.springframework.http.HttpStatus;

public class ResponseMessage {

	private HttpStatus error;

	private String message;

	private String description;

	public ResponseMessage(final HttpStatus error, final String message, final String description) {
		super();
		this.error = error;
		this.message = message;
		this.description = description;
	}

	public void createMessage(final HttpStatus error, final String message, final String description) {
		this.error = error;
		this.message = message;
		this.description = description;
	}

	public HttpStatus getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}

}

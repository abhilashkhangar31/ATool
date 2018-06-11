package com.atool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atool.exceptions.ResourceNotAvailableException;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@GetMapping(path = "/{questionType}")
	public ModelAndView questionCreationPage(@PathVariable String questionType) {
		verifyQuestionType(questionType);
		return new ModelAndView(questionType);
	}

	protected void verifyQuestionType(String questionType) {
		if (!QuestionType.contains(questionType))
			throw new ResourceNotAvailableException("Sorry, Resource Not Available");
		return;
	}

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

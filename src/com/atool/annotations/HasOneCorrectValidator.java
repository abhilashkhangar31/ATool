package com.atool.annotations;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.atool.models.Choice;

public class HasOneCorrectValidator implements ConstraintValidator<HasOneCorrect, Set<Choice>> {

	@Override
	public boolean isValid(Set<Choice> choices, ConstraintValidatorContext ctx) {
		if (choices != null && !choices.isEmpty()) {
			for (Choice choice : choices) {
				if(choice.isCorrect()) return true;
			}
		} else {
			return true;
		}
		return false;
	}
	
}

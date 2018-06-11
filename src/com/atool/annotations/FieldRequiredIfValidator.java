package com.atool.annotations;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.atool.enums.QuestionCategory;
import com.atool.models.Choice;
import com.atool.models.Question;

public class FieldRequiredIfValidator implements ConstraintValidator<FieldRequiredIf, Question> {

	@Override
	public boolean isValid(Question question, ConstraintValidatorContext ctx) {
		
		if (question.getQuestionCategory().equals(QuestionCategory.MultipleChoice)) {
			Set<Choice> choices = question.getMultipleChoice().getChoices();
			if (choices != null && !choices.isEmpty()) return true;
		} 
		else if (question.getQuestionCategory().equals(QuestionCategory.FillInTheBlanks)) {
			if (question.getFillInTheBlanks() != null) return true;
		} 
		else if (question.getQuestionCategory().equals(QuestionCategory.TrueAndFalse)) {
			if (question.getTrueAndFalse() != null) return true;
		} 
		else if (question.getQuestionCategory().equals(QuestionCategory.MatchThePair)) {
			if (question.getMatchThePair() != null) return true;
		} 
		
		return false;
	}

}

package com.atool.models;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.atool.annotations.FieldRequiredIf;
import com.atool.enums.QuestionCategory;

@FieldRequiredIf
public class Question {

	@NotNull(message = "Should define question category")
	private QuestionCategory questionCategory;

	@NotEmpty(message = "Question statement can not be empty")
	@Size(min = 5, max = 500)
	private StringBuffer questionStatement;

	@Valid
	private MetaInfo metaInfo;

	private MultipleChoice multipleChoice;

	private FillInTheBlanks fillInTheBlanks;

	private TrueAndFalse trueAndFalse;

	private MatchThePair matchThePair;

	public QuestionCategory getQuestionCategory() {
		return questionCategory;
	}

	public void setQuestionCategory(QuestionCategory questionCategory) {
		this.questionCategory = questionCategory;
	}

	public StringBuffer getQuestionStatement() {
		return questionStatement;
	}

	public void setQuestionStatement(StringBuffer questionStatement) {
		this.questionStatement = questionStatement;
	}

	public MetaInfo getMetaInfo() {
		return metaInfo;
	}

	public void setMetaInfo(MetaInfo metaInfo) {
		this.metaInfo = metaInfo;
	}

	public MultipleChoice getMultipleChoice() {
		return multipleChoice;
	}

	public void setMultipleChoice(MultipleChoice multipleChoice) {
		this.multipleChoice = multipleChoice;
	}

	public FillInTheBlanks getFillInTheBlanks() {
		return fillInTheBlanks;
	}

	public void setFillInTheBlanks(FillInTheBlanks fillInTheBlanks) {
		this.fillInTheBlanks = fillInTheBlanks;
	}

	public TrueAndFalse getTrueAndFalse() {
		return trueAndFalse;
	}

	public void setTrueAndFalse(TrueAndFalse trueAndFalse) {
		this.trueAndFalse = trueAndFalse;
	}

	public MatchThePair getMatchThePair() {
		return matchThePair;
	}

	public void setMatchThePair(MatchThePair matchThePair) {
		this.matchThePair = matchThePair;
	}

	@Override
	public String toString() {
		return "Question [questionCategory=" + questionCategory + ", questionStatement=" + questionStatement
				+ ", metaInfo=" + metaInfo + ", multipleChoice=" + multipleChoice + ", fillInTheBlanks="
				+ fillInTheBlanks + ", trueAndFalse=" + trueAndFalse + ", matchThePair=" + matchThePair + "]";
	}

}

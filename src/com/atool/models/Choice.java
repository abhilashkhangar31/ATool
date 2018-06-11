package com.atool.models;

public class Choice {

	private StringBuffer choiceStatement;
	private boolean isCorrect;

	public StringBuffer getChoiceStatement() {
		return choiceStatement;
	}

	public void setChoiceStatement(StringBuffer choiceStatement) {
		this.choiceStatement = choiceStatement;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Choice [choiceStatement=" + choiceStatement + ", isCorrect=" + isCorrect + "]";
	}

}

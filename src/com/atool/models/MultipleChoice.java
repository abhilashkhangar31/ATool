package com.atool.models;

import java.util.Set;

public class MultipleChoice extends Question {

	private Set<Choice> choices;

	public Set<Choice> getChoices() {
		return choices;
	}

	public void setChoices(Set<Choice> choices) {
		this.choices = choices;
	}

	@Override
	public String toString() {
		return "MultipleChoice [choices=" + choices + "]";
	}

}

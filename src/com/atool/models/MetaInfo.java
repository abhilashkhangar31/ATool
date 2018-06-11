package com.atool.models;

import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.atool.enums.DifficultyLevel;

public class MetaInfo {

	@NotEmpty
	@Size(min = 1, max = 10)
	private Set<@Size(min = 1, max = 20) String> tags;
	
	@NotEmpty
	private Set<DifficultyLevel> difficultyLevels;

	@Min(value = 10000)
	@Max(value = 3600000)
	@NotNull
	private long timeToSolve;

	@Size(min = 5, max = 50)
	private StringBuffer answerExplanation;

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public Set<DifficultyLevel> getDifficultyLevels() {
		return difficultyLevels;
	}

	public void setDifficultyLevels(Set<DifficultyLevel> difficultyLevels) {
		this.difficultyLevels = difficultyLevels;
	}

	public long getTimeToSolve() {
		return timeToSolve;
	}

	public void setTimeToSolve(long timeToSolve) {
		this.timeToSolve = timeToSolve;
	}

	public StringBuffer getAnswerExplanation() {
		return answerExplanation;
	}

	public void setAnswerExplanation(StringBuffer answerExplanation) {
		this.answerExplanation = answerExplanation;
	}

	@Override
	public String toString() {
		return "MetaInfo [tags=" + tags + ", difficultyLevels=" + difficultyLevels + ", timeToSolve=" + timeToSolve
				+ ", answerExplanation=" + answerExplanation + "]";
	}

}

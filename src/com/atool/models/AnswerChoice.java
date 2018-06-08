package com.atool.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="answer_choice")
public class AnswerChoice implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ac_id")
	private Long answerChoiceId;

	@Column(name="ac_label")
	private String answerChoiceLabel;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@OneToMany(mappedBy="answerChoice")
	private List<AnswerChoiceGroupMap> answerChoiceGroupMaps;

	@OneToMany(mappedBy="answerChoice")
	private List<CorrectAnswer> correctAnswers;

	@OneToMany(mappedBy="answerChoice")
	private List<QuestionAnswerChoiceMap> questionAnswerChoiceMaps;
	
	/**
	 * 
	 */
	public AnswerChoice() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param answerChoiceId
	 * @param answerChoiceLabel
	 * @param creationtime
	 * @param lastmodified
	 * @param answerChoiceGroupMaps
	 * @param correctAnswers
	 * @param questionAnswerChoiceMaps
	 */
	public AnswerChoice(Long answerChoiceId, String answerChoiceLabel, Timestamp creationtime, Timestamp lastmodified,
			List<AnswerChoiceGroupMap> answerChoiceGroupMaps, List<CorrectAnswer> correctAnswers,
			List<QuestionAnswerChoiceMap> questionAnswerChoiceMaps) {
		super();
		this.answerChoiceId = answerChoiceId;
		this.answerChoiceLabel = answerChoiceLabel;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.answerChoiceGroupMaps = answerChoiceGroupMaps;
		this.correctAnswers = correctAnswers;
		this.questionAnswerChoiceMaps = questionAnswerChoiceMaps;
	}

	public Long getAnswerChoiceId() {
		return answerChoiceId;
	}

	public void setAnswerChoiceId(Long answerChoiceId) {
		this.answerChoiceId = answerChoiceId;
	}

	public String getAnswerChoiceLabel() {
		return answerChoiceLabel;
	}

	public void setAnswerChoiceLabel(String answerChoiceLabel) {
		this.answerChoiceLabel = answerChoiceLabel;
	}

	public Timestamp getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Timestamp creationtime) {
		this.creationtime = creationtime;
	}

	public Timestamp getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}

	public List<AnswerChoiceGroupMap> getAnswerChoiceGroupMaps() {
		return answerChoiceGroupMaps;
	}

	public void setAnswerChoiceGroupMaps(List<AnswerChoiceGroupMap> answerChoiceGroupMaps) {
		this.answerChoiceGroupMaps = answerChoiceGroupMaps;
	}

	public List<CorrectAnswer> getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(List<CorrectAnswer> correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public List<QuestionAnswerChoiceMap> getQuestionAnswerChoiceMaps() {
		return questionAnswerChoiceMaps;
	}

	public void setQuestionAnswerChoiceMaps(List<QuestionAnswerChoiceMap> questionAnswerChoiceMaps) {
		this.questionAnswerChoiceMaps = questionAnswerChoiceMaps;
	}

	@Override
	public String toString() {
		return "AnswerChoice [answerChoiceId=" + answerChoiceId + ", answerChoiceLabel=" + answerChoiceLabel
				+ ", creationtime=" + creationtime + ", lastmodified=" + lastmodified + ", answerChoiceGroupMaps="
				+ answerChoiceGroupMaps + ", correctAnswers=" + correctAnswers + ", questionAnswerChoiceMaps="
				+ questionAnswerChoiceMaps + "]";
	}

}

package com.atool.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="question_answer_choice_map")
public class QuestionAnswerChoiceMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="qacm_id")
	private Long questionAnswerChoiceMapId;

	private Timestamp lastmodified;

	private Boolean status;

	@ManyToOne
	@JoinColumn(name="qacm_ac_id")
	private AnswerChoice answerChoice;

	@ManyToOne
	@JoinColumn(name="qacm_q_id")
	private Question question;
	
	/**
	 * 
	 */
	public QuestionAnswerChoiceMap() {

	}

	/**
	 * 
	 * @param questionAnswerChoiceMapId
	 * @param lastmodified
	 * @param status
	 * @param answerChoice
	 * @param question
	 */
	public QuestionAnswerChoiceMap(Long questionAnswerChoiceMapId, Timestamp lastmodified, Boolean status,
			AnswerChoice answerChoice, Question question) {
		super();
		this.questionAnswerChoiceMapId = questionAnswerChoiceMapId;
		this.lastmodified = lastmodified;
		this.status = status;
		this.answerChoice = answerChoice;
		this.question = question;
	}

	public Long getQuestionAnswerChoiceMapId() {
		return questionAnswerChoiceMapId;
	}

	public void setQuestionAnswerChoiceMapId(Long questionAnswerChoiceMapId) {
		this.questionAnswerChoiceMapId = questionAnswerChoiceMapId;
	}

	public Timestamp getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public AnswerChoice getAnswerChoice() {
		return answerChoice;
	}

	public void setAnswerChoice(AnswerChoice answerChoice) {
		this.answerChoice = answerChoice;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "QuestionAnswerChoiceMap [questionAnswerChoiceMapId=" + questionAnswerChoiceMapId + ", lastmodified="
				+ lastmodified + ", status=" + status + ", answerChoice=" + answerChoice + ", question=" + question
				+ "]";
	}

}

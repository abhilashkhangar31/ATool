package com.atool.pojos;

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
@Table(name="correct_answer")
public class CorrectAnswer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ca_id")
	private Long correctAnswerId;

	private Timestamp lastmodified;

	@ManyToOne
	@JoinColumn(name="ca_ac_id")
	private AnswerChoice answerChoice;

	@ManyToOne
	@JoinColumn(name="ca_q_id")
	private Question question;
	
	/**
	 * 
	 */
	public CorrectAnswer() {
		
	}

	/**
	 * 
	 * @param correctAnswerId
	 * @param lastmodified
	 * @param answerChoice
	 * @param question
	 */
	public CorrectAnswer(Long correctAnswerId, Timestamp lastmodified, AnswerChoice answerChoice, Question question) {
		super();
		this.correctAnswerId = correctAnswerId;
		this.lastmodified = lastmodified;
		this.answerChoice = answerChoice;
		this.question = question;
	}

	public Long getCorrectAnswerId() {
		return correctAnswerId;
	}

	public void setCorrectAnswerId(Long correctAnswerId) {
		this.correctAnswerId = correctAnswerId;
	}

	public Timestamp getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
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
		return "CorrectAnswer [correctAnswerId=" + correctAnswerId + ", lastmodified=" + lastmodified
				+ ", answerChoice=" + answerChoice + ", question=" + question + "]";
	}

}

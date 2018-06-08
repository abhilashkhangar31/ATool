package com.atool.pojos;

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
@Table(name="question_type")
public class QuestionType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="qt_id")
	private Long questionTypeId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@Column(name="qt_label")
	private String questionTypeLabel;

	@OneToMany(mappedBy="questionType")
	private List<Question> questions;
	
	/**
	 * 
	 */
	public QuestionType() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param questionTypeId
	 * @param creationtime
	 * @param lastmodified
	 * @param questionTypeLabel
	 * @param questions
	 */
	public QuestionType(Long questionTypeId, Timestamp creationtime, Timestamp lastmodified, String questionTypeLabel,
			List<Question> questions) {
		super();
		this.questionTypeId = questionTypeId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.questionTypeLabel = questionTypeLabel;
		this.questions = questions;
	}

	public Long getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(Long questionTypeId) {
		this.questionTypeId = questionTypeId;
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

	public String getQuestionTypeLabel() {
		return questionTypeLabel;
	}

	public void setQuestionTypeLabel(String questionTypeLabel) {
		this.questionTypeLabel = questionTypeLabel;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "QuestionType [questionTypeId=" + questionTypeId + ", creationtime=" + creationtime + ", lastmodified="
				+ lastmodified + ", questionTypeLabel=" + questionTypeLabel + ", questions=" + questions + "]";
	}

}

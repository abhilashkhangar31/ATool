package com.atool.pojos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

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
@Table(name = "question_tag_belongs_to_map")
public class QuestionTagBelongsToMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qtbm_id")
	private Long questionTagBelongsToMapId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@ManyToOne
	@JoinColumn(name = "qtbm_q_id")
	private Question question;

	@ManyToOne
	@JoinColumn(name = "qtbm_tb_id")
	private TagBelongsTo tagBelongsTo;
	
	/**
	 * 
	 */
	public QuestionTagBelongsToMap() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param questionTagBelongsToMapId
	 * @param creationtime
	 * @param lastmodified
	 * @param question
	 * @param tagBelongsTo
	 */
	public QuestionTagBelongsToMap(Long questionTagBelongsToMapId, Timestamp creationtime, Timestamp lastmodified,
			Question question, TagBelongsTo tagBelongsTo) {
		super();
		this.questionTagBelongsToMapId = questionTagBelongsToMapId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.question = question;
		this.tagBelongsTo = tagBelongsTo;
	}

	public Long getQuestionTagBelongsToMapId() {
		return questionTagBelongsToMapId;
	}

	public void setQuestionTagBelongsToMapId(Long questionTagBelongsToMapId) {
		this.questionTagBelongsToMapId = questionTagBelongsToMapId;
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public TagBelongsTo getTagBelongsTo() {
		return tagBelongsTo;
	}

	public void setTagBelongsTo(TagBelongsTo tagBelongsTo) {
		this.tagBelongsTo = tagBelongsTo;
	}

	@Override
	public String toString() {
		return "QuestionTagBelongsToMap [questionTagBelongsToMapId=" + questionTagBelongsToMapId + ", creationtime="
				+ creationtime + ", lastmodified=" + lastmodified + ", question=" + question + ", tagBelongsTo="
				+ tagBelongsTo + "]";
	}

}

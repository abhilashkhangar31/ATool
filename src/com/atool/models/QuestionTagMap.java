package com.atool.models;

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
@Table(name="question_tag_map")
public class QuestionTagMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="qtm_id")
	private Long questionTagMapId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@ManyToOne
	@JoinColumn(name="qtm_q_id")
	private Question question;

	@ManyToOne
	@JoinColumn(name="qtm_tag_id")
	private Tag tag;

	@ManyToOne
	@JoinColumn(name="qtm_tt_id")
	private TagType tagType;
	
	/**
	 * 
	 */
	public QuestionTagMap() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param questionTagMapId
	 * @param creationtime
	 * @param lastmodified
	 * @param question
	 * @param tag
	 * @param tagType
	 */
	public QuestionTagMap(Long questionTagMapId, Timestamp creationtime, Timestamp lastmodified, Question question,
			Tag tag, TagType tagType) {
		super();
		this.questionTagMapId = questionTagMapId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.question = question;
		this.tag = tag;
		this.tagType = tagType;
	}

	public Long getQuestionTagMapId() {
		return questionTagMapId;
	}

	public void setQuestionTagMapId(Long questionTagMapId) {
		this.questionTagMapId = questionTagMapId;
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

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public TagType getTagType() {
		return tagType;
	}

	public void setTagType(TagType tagType) {
		this.tagType = tagType;
	}

	@Override
	public String toString() {
		return "QuestionTagMap [questionTagMapId=" + questionTagMapId + ", creationtime=" + creationtime
				+ ", lastmodified=" + lastmodified + ", question=" + question + ", tag=" + tag + ", tagType=" + tagType
				+ "]";
	}

}

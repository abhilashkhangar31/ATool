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
@Table(name="answer_choice_group_map")
public class AnswerChoiceGroupMap implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="acgm_id")
	private Long answerChoiceGroupMapId;
	
	private Timestamp lastmodified;

	@ManyToOne
	@JoinColumn(name="acgm_acg_id")
	private AnswerChoiceGroup answerChoiceGroup;

	@ManyToOne
	@JoinColumn(name="acgm_ac_id")
	private AnswerChoice answerChoice;

	@ManyToOne
	@JoinColumn(name="acgm_q_id")
	private Question question;
	
	@ManyToOne
	@JoinColumn(name="acgm_mt_id")
	private MetaTag metaTag;
	
	/**
	 * 
	 */
	public AnswerChoiceGroupMap() {
		
	}

	/**
	 * 
	 * @param answerChoiceGroupMapId
	 * @param lastmodified
	 * @param answerChoiceGroup
	 * @param answerChoice
	 * @param question
	 * @param metaTag
	 */
	public AnswerChoiceGroupMap(Long answerChoiceGroupMapId, Timestamp lastmodified,
			AnswerChoiceGroup answerChoiceGroup, AnswerChoice answerChoice, Question question, MetaTag metaTag) {
		super();
		this.answerChoiceGroupMapId = answerChoiceGroupMapId;
		this.lastmodified = lastmodified;
		this.answerChoiceGroup = answerChoiceGroup;
		this.answerChoice = answerChoice;
		this.question = question;
		this.metaTag = metaTag;
	}

	public Long getAnswerChoiceGroupMapId() {
		return answerChoiceGroupMapId;
	}

	public void setAnswerChoiceGroupMapId(Long answerChoiceGroupMapId) {
		this.answerChoiceGroupMapId = answerChoiceGroupMapId;
	}

	public Timestamp getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}

	public AnswerChoiceGroup getAnswerChoiceGroup() {
		return answerChoiceGroup;
	}

	public void setAnswerChoiceGroup(AnswerChoiceGroup answerChoiceGroup) {
		this.answerChoiceGroup = answerChoiceGroup;
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

	public MetaTag getMetaTag() {
		return metaTag;
	}

	public void setMetaTag(MetaTag metaTag) {
		this.metaTag = metaTag;
	}

	@Override
	public String toString() {
		return "AnswerChoiceGroupMap [answerChoiceGroupMapId=" + answerChoiceGroupMapId + ", lastmodified="
				+ lastmodified + ", answerChoiceGroup=" + answerChoiceGroup + ", answerChoice=" + answerChoice
				+ ", question=" + question + ", metaTag=" + metaTag + "]";
	}

}

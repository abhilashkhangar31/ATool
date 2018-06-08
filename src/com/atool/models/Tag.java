package com.atool.models;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name="tag")
public class Tag implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tag_id")
	private Long tagId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	private Boolean status;

	private String tag;

	@OneToMany(mappedBy="tag")
	private List<QuestionTagMap> questionTagMaps;
	
	/**
	 * 
	 */
	public Tag() {
		
	}

	/**
	 * 
	 * @param tagId
	 * @param creationtime
	 * @param lastmodified
	 * @param status
	 * @param tag
	 * @param tagBelongsTosFirst
	 * @param tagBelongsTosSecond
	 * @param questionTagMaps
	 */
	public Tag(Long tagId, Timestamp creationtime, Timestamp lastmodified, Boolean status, String tag, List<QuestionTagMap> questionTagMaps) {
		super();
		this.tagId = tagId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.status = status;
		this.tag = tag;
		this.questionTagMaps = questionTagMaps;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<QuestionTagMap> getQuestionTagMaps() {
		return questionTagMaps;
	}

	public void setQuestionTagMaps(List<QuestionTagMap> questionTagMaps) {
		this.questionTagMaps = questionTagMaps;
	}

	@Override
	public String toString() {
		return "Tag [tagId=" + tagId + ", creationtime=" + creationtime + ", lastmodified=" + lastmodified + ", status="
				+ status + ", tag=" + tag + ", questionTagMaps=" + questionTagMaps + "]";
	}

}

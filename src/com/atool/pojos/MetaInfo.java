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
@Table(name="meta_info")
public class MetaInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mi_id")
	private Long metaInfoId;

	private Timestamp lastmodified;

	@Column(name="mi_value")
	private String metaInfoValue;

	@ManyToOne
	@JoinColumn(name="mi_mt_id")
	private MetaTag metaTag;

	@ManyToOne
	@JoinColumn(name="mi_q_id")
	private Question question;
	
	/**
	 * 
	 */
	public MetaInfo() {
		
	}

	/**
	 * 
	 * @param metaInfoId
	 * @param lastmodified
	 * @param metaInfoValue
	 * @param metaTag
	 * @param question
	 */
	public MetaInfo(Long metaInfoId, Timestamp lastmodified, String metaInfoValue, MetaTag metaTag, Question question) {
		super();
		this.metaInfoId = metaInfoId;
		this.lastmodified = lastmodified;
		this.metaInfoValue = metaInfoValue;
		this.metaTag = metaTag;
		this.question = question;
	}

	public Long getMetaInfoId() {
		return metaInfoId;
	}

	public void setMetaInfoId(Long metaInfoId) {
		this.metaInfoId = metaInfoId;
	}

	public Timestamp getLastmodified() {
		return lastmodified;
	}

	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}

	public String getMetaInfoValue() {
		return metaInfoValue;
	}

	public void setMetaInfoValue(String metaInfoValue) {
		this.metaInfoValue = metaInfoValue;
	}

	public MetaTag getMetaTag() {
		return metaTag;
	}

	public void setMetaTag(MetaTag metaTag) {
		this.metaTag = metaTag;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "MetaInfo [metaInfoId=" + metaInfoId + ", lastmodified=" + lastmodified + ", metaInfoValue="
				+ metaInfoValue + ", metaTag=" + metaTag + ", question=" + question + "]";
	}

}

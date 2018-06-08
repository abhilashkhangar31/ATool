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
@Table(name="tag_type")
public class TagType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tt_id")
	private Long tagTypeId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	private Boolean status;

	@Column(name="tt_details")
	private String tagTypeDetails;

	@Column(name="tt_name")
	private String tagTypeName;

	@OneToMany(mappedBy="tagType")
	private List<QuestionTagMap> questionTagMaps;
	
	/**
	 * 
	 */
	public TagType() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param tagTypeId
	 * @param creationtime
	 * @param lastmodified
	 * @param status
	 * @param tagTypeDetails
	 * @param tagTypeName
	 * @param questionTagMaps
	 */
	public TagType(Long tagTypeId, Timestamp creationtime, Timestamp lastmodified, Boolean status,
			String tagTypeDetails, String tagTypeName, List<QuestionTagMap> questionTagMaps) {
		super();
		this.tagTypeId = tagTypeId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.status = status;
		this.tagTypeDetails = tagTypeDetails;
		this.tagTypeName = tagTypeName;
		this.questionTagMaps = questionTagMaps;
	}

	public Long getTagTypeId() {
		return tagTypeId;
	}

	public void setTagTypeId(Long tagTypeId) {
		this.tagTypeId = tagTypeId;
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

	public String getTagTypeDetails() {
		return tagTypeDetails;
	}

	public void setTagTypeDetails(String tagTypeDetails) {
		this.tagTypeDetails = tagTypeDetails;
	}

	public String getTagTypeName() {
		return tagTypeName;
	}

	public void setTagTypeName(String tagTypeName) {
		this.tagTypeName = tagTypeName;
	}

	public List<QuestionTagMap> getQuestionTagMaps() {
		return questionTagMaps;
	}

	public void setQuestionTagMaps(List<QuestionTagMap> questionTagMaps) {
		this.questionTagMaps = questionTagMaps;
	}

	@Override
	public String toString() {
		return "TagType [tagTypeId=" + tagTypeId + ", creationtime=" + creationtime + ", lastmodified=" + lastmodified
				+ ", status=" + status + ", tagTypeDetails=" + tagTypeDetails + ", tagTypeName=" + tagTypeName
				+ ", questionTagMaps=" + questionTagMaps + "]";
	}

}

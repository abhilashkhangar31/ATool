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
@Table(name="answer_choice_group")
public class AnswerChoiceGroup implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="acg_id")
	private Long answerChoiceGroupId;

	@Column(name="acg_label")
	private String answerChoiceGroupLabel;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@OneToMany(mappedBy="answerChoiceGroup")
	private List<AnswerChoiceGroupMap> answerChoiceGroupMaps;
	
	/**
	 * 
	 */
	public AnswerChoiceGroup() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param answerChoiceGroupId
	 * @param answerChoiceGroupLabel
	 * @param creationtime
	 * @param lastmodified
	 * @param answerChoiceGroupMaps
	 */
	public AnswerChoiceGroup(Long answerChoiceGroupId, String answerChoiceGroupLabel, Timestamp creationtime,
			Timestamp lastmodified, List<AnswerChoiceGroupMap> answerChoiceGroupMaps) {
		super();
		this.answerChoiceGroupId = answerChoiceGroupId;
		this.answerChoiceGroupLabel = answerChoiceGroupLabel;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.answerChoiceGroupMaps = answerChoiceGroupMaps;
	}

	public Long getAnswerChoiceGroupId() {
		return answerChoiceGroupId;
	}

	public void setAnswerChoiceGroupId(Long answerChoiceGroupId) {
		this.answerChoiceGroupId = answerChoiceGroupId;
	}

	public String getAnswerChoiceGroupLabel() {
		return answerChoiceGroupLabel;
	}

	public void setAnswerChoiceGroupLabel(String answerChoiceGroupLabel) {
		this.answerChoiceGroupLabel = answerChoiceGroupLabel;
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

	@Override
	public String toString() {
		return "AnswerChoiceGroup [answerChoiceGroupId=" + answerChoiceGroupId + ", answerChoiceGroupLabel="
				+ answerChoiceGroupLabel + ", creationtime=" + creationtime + ", lastmodified=" + lastmodified
				+ ", answerChoiceGroupMaps=" + answerChoiceGroupMaps + "]";
	}

}

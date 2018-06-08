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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "tag_belongs_to")
public class TagBelongsTo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tb_id")
	private Long tagBelongsToId;

	private Timestamp creationtime;

	private Timestamp lastmodified;
	
	@Column(name = "is_root")
	private Boolean isRoot;

	@ManyToOne
	@JoinColumn(name = "tb_parent_id")
	private Tag parent;

	@ManyToOne
	@JoinColumn(name = "tb_child_id")
	private Tag child;

	@OneToMany(mappedBy = "tagBelongsTo")
	private List<QuestionTagBelongsToMap> questionTagBelongsToMaps;
	
	/**
	 * 
	 */
	public TagBelongsTo() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param tagBelongsToId
	 * @param creationtime
	 * @param lastmodified
	 * @param isRoot
	 * @param parent
	 * @param child
	 * @param questionTagBelongsToMaps
	 */
	public TagBelongsTo(Long tagBelongsToId, Timestamp creationtime, Timestamp lastmodified, Boolean isRoot, Tag parent,
			Tag child, List<QuestionTagBelongsToMap> questionTagBelongsToMaps) {
		super();
		this.tagBelongsToId = tagBelongsToId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.isRoot = isRoot;
		this.parent = parent;
		this.child = child;
		this.questionTagBelongsToMaps = questionTagBelongsToMaps;
	}

	public Long getTagBelongsToId() {
		return tagBelongsToId;
	}

	public void setTagBelongsToId(Long tagBelongsToId) {
		this.tagBelongsToId = tagBelongsToId;
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

	public Boolean getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

	public Tag getParent() {
		return parent;
	}

	public void setParent(Tag parent) {
		this.parent = parent;
	}

	public Tag getChild() {
		return child;
	}

	public void setChild(Tag child) {
		this.child = child;
	}

	public List<QuestionTagBelongsToMap> getQuestionTagBelongsToMaps() {
		return questionTagBelongsToMaps;
	}

	public void setQuestionTagBelongsToMaps(List<QuestionTagBelongsToMap> questionTagBelongsToMaps) {
		this.questionTagBelongsToMaps = questionTagBelongsToMaps;
	}

	@Override
	public String toString() {
		return "TagBelongsTo [tagBelongsToId=" + tagBelongsToId + ", creationtime=" + creationtime + ", lastmodified="
				+ lastmodified + ", isRoot=" + isRoot + ", parent=" + parent + ", child=" + child
				+ ", questionTagBelongsToMaps=" + questionTagBelongsToMaps + "]";
	}

}

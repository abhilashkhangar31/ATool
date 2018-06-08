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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="meta_tag")
public class MetaTag implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mt_id")
	private Long metaTagId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@Column(name="mt_description")
	private String metaTagDescription;

	@Column(name="mt_status")
	private Boolean metaTagStatus;

	@Column(name="mt_tag")
	private String metaTag;

	@OneToMany(mappedBy="metaTag")
	private List<MetaInfo> metaInfos;

	@ManyToOne
	@JoinColumn(name="mt_mty_id")
	private MetaType metaType;
	
	/**
	 * 
	 */
	public MetaTag() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param metaTagId
	 * @param creationtime
	 * @param lastmodified
	 * @param metaTagDescription
	 * @param metaTagStatus
	 * @param metaTag
	 * @param metaInfos
	 * @param metaType
	 */
	public MetaTag(Long metaTagId, Timestamp creationtime, Timestamp lastmodified, String metaTagDescription,
			Boolean metaTagStatus, String metaTag, List<MetaInfo> metaInfos, MetaType metaType) {
		super();
		this.metaTagId = metaTagId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.metaTagDescription = metaTagDescription;
		this.metaTagStatus = metaTagStatus;
		this.metaTag = metaTag;
		this.metaInfos = metaInfos;
		this.metaType = metaType;
	}

	public Long getMetaTagId() {
		return metaTagId;
	}

	public void setMetaTagId(Long metaTagId) {
		this.metaTagId = metaTagId;
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

	public String getMetaTagDescription() {
		return metaTagDescription;
	}

	public void setMetaTagDescription(String metaTagDescription) {
		this.metaTagDescription = metaTagDescription;
	}

	public Boolean getMetaTagStatus() {
		return metaTagStatus;
	}

	public void setMetaTagStatus(Boolean metaTagStatus) {
		this.metaTagStatus = metaTagStatus;
	}

	public String getMetaTag() {
		return metaTag;
	}

	public void setMetaTag(String metaTag) {
		this.metaTag = metaTag;
	}

	public List<MetaInfo> getMetaInfos() {
		return metaInfos;
	}

	public void setMetaInfos(List<MetaInfo> metaInfos) {
		this.metaInfos = metaInfos;
	}

	public MetaType getMetaType() {
		return metaType;
	}

	public void setMetaType(MetaType metaType) {
		this.metaType = metaType;
	}

	@Override
	public String toString() {
		return "MetaTag [metaTagId=" + metaTagId + ", creationtime=" + creationtime + ", lastmodified=" + lastmodified
				+ ", metaTagDescription=" + metaTagDescription + ", metaTagStatus=" + metaTagStatus + ", metaTag="
				+ metaTag + ", metaInfos=" + metaInfos + ", metaType=" + metaType + "]";
	}

}

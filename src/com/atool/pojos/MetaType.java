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
@Table(name="meta_type")
public class MetaType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mty_id")
	private Long metaTypeId;

	private Timestamp creationtime;

	private Timestamp lastmodified;

	@Column(name="mty_details")
	private String metaTypeDetails;

	@Column(name="mty_status")
	private Boolean metaTypeStatus;

	@Column(name="mty_title")
	private String metaTypeTitle;

	@OneToMany(mappedBy="metaType")
	private List<MetaTag> metaTags;
	
	/**
	 * 
	 */
	public MetaType() {
		this.creationtime = new Timestamp(new Date().getTime());
	}

	/**
	 * 
	 * @param metaTypeId
	 * @param creationtime
	 * @param lastmodified
	 * @param metaTypeDetails
	 * @param metaTypeStatus
	 * @param metaTypeTitle
	 * @param metaTags
	 */
	public MetaType(Long metaTypeId, Timestamp creationtime, Timestamp lastmodified, String metaTypeDetails,
			Boolean metaTypeStatus, String metaTypeTitle, List<MetaTag> metaTags) {
		super();
		this.metaTypeId = metaTypeId;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
		this.metaTypeDetails = metaTypeDetails;
		this.metaTypeStatus = metaTypeStatus;
		this.metaTypeTitle = metaTypeTitle;
		this.metaTags = metaTags;
	}

	public Long getMetaTypeId() {
		return metaTypeId;
	}

	public void setMetaTypeId(Long metaTypeId) {
		this.metaTypeId = metaTypeId;
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

	public String getMetaTypeDetails() {
		return metaTypeDetails;
	}

	public void setMetaTypeDetails(String metaTypeDetails) {
		this.metaTypeDetails = metaTypeDetails;
	}

	public Boolean getMetaTypeStatus() {
		return metaTypeStatus;
	}

	public void setMetaTypeStatus(Boolean metaTypeStatus) {
		this.metaTypeStatus = metaTypeStatus;
	}

	public String getMetaTypeTitle() {
		return metaTypeTitle;
	}

	public void setMetaTypeTitle(String metaTypeTitle) {
		this.metaTypeTitle = metaTypeTitle;
	}

	public List<MetaTag> getMetaTags() {
		return metaTags;
	}

	public void setMetaTags(List<MetaTag> metaTags) {
		this.metaTags = metaTags;
	}

	@Override
	public String toString() {
		return "MetaType [metaTypeId=" + metaTypeId + ", creationtime=" + creationtime + ", lastmodified="
				+ lastmodified + ", metaTypeDetails=" + metaTypeDetails + ", metaTypeStatus=" + metaTypeStatus
				+ ", metaTypeTitle=" + metaTypeTitle + ", metaTags=" + metaTags + "]";
	}

}

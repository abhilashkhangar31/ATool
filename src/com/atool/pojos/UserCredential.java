package com.atool.pojos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user_credential")
public class UserCredential implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uc_id")
	private Long credentialId;
	
	@Column(name = "ur_user_id", unique = false)
	private String userId;
	
	@Column(name = "ur_password")
	private String password;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private UserRegistration userRegistration;
	
	private Timestamp creationtime;
	private Timestamp lastmodified;
	
	public UserCredential() {
		this.creationtime = new Timestamp(new Date().getTime());
		this.lastmodified = new Timestamp(new Date().getTime());
	}

	public UserCredential(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}
	
	public UserCredential(Long credentialId, String userId, String password, UserRegistration userRegistration,
			Timestamp creationtime, Timestamp lastmodified) {
		super();
		this.credentialId = credentialId;
		this.userId = userId;
		this.password = password;
		this.userRegistration = userRegistration;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
	}

	public Long getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(Long credentialId) {
		this.credentialId = credentialId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
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

	@Override
	public String toString() {
		return "UserCredential [credentialId=" + credentialId + ", userId=" + userId + ", password=" + password
				+ ", userRegistration=" + userRegistration + ", creationtime=" + creationtime + ", lastmodified="
				+ lastmodified + "]";
	}

}

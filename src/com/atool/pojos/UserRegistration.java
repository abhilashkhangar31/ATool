package com.atool.pojos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user_registration")
public class UserRegistration implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ur_id")
	private Long registrationId;
	
	@Column(name = "ur_first_name")
	private String firstName;
	
	@Column(name = "ur_last_name")
	private String lastName;
	
	@OneToOne(mappedBy = "userRegistration", cascade = CascadeType.PERSIST)
	private UserCredential userCredential;
	
	private Timestamp creationtime;
	private Timestamp lastmodified;
	
	public UserRegistration() {
		this.creationtime = new Timestamp(new Date().getTime());
		this.lastmodified = new Timestamp(new Date().getTime());
	}

	public UserRegistration(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}
	
	public UserRegistration(Long registrationId, String firstName, String lastName, UserCredential userCredential,
			Timestamp creationtime, Timestamp lastmodified) {
		super();
		this.registrationId = registrationId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userCredential = userCredential;
		this.creationtime = creationtime;
		this.lastmodified = lastmodified;
	}

	public Long getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(Long registrationId) {
		this.registrationId = registrationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserCredential getUserCredential() {
		return userCredential;
	}

	public void setUserCredential(UserCredential userCredential) {
		this.userCredential = userCredential;
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
		return "UserRegistration [registrationId=" + registrationId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", userCredential=" + userCredential + ", creationtime=" + creationtime + ", lastmodified="
				+ lastmodified + "]";
	}

}

package com.assimilate.matrimony.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int feedback_id;
	
	@Column(name="name")
	String name;
	
	@Column(name="address")
	String address;
	
	@Column(name="email")
	String email;
	
	@Column(name="suggestion")
	String suggestion;
	
	@Column(name="created_At")
	Date created_At;
	
	@Column(name="created_By")
	String created_By;
	
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name= "user_id")
	private User user;
	
	public Feedback() {}

	public Feedback(int feedback_id, String name, String address, String email, String suggestion, Date created_At,
			String created_By, User user) {
		super();
		this.feedback_id = feedback_id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.suggestion = suggestion;
		this.created_At = created_At;
		this.created_By = created_By;
		this.user = user;
	}

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public String getCreated_By() {
		return created_By;
	}

	public void setCreated_By(String created_By) {
		this.created_By = created_By;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Feedback [feedback_id=" + feedback_id + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", suggestion=" + suggestion + ", created_At=" + created_At + ", created_By=" + created_By + ", user="
				+ user + "]";
	}

	
	

}


package com.assimilate.matrimony.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"createdAt"},allowGetters=true)
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  user_id;
	

	@Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date Updated_At;

	
	@Column(name="Updated_By")
	private String Updated_By;


	@Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date created_At;
	
	@Column(name="created_By")
	private String created_By;
	
	@Column(name="email")
	private String email;

	@Column(name="gender")
	private String gender;
	
	@Column(name="isAuthorized")
	private int isAuthorized;
	

	@Column(name="isDelete")
	private int isDelete;
	

	@Column(name="isEnabled")
	private int isEnabled;

	
	@Column(name="mobile")
	private String mobile;
	

	@Column(name="password")
	private String password;
	
	@Column(name="username")
	private String username;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, Date updated_At, String updated_By, Date created_At, String created_By, String email,
			String gender, int isAuthorized, int isDelete, int isEnabled, String mobile, String password,
			String username) {
		super();
		this.user_id = user_id;
		Updated_At = updated_At;
		Updated_By = updated_By;
		this.created_At = created_At;
		this.created_By = created_By;
		this.email = email;
		this.gender = gender;
		this.isAuthorized = isAuthorized;
		this.isDelete = isDelete;
		this.isEnabled = isEnabled;
		this.mobile = mobile;
		this.password = password;
		this.username = username;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Date getUpdated_At() {
		return Updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		Updated_At = updated_At;
	}

	public String getUpdated_By() {
		return Updated_By;
	}

	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getIsAuthorized() {
		return isAuthorized;
	}

	public void setIsAuthorized(int isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	public int getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", Updated_At=" + Updated_At + ", Updated_By=" + Updated_By
				+ ", created_At=" + created_At + ", created_By=" + created_By + ", email=" + email + ", gender="
				+ gender + ", isAuthorized=" + isAuthorized + ", isDelete=" + isDelete + ", isEnabled=" + isEnabled
				+ ", mobile=" + mobile + ", password=" + password + ", username=" + username + "]";
	}

	
	}





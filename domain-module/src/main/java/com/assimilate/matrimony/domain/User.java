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
@Table(name="user")
public class User {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int user_id;
	
	@Column(name="username")
	String username;
	
	
	@Column(name="email")
	String Email;
	
	@Column(name="password")
	String password;
	
	
	@Column(name="mobile")
	String mobile;
	
	@Column(name="gender")
	String gender;
	
	@Column(name="isDelete")
	int isDelete;
	
	@Column(name="isAuthorized")
	int isAuthorised;
	
	@Column(name="isEnabled")
	int isEnable;
	
	@Column(name="created_At")
	Date created_At;
	
	@Column(name="created_By")
	String created_By;
	
	@Column(name="updated_At")
	Date updated_At;
	
	@Column(name="updated_By")
	String updated_By;
	
    public User() {}

	public User(int user_id, String username, String email, String password, String mobile, String gender,
			int isDelete, int isAuthorised, int isEnable, Date created_At, String created_By, Date updated_At,
			String updated_By) {
		super();
		this.user_id = user_id;
		this.username = username;
		Email = email;
		this.password = password;
		this.mobile = mobile;
		this.gender = gender;
		this.isDelete = isDelete;
		this.isAuthorised = isAuthorised;
		this.isEnable = isEnable;
		this.created_At = created_At;
		this.created_By = created_By;
		this.updated_At = updated_At;
		this.updated_By = updated_By;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}

	public int getIsAuthorised() {
		return isAuthorised;
	}

	public void setIsAuthorised(int isAuthorised) {
		this.isAuthorised = isAuthorised;
	}

	public int getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
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

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	public String getUpdated_By() {
		return updated_By;
	}

	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", Email=" + Email + ", password=" + password
				+ ", mobile=" + mobile + ", gender=" + gender + ", isDelete=" + isDelete + ", isAuthorised="
				+ isAuthorised + ", isEnable=" + isEnable + ", created_At=" + created_At + ", created_By=" + created_By
				+ ", updated_At=" + updated_At + ", updated_By=" + updated_By + "]";
	}

}







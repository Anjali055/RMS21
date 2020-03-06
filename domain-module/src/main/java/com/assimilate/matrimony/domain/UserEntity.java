package com.assimilate.matrimony.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class UserEntity {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int user_id;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private int mobile;
	@Column
	private String gender;
	@Column
	private int isDelete;
	@Column
	private int isAuthorized;
	@Column
	private int isEnabled;
	@Column
	private Date created_At;
	@Column
	private String created_By;
	@Column
	private Date Updated_At;
	@Column
	private String Updated_By;
	
	public  UserEntity() {
		
	}
	public UserEntity(int user_id, String username, String email, String password, int mobile, String gender, int isDelete,
			int isAuthorized, int isEnabled, Date created_At, String created_By, Date updated_At, String updated_By) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.gender = gender;
		this.isDelete = isDelete;
		this.isAuthorized = isAuthorized;
		this.isEnabled = isEnabled;
		this.created_At = created_At;
		this.created_By = created_By;
		Updated_At = updated_At;
		Updated_By = updated_By;
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
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
	public int getIsAuthorized() {
		return isAuthorized;
	}
	public void setIsAuthorized(int isAuthorized) {
		this.isAuthorized = isAuthorized;
	}
	public int getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
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
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", gender=" + gender + ", isDelete=" + isDelete + ", isAuthorized="
				+ isAuthorized + ", isEnabled=" + isEnabled + ", created_At=" + created_At + ", created_By="
				+ created_By + ", Updated_At=" + Updated_At + ", Updated_By=" + Updated_By + "]";
	}
	

}

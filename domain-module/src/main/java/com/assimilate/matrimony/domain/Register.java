package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;
@Configuration
@Entity
@Table(name="register")

public class Register {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@Column()
	private String username;
	
	@Column()
	private String email;
	
	@Column()
	private String password;
	
	@Column()
	private String mobile;
	
	@Column()
	private String create_profile_by;
	
	@Column()
	private String gender;
	
	@Column()
	private String date_of_birth;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCreate_profile_by() {
		return create_profile_by;
	}
	public void setCreate_profile_by(String create_profile_by) {
		this.create_profile_by = create_profile_by;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Register( String username, String email, String password, String mobile, String create_profile_by,
			String gender, String date_of_birth) {
		super();
		
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.create_profile_by = create_profile_by;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
	}
	public Register() {
		
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", create_profile_by=" + create_profile_by + ", gender=" + gender
				+ ", date_of_birth=" + date_of_birth + "]";
	}
	
}

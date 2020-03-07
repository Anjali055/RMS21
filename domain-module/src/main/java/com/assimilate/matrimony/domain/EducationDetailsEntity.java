package com.assimilate.matrimony.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="education_details")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"createdAt"},allowGetters=true)
public class EducationDetailsEntity {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer education_details_id;
	@Column
	private String about_my_education;
	@Column
	private String highest_education;
	@Column
	private String graduation_college;
	@Column
	private String school_name;
	
	@Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
    private Date created_At;

    @Column  
    private String created_By;
   
    @Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
    private Date Updated_At;
    @Column
    private String Updated_By;

    @OneToOne
    @JoinColumn(name="user_id")
    private UserEntity user;
    
    @OneToOne
    @JoinColumn(name="bacholer_degree_id")
    private BacholerDegreeEntity bacholerDegree;
    
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public BacholerDegreeEntity getBacholerDegree() {
		return bacholerDegree;
	}
	public void setBacholerDegree(BacholerDegreeEntity bacholerDegree) {
		this.bacholerDegree = bacholerDegree;
	}
	public EducationDetailsEntity(UserEntity user, BacholerDegreeEntity bacholerDegree) {
		super();
		this.user = user;
		this.bacholerDegree = bacholerDegree;
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
	public EducationDetailsEntity(Date created_At, String created_By, Date updated_At, String updated_By) {
		super();
		this.created_At = created_At;
		this.created_By = created_By;
		Updated_At = updated_At;
		Updated_By = updated_By;
	}
	@Override
	public String toString() {
		return "EducationDetails [user=" + user + ", bacholerDegree=" + bacholerDegree + "]";
	}
	public EducationDetailsEntity() {
		super();
	}
	public EducationDetailsEntity(Integer education_details_id, String about_my_education, String highest_education,
			 String graduation_college, String school_name) {
		super();
		this.education_details_id = education_details_id;
		this.about_my_education = about_my_education;
		this.highest_education = highest_education;
		this.graduation_college = graduation_college;
		this.school_name = school_name;
	}
	public Integer getEducation_details_id() {
		return education_details_id;
	}
	public void setEducation_details_id(Integer education_details_id) {
		this.education_details_id = education_details_id;
	}
	public String getAbout_my_education() {
		return about_my_education;
	}
	public void setAbout_my_education(String about_my_education) {
		this.about_my_education = about_my_education;
	}
	public String getHighest_education() {
		return highest_education;
	}
	public void setHighest_education(String highest_education) {
		this.highest_education = highest_education;
	}
	
	public String getGraduation_college() {
		return graduation_college;
	}
	public void setGraduation_college(String graduation_college) {
		this.graduation_college = graduation_college;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public void setUserEntity(UserEntity user2) {
		// TODO Auto-generated method stub
		
	}
	
}

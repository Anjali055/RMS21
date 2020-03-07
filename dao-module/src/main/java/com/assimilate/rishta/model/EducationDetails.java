package com.assimilate.rishta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="education_details")
public class EducationDetails {
	@Id
	private Integer education_details_id;
	@Column
	private String about_my_education;
	@Column
	private String highest_education;
	@Column
	private String graduation_degree;
	@Column
	private String graduation_college;
	@Column
	private String school_name;
	@Override
	public String toString() {
		return "EducationDetails [education_details_id=" + education_details_id + ", about_my_education="
				+ about_my_education + ", highest_education=" + highest_education + ", graduation_degree="
				+ graduation_degree + ", graduation_college=" + graduation_college + ", school_name=" + school_name
				+ "]";
	}
	public EducationDetails() {
		super();
	}
	public EducationDetails(Integer education_details_id, String about_my_education, String highest_education,
			String graduation_degree, String graduation_college, String school_name) {
		super();
		this.education_details_id = education_details_id;
		this.about_my_education = about_my_education;
		this.highest_education = highest_education;
		this.graduation_degree = graduation_degree;
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
	public String getGraduation_degree() {
		return graduation_degree;
	}
	public void setGraduation_degree(String graduation_degree) {
		this.graduation_degree = graduation_degree;
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
	
}

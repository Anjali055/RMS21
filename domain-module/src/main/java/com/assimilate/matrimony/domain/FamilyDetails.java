package com.assimilate.matrimony.domain;


import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="familydetails")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"created_At"},allowGetters = true)

public class FamilyDetails  {
	

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="family_id")
	private int family_id;
	
	@Column(name="family_type")
	private String family_type;
	
	@Column(name="fathers_occupation")
	private String fathers_occupation;
	
	@Column(name="mothers_occupation")
	private String mothers_occupation;
	
	@Column(name="brothers")
	private String brothers;
	
	@Column(name="married_brothers")
	private String married_brothers;
	
	
	@Column(name="sisters")
	private String sisters;
	
	@Column(name="married_sisters")
	private String married_sisters;
	
	@OneToOne()
	@JoinColumn(name="country_id")
	private Country country;
	
	@OneToOne()
	@JoinColumn(name="state_id")
	private State state;
	
	@OneToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@Column(name="contact_address")
	private String contact_address;
	
	@Column(name="about_family")
	private String about_family;
	
	@Column(name="created_At")
	@Temporal(TIMESTAMP)
	@CreatedDate
	private Date  created_At;
	
	@Column(name="created_By")
	private String created_By;
	
	@Column(name="updated_At")
	@Temporal(TIMESTAMP)
	@LastModifiedDate
	private Date updated_At;
	
	@Column(name="updated_By")
	private String updated_By;
	
	@OneToOne()
	@JoinColumn(name="user_id")
	private UserDetails user;
	
	
	
	FamilyDetails(){
		
	}



	public FamilyDetails(int family_id, String family_type, String fathers_occupation, String mothers_occupation,
			String brothers, String married_brothers, String sisters, String married_sisters, Country country,
			State state, City city, String contact_address, String about_family, Date created_At, String created_By,
			Date updated_At, String updated_By, UserDetails user) {
		super();
		this.family_id = family_id;
		this.family_type = family_type;
		this.fathers_occupation = fathers_occupation;
		this.mothers_occupation = mothers_occupation;
		this.brothers = brothers;
		this.married_brothers = married_brothers;
		this.sisters = sisters;
		this.married_sisters = married_sisters;
		this.country = country;
		this.state = state;
		this.city = city;
		this.contact_address = contact_address;
		this.about_family = about_family;
		this.created_At = created_At;
		this.created_By = created_By;
		this.updated_At = updated_At;
		this.updated_By = updated_By;
		this.user = user;
	}



	public int getFamily_id() {
		return family_id;
	}



	public void setFamily_id(int family_id) {
		this.family_id = family_id;
	}



	public String getFamily_type() {
		return family_type;
	}



	public void setFamily_type(String family_type) {
		this.family_type = family_type;
	}



	public String getFathers_occupation() {
		return fathers_occupation;
	}



	public void setFathers_occupation(String fathers_occupation) {
		this.fathers_occupation = fathers_occupation;
	}



	public String getMothers_occupation() {
		return mothers_occupation;
	}



	public void setMothers_occupation(String mothers_occupation) {
		this.mothers_occupation = mothers_occupation;
	}



	public String getBrothers() {
		return brothers;
	}



	public void setBrothers(String brothers) {
		this.brothers = brothers;
	}



	public String getMarried_brothers() {
		return married_brothers;
	}



	public void setMarried_brothers(String married_brothers) {
		this.married_brothers = married_brothers;
	}



	public String getSisters() {
		return sisters;
	}



	public void setSisters(String sisters) {
		this.sisters = sisters;
	}



	public String getMarried_sisters() {
		return married_sisters;
	}



	public void setMarried_sisters(String married_sisters) {
		this.married_sisters = married_sisters;
	}



	public Country getCountry() {
		return country;
	}



	public void setCountry(Country country) {
		this.country = country;
	}



	public State getState() {
		return state;
	}



	public void setState(State state) {
		this.state = state;
	}



	public City getCity() {
		return city;
	}



	public void setCity(City city) {
		this.city = city;
	}



	public String getContact_address() {
		return contact_address;
	}



	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}



	public String getAbout_family() {
		return about_family;
	}



	public void setAbout_family(String about_family) {
		this.about_family = about_family;
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



	public UserDetails getUser() {
		return user;
	}



	public void setUser(UserDetails user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "FamilyDetails [family_id=" + family_id + ", family_type=" + family_type + ", fathers_occupation="
				+ fathers_occupation + ", mothers_occupation=" + mothers_occupation + ", brothers=" + brothers
				+ ", married_brothers=" + married_brothers + ", sisters=" + sisters + ", married_sisters="
				+ married_sisters + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", contact_address=" + contact_address + ", about_family=" + about_family + ", created_At="
				+ created_At + ", created_By=" + created_By + ", updated_At=" + updated_At + ", updated_By="
				+ updated_By + ", user=" + user + "]";
	}
	
	
	
	



	

	
	
//--------------------------------------------------------------------


	
	


	



}

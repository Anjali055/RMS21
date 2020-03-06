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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = { "created_At", "Updated_At" }, allowGetters = true)
@JsonIgnoreType
@Entity
@Table(name = "desireform")
public class Desireform {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int desire_form_id;
	
	@Column()
	private String from_age;
	
	@Column()
	private String to_age;
	
	@Column()
	private String from_height;
	
	@Column()
	private String to_height; 
	
	@Column()
	private String from_weight;
	
	@Column()
	private String to_weight;
	
	@Column()
	private String spectacles;
	
	@Column()
	private String nri;
	
	@Column()
	private String annual_income;
	
	@Column()
	private String smoking;
	
	@Column()
	private String drinking;
	
	@Column()
	private Date created_At;
	
	@Column()
	private String created_By; 
	
	@Column()
	private String physical_disability;
	
	@Column()
	private String education;
	@Column()
	private Date updated_At;
	
	@Column()
	private String updated_By;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "manglik_id")
	private Manglik manglik;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "mothertongue_id")
	private Mothertongue mothertongue;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "blood_group_id")
	private Blood_group blood_group;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "eating_habits_id")
	private Eating_habits eating_habits;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "body_type_id")
	private Body_type body_type;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "complexion_id")
	private Complexion  complexion;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "religion_id")
	private Religion religion;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "caste_id")
	private Caste caste;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "subcaste_id")
	private Subcaste subcaste;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "horoscope_id")
	private Horoscope horoscope;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "occupation_id")
	private Occupation occupation;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "marital_status_id")
	private Marital_status marital_status;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	
	private UserEntity user;
	public Desireform() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Desireform(int desire_form_id, String from_age, String to_age, String from_height, String to_height,
			String from_weight, String to_weight, String spectacles, String nri, String annual_income, String smoking,
			String drinking, Date created_At, String created_By, String physical_disability, String education,
			Date updated_At, String updated_By, Manglik manglik, Mothertongue mothertongue, Blood_group blood_group,
			Eating_habits eating_habits, Body_type body_type, Complexion complexion, Religion religion, Caste caste,
			Subcaste subcaste, Horoscope horoscope, Occupation occupation, Marital_status marital_status,
			UserEntity user) {
		super();
		this.desire_form_id = desire_form_id;
		this.from_age = from_age;
		this.to_age = to_age;
		this.from_height = from_height;
		this.to_height = to_height;
		this.from_weight = from_weight;
		this.to_weight = to_weight;
		this.spectacles = spectacles;
		this.nri = nri;
		this.annual_income = annual_income;
		this.smoking = smoking;
		this.drinking = drinking;
		this.created_At = created_At;
		this.created_By = created_By;
		this.physical_disability = physical_disability;
		this.education = education;
		this.updated_At = updated_At;
		this.updated_By = updated_By;
		this.manglik = manglik;
		this.mothertongue = mothertongue;
		this.blood_group = blood_group;
		this.eating_habits = eating_habits;
		this.body_type = body_type;
		this.complexion = complexion;
		this.religion = religion;
		this.caste = caste;
		this.subcaste = subcaste;
		this.horoscope = horoscope;
		this.occupation = occupation;
		this.marital_status = marital_status;
		this.user = user;
	}
	public int getDesire_form_id() {
		return desire_form_id;
	}
	public void setDesire_form_id(int desire_form_id) {
		this.desire_form_id = desire_form_id;
	}
	public String getFrom_age() {
		return from_age;
	}
	public void setFrom_age(String from_age) {
		this.from_age = from_age;
	}
	public String getTo_age() {
		return to_age;
	}
	public void setTo_age(String to_age) {
		this.to_age = to_age;
	}
	public String getFrom_height() {
		return from_height;
	}
	public void setFrom_height(String from_height) {
		this.from_height = from_height;
	}
	public String getTo_height() {
		return to_height;
	}
	public void setTo_height(String to_height) {
		this.to_height = to_height;
	}
	public String getFrom_weight() {
		return from_weight;
	}
	public void setFrom_weight(String from_weight) {
		this.from_weight = from_weight;
	}
	public String getTo_weight() {
		return to_weight;
	}
	public void setTo_weight(String to_weight) {
		this.to_weight = to_weight;
	}
	public String getSpectacles() {
		return spectacles;
	}
	public void setSpectacles(String spectacles) {
		this.spectacles = spectacles;
	}
	public String getNri() {
		return nri;
	}
	public void setNri(String nri) {
		this.nri = nri;
	}
	public String getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(String annual_income) {
		this.annual_income = annual_income;
	}
	public String getSmoking() {
		return smoking;
	}
	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}
	public String getDrinking() {
		return drinking;
	}
	public void setDrinking(String drinking) {
		this.drinking = drinking;
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
	public String getPhysical_disability() {
		return physical_disability;
	}
	public void setPhysical_disability(String physical_disability) {
		this.physical_disability = physical_disability;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
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
	public Manglik getManglik() {
		return manglik;
	}
	public void setManglik(Manglik manglik) {
		this.manglik = manglik;
	}
	public Mothertongue getMothertongue() {
		return mothertongue;
	}
	public void setMothertongue(Mothertongue mothertongue) {
		this.mothertongue = mothertongue;
	}
	public Blood_group getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(Blood_group blood_group) {
		this.blood_group = blood_group;
	}
	public Eating_habits getEating_habits() {
		return eating_habits;
	}
	public void setEating_habits(Eating_habits eating_habits) {
		this.eating_habits = eating_habits;
	}
	public Body_type getBody_type() {
		return body_type;
	}
	public void setBody_type(Body_type body_type) {
		this.body_type = body_type;
	}
	public Complexion getComplexion() {
		return complexion;
	}
	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}
	public Religion getReligion() {
		return religion;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	public Caste getCaste() {
		return caste;
	}
	public void setCaste(Caste caste) {
		this.caste = caste;
	}
	public Subcaste getSubcaste() {
		return subcaste;
	}
	public void setSubcaste(Subcaste subcaste) {
		this.subcaste = subcaste;
	}
	public Horoscope getHoroscope() {
		return horoscope;
	}
	public void setHoroscope(Horoscope horoscope) {
		this.horoscope = horoscope;
	}
	public Occupation getOccupation() {
		return occupation;
	}
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	public Marital_status getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(Marital_status marital_status) {
		this.marital_status = marital_status;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Desireform [desire_form_id=" + desire_form_id + ", from_age=" + from_age + ", to_age=" + to_age
				+ ", from_height=" + from_height + ", to_height=" + to_height + ", from_weight=" + from_weight
				+ ", to_weight=" + to_weight + ", spectacles=" + spectacles + ", nri=" + nri + ", annual_income="
				+ annual_income + ", smoking=" + smoking + ", drinking=" + drinking + ", created_At=" + created_At
				+ ", created_By=" + created_By + ", physical_disability=" + physical_disability + ", education="
				+ education + ", updated_At=" + updated_At + ", updated_By=" + updated_By + ", manglik=" + manglik
				+ ", mothertongue=" + mothertongue + ", blood_group=" + blood_group + ", eating_habits=" + eating_habits
				+ ", body_type=" + body_type + ", complexion=" + complexion + ", religion=" + religion + ", caste="
				+ caste + ", subcaste=" + subcaste + ", horoscope=" + horoscope + ", occupation=" + occupation
				+ ", marital_status=" + marital_status + ", user=" + user + "]";
	}
	
	
	
}

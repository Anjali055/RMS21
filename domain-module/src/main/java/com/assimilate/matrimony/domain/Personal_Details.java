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

@Table(name="personaldetails")
public class Personal_Details {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int personaldetails_id;
	
	
	@OneToOne()
	@JoinColumn(name= "blood_group_id")
	private Blood_Group blood_group;
	
	@Column(name="height")
	String height;
	
	
	@Column(name="weight")
	String weight;
	
	@OneToOne()
	@JoinColumn(name= "body_type_id")
	private Body_Type body_type;
	
	@Column(name="physical_disability")
	String physical_disability;
	
	@Column(name="lens")
	String lens;
	
	@Column(name="spectacles")
	String spectacles;
	
	@OneToOne()
	@JoinColumn(name= "complexion_id")
	private Complexion complexion;
	
	
	@Column(name="NRI")
	String nri;
	
	@Column(name="smoking")
	String smoking;
	
	@Column(name="drinking")
	String drinking;
	
	@OneToOne()
	@JoinColumn(name= "eating_habit_id")
	private Eating_Habits eating_habit;
	
	
	@Column(name="created_At")
	Date created_At;
	
	@Column(name="created_By")
	String created_By;
	
	@Column(name="updated_At")
	Date updated_At;
	
	@Column(name="updated_By")
	String updated_By;
	
	
	@OneToOne()
	@JoinColumn(name= "user_id")
	private User user;

	public Personal_Details() {}

	public Personal_Details(int personaldetails_id, Blood_Group blood_group, String height, String weight,
			Body_Type body_type, String physical_disability, String lens, String spectacles, Complexion complexion,
			String nri, String smoking, String drinking, Eating_Habits eating_habit, Date created_At, String created_By,
			Date updated_At, String updated_By, User user) {
		super();
		this.personaldetails_id = personaldetails_id;
		this.blood_group = blood_group;
		this.height = height;
		this.weight = weight;
		this.body_type = body_type;
		this.physical_disability = physical_disability;
		this.lens = lens;
		this.spectacles = spectacles;
		this.complexion = complexion;
		this.nri = nri;
		this.smoking = smoking;
		this.drinking = drinking;
		this.eating_habit = eating_habit;
		this.created_At = created_At;
		this.created_By = created_By;
		this.updated_At = updated_At;
		this.updated_By = updated_By;
		this.user = user;
	}

	public int getPersonaldetails_id() {
		return personaldetails_id;
	}

	public void setPersonaldetails_id(int personaldetails_id) {
		this.personaldetails_id = personaldetails_id;
	}

	public Blood_Group getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(Blood_Group blood_group) {
		this.blood_group = blood_group;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Body_Type getBody_type() {
		return body_type;
	}

	public void setBody_type(Body_Type body_type) {
		this.body_type = body_type;
	}

	public String getPhysical_disability() {
		return physical_disability;
	}

	public void setPhysical_disability(String physical_disability) {
		this.physical_disability = physical_disability;
	}

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public String getSpectacles() {
		return spectacles;
	}

	public void setSpectacles(String spectacles) {
		this.spectacles = spectacles;
	}

	public Complexion getComplexion() {
		return complexion;
	}

	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}

	public String getNri() {
		return nri;
	}

	public void setNri(String nri) {
		this.nri = nri;
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

	public Eating_Habits getEating_habit() {
		return eating_habit;
	}

	public void setEating_habit(Eating_Habits eating_habit) {
		this.eating_habit = eating_habit;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Personal_Details [personaldetails_id=" + personaldetails_id + ", blood_group=" + blood_group
				+ ", height=" + height + ", weight=" + weight + ", body_type=" + body_type + ", physical_disability="
				+ physical_disability + ", lens=" + lens + ", spectacles=" + spectacles + ", complexion=" + complexion
				+ ", nri=" + nri + ", smoking=" + smoking + ", drinking=" + drinking + ", eating_habit=" + eating_habit
				+ ", created_At=" + created_At + ", created_By=" + created_By + ", updated_At=" + updated_At
				+ ", updated_By=" + updated_By + ", user=" + user + "]";
	}

}

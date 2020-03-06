package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="profile_details")
public class ProfileDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profile_details_id;
	
	@Column()
	private String brides_name;
	
	@Column()
	private String mother_tongue;
	
	@Column()
	private String birthdate;
	
	@Column()
	private String religion;
	
	@Column()
	private String caste;
	
	@Column()
	private String sub_caste;
	
	@Column()
	private String manglik;
	
	@Column()
	private String horoscope;
	
	@Column()
	private String marital_status;
	
	@Column()
	private String height;
	public ProfileDetails() {
		super();
	}
	public ProfileDetails(Integer profile_details_id, String brides_name, String mother_tongue, String birthdate,
			String religion, String caste, String sub_caste, String manglik, String horoscope, String marital_status,
			String height) {
		super();
		this.profile_details_id = profile_details_id;
		this.brides_name = brides_name;
		this.mother_tongue = mother_tongue;
		this.birthdate = birthdate;
		this.religion = religion;
		this.caste = caste;
		this.sub_caste = sub_caste;
		this.manglik = manglik;
		this.horoscope = horoscope;
		this.marital_status = marital_status;
		this.height = height;
	}
	public Integer getProfile_details_id() {
		return profile_details_id;
	}
	public void setProfile_details_id(Integer profile_details_id) {
		this.profile_details_id = profile_details_id;
	}
	public String getBrides_name() {
		return brides_name;
	}
	public void setBrides_name(String brides_name) {
		this.brides_name = brides_name;
	}
	public String getMother_tongue() {
		return mother_tongue;
	}
	public void setMother_tongue(String mother_tongue) {
		this.mother_tongue = mother_tongue;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getSub_caste() {
		return sub_caste;
	}
	public void setSub_caste(String sub_caste) {
		this.sub_caste = sub_caste;
	}
	public String getManglik() {
		return manglik;
	}
	public void setManglik(String manglik) {
		this.manglik = manglik;
	}
	public String getHoroscope() {
		return horoscope;
	}
	public void setHoroscope(String horoscope) {
		this.horoscope = horoscope;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "ProfileDetails [profile_details_id=" + profile_details_id + ", brides_name=" + brides_name
				+ ", mother_tongue=" + mother_tongue + ", birthdate=" + birthdate + ", religion=" + religion
				+ ", caste=" + caste + ", sub_caste=" + sub_caste + ", manglik=" + manglik + ", horoscope=" + horoscope
				+ ", marital_status=" + marital_status + ", height=" + height + "]";
	}
		
	}

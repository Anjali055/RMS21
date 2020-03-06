package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
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
@Table(name="astro_religion")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"createdAt"},allowGetters=true)
public class Astro {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer astro_religion_id;
	
	
	@Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date created_At;
	
	
	@Column(name="created_By")
	private String created_By;
	
	
	@Column(nullable=false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date Updated_At;
	
	
	
	@Column(name="Updated_By")
	private String Updated_By;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="marital_status_id")
	private  Marital marital;
	
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="mothertongue_id")
	private Mothertongue mothertongue;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="religion_id")
	private Religion religion;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="caste_id")
	private Caste caste;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="subcaste_id")
	private SubCaste subCaste;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="devak_id")
	private Devak devak;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="gotra_id")
	private Gotra gotra;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="horoscope_id")
	private Horoscope horoscope;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="nakshtra_id")
	private Nakshtra nakshtra;
	

	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="manglik_id")
	private Manglik manglik;

	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="user_id")
	private User user;

	public Astro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Astro(Integer astro_religion_id, Date created_At, String created_By, Date updated_At, String updated_By,
			Marital marital, Mothertongue mothertongue, Religion religion, Caste caste, SubCaste subCaste, Devak devak,
			Gotra gotra, Horoscope horoscope, Nakshtra nakshtra, Manglik manglik, User user) {
		super();
		this.astro_religion_id = astro_religion_id;
		this.created_At = created_At;
		this.created_By = created_By;
		Updated_At = updated_At;
		Updated_By = updated_By;
		this.marital = marital;
		this.mothertongue = mothertongue;
		this.religion = religion;
		this.caste = caste;
		this.subCaste = subCaste;
		this.devak = devak;
		this.gotra = gotra;
		this.horoscope = horoscope;
		this.nakshtra = nakshtra;
		this.manglik = manglik;
		this.user = user;
	}

	public Integer getAstro_religion_id() {
		return astro_religion_id;
	}

	public void setAstro_religion_id(Integer astro_religion_id) {
		this.astro_religion_id = astro_religion_id;
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

	public Marital getMarital() {
		return marital;
	}

	public void setMarital(Marital marital) {
		this.marital = marital;
	}

	public Mothertongue getMothertongue() {
		return mothertongue;
	}

	public void setMothertongue(Mothertongue mothertongue) {
		this.mothertongue = mothertongue;
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

	public SubCaste getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(SubCaste subCaste) {
		this.subCaste = subCaste;
	}

	public Devak getDevak() {
		return devak;
	}

	public void setDevak(Devak devak) {
		this.devak = devak;
	}

	public Gotra getGotra() {
		return gotra;
	}

	public void setGotra(Gotra gotra) {
		this.gotra = gotra;
	}

	public Horoscope getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Horoscope horoscope) {
		this.horoscope = horoscope;
	}

	public Nakshtra getNakshtra() {
		return nakshtra;
	}

	public void setNakshtra(Nakshtra nakshtra) {
		this.nakshtra = nakshtra;
	}

	public Manglik getManglik() {
		return manglik;
	}

	public void setManglik(Manglik manglik) {
		this.manglik = manglik;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Astro [astro_religion_id=" + astro_religion_id + ", created_At=" + created_At + ", created_By="
				+ created_By + ", Updated_At=" + Updated_At + ", Updated_By=" + Updated_By + ", marital=" + marital
				+ ", mothertongue=" + mothertongue + ", religion=" + religion + ", caste=" + caste + ", subCaste="
				+ subCaste + ", devak=" + devak + ", gotra=" + gotra + ", horoscope=" + horoscope + ", nakshtra="
				+ nakshtra + ", manglik=" + manglik + ", user=" + user + "]";
	}
	
	

	}	
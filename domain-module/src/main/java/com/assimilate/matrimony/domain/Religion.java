package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="religion")
public class Religion {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	
	private Integer religion_id;
	
	@Column(name="religion_name")
	private String religion_name;
	
	
	@OneToMany(targetEntity=Caste.class)
	@JoinColumn(name="religion_id" ,referencedColumnName ="religion_id")
	
	@Autowired
	private List<Caste> caste;


	public Religion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Religion(Integer religion_id, String religion_name, List<Caste> caste) {
		super();
		this.religion_id = religion_id;
		this.religion_name = religion_name;
		this.caste = caste;
	}


	public Integer getReligion_id() {
		return religion_id;
	}


	public void setReligion_id(Integer religion_id) {
		this.religion_id = religion_id;
	}


	public String getReligion_name() {
		return religion_name;
	}


	public void setReligion_name(String religion_name) {
		this.religion_name = religion_name;
	}


	public List<Caste> getCaste() {
		return caste;
	}


	public void setCaste(List<Caste> caste) {
		this.caste = caste;
	}


	@Override
	public String toString() {
		return "Religion [religion_id=" + religion_id + ", religion_name=" + religion_name + ", caste=" + caste + "]";
	}

}
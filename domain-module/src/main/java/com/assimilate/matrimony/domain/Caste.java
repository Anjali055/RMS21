package com.assimilate.matrimony.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="caste")
public class Caste {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer caste_id;
	
	@Column(name="caste_name")
	private String caste_name;
	
	private int religion_id;
	
	@OneToMany(targetEntity=SubCaste.class)
	@JoinColumn(name="caste_id",referencedColumnName="caste_id")
	@Autowired
	private List<SubCaste> subCaste;

	public Caste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caste(Integer caste_id, String caste_name, int religion_id, List<SubCaste> subCaste) {
		super();
		this.caste_id = caste_id;
		this.caste_name = caste_name;
		this.religion_id = religion_id;
		this.subCaste = subCaste;
	}

	public Integer getCaste_id() {
		return caste_id;
	}

	public void setCaste_id(Integer caste_id) {
		this.caste_id = caste_id;
	}

	public String getCaste_name() {
		return caste_name;
	}

	public void setCaste_name(String caste_name) {
		this.caste_name = caste_name;
	}

	public int getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(int religion_id) {
		this.religion_id = religion_id;
	}

	public List<SubCaste> getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(List<SubCaste> subCaste) {
		this.subCaste = subCaste;
	}

	@Override
	public String toString() {
		return "Caste [caste_id=" + caste_id + ", caste_name=" + caste_name + ", religion_id=" + religion_id
				+ ", subCaste=" + subCaste + "]";
	}

}	
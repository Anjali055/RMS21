package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subcaste")
public class SubCaste {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer subcaste_id;
	
	@Column(name="subcaste_name")
	private String subcaste_name;
	
	private int caste_id;

	public SubCaste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCaste(Integer subcaste_id, String subcaste_name, int caste_id) {
		super();
		this.subcaste_id = subcaste_id;
		this.subcaste_name = subcaste_name;
		this.caste_id = caste_id;
	}

	public Integer getSubcaste_id() {
		return subcaste_id;
	}

	public void setSubcaste_id(Integer subcaste_id) {
		this.subcaste_id = subcaste_id;
	}

	public String getSubcaste_name() {
		return subcaste_name;
	}

	public void setSubcaste_name(String subcaste_name) {
		this.subcaste_name = subcaste_name;
	}

	public int getCaste_id() {
		return caste_id;
	}

	public void setCaste_id(int caste_id) {
		this.caste_id = caste_id;
	}

	@Override
	public String toString() {
		return "SubCaste [subcaste_id=" + subcaste_id + ", subcaste_name=" + subcaste_name + ", caste_id=" + caste_id
				+ "]";
	}

}
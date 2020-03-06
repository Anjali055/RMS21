package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcaste")
public class Subcaste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
private int subcaste_id;
	
	@Column()
	private String subcaste_name;
	
	private int caste_id;
	
	
	

	public Subcaste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subcaste(int subcaste_id, String subcaste_name, int caste_id) {
		super();
		this.subcaste_id = subcaste_id;
		this.subcaste_name = subcaste_name;
		this.caste_id = caste_id;
	}

	public int getSubcaste_id() {
		return subcaste_id;
	}

	public void setSubcaste_id(int subcaste_id) {
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
		return "Subcaste [subcaste_id=" + subcaste_id + ", subcaste_name=" + subcaste_name + ", caste_id=" + caste_id
				+ "]";
	}
	
	
}

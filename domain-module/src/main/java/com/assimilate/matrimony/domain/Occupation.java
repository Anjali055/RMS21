package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "occupation")
public class Occupation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int occupation_id;
	
	@Column()
	private String name;

	public Occupation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Occupation(int occupation_id, String name) {
		super();
		this.occupation_id = occupation_id;
		this.name = name;
	}

	public int getOccupation_id() {
		return occupation_id;
	}

	public void setOccupation_id(int occupation_id) {
		this.occupation_id = occupation_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Occupation [occupation_id=" + occupation_id + ", name=" + name + "]";
	}
	
	
}

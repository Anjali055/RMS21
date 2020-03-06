package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "occupation")
public class Occupation {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "occupation_id")
	private Integer occupation_id;
	
	@Column(name = "name")
	private String name;

	public Occupation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Occupation(Integer occupation_id, String name) {
		super();
		this.occupation_id = occupation_id;
		this.name = name;
	}

	public Integer getOccupation_id() {
		return occupation_id;
	}

	public void setOccupation_id(Integer occupation_id) {
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

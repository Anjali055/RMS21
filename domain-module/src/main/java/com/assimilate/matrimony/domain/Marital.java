package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marital_status")
public class Marital {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer marital_status_id;
	
	@Column(name="marital_name")
	private String marital_name;

	public Marital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marital(Integer marital_status_id, String marital_name) {
		super();
		this.marital_status_id = marital_status_id;
		this.marital_name = marital_name;
	}

	public Integer getMarital_status_id() {
		return marital_status_id;
	}

	public void setMarital_status_id(Integer marital_status_id) {
		this.marital_status_id = marital_status_id;
	}

	public String getMarital_name() {
		return marital_name;
	}

	public void setMarital_name(String marital_name) {
		this.marital_name = marital_name;
	}

	@Override
	public String toString() {
		return "Marital [marital_status_id=" + marital_status_id + ", marital_name=" + marital_name + "]";
	}
	
	

}

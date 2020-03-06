package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gotra")
public class Gotra {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer gotra_id;
	
	@Column(name="gotra_name")
	private String gotra_name;

	public Gotra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gotra(Integer gotra_id, String gotra_name) {
		super();
		this.gotra_id = gotra_id;
		this.gotra_name = gotra_name;
	}

	public Integer getGotra_id() {
		return gotra_id;
	}

	public void setGotra_id(Integer gotra_id) {
		this.gotra_id = gotra_id;
	}

	public String getGotra_name() {
		return gotra_name;
	}

	public void setGotra_name(String gotra_name) {
		this.gotra_name = gotra_name;
	}

	@Override
	public String toString() {
		return "Gotra [gotra_id=" + gotra_id + ", gotra_name=" + gotra_name + "]";
	}


}

package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devak")
public class Devak {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer devak_id;
	
	@Column(name="devak_name")
	private String devak_name;

	public Devak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Devak(Integer devak_id, String devak_name) {
		super();
		this.devak_id = devak_id;
		this.devak_name = devak_name;
	}

	public Integer getDevak_id() {
		return devak_id;
	}

	public void setDevak_id(Integer devak_id) {
		this.devak_id = devak_id;
	}

	public String getDevak_name() {
		return devak_name;
	}

	public void setDevak_name(String devak_name) {
		this.devak_name = devak_name;
	}

	@Override
	public String toString() {
		return "Devak [devak_id=" + devak_id + ", devak_name=" + devak_name + "]";
	}

}

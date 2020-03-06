package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="marital_status")
public class Marital_StatusEntity {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer marital_status_id;
	
	@Column()
	private String marital_name;

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

	public Marital_StatusEntity(Integer marital_status_id, String marital_name) {
		super();
		this.marital_status_id = marital_status_id;
		this.marital_name = marital_name;
	}

	public Marital_StatusEntity() {
		super();
	}

	@Override
	public String toString() {
		return "Marital_StatusEntity [marital_status_id=" + marital_status_id + ", marital_name=" + marital_name + "]";
	}
	
}

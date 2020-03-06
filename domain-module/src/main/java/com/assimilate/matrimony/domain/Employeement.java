package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeement")
public class Employeement {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "employeement_id")
	private Integer employeement_id;

	@Column(name = "employeement_type")
	private String employeement_type;

	public Employeement() {
		super();
	}

	public Employeement(Integer employeement_id, String employeement_type) {
		super();
		this.employeement_id = employeement_id;
		this.employeement_type = employeement_type;
	}

	public Integer getEmployeement_id() {
		return employeement_id;
	}

	public void setEmployeement_id(Integer employeement_id) {
		this.employeement_id = employeement_id;
	}

	public String getEmployeement_type() {
		return employeement_type;
	}

	public void setEmployeement_type(String employeement_type) {
		this.employeement_type = employeement_type;
	}

	@Override
	public String toString() {
		return "Employeement [employeement_id=" + employeement_id + ", employeement_type=" + employeement_type + "]";
	}

}

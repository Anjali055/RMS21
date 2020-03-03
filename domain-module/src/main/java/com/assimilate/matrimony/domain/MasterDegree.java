package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_degree")
public class MasterDegree {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "master_degree_id")
	private Integer master_degree_id;
	
	@Column(name = "qualification")
	private String qualification;

	public MasterDegree() {
		super();
	}

	public MasterDegree(Integer master_degree_id, String qualification) {
		super();
		this.master_degree_id = master_degree_id;
		this.qualification = qualification;
	}

	public Integer getMaster_degree_id() {
		return master_degree_id;
	}

	public void setMaster_degree_id(Integer master_degree_id) {
		this.master_degree_id = master_degree_id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "MasterDegree [master_degree_id=" + master_degree_id + ", qualification=" + qualification + "]";
	}

	

}

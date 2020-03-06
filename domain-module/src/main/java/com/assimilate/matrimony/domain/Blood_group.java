package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "blood_group")
public class Blood_group {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	
	private int blood_group_id;
	
	@Column()
	private String blood_group_name;

	public Blood_group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Blood_group(int blood_group_id, String blood_group_name) {
		super();
		this.blood_group_id = blood_group_id;
		this.blood_group_name = blood_group_name;
	}

	public int getBlood_group_id() {
		return blood_group_id;
	}

	public void setBlood_group_id(int blood_group_id) {
		this.blood_group_id = blood_group_id;
	}

	public String getBlood_group_name() {
		return blood_group_name;
	}

	public void setBlood_group_name(String blood_group_name) {
		this.blood_group_name = blood_group_name;
	}

	@Override
	public String toString() {
		return "Blood_group [blood_group_id=" + blood_group_id + ", blood_group_name=" + blood_group_name + "]";
	}
	
	
	
}


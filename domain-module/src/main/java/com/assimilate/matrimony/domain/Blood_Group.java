package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="blood_group")
public class Blood_Group {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int blood_group_id;
	
	
	@Column(name="blood_group_name")
	String blood_group_name;

	
	public Blood_Group() {}

	public Blood_Group(int blood_group_id, String blood_group_name) {
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
		return "Blood_Group [blood_group_id=" + blood_group_id + ", blood_group_name=" + blood_group_name + "]";
	}
	
	
	

}

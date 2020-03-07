package com.assimilate.matrimony.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bacholer_degree")
public class BacholerDegreeEntity {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int bacholer_degree_id;
	@Column
	private String qualification;
		
	public  BacholerDegreeEntity() {
		
	}
	public BacholerDegreeEntity(int bacholer_degree_id, String qualification) {
		super();
		this.bacholer_degree_id = bacholer_degree_id;
		this.qualification = qualification;
	}
	public int getBacholer_degree_id() {
		return bacholer_degree_id;
	}
	public void setBacholer_degree_id(int bacholer_degree_id) {
		this.bacholer_degree_id = bacholer_degree_id;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	

}

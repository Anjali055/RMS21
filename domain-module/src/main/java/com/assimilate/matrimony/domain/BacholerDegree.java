
package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bacholer_Degree")
public class BacholerDegree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bacholer_Degree_id")
	private Integer bacholer_Degree_id;

	@Column(name = "qualification")
	private String qualification;

	public BacholerDegree() {
		super();

	}

	public BacholerDegree(Integer bacholer_Degree_id, String qualification) {
		super();
		this.bacholer_Degree_id = bacholer_Degree_id;
		this.qualification = qualification;
	}

	public Integer getBacholer_Degree_id() {
		return bacholer_Degree_id;
	}

	public void setBacholer_Degree_id(Integer bacholer_Degree_id) {
		this.bacholer_Degree_id = bacholer_Degree_id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "BacholerDegree [bacholer_Degree_id=" + bacholer_Degree_id + ", qualification=" + qualification + "]";
	}
	

	
	
	
	

}

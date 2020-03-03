package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="interest")
public class InterestEntity {
	
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer interest_id;
	
	@Column()
	private String name;
	

	public Integer getInterest_id() {
		return interest_id;
	}

	public void setInterest_id(Integer interest_id) {
		this.interest_id = interest_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InterestEntity(Integer interest_id, String name) {
		super();
		this.interest_id = interest_id;
		this.name = name;
	}

	public InterestEntity() {
		super();
	}

	@Override
	public String toString() {
		return "Interest [interest_id=" + interest_id + ", name=" + name + "]";
	}

}

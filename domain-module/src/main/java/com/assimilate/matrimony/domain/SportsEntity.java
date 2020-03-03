package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")
public class SportsEntity {
	
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sports_id;
	
	@Column()
	private String name;
	
	@Override
	public String toString() {
		return "Sports [sports_id=" + sports_id + ", name=" + name + "]";
	}

	public SportsEntity() {
		super();
	}

	public SportsEntity(Integer sports_id, String name) {
		super();
		this.sports_id = sports_id;
		this.name = name;
	}

	public Integer getSports_id() {
		return sports_id;
	}

	public void setSports_id(Integer sports_id) {
		this.sports_id = sports_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	

}

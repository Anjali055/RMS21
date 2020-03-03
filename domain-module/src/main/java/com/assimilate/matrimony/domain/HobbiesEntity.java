package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hobbies")
public class HobbiesEntity {
	

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hobbies_id;
	
	@Column()
	
	private String name;

	public Integer getHobbies_id() {
		return hobbies_id;
	}

	public void setHobbies_id(Integer hobbies_id) {
		this.hobbies_id = hobbies_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HobbiesEntity(Integer hobbies_id, String name) {
		super();
		this.hobbies_id = hobbies_id;
		this.name = name;
	}

	public HobbiesEntity() {
		super();
	}

	@Override
	public String toString() {
		return "HobbiesEntity [hobbies_id=" + hobbies_id + ", name=" + name + "]";
	}

	
	
	
}

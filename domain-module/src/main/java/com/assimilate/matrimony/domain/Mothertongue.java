package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mothertongue")
public class Mothertongue {
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	
	private Integer mothertongue_id;
	
	@Column(name="")
	private String mothertongue_name;

	public Mothertongue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mothertongue(Integer mothertongue_id, String mothertongue_name) {
		super();
		this.mothertongue_id = mothertongue_id;
		this.mothertongue_name = mothertongue_name;
	}

	public Integer getMothertongue_id() {
		return mothertongue_id;
	}

	public void setMothertongue_id(Integer mothertongue_id) {
		this.mothertongue_id = mothertongue_id;
	}

	public String getMothertongue_name() {
		return mothertongue_name;
	}

	public void setMothertongue_name(String mothertongue_name) {
		this.mothertongue_name = mothertongue_name;
	}

	@Override
	public String toString() {
		return "Mothertongue [mothertongue_id=" + mothertongue_id + ", mothertongue_name=" + mothertongue_name + "]";
	}
	
	

}

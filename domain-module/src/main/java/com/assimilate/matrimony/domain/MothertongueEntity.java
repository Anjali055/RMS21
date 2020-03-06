package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mothertongue")
public class MothertongueEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int mothertongue_id;
	
	@Column()
	private String mothertongue_name;

	public MothertongueEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MothertongueEntity(int mothertongue_id, String mothertongue_name) {
		super();
		this.mothertongue_id = mothertongue_id;
		this.mothertongue_name = mothertongue_name;
	}

	public int getMothertongue_id() {
		return mothertongue_id;
	}

	public void setMothertongue_id(int mothertongue_id) {
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

package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mothertongue")
public class MothertongueEntity {

	@Id
	//@GeneratedValue(strategy = IDENTITY)
	private Integer mothertongue_id;
	
	@Column()
	private String mothertongue_name;
	
	
//	@OneToOne (mappedBy ="mothertongue" )
//	public ProfileDetailsEntity profileDetailsEntity;

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

	public MothertongueEntity(Integer mothertongue_id, String mothertongue_name) {
		super();
		this.mothertongue_id = mothertongue_id;
		this.mothertongue_name = mothertongue_name;
	}

	public MothertongueEntity() {
		super();
	}

	@Override
	public String toString() {
		return "MothertongueEntity [mothertongue_id=" + mothertongue_id + ", mothertongue_name=" + mothertongue_name
				+ "]";
	}
	


	

	}

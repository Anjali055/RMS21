package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subcaste")
public class SubCasteEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subcaste_id;
	
	@Column()
	private String subcaste_name;
	private Integer caste_id;
	@Override
	public String toString() {
		return "SubCasteEntity [subcaste_id=" + subcaste_id + ", subcaste_name=" + subcaste_name + ", caste_id="
				+ caste_id + "]";
	}
	public SubCasteEntity() {
		super();
	}
	public SubCasteEntity(Integer subcaste_id, String subcaste_name, Integer caste_id) {
		super();
		this.subcaste_id = subcaste_id;
		this.subcaste_name = subcaste_name;
		this.caste_id = caste_id;
	}
	public Integer getSubcaste_id() {
		return subcaste_id;
	}
	public void setSubcaste_id(Integer subcaste_id) {
		this.subcaste_id = subcaste_id;
	}
	public String getSubcaste_name() {
		return subcaste_name;
	}
	public void setSubcaste_name(String subcaste_name) {
		this.subcaste_name = subcaste_name;
	}
	public Integer getCaste_id() {
		return caste_id;
	}
	public void setCaste_id(Integer caste_id) {
		this.caste_id = caste_id;
	}
	

}

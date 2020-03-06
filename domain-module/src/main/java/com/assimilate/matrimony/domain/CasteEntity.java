package com.assimilate.matrimony.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "caste")
public class CasteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int caste_id;
	
	@Column()
	private String caste_name;
	
	private int religion_id;
	
	@OneToMany(targetEntity = SubcasteEntity.class)
	@JoinColumn(name = "caste_id",referencedColumnName = "caste_id")
	
	
	@Autowired
	private List<SubcasteEntity> subcasteObject;

	public CasteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CasteEntity(int caste_id, String caste_name, int religion_id, List<SubcasteEntity> subcasteObject) {
		super();
		this.caste_id = caste_id;
		this.caste_name = caste_name;
		this.religion_id = religion_id;
		this.subcasteObject = subcasteObject;
	}

	public int getCaste_id() {
		return caste_id;
	}

	public void setCaste_id(int caste_id) {
		this.caste_id = caste_id;
	}

	public String getCaste_name() {
		return caste_name;
	}

	public void setCaste_name(String caste_name) {
		this.caste_name = caste_name;
	}

	public int getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(int religion_id) {
		this.religion_id = religion_id;
	}

	public List<SubcasteEntity> getSubcasteObject() {
		return subcasteObject;
	}

	public void setSubcasteObject(List<SubcasteEntity> subcasteObject) {
		this.subcasteObject = subcasteObject;
	}

	@Override
	public String toString() {
		return "Caste [caste_id=" + caste_id + ", caste_name=" + caste_name + ", religion_id=" + religion_id
				+ ", subcasteObject=" + subcasteObject + "]";
	}
	
	
	
	
}

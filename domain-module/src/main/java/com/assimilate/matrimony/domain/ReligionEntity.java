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

@Entity
@Table(name = "religion")
public class ReligionEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int religion_id;
	
	@Column()
	private String religion_name;
	
	@OneToMany(targetEntity = CasteEntity.class)
	@JoinColumn(name = "religion_id",referencedColumnName = "religion_id")
	
	private List<CasteEntity> casteObject;

	public ReligionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReligionEntity(int religion_id, String religion_name, List<CasteEntity> casteObject) {
		super();
		this.religion_id = religion_id;
		this.religion_name = religion_name;
		this.casteObject = casteObject;
	}

	public int getReligion_id() {
		return religion_id;
	}

	public void setReligion_id(int religion_id) {
		this.religion_id = religion_id;
	}

	public String getReligion_name() {
		return religion_name;
	}

	public void setReligion_name(String religion_name) {
		this.religion_name = religion_name;
	}

	public List<CasteEntity> getCasteObject() {
		return casteObject;
	}

	public void setCasteObject(List<CasteEntity> casteObject) {
		this.casteObject = casteObject;
	}

	@Override
	public String toString() {
		return "Religion [religion_id=" + religion_id + ", religion_name=" + religion_name + ", casteObject="
				+ casteObject + "]";
	}
	
	
	
}

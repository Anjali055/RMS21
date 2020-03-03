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
@Table(name="caste")
public class CasteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caste_id;
	
	@Column()
	private String caste_name;
	
	private int religion_id;
	
	@OneToMany(targetEntity = SubCasteEntity.class)
	@JoinColumn(name ="caste_id" ,referencedColumnName = "caste_id" )
	private List<SubCasteEntity>  subCasteEntity;

	public Integer getCaste_id() {
		return caste_id;
	}

	public void setCaste_id(Integer caste_id) {
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

	public List<SubCasteEntity> getSubCasteEntity() {
		return subCasteEntity;
	}

	public void setSubCasteEntity(List<SubCasteEntity> subCasteEntity) {
		this.subCasteEntity = subCasteEntity;
	}

	public CasteEntity(Integer caste_id, String caste_name, int religion_id, List<SubCasteEntity> subCasteEntity) {
		super();
		this.caste_id = caste_id;
		this.caste_name = caste_name;
		this.religion_id = religion_id;
		this.subCasteEntity = subCasteEntity;
	}

	public CasteEntity() {
		super();
	}

	@Override
	public String toString() {
		return "CasteEntity [caste_id=" + caste_id + ", caste_name=" + caste_name + ", religion_id=" + religion_id
				+ ", subCasteEntity=" + subCasteEntity + "]";
	}
	
	
	}

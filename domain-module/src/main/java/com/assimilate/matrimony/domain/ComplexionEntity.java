package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "complexion")
public class ComplexionEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int complexion_id;
	
	@Column()
	private String complexion_name;

	public ComplexionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComplexionEntity(int complexion_id, String complexion_name) {
		super();
		this.complexion_id = complexion_id;
		this.complexion_name = complexion_name;
	}

	public int getComplexion_id() {
		return complexion_id;
	}

	public void setComplexion_id(int complexion_id) {
		this.complexion_id = complexion_id;
	}

	public String getComplexion_name() {
		return complexion_name;
	}

	public void setComplexion_name(String complexion_name) {
		this.complexion_name = complexion_name;
	}

	@Override
	public String toString() {
		return "Complexion [complexion_id=" + complexion_id + ", complexion_name=" + complexion_name + "]";
	}
	
	
	
}

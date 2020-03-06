package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manglik")
public class Manglik {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int manglik_id;
	
	@Column()
	private String manglik_name;

	public Manglik() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manglik(int manglik_id, String manglik_name) {
		super();
		this.manglik_id = manglik_id;
		this.manglik_name = manglik_name;
	}

	public int getManglik_id() {
		return manglik_id;
	}

	public void setManglik_id(int manglik_id) {
		this.manglik_id = manglik_id;
	}

	public String getManglik_name() {
		return manglik_name;
	}

	public void setManglik_name(String manglik_name) {
		this.manglik_name = manglik_name;
	}

	@Override
	public String toString() {
		return "Manglik [manglik_id=" + manglik_id + ", manglik_name=" + manglik_name + "]";
	}
	
	
	
	
}

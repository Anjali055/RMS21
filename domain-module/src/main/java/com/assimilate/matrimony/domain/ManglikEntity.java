package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manglik")
public class ManglikEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer manglik_id;
	
	@Column()
	private String manglik_name;

	public Integer getManglik_id() {
		return manglik_id;
	}

	public void setManglik_id(Integer manglik_id) {
		this.manglik_id = manglik_id;
	}

	public String getManglik_name() {
		return manglik_name;
	}

	public void setManglik_name(String manglik_name) {
		this.manglik_name = manglik_name;
	}

	public ManglikEntity(Integer manglik_id, String manglik_name) {
		super();
		this.manglik_id = manglik_id;
		this.manglik_name = manglik_name;
	}

	public ManglikEntity() {
		super();
	}

	@Override
	public String toString() {
		return "ManglikEntity [manglik_id=" + manglik_id + ", manglik_name=" + manglik_name + "]";
	}
	
}

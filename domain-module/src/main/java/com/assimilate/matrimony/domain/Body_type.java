package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "body_type")
public class Body_type {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int body_type_id;	
	
	@Column()
	private String body_type_name;

	public Body_type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Body_type(int body_type_id, String body_type_name) {
		super();
		this.body_type_id = body_type_id;
		this.body_type_name = body_type_name;
	}

	public int getBody_type_id() {
		return body_type_id;
	}

	public void setBody_type_id(int body_type_id) {
		this.body_type_id = body_type_id;
	}

	public String getBody_type_name() {
		return body_type_name;
	}

	public void setBody_type_name(String body_type_name) {
		this.body_type_name = body_type_name;
	}

	@Override
	public String toString() {
		return "Body_type [body_type_id=" + body_type_id + ", body_type_name=" + body_type_name + "]";
	}
	
	
}

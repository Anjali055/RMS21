package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nakshtra")
public class Nakshtra {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer nakshtra_id;
	
	@Column(name="nakshtra_name")
	private String nakshtra_name;

	public Nakshtra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nakshtra(Integer nakshtra_id, String nakshtra_name) {
		super();
		this.nakshtra_id = nakshtra_id;
		this.nakshtra_name = nakshtra_name;
	}

	public Integer getNakshtra_id() {
		return nakshtra_id;
	}

	public void setNakshtra_id(Integer nakshtra_id) {
		this.nakshtra_id = nakshtra_id;
	}

	public String getNakshtra_name() {
		return nakshtra_name;
	}

	public void setNakshtra_name(String nakshtra_name) {
		this.nakshtra_name = nakshtra_name;
	}

	@Override
	public String toString() {
		return "Nakshtra [nakshtra_id=" + nakshtra_id + ", nakshtra_name=" + nakshtra_name + "]";
	}

}

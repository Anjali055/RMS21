package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dress_style")
public class DressStyleEntity {
	

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dress_style_id;
	
	@Override
	public String toString() {
		return "Dress_Style [dress_style_id=" + dress_style_id + ", clothes_Type=" + clothes_Type + "]";
	}

	public DressStyleEntity() {
		super();
	}

	public DressStyleEntity(Integer dress_style_id, String clothes_Type) {
		super();
		this.dress_style_id = dress_style_id;
		this.clothes_Type = clothes_Type;
	}

	public Integer getDress_style_id() {
		return dress_style_id;
	}

	public void setDress_style_id(Integer dress_style_id) {
		this.dress_style_id = dress_style_id;
	}

	public String getClothes_Type() {
		return clothes_Type;
	}

	public void setClothes_Type(String clothes_Type) {
		this.clothes_Type = clothes_Type;
	}

	@Column()
	private String clothes_Type;
	

}

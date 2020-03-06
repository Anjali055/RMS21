package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer city_id;

//	@OneToOne(mappedBy = "city")
//	Career_detail c;

	@Column(name = "city_name")
	private String city_name;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "state_id")
//	private State state;

	private Integer state_id;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(Integer city_id, String city_name, Integer state_id) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.state_id = state_id;
	}

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", city_name=" + city_name + ", state_id=" + state_id + "]";
	}


	
}

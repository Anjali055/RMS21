package com.assimilate.matrimony.domain;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "state")
public class State {

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "state_id")
	private Integer state_id;
	
	@Column(name = "state_name")
	private String state_name;
	
	private Integer country_id;

	/////////////////////////////////////////////////
	

	@OneToMany(targetEntity = City.class)
	@JoinColumn(name="state_id",referencedColumnName = "state_id")
	@Autowired
	private List<City> cityObject;
	
	
	////////////////////////////////////////////////
	
	
	public State() {
		super();
	}


	public State(Integer state_id, String state_name, Integer country_id, List<City> cityObject) {
		super();
		this.state_id = state_id;
		this.state_name = state_name;
		this.country_id = country_id;
		this.cityObject = cityObject;
	}


	public Integer getState_id() {
		return state_id;
	}


	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}


	public String getState_name() {
		return state_name;
	}


	public void setState_name(String state_name) {
		this.state_name = state_name;
	}


	public Integer getCountry_id() {
		return country_id;
	}


	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}


	public List<City> getCityObject() {
		return cityObject;
	}


	public void setCityObject(List<City> cityObject) {
		this.cityObject = cityObject;
	}


	@Override
	public String toString() {
		return "State [state_id=" + state_id + ", state_name=" + state_name + ", country_id=" + country_id
				+ ", cityObject=" + cityObject + "]";
	}



	
	
}

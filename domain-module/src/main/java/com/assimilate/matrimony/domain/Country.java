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
@Table(name = "country")
public class Country {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	
	@Column(name = "country_id")
	private Integer country_id;

	@Column(name = "country_name")
	private String country_name;


	/////////////////////////////////////////
	
	
	@OneToMany(targetEntity = State.class)
	@JoinColumn(name="country_id",referencedColumnName = "country_id")
	@Autowired
	private List<State> stateObject;


	
	//////////////////////////////////////////
	public Country() {
		super();
	}



	public Country(Integer country_id, String country_name, List<State> stateObject) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.stateObject = stateObject;
	}



	public Integer getCountry_id() {
		return country_id;
	}



	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}



	public String getCountry_name() {
		return country_name;
	}



	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}



	public List<State> getStateObject() {
		return stateObject;
	}



	public void setStateObject(List<State> stateObject) {
		this.stateObject = stateObject;
	}



	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + ", stateObject=" + stateObject
				+ "]";
	}
	




}

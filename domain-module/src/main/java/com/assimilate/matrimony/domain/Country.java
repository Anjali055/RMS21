package com.assimilate.matrimony.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="country_id")
	private int country_id;
	
	@Column(name="country_name")
	private String Country_name;
	
	
	@OneToMany(targetEntity = State.class,cascade = CascadeType.ALL)
	@JoinColumn(name="country_id",referencedColumnName = "country_id")
	private List<State> stateobj;
	
	Country(){
		
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return Country_name;
	}

	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}

	public List<State> getStateobj() {
		return stateobj;
	}

	public void setStateobj(List<State> stateobj) {
		this.stateobj = stateobj;
	}

	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", Country_name=" + Country_name + ", stateobj=" + stateobj + "]";
	}
	
	
	
	

	
	

}

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="state")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="state_id")
	private int state_id;
	
	@Column(name="state_name")
	private String state_name;
		
	
	private  int  country_id;
	
	
	@OneToMany(targetEntity = City.class,cascade = CascadeType.ALL)
	@JoinColumn(name="state_id",referencedColumnName = "state_id")
	private List<City> city;
	
	
	
	State(){
		
	}



	public State(int state_id, String state_name, int country_id, List<City> city) {
		super();
		this.state_id = state_id;
		this.state_name = state_name;
		this.country_id = country_id;
		this.city = city;
	}



	public int getState_id() {
		return state_id;
	}



	public void setState_id(int state_id) {
		this.state_id = state_id;
	}



	public String getState_name() {
		return state_name;
	}



	public void setState_name(String state_name) {
		this.state_name = state_name;
	}



	public int getCountry_id() {
		return country_id;
	}



	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}



	public List<City> getCity() {
		return city;
	}



	public void setCity(List<City> city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "State [state_id=" + state_id + ", state_name=" + state_name + ", country_id=" + country_id + ", city="
				+ city + "]";
	}



	
	

	
	
	

}

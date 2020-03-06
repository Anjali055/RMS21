package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Eating_Habits")
public class Eating_Habits {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eating_habit_id;
	
	
	@Column(name="eating_habit_name")
	String eating_habit_name;
	
	
	public Eating_Habits() {}


	public Eating_Habits(int eating_habit_id, String eating_habit_name) {
		super();
		this.eating_habit_id = eating_habit_id;
		this.eating_habit_name = eating_habit_name;
	}


	public int getEating_habit_id() {
		return eating_habit_id;
	}


	public void setEating_habit_id(int eating_habit_id) {
		this.eating_habit_id = eating_habit_id;
	}


	public String getEating_habit_name() {
		return eating_habit_name;
	}


	public void setEating_habit_name(String eating_habit_name) {
		this.eating_habit_name = eating_habit_name;
	}


	@Override
	public String toString() {
		return "Eating_Habits [eating_habit_id=" + eating_habit_id + ", eating_habit_name=" + eating_habit_name + "]";
	}
    
	
	
	

}

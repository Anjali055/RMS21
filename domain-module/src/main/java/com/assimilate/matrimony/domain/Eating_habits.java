package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eating_habits")
public class Eating_habits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int eating_habits_id;
	
	@Column()
	private String eating_habits_name;

	public Eating_habits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Eating_habits(int eating_habits_id, String eating_habits_name) {
		super();
		this.eating_habits_id = eating_habits_id;
		this.eating_habits_name = eating_habits_name;
	}

	public int getEating_habits_id() {
		return eating_habits_id;
	}

	public void setEating_habits_id(int eating_habits_id) {
		this.eating_habits_id = eating_habits_id;
	}

	public String getEating_habits_name() {
		return eating_habits_name;
	}

	public void setEating_habits_name(String eating_habits_name) {
		this.eating_habits_name = eating_habits_name;
	}

	@Override
	public String toString() {
		return "Eating_habits [eating_habits_id=" + eating_habits_id + ", eating_habits_name=" + eating_habits_name
				+ "]";
	}
	
	
	
}

package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horoscope")
public class Horoscope {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private int horoscope_id;
	
	@Column()
	private String horoscope_name;

	public Horoscope() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horoscope(int horoscope_id, String horoscope_name) {
		super();
		this.horoscope_id = horoscope_id;
		this.horoscope_name = horoscope_name;
	}

	public int getHoroscope_id() {
		return horoscope_id;
	}

	public void setHoroscope_id(int horoscope_id) {
		this.horoscope_id = horoscope_id;
	}

	public String getHoroscope_name() {
		return horoscope_name;
	}

	public void setHoroscope_name(String horoscope_name) {
		this.horoscope_name = horoscope_name;
	}

	@Override
	public String toString() {
		return "Horoscope [horoscope_id=" + horoscope_id + ", horoscope_name=" + horoscope_name + "]";
	}
	
}

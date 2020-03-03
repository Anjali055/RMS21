package com.assimilate.matrimony.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horoscope")
public class HoroscopeEntity {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer horoscope_id;
	
	@Column()
	private String horoscope_name;

	public Integer getHoroscope_id() {
		return horoscope_id;
	}

	public void setHoroscope_id(Integer horoscope_id) {
		this.horoscope_id = horoscope_id;
	}

	public String getHoroscope_name() {
		return horoscope_name;
	}

	public void setHoroscope_name(String horoscope_name) {
		this.horoscope_name = horoscope_name;
	}

	public HoroscopeEntity(Integer horoscope_id, String horoscope_name) {
		super();
		this.horoscope_id = horoscope_id;
		this.horoscope_name = horoscope_name;
	}

	public HoroscopeEntity() {
		super();
	}

	@Override
	public String toString() {
		return "HoroscopeEntity [horoscope_id=" + horoscope_id + ", horoscope_name=" + horoscope_name + "]";
	}

}

package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.HoroscopeEntity;

public interface HoroscopeService {

	void createHoroscope(HoroscopeEntity horoscope);

	public List<HoroscopeEntity> getAllHoroscope();
import com.assimilate.matrimony.domain.Horoscope;

public interface HoroscopeService {

	List<Horoscope> getAllHoroscope();

}

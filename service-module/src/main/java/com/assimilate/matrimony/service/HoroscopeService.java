package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.HoroscopeEntity;

public interface HoroscopeService {

	void createHoroscope(HoroscopeEntity horoscope);

	public List<HoroscopeEntity> getAllHoroscope();

}

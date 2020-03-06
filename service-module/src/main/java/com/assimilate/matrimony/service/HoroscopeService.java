package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Horoscope;

public interface HoroscopeService {

	void createHoroscope(Horoscope horoscope);

	public List<Horoscope> getAllHoroscope();

}

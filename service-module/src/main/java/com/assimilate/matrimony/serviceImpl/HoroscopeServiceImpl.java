package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.HoroscopeRepository;
import com.assimilate.matrimony.domain.HoroscopeEntity;
import com.assimilate.matrimony.service.HoroscopeService;

@Service
public class HoroscopeServiceImpl implements  HoroscopeService{

	@Autowired
	private HoroscopeRepository horoscopeRepository;
	@Override
	public void createHoroscope(HoroscopeEntity horoscope) {
		
		horoscopeRepository.save(horoscope);
	}
	@Override
	public List<HoroscopeEntity> getAllHoroscope() {
		List<HoroscopeEntity>list=horoscopeRepository.findAll();
		return list;
	}

}

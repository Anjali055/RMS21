package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.AstroRepository;
import com.assimilate.matrimony.dao.DevakRepository;
import com.assimilate.matrimony.dao.GotraRepository;
import com.assimilate.matrimony.dao.HoroscopeRepository;
import com.assimilate.matrimony.dao.ManglikRepository;
import com.assimilate.matrimony.dao.MaritalRepository;
import com.assimilate.matrimony.dao.MothertongueRepository;
import com.assimilate.matrimony.dao.NakshtraRepository;
import com.assimilate.matrimony.dao.ReligionRepository;
import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.Astro;
import com.assimilate.matrimony.domain.Devak;
import com.assimilate.matrimony.domain.Gotra;
import com.assimilate.matrimony.domain.Horoscope;
import com.assimilate.matrimony.domain.Manglik;
import com.assimilate.matrimony.domain.Marital;
import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.domain.Nakshtra;
import com.assimilate.matrimony.domain.Religion;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.AstroService;

@Service
public class AstroServiceImpl implements AstroService{
	
	
@Autowired
AstroRepository astroRepository;

@Autowired
DevakRepository devakRepository;

@Autowired
GotraRepository gotraRepository;

@Autowired
HoroscopeRepository horoscopeRepository;


@Autowired 
UserRepository userRepository;

@Autowired
ManglikRepository manglikRepository;

@Autowired
MaritalRepository maritalRepository;

@Autowired
MothertongueRepository mothertongueRepository;

@Autowired
NakshtraRepository nakshtraRepository;

@Autowired
ReligionRepository religionRepository;

public int createUser(Astro astro)
{
	Devak devak=astro.getDevak();
	Optional<Devak> devak2=devakRepository.findById(devak.getDevak_id());
	
	if(devak2!=null)
	{
		System.out.println("devak save successfully.....");
		Gotra gotra=astro.getGotra();
		Optional<Gotra> gotra2=gotraRepository.findById(gotra.getGotra_id());
		if(gotra2!=null)
		{
			System.out.println("Gotra save successfully....");
			Horoscope horoscope=astro.getHoroscope();
			Optional<Horoscope> horoscope2=horoscopeRepository.findById(horoscope.getHoroscope_id());
			if(horoscope2!=null)
			{
				System.out.println("horoscope save successfully.....");
				Manglik manglik=astro.getManglik();
				Optional<Manglik> manglik2=manglikRepository.findById(manglik.getManglik_id());
				if(manglik2!=null)
				{
					System.out.println("manglik save successfully.....");
					Marital marital=astro.getMarital();
					Optional<Marital> marital2=maritalRepository.findById(marital.getMarital_status_id());
					
					if(marital2!=null)
					{
						System.out.println("marital save successfully.....");
						Mothertongue mothertongue=astro.getMothertongue();
						Optional<Mothertongue> mothertongue2=mothertongueRepository.findById(mothertongue.getMothertongue_id());
						if(mothertongue2!=null)
						{
							System.out.println("mothertongue save successfully.....");
							Nakshtra nakshtra=astro.getNakshtra();
							Optional<Nakshtra> nakshtra2=nakshtraRepository.findById(nakshtra.getNakshtra_id());
							
						if(nakshtra2!=null)
						{
							System.out.println("nakshtra save successfully.....");
							User user=astro.getUser();
							Optional<User> user2=userRepository.findById(user.getUser_id());
							
							if(user2!=null)
							{
								System.out.println("user save successfully.....");
								Religion religion=astro.getReligion();
								Optional<Religion> religion2=religionRepository.findById(religion.getReligion_id());
								if(religion2!=null)
								{
							System.out.println("religion save successfully");
							astroRepository.save(astro);
								}

							else
				{
					System.out.println("devak null value error");
				}
			}
			else {
				System.out.println("Gotra null value error");
			}
		}
		else {
			System.out.println("horoscope null value error");
		}
	}
	else {
		System.out.println("manglik null value error");
	}
}
   else {
	   	System.out.println("maritalstatus null value error");
 }
			}
			else {
			   	System.out.println("mothertongue null value error");
		 }
		}
		else {
		   	System.out.println("nakshtra null value error");
	 }
	}

		else {
		   	System.out.println("user null value error");
	 }
	}
	else {
	   	System.out.println("religion null value error");
 }
	
return astro.getAstro_religion_id();
}
		





@Override
public List<Astro> getAll() {
	return astroRepository.findAll();
}

@Override
public int deleteUser(int user_id) {
	astroRepository.deleteByUserId(user_id);
	return 1;
}

@Override
public int updateastroReligion(Astro astro, int user_id, int astro_religion_id) {
	
	Optional<User> user=userRepository.findById(user_id);
	
	if(user!=null)
	{
		Optional <Astro> Astro=astroRepository.findById(astro_religion_id);
		
		if(Astro!=null)
		{
			astroRepository.save(astro);
			return 1;
		}
		else
		{
			System.out.println("Astro religion details not found");
		}
	}
	else {
		System.out.println("user not found");
	}
	Astro astr=astroRepository.save(astro);
	return astr.getAstro_religion_id();	
	
	}

@Override
public Astro getUserById(int user_id) {
	Optional<Astro> optional=astroRepository.findByUserId(user_id);
	if(optional!=null)
	{
		return optional.get();
	}
	else
	{
		return null;
	}
	
}




	}


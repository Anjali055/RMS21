package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.LanguageRepository;
import com.assimilate.matrimony.domain.LanguageEntity;
import com.assimilate.matrimony.service.LanguageService;
@Service
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	LanguageRepository languageRepository;
	
	@Override
	public List<LanguageEntity> getAllLanguage() {
		
		List<LanguageEntity> language=languageRepository.findAll();
		
		return language;
	}

//	@Override
//	public List<Language> getLanguageById(int language_id) {
//		Optional<Language> language=languageRepository.findById(language_id);
//		if (language== null) {
//			return null;
//		}else {
//			
//		}
//		return language;
//	}

}


package com.assimilate.matrimony.restcontroller;

import static com.assimilate.matrimony.common.MatrimonyConstants.API;
import static com.assimilate.matrimony.common.MatrimonyConstants.DELETE_LIFE_STYLE;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_ALL_LANGUAGES;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_ALL_LIFE_STYLES;
import static com.assimilate.matrimony.common.MatrimonyConstants.POST_LIFE_STYLE;
import static com.assimilate.matrimony.common.MatrimonyConstants.UPDATE_LIFE_STYLE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.common.MatrimonyConstants;
import com.assimilate.matrimony.domain.DressStyleEntity;
import com.assimilate.matrimony.domain.HobbiesEntity;
import com.assimilate.matrimony.domain.InterestEntity;
import com.assimilate.matrimony.domain.LanguageEntity;
import com.assimilate.matrimony.domain.LifeStyleEntity;
import com.assimilate.matrimony.domain.SportsEntity;
import com.assimilate.matrimony.service.LanguageService;
import com.assimilate.matrimony.service.LifeStyleService;

@RestController
@RequestMapping(API)
public class LifeStyleRestController {

	@Autowired
	private LifeStyleService lifeStyleService;

	@Autowired
	private LanguageService languageService;

	@PostMapping(POST_LIFE_STYLE)

	public LifeStyleEntity postLifeStyle(@RequestBody LifeStyleEntity lifeStyle) {

		System.out.println("lifeStyle--------"+lifeStyle);
		lifeStyleService.postLifeStyle(lifeStyle);
		

		return lifeStyle;

	}

	@PutMapping(UPDATE_LIFE_STYLE)

	public LifeStyleEntity updateLifeStyle(@RequestBody LifeStyleEntity lifeStyle) {

		lifeStyleService.updateLifeStyle(lifeStyle);

		return lifeStyle;

	}

	@DeleteMapping(DELETE_LIFE_STYLE)

	public int deleteLifeStyle(@PathVariable("lifestyle_id") int lifestyle_id) {

		lifeStyleService.deleteLifeStyle(lifestyle_id);
		return 1;
	}

	@GetMapping(GET_ALL_LANGUAGES)

	public List<LanguageEntity> getAllLanguage() {
		List<LanguageEntity> language = languageService.getAllLanguage();
		return language;
	}

//	@GetMapping("/language/getLanguageById/{getlanguage_id}")
//	public List<Language> getLanguageById(@PathVariable("language_id")int language_id){
//		
//		List<Language> language=languageService.getLanguageById(language_id);
//		return language;
//	}

	@GetMapping(GET_ALL_LIFE_STYLES)
	public ResponseEntity<List<LifeStyleEntity>> getAll() {
		List<LifeStyleEntity> lifeStyle = lifeStyleService.getAll();
		return new ResponseEntity<List<LifeStyleEntity>>(lifeStyle,new HttpHeaders(),HttpStatus.OK);

	}
	
	@GetMapping(MatrimonyConstants.ALL_HOBBIES)
	public List<HobbiesEntity> getAllHobbies(){
		List<HobbiesEntity> list=lifeStyleService.getAllHobbies();
		return list;
	}
	
	
	@GetMapping(MatrimonyConstants.ALL_INTEREST)
	public List<InterestEntity> getAllInterest(){
		List<InterestEntity> list=lifeStyleService.getAllInterest();
		return list;
	}
	
	@GetMapping(MatrimonyConstants.ALL_SPORTS)
	public List<SportsEntity> getAllSports(){
		List<SportsEntity> list=lifeStyleService.getAllSports();
		return list;
	}
	
	@GetMapping(MatrimonyConstants.ALL_DRESS_STYLE)
	public List<DressStyleEntity> getAllDressStyle(){
		List<DressStyleEntity> list=lifeStyleService.getAllDressStyle();
		return list;
	}
	
	
}

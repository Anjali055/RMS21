package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Astro;

public interface AstroService {

	public int createUser(Astro astro);

	

	public List<Astro> getAll();
	
	public int deleteUser(int user_id);
	
	public   int updateastroReligion(Astro astro, int user_id, int astro_religion_id);
	
	public Astro getUserById(int user_id);







	

}

package com.assimilate.matrimony.restcontroller;

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
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Astro;
import com.assimilate.matrimony.service.AstroService;

@RestController
public class AstroController {
	
	@Autowired
	AstroService astroService;
	
	@PostMapping("/api/user/create")
	public ResponseEntity<Astro> createUser(@RequestBody Astro astro)
	
	{
		astroService.createUser(astro);
		return new ResponseEntity<Astro>(astro,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/api/user/getAll")
	public ResponseEntity<List<Astro>> getAll() 
		
	{
		List<Astro> users = astroService.getAll();
		
		return new ResponseEntity<List<Astro>>(users,new HttpHeaders(), HttpStatus.OK);
		}
	
	
	@DeleteMapping("/api/user/delete/{user_id}")
	public String deleteUser(@PathVariable("user_id") Integer user_id)
	{
		astroService.deleteUser(user_id);
		return "user deleted successfully";
		}
	
	@PutMapping("/api/user/update/{user_id}/{astro_religion_id}")
	public Astro updateastroReligion(@RequestBody Astro astro,@PathVariable("user_id")int user_id,@PathVariable("astro_religion_id")
	int astro_religion_id)
	{
		int result=astroService.updateastroReligion(astro,user_id,astro_religion_id);
		return astro;
}

	
	
	@GetMapping("/api/user/getAstroReligionById/{user_id}")
	 public ResponseEntity<Object> getUserById(@PathVariable("user_id") int user_id)
			{
		try 
		{
		
		Astro astroReligion=astroService.getUserById(user_id);
			if(astroReligion!=null)
			{
				return new ResponseEntity<Object>(astroReligion,HttpStatus.OK);
			}
			String message="user not found with id:"+user_id;
			return new ResponseEntity<Object>(message,HttpStatus.NOT_FOUND);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Object>("something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
			
			
		}
			}
	
	
	
}
	



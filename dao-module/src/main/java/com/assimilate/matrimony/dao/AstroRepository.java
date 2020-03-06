package com.assimilate.matrimony.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Astro;

@Repository
@Transactional
public interface AstroRepository extends JpaRepository<Astro,Integer> {
	@Modifying
	@Query("delete from Astro a where a.user.user_id=:user_id")
	int deleteByUserId(@Param ("user_id")int user_id);
	
	@Query("select u from Astro u where u.user.user_id=:user_id")
	
	public Optional<Astro> findByUserId(@Param("user_id")int user_id);
	

	
}

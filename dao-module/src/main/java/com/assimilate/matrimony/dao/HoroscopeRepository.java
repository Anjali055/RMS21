package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.assimilate.matrimony.domain.Horoscope;

@Repository
public interface HoroscopeRepository extends JpaRepository<Horoscope,Integer> {
=======
import com.assimilate.matrimony.domain.HoroscopeEntity;

@Repository
public interface HoroscopeRepository extends JpaRepository<HoroscopeEntity, Integer> {
>>>>>>> f981900817d7a49a6148140e8821500d94310551

}

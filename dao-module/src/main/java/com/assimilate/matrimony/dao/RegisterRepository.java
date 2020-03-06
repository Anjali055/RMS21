package com.assimilate.matrimony.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Register;


@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer>{



}

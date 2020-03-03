package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Employeement;

@Repository
public interface EmployeementRepositary extends JpaRepository<Employeement, Integer>{

}

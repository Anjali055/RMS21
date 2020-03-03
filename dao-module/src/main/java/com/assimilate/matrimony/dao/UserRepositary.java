package com.assimilate.matrimony.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.User;

@Repository
@Transactional
public interface UserRepositary extends JpaRepository<User,Integer>{

	List<User> findAllByisDelete(int i);





}

package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	List<User> findAllByisDelete(int i);
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

import com.assimilate.matrimony.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

import com.assimilate.matrimony.domain.studentEntity;



@Repository
public interface StudentDao extends JpaRepository<studentEntity, Integer> {
	
	

	
}

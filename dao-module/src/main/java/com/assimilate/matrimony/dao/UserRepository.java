package com.assimilate.matrimony.dao;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	List<User> findAllByisDelete(int i);
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
>>>>>>> f981900817d7a49a6148140e8821500d94310551

}

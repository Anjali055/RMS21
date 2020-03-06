package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	List<User> findAllByisDelete(int i);

}

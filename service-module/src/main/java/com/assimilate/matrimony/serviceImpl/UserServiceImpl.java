package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.UserService;

@Service
public class UserServiceImpl implements UserService  {

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<UserEntity> getUser() {
		
		return userRepository.findAll();
	}
	@Override
	public int createUser(UserEntity user) {
		UserEntity userFromDb=userRepository.save(user);
		return userFromDb.getUser_id();
	}
	

}

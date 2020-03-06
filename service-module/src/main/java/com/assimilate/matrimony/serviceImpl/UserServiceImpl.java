package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.UserRepository;

import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
		
	}

	/*
	 * @Override public int updateDelete(int user_id) {
	 * 
	 * User userOptional=userRepository.getOne(user_id);
	 * System.out.println("aaaaaaaaaaa"); if(userOptional!=null) {
	 * System.out.println(userOptional); int size=userOptional.getIsDelete();
	 * System.out.println(size); userOptional.setIsDelete(1);
	 * userRepository.save(userOptional);
	 * 
	 * } return 1; }
	 */

	@Override
	public int booleantrueandfalse(int user_id) {
		User userOptional = userRepository.getOne(user_id);
		if (userOptional != null) {
			System.out.println(userOptional);
			int size = userOptional.getIsDelete();
			System.out.println("ddddd" + size);
			if (userOptional.getIsDelete() != 1) {
				userOptional.setIsDelete(1);
				userRepository.save(userOptional);
			} else {
				userOptional.setIsDelete(0);
				userRepository.save(userOptional);
			}
		}
		return 1;
	}

	@Override
	public List<User> booleantrue() {
		
			return userRepository.findAllByisDelete(0);
		}
		
	}
	
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	private UserRepository userRepository;

	@Override
	public List<UserEntity> getUser() {
		
		List<UserEntity> list=userRepository.findAll();
		
		return list;
	}

	@Override
	public int createUser(UserEntity user) {
		userRepository.save(user);
		return user.getUser_id();
	}

}

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


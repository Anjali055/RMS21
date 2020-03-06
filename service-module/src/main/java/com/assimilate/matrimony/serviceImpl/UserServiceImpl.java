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
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int user_id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(user_id);
	}

	@Override
	public int updateUser(User user) {
		userRepository.save(user);
		return user.getUser_id();
	}

	@Override
	public User userDeletebyId(int user_id) {
		User userob = null;
		User userop = userRepository.getOne(user_id);
		if (userop!= null) {
			if (userop.getIsDelete() != 1) {
				userob = userop;
				return userob;
			} else {
				System.out.println("not inerted the value..........");
			}
		}
		return userob;
	}
}
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

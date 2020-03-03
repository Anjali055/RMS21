package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.UserRepositary;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepositary userRepositary;

	@Override
	public User createUser(User user) {
		return userRepositary.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepositary.findAll();
	}

	@Override
	public int updateUser(User user) {
		userRepositary.save(user);
		return user.getUser_id();
	}

	@Override
	public User getUserById(int user_id) {
		Optional<User> optional = userRepositary.findById(user_id);
		if (optional != null) {
			return optional.get();
		} else {
			return null;
		}
	}

	@Override
	public int booleantrueandfalse(int user_id) {
		User userOptional = userRepositary.getOne(user_id);
		if (userOptional != null) {
			System.out.println(userOptional);
			int size = userOptional.getIsDelete();
			System.out.println("ddddd" + size);
			if (userOptional.getIsDelete() != 1) {
				userOptional.setIsDelete(1);
				userRepositary.save(userOptional);
			} else {
				userOptional.setIsDelete(0);
				userRepositary.save(userOptional);
			}
		}
		return 1;
	}
	

	@Override
	public List<User> booleantrue() {
		return userRepositary.findAllByisDelete(0);
	}
	

	@Override
	public User userDeletebyId(int user_id) {
		User userob = null;
		User userop = userRepositary.getOne(user_id);
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
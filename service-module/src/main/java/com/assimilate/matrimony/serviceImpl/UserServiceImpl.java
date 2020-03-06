
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


package com.assimilate.matrimony.serviceImpl;

import java.util.LinkedList;
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
		return userOptional.getUser_id();
	}

	@Override
	public List<User> booleantrue() {
		return userRepositary.findAllByisDelete(0);
	}

	@Override
	public User userDeletebyId(int user_id) {
		User userob = null;
		User userop = userRepositary.getOne(user_id);
		if (userop != null) {
			if (userop.getIsDelete() != 1) {
				userob = userop;
				return userob;
			} else {
				System.out.println("not inerted the value..........");
			}
		}
		return userob;
	}
//
//	@Override
//	public long getcountno() {
//		long p = userRepositary.countByIsDelete(0);
//		return p;
//	}

//   ****************
	@Override
	public List<User> getAllGrooms() {
		List<User> op = new LinkedList<User>();
		List<User> u1 = userRepositary.findAll();
		for (User u : u1) {
			if ((u.getIsDelete() == 0) && ("male".equals(u.getGender()))) {
				op.add(u);
			}
		}
		return op;
	}

	@Override
	public List<User> getAllBridges() {

		return userRepositary.findByIsDeleteAndGender(0, "female");

	}

	@Override
	public long getcountno() {

		int count = 0;
		List<User> user1 = userRepositary.findAll();
		for (User uuu : user1) {
			if (uuu.getIsDelete() == 0) {
				count++;
			}
		}
		return count;
	}

//      ***************
//	@Override
//	public List<User> getAllBridges() {
//		List<User> uip = new LinkedList<User>();
//		List<User> u1 = userRepositary.findAll();
//		for (User u : u1) {
//			if (uip != null) {
//				if ((u.getIsDelete() == 0) && ("female".equals(u.getGender()))) {
//					uip.add(u);
//				}
//			}
//		}		
//		return uip;
//
//	}
//
//      ***************

}

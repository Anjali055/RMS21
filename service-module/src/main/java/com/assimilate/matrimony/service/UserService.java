package com.assimilate.matrimony.service;

import java.util.List;

<<<<<<< HEAD
import com.assimilate.matrimony.domain.User;

public interface UserService {

	public List<User> getAllUser();

	//public int updateDelete( int  user_id);

	public int booleantrueandfalse(int user_id);

	public List<User> booleantrue();


	
=======
import com.assimilate.matrimony.domain.UserEntity;

public interface UserService {

	 public List<UserEntity> getUser();

	public int createUser(UserEntity user);
>>>>>>> f981900817d7a49a6148140e8821500d94310551

}

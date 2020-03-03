package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.User;

public interface UserService {


	public User createUser(User user);

	public List<User> getAllUser();

	public int updateUser(User user);

	public User getUserById(int user_id);

	public int booleantrueandfalse(int user_id);

	public List<User> booleantrue();

	public User userDeletebyId(int user_id);







	







}






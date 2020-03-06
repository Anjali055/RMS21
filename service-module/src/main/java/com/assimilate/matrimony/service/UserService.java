package com.assimilate.matrimony.service;

import java.util.List;

import javax.validation.Valid;

import com.assimilate.matrimony.domain.User;

public interface UserService {

	public User createUser(User user);

	public List<User> getUsers();

	public User getUserById(int user_id);

	public int updateUser( User user);

	public User userDeletebyId(int user_id);



	

}
package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.UserEntity;

public interface UserService {
public List<UserEntity> getUser();

public int createUser(UserEntity user);
}

package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.UserEntity;

public interface UserService {
public List<UserEntity> getUser();

public int createUser(UserEntity user);
}

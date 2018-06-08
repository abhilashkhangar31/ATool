package com.atool.daos;

import java.util.List;

import com.atool.pojos.UserRegistration;

public interface RegistrationDao {
	List<String> getAllUserId();

	void saveNewUser(UserRegistration newUser);
}

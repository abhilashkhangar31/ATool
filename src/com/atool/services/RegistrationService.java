package com.atool.services;

import com.atool.pojos.UserRegistration;

public interface RegistrationService {
	boolean isUserIdTaken(String userId);

	void registerUser(UserRegistration newUser);
}

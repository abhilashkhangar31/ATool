package com.atool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atool.daos.RegistrationDao;
import com.atool.pojos.UserRegistration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao registrationDao;
	
	@Override
	public void registerUser(UserRegistration newUser) {
		registrationDao.saveNewUser(newUser);
	}
	
	@Override
	public boolean isUserIdTaken(String userId) {
		return registrationDao.getAllUserId().contains(userId);
	}

}

package com.atool.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atool.pojos.UserCredential;
import com.atool.pojos.UserRegistration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	SessionFactory factory;
	
	@Override
	public void saveNewUser(UserRegistration newUser) {
		Session session = factory.getCurrentSession();
		try {
			session.persist(newUser);
		} catch (Exception e) {

		}
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<String> getAllUserId() {
		Session session = factory.getCurrentSession();
		List<String> userIdList = new ArrayList<>();
		try {
			userIdList = session.createCriteria(UserCredential.class).setProjection(Projections.property("userId")).list();
		} catch (Exception e) {
			
		}
		return userIdList;
	}

}

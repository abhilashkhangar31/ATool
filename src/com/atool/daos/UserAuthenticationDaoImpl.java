package com.atool.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atool.pojos.UserCredential;

@Repository
public class UserAuthenticationDaoImpl implements UserAuthenticationDao {

	@Autowired
	SessionFactory factory;

	@Override
	public UserCredential getUserByUserId(String userId) {
		Session session = factory.getCurrentSession();
		UserCredential user = new UserCredential();
		try {
			String hql = "from UserCredential uc where uc.userId = :userId";
			user = (UserCredential) session.createQuery(hql).setParameter("userId", userId).uniqueResult();
		} catch (Exception e) {

		}
		return user;
	}

}

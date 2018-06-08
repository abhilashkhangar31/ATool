package com.atool.daos;

import com.atool.pojos.UserCredential;

public interface UserAuthenticationDao {
	UserCredential getUserByUserId(String userId);
}

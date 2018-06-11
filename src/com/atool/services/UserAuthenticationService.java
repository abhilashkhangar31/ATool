/**
 * 
 */
package com.atool.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atool.daos.UserAuthenticationDao;
import com.atool.pojos.UserCredential;
import com.atool.pojos.UserInformation;

/**
 * @author abhilashk
 *
 */
@Service("customUserDetailsService")
public class UserAuthenticationService implements UserDetailsService {

	@Autowired
	UserAuthenticationDao ad;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserCredential user = ad.getUserByUserId(userId);
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		if (user == null) {
			throw new UsernameNotFoundException("Username not found.");
		}
		return new UserInformation(user.getUserRegistration().getFirstName(), user.getUserId(), user.getPassword(), true, true, true, true, authorities);
	}

}

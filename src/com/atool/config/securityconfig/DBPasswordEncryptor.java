package com.atool.config.securityconfig;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DBPasswordEncryptor implements PasswordEncoder {

	private static final BCryptPasswordEncoder BCRPT = new BCryptPasswordEncoder(11);

	@Override
	public String encode(CharSequence originalPassword) {
		String encodedPassword = BCRPT.encode(originalPassword);
		return encodedPassword;
	}

	@Override
	public boolean matches(CharSequence originalPassword, String encodedPassword) {
		return BCRPT.matches(originalPassword, encodedPassword);
	}

}

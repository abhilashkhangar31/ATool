package com.atool.config.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.atool.config.interceptors.NoScriptDetector;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("customUserDetailsService")
	UserDetailsService userDetailsService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// Header settings.
		http.headers()
				.xssProtection().xssProtectionEnabled(true).and()
				.cacheControl().and()
				.contentTypeOptions().and()
				.frameOptions().sameOrigin().httpStrictTransportSecurity();
		
		// Request authorization settings.
		http.authorizeRequests()
				.antMatchers( "/", "/home", "/login", "/register/user", "/error" ).permitAll()
				.anyRequest().authenticated().and()
				.formLogin().loginPage("/login")
				.loginProcessingUrl("/login/processLogin")
				.defaultSuccessUrl("/login/processLogin", true)
				.failureUrl("/login?error=true")
				.usernameParameter("userId").passwordParameter("password").and()
				.logout().logoutUrl("/logout").logoutSuccessUrl("/userLogin").clearAuthentication(true)
				.invalidateHttpSession(true).and()
				.csrf().disable()
				.exceptionHandling()
				.accessDeniedPage("/accessDenied");

		// Session management settings.
		http.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).maximumSessions(1)
				.expiredUrl("/login").and()
				.enableSessionUrlRewriting(false)
				.sessionFixation().none();
		
		// Application filters.
		http.addFilterAfter(noScriptDetector(), UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService);
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}

	@Bean
	public AuthenticationTrustResolver getAuthenticationTrustResolver() {
		return new AuthenticationTrustResolverImpl();
	}
	
	@Bean
	public NoScriptDetector noScriptDetector() {
		return new NoScriptDetector();
	}

}

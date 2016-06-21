package org.sepro.authentifictionweb.security;

import javax.annotation.Resource;

import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.ProviderNotFoundException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import org.springframework.security.web.authentication.rememberme.RememberMeAuthenticationException;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.www.NonceExpiredException;
import org.springframework.stereotype.Service;

@Service("authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {


	@Resource(name = "authenticationManager")
	private AuthenticationManager authenticationManager; // specific for Spring Security
	private UserAuthAttempt	userAuthAttempt = new UserAuthAttempt();
	
	@Override
	public boolean login(String username, String password) throws Exception {
		try {
			Authentication authenticate = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(
							username, password));
			if (authenticate.isAuthenticated()) {
				SecurityContextHolder.getContext().setAuthentication(
						authenticate);	
				userAuthAttempt.resetFailAttempts(username);
				return true;
			}
		} catch (BadCredentialsException ex) {	
			userAuthAttempt.updateFailAttempts(username);
			if (userAuthAttempt.getUserAttempts(username) > 2){
				userAuthAttempt.lockUser(username);
			}
			throw ex;
		} catch (Exception e) {	
			throw e;
		}

		return false;
	}
	@Override
	public void logout() {
		SecurityContextHolder.getContext().setAuthentication(null);
		//currentUser.unauthenticate();
	}

	
}

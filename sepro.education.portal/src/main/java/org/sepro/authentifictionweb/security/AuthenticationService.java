package org.sepro.authentifictionweb.security;


public interface AuthenticationService {
	
	boolean login(String username, String password) throws Exception;

	void logout();
}

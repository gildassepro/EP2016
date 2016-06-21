package org.sepro.authentifictionweb.security;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;

public class UserAuthAttempt {
	private Logger logger = Logger.getLogger(UserAuthAttempt.class);
	
	private UserServicews userServicews =  new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint = userServicews.getUserServicewsImplPort();;
	
	public void updateFailAttempts(String userlogin) {
		userServicewsEndpoint.updateFailAttempts(userlogin);
	}
	
	public int getUserAttempts(String userlogin) {
		return userServicewsEndpoint.getUserAttempts(userlogin);
	}
	
	public void resetFailAttempts(String userlogin) {
		logger.setLevel(Level.DEBUG);
		logger.debug("resetFailAttempts");
		userServicewsEndpoint.resetFailAttempts(userlogin);
	}
	
	public void lockUser(String userlogin) {
		userServicewsEndpoint.lockUser(userlogin);
	}
}

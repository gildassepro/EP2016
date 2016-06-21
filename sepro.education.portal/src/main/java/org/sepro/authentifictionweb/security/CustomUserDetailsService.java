package org.sepro.authentifictionweb.security;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.AuthDto;
import org.sepro.authentificationweb.serviceapi.MenuDto;
import org.sepro.authentificationweb.serviceapi.ModuleDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.authentificationweb.serviceapi.UserDto;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
	
	private Logger logger = Logger.getLogger(CustomUserDetailsService.class);
	private UserServicews userServicews =  new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint ;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init loadUserByUsername");
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();
		} catch (Exception e) {
			e.printStackTrace();
		}
		AuthDto authDto = new AuthDto();
		authDto.setUserlogin(login);
		authDto = userServicewsEndpoint.authentifyUserbyPasswordws(authDto);
		if(authDto!=null){
			boolean enabled = authDto.isEnabled();
			boolean accountNonExpired = authDto.isCredentialsNonExpired();
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = authDto.isAccountIslocked();
			if (authDto.isEnabled()){
				logger.debug("getEnabled true");
			}else {
				logger.debug("getEnabled false");
			}
			
			if (authDto.isCredentialsNonExpired()){
				logger.debug("getCredentialsNonExpired true");
			}else {
				logger.debug("getCredentialsNonExpired false");
			}
			
			if (authDto.isAccountIslocked()){
				logger.debug("getAccountIslocked true");
			}else {
				logger.debug("getAccountIslocked false");
			}
	//		
	//
	//		boolean enabled = true;
	//		boolean accountNonExpired = true;
	//		boolean credentialsNonExpired =true;
	//		boolean accountNonLocked = true;
			logger.debug("end init loadUserByUsername "+authDto.getPassword());
			return new User(
					 authDto.getUserlogin(),
					 authDto.getPassword(),
			         enabled,
			         accountNonExpired,
			         credentialsNonExpired,
			         accountNonLocked,
			         getAuthorities(authDto.getProfile())
			 );
		}
		else{
			UsernameNotFoundException e = new UsernameNotFoundException("UsernameNotFoundException");
			throw  e;
		}
     }

     public Collection<? extends GrantedAuthority> getAuthorities(ProfileDto profileDto) {
    	 List<String> roles = new ArrayList<String>();
    	 for (ModuleDto moduleDto : profileDto.getModules().getModule()) {
    		 for(MenuDto menuDto : moduleDto.getMenus().getMenu()){
    			 for(RoleDto roleDto : menuDto.getRoles().getRole()){
    				 roles.add(roleDto.getRoleName());
    			 }
    		 }
    	 }
         List<GrantedAuthority> authList = getGrantedAuthorities(roles);
         return authList;
     }


     public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
         List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

         for (String role : roles) {
             authorities.add(new SimpleGrantedAuthority(role));
         }
         return authorities;
     }
}

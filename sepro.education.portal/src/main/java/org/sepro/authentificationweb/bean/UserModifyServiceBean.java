package org.sepro.authentificationweb.bean;



import java.util.List;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.UserDto;
import org.sepro.authentificationweb.serviceimpl.ProfileServicews;
import org.sepro.authentificationweb.serviceimpl.ProfileServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.RoleServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserModifyServiceBean {
	
	private static final long serialVersionUID = 1L;
    private Locale locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle("sepro.education.language.messages",locale); 
	private Logger logger = Logger.getLogger(UserCreateServiceBean.class);
	private UserServicews userServicews =  new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint;	
	private UserDto user;
	
	private List<UserDto> listUser;
	
	
	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<UserDto> getListUser() {
		return listUser;
	}

	public void setListUser(List<UserDto> listUser) {
		this.listUser = listUser;
	}

	public UserModifyServiceBean() {
		super();
	}
	
	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init UserServiceBean");
			
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();			
			listUser = userServicewsEndpoint.getAllUserServicews();
			logger.debug("end init UserServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public String modifierUser(){
		
		logger.debug("begin createUser UserCreateServiceBean");
		FacesMessage msg = null;
		try {
			UserDto modifUserDto = new UserDto();
			logger.debug("begin before JAXBElement UserCreateServiceBean");
			modifUserDto.setEnabled(true);
			modifUserDto.setAccountIslocked(true);		
			modifUserDto.setCredentialsNonExpired(true);
			modifUserDto.setNumberOfAttempt(0);

			return "/education/index?faces-redirect=true"; 
		} catch (Exception e) {
			logger.debug("error date createUser UserCreateServiceBean");
			e.printStackTrace();
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_nonceexpiredexception"),
					rb.getString("label_nonceexpiredexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return null;
		}
	}

}

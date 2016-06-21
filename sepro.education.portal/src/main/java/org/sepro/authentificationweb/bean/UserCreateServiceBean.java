package org.sepro.authentificationweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.MenuDto;
import org.sepro.authentificationweb.serviceapi.ModuleDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.authentificationweb.serviceapi.UserDto;
import org.sepro.authentificationweb.serviceapi.ModuleDto.Menus;
import org.sepro.authentificationweb.serviceimpl.ProfileServicews;
import org.sepro.authentificationweb.serviceimpl.ProfileServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.xml.bind.JAXBElement;
@ManagedBean
@RequestScoped
public class UserCreateServiceBean  implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private Locale locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle("sepro.education.language.messages",locale); 
	private Logger logger = Logger.getLogger(UserCreateServiceBean.class);
	private UserServicews userServicews =  new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint ;
	private ProfileServicews profileServicews =  new ProfileServicews();
	private ProfileServicewsEndpoint profileServicewsEndpoint ;
	private String password;
	private String userlogin;
	private String confirmpassword;
	private String emailadd;
	private long userid;
	private ProfileDto profile;
	private Calendar now = Calendar.getInstance();      
	private List<ProfileDto> listProfile;
	private List<UserDto> listuser;
	private UserDto userDto;

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	
	public ProfileDto getProfile() {
		return profile;
	}

	public void setProfile(ProfileDto profile) {
		this.profile = profile;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getEmailadd() {
		return emailadd;
	}

	public void setEmailadd(String emailadd) {
		this.emailadd = emailadd;
	}

	public List<ProfileDto> getListProfile() {
		return listProfile;
	}

	public void setListProfile(List<ProfileDto> listProfile) {
		this.listProfile = listProfile;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserlogin() {
		return userlogin;
	}
	
	public void setUserlogin(String userlogin) {
		this.userlogin = userlogin;
	}

	public UserCreateServiceBean() {
		super();
	}
	
	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			profileServicewsEndpoint = profileServicews.getProfileServicewsImplPort();
			listProfile = profileServicewsEndpoint.getAllProfileServicews();
			UserDto userDtoFlash = (UserDto)FacesContext.getCurrentInstance().getExternalContext().getFlash().get("userkey");
			ProfileDto profileDtoFlash = (ProfileDto)FacesContext.getCurrentInstance().getExternalContext().getFlash().get("profilekey");
			if (userDtoFlash != null){
				userDto = userDtoFlash;
			logger.debug("begin init UserServiceBean");
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();
			
			listuser = userServicewsEndpoint.getAllUserServicews();
			logger.debug("end init UserServiceBean");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
	public String createUser(){	
		logger.debug("begin createUser UserCreateServiceBean");
		FacesMessage msg = null;
		try {
			String hashedPassword;
			UserDto creatUserDto = new UserDto();
			creatUserDto.setUserlogin(this.getUserlogin());
			creatUserDto.setPasswordNbrDay(60);
			creatUserDto.setEmailAdd(this.getEmailadd());
			creatUserDto.setEnabled(true);
			creatUserDto.setAccountIslocked(true);
			PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			hashedPassword = passwordEncoder.encode(this.getPassword());		
			creatUserDto.setPassword(hashedPassword);	
			creatUserDto.setCredentialsNonExpired(true);
			creatUserDto.setNumberOfAttempt(0);
			creatUserDto.setProfile(this.getProfile());
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
			.newXMLGregorianCalendar(gregory);
			creatUserDto.setPasswordDate(nowGregorian);
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();
			userDto = userServicewsEndpoint.createUserServicews(creatUserDto);
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

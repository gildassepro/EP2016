package org.sepro.authentificationweb.bean;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.UserDto;
import org.sepro.authentificationweb.serviceimpl.ProfileServicews;
import org.sepro.authentificationweb.serviceimpl.ProfileServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@ManagedBean
@ViewScoped
public class UserSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(UserSearchServiceBean.class);
	private UserServicews userServicews = new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint;
	private ProfileServicews profileServicews = new ProfileServicews();
	private ProfileServicewsEndpoint profileServicewsEndpoint;
	private List<ProfileDto> listProfile = new ArrayList<ProfileDto>();
	private List<UserDto> listuser = new ArrayList<UserDto>();
	private String password = new String();
	private String userlogin = new String();
	private String confirmpassword = new String();
	private String emailadd = new String();
	private long userid = 0;
	private ProfileDto profile = new ProfileDto();
	private Calendar now = Calendar.getInstance();
	private UserDto userDto = new UserDto();
	private UserDto usersDto = new UserDto();
	private boolean action = false;
	private boolean enabled;
	private boolean action2 = false;
	private boolean action3 = true;

	
	
	public boolean isAction2() {
		return action2;
	}

	public void setAction2(boolean action2) {
		this.action2 = action2;
	}

	public boolean isAction3() {
		return action3;
	}

	public void setAction3(boolean action3) {
		this.action3 = action3;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserDto getUsersDto() {
		return usersDto;
	}

	public void setUsersDto(UserDto usersDto) {
		this.usersDto = usersDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

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

	public List<UserDto> getListuser() {
		return listuser;
	}

	public void setListuser(List<UserDto> listuser) {
		this.listuser = listuser;
	}

	public List<ProfileDto> getListProfile() {
		return listProfile;
	}

	public void setListProfile(List<ProfileDto> listProfile) {
		this.listProfile = listProfile;
	}

	public UserSearchServiceBean() {
		super();
	}

	public void createUser() {
		FacesMessage msg = null;
		try {
			String hashedPassword;
			UserDto creatUserDto = new UserDto();
			creatUserDto.setUserlogin(userDto.getUserlogin());
			creatUserDto.setPasswordNbrDay(60);
			creatUserDto.setEmailAdd(userDto.getEmailAdd());
			creatUserDto.setEnabled(userDto.getEnabled());
			creatUserDto.setAccountIslocked(true);
			PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			hashedPassword = passwordEncoder.encode(userDto.getPassword());
			creatUserDto.setPassword(hashedPassword);
			creatUserDto.setCredentialsNonExpired(true);
			creatUserDto.setNumberOfAttempt(0);
			creatUserDto.setProfile(userDto.getProfile());
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			creatUserDto.setPasswordDate(nowGregorian);
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();
			userDto = userServicewsEndpoint.createUserServicews(creatUserDto);
			init();
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_msg_create_user")));
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,
					rb.getString("label_nonceexpiredexception"),
					rb.getString("label_nonceexpiredexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public String modifierUser() {
		logger.debug("DEBUT modifierUser");
		UserDto usermodif = new UserDto();
		try {
			usermodif.setProfile(userDto.getProfile());
			usermodif.setUserlogin(userDto.getUserlogin());
			usermodif.setEmailAdd(userDto.getEmailAdd());
			usermodif.setEnabled(userDto.getEnabled());
			usermodif.setIdUser(userDto.getIdUser());
			usermodif = userServicewsEndpoint.updateUserServicews(usermodif);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_user")));
		return null;
	}

	public void initUser(String baction) {
		if (baction.equals("1")) {
			userDto = usersDto;
			listProfile = new ArrayList<ProfileDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			userDto = new UserDto();
			listProfile = new ArrayList<ProfileDto>();
			action2 = true;
			action3= false;
			initCreate();

		}
	}

	public void initCreate() {
		try {
			action = true;
			profileServicewsEndpoint = profileServicews
					.getProfileServicewsImplPort();
			listProfile = profileServicewsEndpoint.getAllProfileServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initUpdate() {
		try {
			action = false;
			listProfile = new ArrayList<ProfileDto>();
			profileServicewsEndpoint = profileServicews
					.getProfileServicewsImplPort();
			listProfile = profileServicewsEndpoint.getAllProfileServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		try {
			logger.debug("begin init UserServiceBean");
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();
			listuser = userServicewsEndpoint.getAllUserServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

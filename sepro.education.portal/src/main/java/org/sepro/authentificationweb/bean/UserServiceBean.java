package org.sepro.authentificationweb.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.text.SimpleDateFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.ModuleDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto.Modules;
import org.sepro.authentificationweb.serviceapi.UserDto;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;
import org.sepro.authentifictionweb.security.AuthenticationService;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.AccountStatusException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.ProviderNotFoundException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedCredentialsNotFoundException;
import org.springframework.security.web.authentication.rememberme.RememberMeAuthenticationException;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.www.NonceExpiredException;


@ManagedBean
@SessionScoped
public class UserServiceBean  implements Serializable {
	
	@ManagedProperty(value = "#{authenticationService}")
	private AuthenticationService authenticationService; // injected Spring defined service for bikes
	
	private static final long serialVersionUID = 1L;
    private Locale locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle("sepro.education.language.messages",locale); 
	private Logger logger = Logger.getLogger(UserServiceBean.class);
	private UserServicews userServicews =  new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint ;
	private String password;
	private String userlogin;
	private UserDto userDto;
	private String lastConnection;
	private List<ModuleDto> listModules;
	private	SimpleDateFormat formater = null;
	private Long selectedModule = new Long(0);
	private Long selectedMenu = new Long(0);
	private Long selectedSousMenu = new Long(0);
	
	
	public Long getSelectedMenu() {
		Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		if (params.get("menu") == null){
			return selectedMenu;
		}else{
			selectedMenu = new Long(params.get("menu"));
			return selectedMenu;
		}
	}

	public void setSelectedMenu(Long selectedMenu) {
		this.selectedMenu = selectedMenu;
	}

	public Long getSelectedSousMenu() {
		Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		if (params.get("sousmenu") == null){
			return selectedSousMenu;
		}else{
			selectedSousMenu = new Long(params.get("sousmenu"));
			return selectedSousMenu;
		}
	}

	public void setSelectedSousMenu(Long selectedSousMenu) {
		this.selectedSousMenu = selectedSousMenu;
	}

	public Long getSelectedModule() {
		Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		if (params.get("module") == null){
			return selectedModule;
		}else{
			selectedModule = new Long(params.get("module"));
			return selectedModule;
		}
	}

	public void setSelectedModule(Long selectedModule) {
		this.selectedModule = selectedModule;
	}

	public String getLastConnection() {
		if(userDto.getLastConnection() == null) {
			return null;
		}
		getFormater();
		return formater.format(userDto.getLastConnection().toGregorianCalendar().getTime());
	}

	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	public void setLastConnection(String lastConnection) {
		this.lastConnection = lastConnection;
	}
		 
	public SimpleDateFormat getFormater() {
		formater = new SimpleDateFormat(rb.getString("label_datetime_format"));
		return formater;
	}

	public void setFormater(SimpleDateFormat formater) {
		this.formater = formater;
	}

	public List<ModuleDto> getListModules() {
		return listModules;
	}

	public void setListModules(List<ModuleDto> listModules) {
		this.listModules = listModules;
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

	public UserServiceBean() {
		super();
	}
	
	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init UserServiceBean");
			userServicewsEndpoint = userServicews.getUserServicewsImplPort();
			logger.debug("end init UserServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	public String connectLogin() {
		logger.debug("begin connectLogin UserServiceBean");
		FacesMessage msg = null;
		boolean success = false;
		try{
			success = authenticationService.login(this.getUserlogin(), this.getPassword());
		} catch (CredentialsExpiredException e) {	
			logger.debug("begin exception NonceExpiredException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_nonceexpiredexception"),
					rb.getString("label_nonceexpiredexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (AccountExpiredException e) {	
			logger.debug("begin exception NonceExpiredException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_nonceexpiredexception"),
					rb.getString("label_nonceexpiredexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		}catch (AccountStatusException e) {	
			logger.debug("begin exception AccountStatusException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_accountstatusexception"),
					rb.getString("label_accountstatusexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return null;
		} catch (AuthenticationCredentialsNotFoundException e) {	
			logger.debug("begin exception AuthenticationCredentialsNotFoundException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_authenticationcredentialsnotfoundexception"),
					rb.getString("label_authenticationcredentialsnotfoundexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (BadCredentialsException e) {	
			logger.debug("begin exception BadCredentialsException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_badcredentialsexception"),
					rb.getString("label_badcredentialsexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (InsufficientAuthenticationException e) {	
			logger.debug("begin exception InsufficientAuthenticationException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_insufficientauthenticationexception"),
					rb.getString("label_insufficientauthenticationexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (PreAuthenticatedCredentialsNotFoundException e) {	
			logger.debug("begin exception PreAuthenticatedCredentialsNotFoundException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_preauthenticatedcredentialsnotfoundexception"),
					rb.getString("label_preauthenticatedcredentialsnotfoundexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (ProviderNotFoundException e) {	
			logger.debug("begin exception ProviderNotFoundException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_providernotfoundexception"),
					rb.getString("label_providernotfoundexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (RememberMeAuthenticationException e) {	
			logger.debug("begin exception RememberMeAuthenticationException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_remembermeauthenticationexception"),
					rb.getString("label_remembermeauthenticationexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (SessionAuthenticationException e) {	
			logger.debug("begin exception SessionAuthenticationException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_sessionauthenticationexception"),
					rb.getString("label_sessionauthenticationexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (UsernameNotFoundException e) {	
			logger.debug("begin exception UsernameNotFoundException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_usernamenotfoundexception"),
					rb.getString("label_usernamenotfoundexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (AuthenticationServiceException e) {	
			logger.debug("begin exception AuthenticationServiceException");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_authenticationserviceexception"),
					rb.getString("label_authenticationserviceexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		} catch (Exception e) {
			logger.debug("begin exception Exception");
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_connexion_invalid_credential"),
					rb.getString("label_connexion_invalid_credential"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		}
		
		logger.debug("after authenticationService");
		
		if (success){
			logger.debug("start getUserBylogin");
			userDto = userServicewsEndpoint.getUserBylogin(this.getUserlogin());
			logger.debug("end getUserBylogin");
			setprofile();
			return "/education/index?faces-redirect=true";
		}
		else{
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,rb.getString("label_connexion_error"),
					rb.getString("label_connexion_error"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
            //return "incorrect";
			return null;
		}
	}
	
	
	public void setprofile(){
		logger.debug("begin setprofile");
		ProfileDto profileDto = userDto.getProfile();
		if(profileDto != null){
			Modules modules = profileDto.getModules();
			listModules = modules.getModule();
			logger.debug("module name"+listModules.get(0).getModuleName()+"module image"+listModules.get(0).getModuleImage());
		}else{
			logger.debug("no profile");
		}
	}

}

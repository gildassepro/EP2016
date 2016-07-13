package org.sepro.authentificationweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.model.DualListModel;
import org.sepro.authentificationweb.serviceapi.ModuleDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto.Modules;
import org.sepro.authentificationweb.serviceimpl.ModuleServicews;
import org.sepro.authentificationweb.serviceimpl.ModuleServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.ProfileServicews;
import org.sepro.authentificationweb.serviceimpl.ProfileServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ProfilSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ProfilSearchServiceBean.class);
	private ProfileServicews profileServicews = new ProfileServicews();
	private ProfileServicewsEndpoint profileServicewsEndpoint;

	private List<ProfileDto> listProfile = new ArrayList<ProfileDto>();
	private ModuleServicews moduleServicews = new ModuleServicews();
	private ModuleServicewsEndpoint moduleServicewsEndpoint;
	private List<ModuleDto> listModuleSource = new ArrayList<ModuleDto>();
	private List<ModuleDto> listModuleDestination = new ArrayList<ModuleDto>();
	private ProfileDto profilDto = new ProfileDto();
	private ProfileDto profileDto = new ProfileDto();
	private boolean action = false;
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

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public List<ModuleDto> getListModuleSource() {
		return listModuleSource;
	}

	public void setListModuleSource(List<ModuleDto> listModuleSource) {
		this.listModuleSource = listModuleSource;
	}

	public List<ModuleDto> getListModuleDestination() {
		return listModuleDestination;
	}

	public void setListModuleDestination(List<ModuleDto> listModuleDestination) {
		this.listModuleDestination = listModuleDestination;
	}

	public ProfileDto getProfilDto() {
		return profilDto;
	}

	public void setProfilDto(ProfileDto profilDto) {
		this.profilDto = profilDto;
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;
			moduleServicewsEndpoint = moduleServicews
					.getModuleServicewsImplPort();
			listModuleSource = moduleServicewsEndpoint.getAllModuleServicews();
			logger.debug("fin dual");
			if (profilDto != null) {
				for (ModuleDto mod : profilDto.getModules().getModule()) {
					for (ModuleDto mods : listModuleSource) {
						if (mods.getIdModule() == mod.getIdModule()) {
							listModuleDestination.add(mods);
							break;
						}
					}
				}
			}
			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			moduleServicewsEndpoint = moduleServicews
					.getModuleServicewsImplPort();
			listModuleSource = moduleServicewsEndpoint.getAllModuleServicews();
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String updateProfil() {
		logger.debug("DEBUT modifierProfil +++++++++++++");
		FacesMessage msg = null;
		ProfileDto profilUp = new ProfileDto();

		try {
			Modules module = new Modules();
			module.getModule().addAll(listModuleDestination);
			profilUp.setModules(module);
			profilUp.setProfilName(profilDto.getProfilName());
			profileServicewsEndpoint = profileServicews
					.getProfileServicewsImplPort();
			profilUp.setIdProfile(profilDto.getIdProfile());
			profilUp = profileServicewsEndpoint
					.updateProfileServicews(profilUp);
			init();

		} catch (Exception ex) {
			return null;

		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_profil"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN modifierProfil +++++++++++++");

		return null;
	}

	public void createProfil() {
		logger.debug("DEBUT createProfil +++++++++++++");
		FacesMessage msg = null;
		ProfileDto profilcreate = new ProfileDto();
		Modules module = new Modules();
		module.getModule().addAll(listModuleDestination);
		profilcreate.setModules(module);
		profilcreate.setProfilName(profilDto.getProfilName());
		profileServicewsEndpoint = profileServicews
				.getProfileServicewsImplPort();
		profilcreate = profileServicewsEndpoint
				.createProfileServicews(profilcreate);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_profil"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("DEBUT createProfil +++++++++++++");
	}

	public ProfileDto getProfileDto() {
		return profileDto;
	}

	public void setProfileDto(ProfileDto profileDto) {
		this.profileDto = profileDto;
	}

	public List<ProfileDto> getListProfile() {
		return listProfile;
	}

	public void setListProfile(List<ProfileDto> listProfile) {
		this.listProfile = listProfile;
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			profilDto = profileDto;
			listModuleSource = new ArrayList<ModuleDto>();
			listModuleDestination = new ArrayList<ModuleDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			profilDto = new ProfileDto();
			listModuleSource = new ArrayList<ModuleDto>();
			listModuleDestination = new ArrayList<ModuleDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
		logger.debug("DEBUT initDualList +++++++++++++");
	}

	public String supprimerProfil() {
		logger.debug("DEBUT Suppresssion Region +++++++++++++");
		FacesMessage msg = null;

		try {
			profileServicewsEndpoint.deleteProfileServicews(profileDto);
			init();

		} catch (Exception ex) {

			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_warn_profil"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_profil"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN Suppression Region +++++++++++++");

		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init ProfilServiceBean");
			profileServicewsEndpoint = profileServicews
					.getProfileServicewsImplPort();
			listProfile = profileServicewsEndpoint.getAllProfileServicews();
			logger.debug("end init ProfilServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
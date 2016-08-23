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
import org.sepro.authentificationweb.serviceapi.MenuDto;
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.authentificationweb.serviceapi.MenuDto.Roles;
import org.sepro.authentificationweb.serviceimpl.MenuServicews;
import org.sepro.authentificationweb.serviceimpl.MenuServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.RoleServicews;
import org.sepro.authentificationweb.serviceimpl.RoleServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ChildMenuSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ChildMenuSearchServiceBean.class);
	private MenuServicews menuServicews = new MenuServicews();
	private MenuServicewsEndpoint menuServicewsEndpoint;
	private List<MenuDto> listsousmenu = new ArrayList<MenuDto>();
	private MenuDto sousmenuDto = new MenuDto();
	private MenuDto sousmenuDtos = new MenuDto();
	private RoleServicews roleServicews = new RoleServicews();
	private RoleServicewsEndpoint roleServicewsEndpoint;
	private List<RoleDto> listRoleSource = new ArrayList<RoleDto>();
	private List<RoleDto> listRoleDestination = new ArrayList<RoleDto>();
	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean test = true;
	private String description = new String();

	
	
	public boolean isTest() {
		return test;
	}


	public void setTest(boolean test) {
		this.test = test;
	}


	public boolean isAction2() {
		return action2;
	}

	
	public MenuDto getSousmenuDtos() {
		return sousmenuDtos;
	}



	public void setSousmenuDtos(MenuDto sousmenuDtos) {
		this.sousmenuDtos = sousmenuDtos;
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

	public List<RoleDto> getListRoleSource() {
		return listRoleSource;
	}

	public void setListRoleSource(List<RoleDto> listRoleSource) {
		this.listRoleSource = listRoleSource;
	}

	public List<RoleDto> getListRoleDestination() {
		return listRoleDestination;
	}

	public void setListRoleDestination(List<RoleDto> listRoleDestination) {
		this.listRoleDestination = listRoleDestination;
	}

	public MenuDto getSousmenuDto() {
		return sousmenuDto;
	}

	public void setSousmenuDto(MenuDto sousmenuDto) {
		this.sousmenuDto = sousmenuDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void initUpdate() {
		logger.setLevel(Level.DEBUG);
		action=false;
		try {
			logger.debug("begin init MenuCreateServiceBean");
			if (sousmenuDto != null) {
				menuServicewsEndpoint = menuServicews
						.getMenuServicewsImplPort();
				roleServicewsEndpoint = roleServicews
						.getRoleServicewsImplPort();
				listRoleSource = roleServicewsEndpoint.getAllRoleServicews();
				if (sousmenuDto != null) {
					for (RoleDto role : sousmenuDto.getRoles().getRole()) {
						for (RoleDto roles : listRoleSource) {
							if (roles.getIdRole() == role.getIdRole()) {
								listRoleDestination.add(roles);
								break;
							}
						}
					}
				}
				logger.debug("end init ChildMenuCreateServiceBean");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void initCreate() {
		logger.setLevel(Level.DEBUG);
		action = true;
		try {
			logger.debug("begin init MenuCreateServiceBean");
			if (sousmenuDto != null) {
				menuServicewsEndpoint = menuServicews
						.getMenuServicewsImplPort();
				roleServicewsEndpoint = roleServicews
						.getRoleServicewsImplPort();
				listRoleSource = roleServicewsEndpoint.getAllRoleServicews();
				if (sousmenuDto != null) {
					for (RoleDto role : sousmenuDto.getRoles().getRole()) {
						for (RoleDto roles : listRoleSource) {
							if (roles.getIdRole() == role.getIdRole()) {
								listRoleDestination.add(roles);
								break;
							}
						}
					}
				}
				logger.debug("end init ChildMenuCreateServiceBean");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void duppSousMenu(){
		FacesMessage msg = null;
		MenuDto sousmenuDupp = new MenuDto();
		Roles role = new Roles();
		role.getRole().addAll(listRoleDestination);
		sousmenuDupp.setRoles(role);
		sousmenuDupp.setMenuName(sousmenuDto.getMenuName());
		sousmenuDupp.setIsSystem(false);
		menuServicewsEndpoint = menuServicews.getMenuServicewsImplPort();
		sousmenuDupp.setDescription(this.description);
		sousmenuDupp = menuServicewsEndpoint
				.createMenuServicews(sousmenuDupp);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_dup_sousmenu"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		
		init();
		
	}
	public void modifSousMenu(){
		
		FacesMessage msg = null;
		MenuDto sousmenuDupp = new MenuDto();
		Roles role = new Roles();
		role.getRole().addAll(listRoleDestination);
		sousmenuDupp.setRoles(role);
		sousmenuDupp.setMenuName(sousmenuDto.getMenuName());
		sousmenuDupp.setIsSystem(false);
		menuServicewsEndpoint = menuServicews.getMenuServicewsImplPort();
		
		sousmenuDupp.setDescription(sousmenuDto.getDescription());
		sousmenuDupp.setIdMenu(sousmenuDto.getIdMenu());
		sousmenuDupp = menuServicewsEndpoint
				.updateMenuServicews(sousmenuDupp);

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_sousmenu"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		
		init();
		
	}
	

	public List<MenuDto> getListsousmenu() {
		return listsousmenu;
	}

	public void setListsousmenu(List<MenuDto> listsousmenu) {
		this.listsousmenu = listsousmenu;
	}

	public void initDualList(String baction) {
		logger.debug("start dual");
		listRoleSource = new ArrayList<RoleDto>();
		listRoleDestination = new ArrayList<RoleDto>();
		if (baction.equals("1")) {
			sousmenuDto = sousmenuDtos;
			action = true;
			action2 = true;
			action3 = false;
			test = false;
			initUpdate();
		} else {
			sousmenuDto = sousmenuDtos;
			action = false;
			test = false;
			action2 = true;
			action3 = false;
			initCreate();
		}
		
		logger.debug("end dual");
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init ChildMenuSearchServiceBean");
			menuServicewsEndpoint = menuServicews.getMenuServicewsImplPort();
			listsousmenu = menuServicewsEndpoint.getAllMenuServicews();
			logger.debug("end init ChildMenuCreateServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String supprimerSousMenu() {
		logger.debug("DEBUT SuppressonSousMenu +++++++++++++");
		FacesMessage msg = null;

		try {
			menuServicewsEndpoint.deleteMenuServicews(sousmenuDtos);
			init();
		} catch (Exception ex) {

			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_warn_delete_region"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;

		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_sousmenu"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN SuppressionSousrMenu +++++++++++++");

		return null;
	}
}
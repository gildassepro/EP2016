package org.sepro.authentificationweb.bean;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.MenuDto;
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.authentificationweb.serviceapi.MenuDto.ChildMenu;
import org.sepro.authentificationweb.serviceapi.MenuDto.Roles;
import org.sepro.authentificationweb.serviceimpl.MenuServicews;
import org.sepro.authentificationweb.serviceimpl.MenuServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.RoleServicews;
import org.sepro.authentificationweb.serviceimpl.RoleServicewsEndpoint;

@ManagedBean
@ViewScoped
public class MenuSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(MenuSearchServiceBean.class);
	private MenuServicews menuServicews = new MenuServicews();
	private MenuServicewsEndpoint menuServicewsEndpoint;
	private List<MenuDto> listmenu = new ArrayList<MenuDto>();
	private RoleServicews roleServicews = new RoleServicews();
	private RoleServicewsEndpoint roleServicewsEndpoint;
	private MenuDto menuDto = new MenuDto();
	private MenuDto menuDtos = new MenuDto();
	private List<MenuDto> listSousMenuSource = new ArrayList<MenuDto>();
	private List<MenuDto> listSousMenuDestination = new ArrayList<MenuDto>();
	private List<RoleDto> listRoleSource = new ArrayList<RoleDto>();
	private List<RoleDto> listRoleDestination = new ArrayList<RoleDto>();
	private boolean action = true;
	private boolean action2 = false;
	private boolean action3 = true;
	private String description = new String();

	
	
	public MenuDto getMenuDtos() {
		return menuDtos;
	}

	public void setMenuDtos(MenuDto menuDtos) {
		this.menuDtos = menuDtos;
	}

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

	public MenuDto getMenuDto() {
		return menuDto;
	}

	public void setMenuDto(MenuDto menuDto) {
		this.menuDto = menuDto;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MenuDto> getListSousMenuSource() {
		return listSousMenuSource;
	}

	public void setListSousMenuSource(List<MenuDto> listSousMenuSource) {
		this.listSousMenuSource = listSousMenuSource;
	}

	public List<MenuDto> getListSousMenuDestination() {
		return listSousMenuDestination;
	}

	public void setListSousMenuDestination(List<MenuDto> listSousMenuDestination) {
		this.listSousMenuDestination = listSousMenuDestination;
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

	public List<MenuDto> getListmenu() {
		return listmenu;
	}

	public void setListmenu(List<MenuDto> listmenu) {
		this.listmenu = listmenu;
	}

	public void initUpdate() {
		logger.setLevel(Level.DEBUG);
		try {
			if (menuDto != null) {
				menuServicewsEndpoint = menuServicews
						.getMenuServicewsImplPort();
				roleServicewsEndpoint = roleServicews
						.getRoleServicewsImplPort();
				listSousMenuSource = menuServicewsEndpoint
						.getAllMenuServicews();
				listRoleSource = roleServicewsEndpoint.getAllRoleServicews();
				if (menuDto != null) {
					for (MenuDto menu : menuDto.getChildMenu().getChildMenu()) {
						for (MenuDto menus : listSousMenuSource) {
							if (menus.getIdMenu() == menu.getIdMenu()) {
								listSousMenuDestination.add(menus);
								break;
							}
						}
					}
					for (RoleDto role : menuDto.getRoles().getRole()) {
						for (RoleDto roles : listRoleSource) {
							if (roles.getIdRole() == role.getIdRole()) {
								listRoleDestination.add(roles);
								break;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initCreate() {
		logger.setLevel(Level.DEBUG);
		try {
			if (menuDto != null) {
				menuServicewsEndpoint = menuServicews
						.getMenuServicewsImplPort();
				roleServicewsEndpoint = roleServicews
						.getRoleServicewsImplPort();
				listSousMenuSource = menuServicewsEndpoint
						.getAllMenuServicews();
				listRoleSource = roleServicewsEndpoint.getAllRoleServicews();
				if (menuDto != null) {
					for (MenuDto menu : menuDto.getChildMenu().getChildMenu()) {
						for (MenuDto menus : listSousMenuSource) {
							if (menus.getIdMenu() == menu.getIdMenu()) {
								listSousMenuDestination.add(menus);
								break;
							}
						}
					}
					for (RoleDto role : menuDto.getRoles().getRole()) {
						for (RoleDto roles : listRoleSource) {
							if (roles.getIdRole() == role.getIdRole()) {
								listRoleDestination.add(roles);
								break;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifMenu(){
		MenuDto menuDupp = new MenuDto();
		ChildMenu menue = new ChildMenu();
		Roles role = new Roles();
		menue.getChildMenu().addAll(listSousMenuDestination);
		role.getRole().addAll(listRoleDestination);
		menuDupp.setRoles(role);
		menuDupp.setChildMenu(menue);
		menuDupp.setMenuName(menuDto.getMenuName());
		menuDupp.setIsSystem(false);
		menuServicews.getMenuServicewsImplPort();
		roleServicews.getRoleServicewsImplPort();
		menuDupp.setDescription(menuDto.getDescription());
		menuDupp.setIdMenu(menuDto.getIdMenu());
		menuDupp.setMenuName(menuDto.getMenuName());
		menuDupp = menuServicewsEndpoint.updateMenuServicews(menuDupp);
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_modifier_menu")));
		init();
	}
	
	public void duppMenu(){
		MenuDto menuDupp = new MenuDto();
		ChildMenu menue = new ChildMenu();
		Roles role = new Roles();
		menue.getChildMenu().addAll(listSousMenuDestination);
		role.getRole().addAll(listRoleDestination);
		menuDupp.setRoles(role);
		menuDupp.setChildMenu(menue);
		menuDupp.setMenuName(menuDto.getMenuName());
		menuDupp.setIsSystem(false);
		menuServicews.getMenuServicewsImplPort();
		roleServicews.getRoleServicewsImplPort();
		menuDupp.setDescription(this.description);
		menuDupp = menuServicewsEndpoint.createMenuServicews(menuDupp);
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_duplique_menu")));
		init();
	}
	

	public void initDualList(String baction) {
		listSousMenuSource = new ArrayList<MenuDto>();
		listSousMenuDestination = new ArrayList<MenuDto>();
		listRoleSource = new ArrayList<RoleDto>();
		listRoleDestination = new ArrayList<RoleDto>();
		if (baction.equals("1")) {
			menuDto = menuDtos;
			action = true;
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			menuDto = menuDtos;
			action = false;
			action2 = true;
			action3= false;
			initCreate();
		}
		
	}

	public String supprimerMenu() {
		try {
			menuServicewsEndpoint.deleteMenuServicews(menuDtos);
			init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_menu")));
			return null;

		}

		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_menu")));
		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init MenuSearchServiceBean");
			menuServicewsEndpoint = menuServicews.getMenuServicewsImplPort();
			listmenu = menuServicewsEndpoint.getAllMenuServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
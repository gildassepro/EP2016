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
import org.sepro.authentificationweb.serviceapi.ModuleDto;
import org.sepro.authentificationweb.serviceapi.ModuleDto.Menus;
import org.sepro.authentificationweb.serviceimpl.MenuServicews;
import org.sepro.authentificationweb.serviceimpl.MenuServicewsEndpoint;
import org.sepro.authentificationweb.serviceimpl.ModuleServicews;
import org.sepro.authentificationweb.serviceimpl.ModuleServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ModuleSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ModuleSearchServiceBean.class);
	private ModuleServicews moduleServicews = new ModuleServicews();
	private ModuleServicewsEndpoint moduleServicewsEndpoint;
	private List<ModuleDto> listmodule = new ArrayList<ModuleDto>();
	private MenuServicews menuServicews = new MenuServicews();
	private MenuServicewsEndpoint menuServicewsEndpoint;
	private ModuleDto moduleDto = new ModuleDto();
	private ModuleDto moduleDtos = new ModuleDto();
	private List<MenuDto> listMenuSource = new ArrayList<MenuDto>();
	private List<MenuDto> listMenuDestination = new ArrayList<MenuDto>();
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

	public ModuleDto getModuleDtos() {
		return moduleDtos;
	}

	public void setModuleDtos(ModuleDto moduleDtos) {
		this.moduleDtos = moduleDtos;
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

	public List<MenuDto> getListMenuSource() {
		return listMenuSource;
	}

	public void setListMenuSource(List<MenuDto> listMenuSource) {
		this.listMenuSource = listMenuSource;
	}

	public List<MenuDto> getListMenuDestination() {
		return listMenuDestination;
	}

	public void setListMenuDestination(List<MenuDto> listMenuDestination) {
		this.listMenuDestination = listMenuDestination;
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

	public ModuleDto getModuleDto() {
		return moduleDto;
	}

	public void setModuleDto(ModuleDto moduleDto) {
		this.moduleDto = moduleDto;
	}

	public List<ModuleDto> getListmodule() {
		return listmodule;
	}

	public void setListmodule(List<ModuleDto> listmodule) {
		this.listmodule = listmodule;
	}

	public void initUpdate() {
		action = false;
		try {
			if (moduleDto != null) {
				menuServicewsEndpoint = menuServicews
						.getMenuServicewsImplPort();
				listMenuSource = menuServicewsEndpoint.getAllMenuServicews();
				if (moduleDto != null) {
					for (MenuDto menu : moduleDto.getMenus().getMenu()) {
						for (MenuDto menus : listMenuSource) {
							if (menus.getIdMenu() == menu.getIdMenu()) {
								listMenuDestination.add(menus);
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
		action = true;
		try {
			if (moduleDto != null) {
				menuServicewsEndpoint = menuServicews
						.getMenuServicewsImplPort();
				listMenuSource = menuServicewsEndpoint.getAllMenuServicews();
				if (moduleDto != null) {
					for (MenuDto menu : moduleDto.getMenus().getMenu()) {
						for (MenuDto menus : listMenuSource) {
							if (menus.getIdMenu() == menu.getIdMenu()) {
								listMenuDestination.add(menus);
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
	
	
	
	public void modifModule(){
		ModuleDto moduleDupp = new ModuleDto();
		Menus menu = new Menus();
		menu.getMenu().removeAll(listMenuDestination);
		menu.getMenu().addAll(listMenuDestination);
		moduleDupp.setMenus(menu);
		
		moduleDupp.setModuleName(moduleDto.getModuleName());
		moduleDupp.setDescription(moduleDto.getDescription());
		moduleDupp.setIsSystem(false);
		moduleServicewsEndpoint = moduleServicews.getModuleServicewsImplPort();
		
		moduleDupp.setIdModule(moduleDto.getIdModule());
		moduleDupp = moduleServicewsEndpoint
				.updateModuleServicews(moduleDupp);
		
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_modifier_module")));
		init();
	}
	
	public void duppModule(){
		ModuleDto moduleDupp = new ModuleDto();
		Menus menu = new Menus();
		menu.getMenu().addAll(listMenuDestination);
		moduleDupp.setMenus(menu);
		moduleDupp.setModuleName(moduleDto.getModuleName());
		moduleDupp.setIsSystem(false);
		moduleServicewsEndpoint = moduleServicews.getModuleServicewsImplPort();
		moduleDupp.setDescription(this.description);
		moduleDupp = moduleServicewsEndpoint
				.createModuleServicews(moduleDupp);
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_duplique_module")));
		init();
	}
	

	public void initDualList(String baction) {
		listMenuSource = new ArrayList<MenuDto>();
		listMenuDestination = new ArrayList<MenuDto>();
		if (baction.equals("1")) {
			moduleDto = moduleDtos;
			action = true;
			action2 = true;
			action3= false;
			test = false;
			initUpdate();
		} else {
			moduleDto = moduleDtos;
			action = false;
			action2 = true;
			action3= false;
			test = false;
			initCreate();
		}
	}

	public String supprimerModule() {
		try {
		moduleServicewsEndpoint.deleteModuleServicews(moduleDtos);
		init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_module")));
			return null;

		}
		
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_module")));
		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			moduleServicewsEndpoint = moduleServicews
					.getModuleServicewsImplPort();
			listmodule = moduleServicewsEndpoint.getAllModuleServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
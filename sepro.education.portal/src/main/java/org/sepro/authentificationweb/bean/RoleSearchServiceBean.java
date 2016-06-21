package org.sepro.authentificationweb.bean;

import java.io.Serializable;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.authentificationweb.serviceimpl.RoleServicews;
import org.sepro.authentificationweb.serviceimpl.RoleServicewsEndpoint;

@ManagedBean
@RequestScoped
public class RoleSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(RoleSearchServiceBean.class);
	private RoleServicews roleServicews = new RoleServicews();
	private RoleServicewsEndpoint roleServicewsEndpoint;
	private List<RoleDto> listrole;

	public List<RoleDto> getListrole() {
		return listrole;
	}

	public void setListrole(List<RoleDto> listrole) {
		this.listrole = listrole;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			roleServicewsEndpoint = roleServicews.getRoleServicewsImplPort();
			listrole = roleServicewsEndpoint.getAllRoleServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

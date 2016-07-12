package org.sepro.parameterweb.bean;

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
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.SessionDto;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SessionDtoServicews;
import org.sepro.parameterweb.serviceimpl.SessionDtoServicewsEndpoint;

@ManagedBean
@ViewScoped
public class SessionSearchServiceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);

	private SessionDtoServicews sessionServicews = new SessionDtoServicews();
	private SessionDtoServicewsEndpoint sessionServicewsEndpoint;
	private List<SessionDto> listsession = new ArrayList<SessionDto>();
	private SessionDto sessionDto = new SessionDto();
	private SessionDto sesionDto = new SessionDto();

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> liststatut = new ArrayList<PopuplistDto>();

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

	public List<SessionDto> getListsession() {
		return listsession;
	}

	public void setListsession(List<SessionDto> listsession) {
		this.listsession = listsession;
	}

	public List<PopuplistDto> getListanneeacademique() {
		return listanneeacademique;
	}

	public void setListanneeacademique(List<PopuplistDto> listanneeacademique) {
		this.listanneeacademique = listanneeacademique;
	}

	public List<PopuplistDto> getListstatut() {
		return liststatut;
	}

	public void setListstatut(List<PopuplistDto> liststatut) {
		this.liststatut = liststatut;
	}

	public SessionDto getSessionDto() {
		return sessionDto;
	}

	public void setSessionDto(SessionDto sessionDto) {
		this.sessionDto = sessionDto;
	}

	public SessionDto getSesionDto() {
		return sesionDto;
	}

	public void setSesionDto(SessionDto sesionDto) {
		this.sesionDto = sesionDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			sessionDto = sesionDto;
			listanneeacademique = new ArrayList<PopuplistDto>();
			liststatut = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			sessionDto = new SessionDto();
			listanneeacademique = new ArrayList<PopuplistDto>();
			liststatut = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
	}

	public void initUpdate() {
		try {
			action = false;
			
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			
			liststatut = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("statut");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			action = true;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			
			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			
			liststatut = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("statut");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		try {
			sessionServicewsEndpoint = sessionServicews
					.getSessionDtoServicewsImplPort();
			listsession = sessionServicewsEndpoint.getAllSessionServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createSession() {
		FacesMessage msg = null;
		try {
			SessionDto session = new SessionDto();
			session.setSessionName(sessionDto.getSessionName());
			session.setAcademiqueYear(sessionDto.getAcademiqueYear());
			session.setStartDate(sessionDto.getStartDate());
			session.setEndDate(sessionDto.getEndDate());
			session.setStatusSession(sessionDto.getStatusSession());
			sessionServicewsEndpoint = sessionServicews
					.getSessionDtoServicewsImplPort();
			session = sessionServicewsEndpoint.createSessionServicews(session);
			init();
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_msg_create_session")));
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,
					rb.getString("label_nonceexpiredexception"),
					rb.getString("label_nonceexpiredexception"));
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

	}

	public String updateSession() {
		FacesMessage msg = null;
		SessionDto sessionmodif = new SessionDto();
		try {
			sessionmodif.setSessionName(sessionDto.getSessionName());
			sessionmodif.setAcademiqueYear(sessionDto.getAcademiqueYear());
			sessionmodif.setStartDate(sessionDto.getStartDate());
			sessionmodif.setEndDate(sessionDto.getEndDate());
			sessionmodif.setStatusSession(sessionDto.getStatusSession());
			sessionServicewsEndpoint = sessionServicews
					.getSessionDtoServicewsImplPort();
			sessionmodif.setIdSession(sessionDto.getIdSession());
			sessionmodif = sessionServicewsEndpoint
					.updateSessionServicews(sessionmodif);
			init();
		} catch (Exception e) {
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_session"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public String supprimerSession() {
		FacesMessage msg = null;
		try {
			sessionServicewsEndpoint.deleteSessionServicews(sesionDto);
			;
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warn_session"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_session"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		return null;

	}

}
package org.sepro.parameterweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.parameterweb.serviceapi.CurriculumDto;
import org.sepro.parameterweb.serviceapi.CleanHoursDto;
import org.sepro.parameterweb.serviceapi.EstablishmentDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.SubEstablishmentDto;
import org.sepro.parameterweb.serviceimpl.CurriculumDtoServicews;
import org.sepro.parameterweb.serviceimpl.CurriculumDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CleanHoursServicews;
import org.sepro.parameterweb.serviceimpl.CleanHoursServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicewsEndpoint;

@ManagedBean
@ViewScoped
public class CursusSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(CursusSearchServiceBean.class);
	private CurriculumDtoServicews CurriculumDtoServicews = new CurriculumDtoServicews();
	private CurriculumDtoServicewsEndpoint CurriculumDtoServicewsEndpoint;

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;

	private CurriculumDto curriculumDto = new CurriculumDto();
	private List<CurriculumDto> listCurriculum = new ArrayList<CurriculumDto>();
	private CurriculumDto curriculumDtos = new CurriculumDto();

	private List<PopuplistDto> listPopuplist = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopulistAY = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopulistFIL = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopulistEtat = new ArrayList<PopuplistDto>();

	private PopuplistDto popuplistDto = new PopuplistDto();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean typeOfCourse;

	
	
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

	public CurriculumDto getCurriculumDto() {
		return curriculumDto;
	}

	public void setCurriculumDto(CurriculumDto curriculumDto) {
		this.curriculumDto = curriculumDto;
	}

	public CurriculumDto getCurriculumDtos() {
		return curriculumDtos;
	}

	public void setCurriculumDtos(CurriculumDto curriculumDtos) {
		this.curriculumDtos = curriculumDtos;
	}

	
	public List<PopuplistDto> getListPopulistAY() {
		return listPopulistAY;
	}

	public void setListPopulistAY(List<PopuplistDto> listPopulistAY) {
		this.listPopulistAY = listPopulistAY;
	}

	public List<PopuplistDto> getListPopulistFIL() {
		return listPopulistFIL;
	}

	public void setListPopulistFIL(List<PopuplistDto> listPopulistFIL) {
		this.listPopulistFIL = listPopulistFIL;
	}

	public List<PopuplistDto> getListPopulistEtat() {
		return listPopulistEtat;
	}

	public void setListPopulistEtat(List<PopuplistDto> listPopulistEtat) {
		this.listPopulistEtat = listPopulistEtat;
	}

	public List<CurriculumDto> getListCurriculum() {
		return listCurriculum;
	}

	public void setListCurriculum(List<CurriculumDto> listCurriculum) {
		this.listCurriculum = listCurriculum;
	}

	public List<PopuplistDto> getListPopuplist() {
		return listPopuplist;
	}

	public void setListPopuplist(List<PopuplistDto> listPopuplist) {
		this.listPopuplist = listPopuplist;
	}

	public PopuplistDto getPopuplistDto() {
		return popuplistDto;
	}

	public void setPopuplistDto(PopuplistDto popuplistDto) {
		this.popuplistDto = popuplistDto;
	}

	public boolean getTypeOfCourse() {
		return typeOfCourse;
	}

	public void setTypeOfCourse(boolean typeOfCourse) {
		this.typeOfCourse = typeOfCourse;
	}

	public String updateCurriculum() {
		logger.debug("DEBUT modifierCURSUS");
		CurriculumDto curriculummodif = new CurriculumDto();
		FacesMessage msg = null;

		try {
			logger.debug("CURSUS Name  " + curriculumDto.getNameCurriculum());
			curriculummodif
					.setNameCurriculum(curriculumDto.getNameCurriculum());
			curriculummodif.setAcademicGrade(curriculumDto.getAcademicGrade());
			curriculummodif
					.setAcademiqueYear(curriculumDto.getAcademiqueYear());
			curriculummodif.setCursusPresentation(curriculumDto
					.getCursusPresentation());
			curriculummodif.setNumberOfSessions(curriculumDto
					.getNumberOfSessions());
			curriculummodif.setNumberOfYears(curriculumDto.getNumberOfYears());
			curriculummodif.setTypeOfCourse(curriculumDto.getTypeOfCourse());
			curriculummodif.setCursusStatus(curriculumDto.getCursusStatus());

			CurriculumDtoServicewsEndpoint = CurriculumDtoServicews
					.getCurriculumDtoServicewsImplPort();
			curriculummodif.setIdCurriculum(curriculumDto.getIdCurriculum());

			curriculummodif = CurriculumDtoServicewsEndpoint
					.updateCurriculumDServicews(curriculummodif);

			init();
		} catch (Exception e) {
			return null;
		}

		logger.debug("Fin Modification cursus  +++++++++++++");
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_cursus"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public void createCurriculum() {
		logger.debug("DEBUT CREATION CURSUS +++++++++++++");
		FacesMessage msg = null;

		CurriculumDto curriculumcreate = new CurriculumDto();
		CurriculumDtoServicewsEndpoint = CurriculumDtoServicews
				.getCurriculumDtoServicewsImplPort();
		curriculumcreate = CurriculumDtoServicewsEndpoint
				.createCurriculumDServicews(curriculumDto);

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_cursus"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		logger.debug("FIN CREATE CURSUS +++++++++++++");
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			curriculumDto = curriculumDtos;
			listPopulistAY = new ArrayList<PopuplistDto>();
			listPopulistFIL = new ArrayList<PopuplistDto>();
			listPopulistEtat = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			curriculumDto = new CurriculumDto();
			listPopulistAY = new ArrayList<PopuplistDto>();
			listPopulistFIL = new ArrayList<PopuplistDto>();
			listPopulistEtat = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
		logger.debug("FIN initDualList +++++++++++++");
	}

	public void initUpdate() {
		try {
			action = false;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			
			listPopulistAY = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("academic_years");
			listPopulistFIL = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("filiere");
			listPopulistEtat = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("etat");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			
			listPopulistAY = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("academic_years");
			listPopulistFIL = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("filiere");
			listPopulistEtat = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("etat");
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerCurriculum() {

		logger.debug("DEBUT SUPPRESSION cursus +++++++++++++");
		FacesMessage msg = null;

		try {
			CurriculumDtoServicewsEndpoint
					.deleteCurriculumDServicews(curriculumDtos);
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warn_cursus"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_cursus"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN SUPPRESSION cursus +++++++++++++");
		init();
		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init CurriculumServiceBean");
			CurriculumDtoServicewsEndpoint = CurriculumDtoServicews
					.getCurriculumDtoServicewsImplPort();

			listCurriculum = CurriculumDtoServicewsEndpoint
					.getAllCurriculumDServicews();
			logger.debug("end init CurriculumServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

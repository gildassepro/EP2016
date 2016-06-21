package org.sepro.teacherweb.bean;

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
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.CvteacherDto;
import org.sepro.teacherweb.serviceapi.DetailteacherDto;
import org.sepro.teacherweb.serviceimpl.DetailteacherServicews;
import org.sepro.teacherweb.serviceimpl.DetailteacherServicewsEndpoint;


@ManagedBean
@ViewScoped
public class ProfesseurdetailSearchServiceBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ProfesseurdetailSearchServiceBean.class);
	
	
	private DetailteacherServicews detailteacherServicews = new DetailteacherServicews();
	private DetailteacherServicewsEndpoint detailteacherServicewsEndpoint;
	
	private DetailteacherDto detailteacherDto = new DetailteacherDto();
	private DetailteacherDto detailteacherDtos = new DetailteacherDto();
	
	
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	
	private List<PopuplistDto> listhoraire = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listmois = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listpriorite = new ArrayList<PopuplistDto>();
	
	private AcademicModuleDtoServicews moduleacademiqueServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint moduleacademiqueServicewsEndpoint;
	private List<AcademicModuleDto> listmodule = new ArrayList<AcademicModuleDto>();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<PopuplistDto> getListhoraire() {
		return listhoraire;
	}
	public void setListhoraire(List<PopuplistDto> listhoraire) {
		this.listhoraire = listhoraire;
	}
	public List<PopuplistDto> getListmois() {
		return listmois;
	}
	public void setListmois(List<PopuplistDto> listmois) {
		this.listmois = listmois;
	}
	public List<PopuplistDto> getListfiliere() {
		return listfiliere;
	}
	public void setListfiliere(List<PopuplistDto> listfiliere) {
		this.listfiliere = listfiliere;
	}
	public List<PopuplistDto> getListanneeacademique() {
		return listanneeacademique;
	}
	public void setListanneeacademique(List<PopuplistDto> listanneeacademique) {
		this.listanneeacademique = listanneeacademique;
	}
	public List<PopuplistDto> getListpriorite() {
		return listpriorite;
	}
	public void setListpriorite(List<PopuplistDto> listpriorite) {
		this.listpriorite = listpriorite;
	}
	public List<AcademicModuleDto> getListmodule() {
		return listmodule;
	}
	public void setListmodule(List<AcademicModuleDto> listmodule) {
		this.listmodule = listmodule;
	}
	public DetailteacherDto getDetailteacherDto() {
		return detailteacherDto;
	}
	public void setDetailteacherDto(DetailteacherDto detailteacherDto) {
		this.detailteacherDto = detailteacherDto;
	}
	public DetailteacherDto getDetailteacherDtos() {
		return detailteacherDtos;
	}
	public void setDetailteacherDtos(DetailteacherDto detailteacherDtos) {
		this.detailteacherDtos = detailteacherDtos;
	}
	
	
	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			List<PopuplistDto> prioriter = popuplistDtoServicewsEndpoint
					.getAllPopuplistDtoServicews();
			for (PopuplistDto pt : prioriter) {
				if (pt.getEntity().equals("priorite"))
					listpriorite.add(pt);
			}
			
			List<PopuplistDto> anneeacademic = popuplistDtoServicewsEndpoint
					.getAllPopuplistDtoServicews();
			for (PopuplistDto pt : anneeacademic) {
				if (pt.getEntity().equals("academic_years"))
					listanneeacademique.add(pt);
			}
			
			
			List<PopuplistDto> filiereacademic = popuplistDtoServicewsEndpoint
					.getAllPopuplistDtoServicews();
			for (PopuplistDto pt : filiereacademic) {
				if (pt.getEntity().equals("filiere"))
					listfiliere.add(pt);
			}
			
			List<PopuplistDto> heuredispo = popuplistDtoServicewsEndpoint
					.getAllPopuplistDtoServicews();
			for (PopuplistDto pt : heuredispo) {
				if (pt.getEntity().equals("mois"))
					listmois.add(pt);
			}
			
			List<PopuplistDto> horairedebutfin = popuplistDtoServicewsEndpoint
					.getAllPopuplistDtoServicews();
			for (PopuplistDto pt : horairedebutfin) {
				if (pt.getEntity().equals("horaire"))
					listhoraire.add(pt);
			}
			
			moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
					.getAcademicModuleDtoServicewsImplPort();
			listmodule = moduleacademiqueServicewsEndpoint
					.getAllAcademicModuleServicews();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
public void enregistrerDetailprof() {
		
		logger.debug("@@@@@@@@ début creation");
		
		DetailteacherDto createdetailprof = new DetailteacherDto();
		createdetailprof.setHourRate(detailteacherDto.getHourRate());
		createdetailprof.setIdentityTeacher(detailteacherDto.getIdentityTeacher());
		createdetailprof.setNumberOfHoursWorked(detailteacherDto.getNumberOfHoursWorked());
		createdetailprof.setStartHour(detailteacherDto.getStartHour());
		createdetailprof.setStopHour(detailteacherDto.getStopHour());
		createdetailprof.setWorkingMonth(detailteacherDto.getWorkingMonth());
		detailteacherServicewsEndpoint = detailteacherServicews.getDetailteacherServicewsImplPort();
		createdetailprof = detailteacherServicewsEndpoint.createDetailteacherServicews(createdetailprof);
		
		logger.debug("@@@@@@ fin creation");
	
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_detail_teacher")));
		
	}

public void modifierDetailprof() {
	
	logger.debug("@@@@@@@@ début modification");
	
	DetailteacherDto detailprofmodif = new DetailteacherDto();
	detailprofmodif.setHourRate(detailteacherDto.getHourRate());
	detailprofmodif.setIdentityTeacher(detailteacherDto.getIdentityTeacher());
	detailprofmodif.setNumberOfHoursWorked(detailteacherDto.getNumberOfHoursWorked());
	detailprofmodif.setStartHour(detailteacherDto.getStartHour());
	detailprofmodif.setStopHour(detailteacherDto.getStopHour());
	detailprofmodif.setWorkingMonth(detailteacherDto.getWorkingMonth());
	detailteacherServicewsEndpoint = detailteacherServicews.getDetailteacherServicewsImplPort();
	detailprofmodif.setIdDetailteacher(detailteacherDto.getIdDetailteacher());
	detailprofmodif = detailteacherServicewsEndpoint.updateDetailteacherServicews(detailprofmodif);
	
	logger.debug("@@@@@@ fin modification");

	FacesContext.getCurrentInstance().addMessage(
			"mesagesalert2",
			new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
					.getString("label_msg_update_detail_teacher")));
	
}
	
	
	
	}
	



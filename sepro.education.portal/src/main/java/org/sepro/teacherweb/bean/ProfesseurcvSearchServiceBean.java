package org.sepro.teacherweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.sepro.teacherweb.serviceapi.CvteacherDto;
import org.sepro.teacherweb.serviceimpl.CvteacherServicews;
import org.sepro.teacherweb.serviceimpl.CvteacherServicewsEndpoint;



@ManagedBean
@ViewScoped
public class ProfesseurcvSearchServiceBean  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ProfesseurcvSearchServiceBean.class);
	
	private CvteacherServicews cvteacherServicews = new CvteacherServicews();
	private CvteacherServicewsEndpoint cvteacherServicewsEndpoint;
	
	
	private CvteacherDto cvteacherDto = new CvteacherDto();
	private CvteacherDto cvteacherDtos = new CvteacherDto();
	private List<CvteacherDto> listexperienceprof = new ArrayList<CvteacherDto>();
	
	
	
	
	
	
	
	
	public List<CvteacherDto> getListexperienceprof() {
		return listexperienceprof;
	}
	public void setListexperienceprof(List<CvteacherDto> listexperienceprof) {
		this.listexperienceprof = listexperienceprof;
	}
	public CvteacherDto getCvteacherDto() {
		return cvteacherDto;
	}
	public void setCvteacherDto(CvteacherDto cvteacherDto) {
		this.cvteacherDto = cvteacherDto;
	}
	public CvteacherDto getCvteacherDtos() {
		return cvteacherDtos;
	}
	public void setCvteacherDtos(CvteacherDto cvteacherDtos) {
		this.cvteacherDtos = cvteacherDtos;
	}
	

	public void enregistrerCvprof() {
		
		logger.debug("@@@@@@@@ début creation");
		
		CvteacherDto  createcvprof = new CvteacherDto();
		createcvprof.setDiploma(cvteacherDto.getDiploma());
		createcvprof.setEnDate(cvteacherDto.getEnDate());
		createcvprof.setIdentityTeacher(cvteacherDto.getIdentityTeacher());
		createcvprof.setLinkdiploma(cvteacherDto.getLinkdiploma());
		createcvprof.setStartDate(cvteacherDto.getStartDate());
		cvteacherServicewsEndpoint = cvteacherServicews.getCvteacherServicewsImplPort();
		createcvprof = cvteacherServicewsEndpoint.createCvteacherServicews(createcvprof);
		
		logger.debug("@@@@@@ fin creation");
	
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_cv_teacher")));
		
	}
	
public void modifierCvprof() {
		
		logger.debug("@@@@@@@@ début modification");
		
		CvteacherDto  cvmodif = new CvteacherDto();
		cvmodif.setDiploma(cvteacherDto.getDiploma());
		cvmodif.setEnDate(cvteacherDto.getEnDate());
		cvmodif.setIdentityTeacher(cvteacherDto.getIdentityTeacher());
		cvmodif.setLinkdiploma(cvteacherDto.getLinkdiploma());
		cvmodif.setStartDate(cvteacherDto.getStartDate());
		cvteacherServicewsEndpoint = cvteacherServicews.getCvteacherServicewsImplPort();
		cvmodif = cvteacherServicewsEndpoint.updateCvteacherServicews(cvmodif);
		
		logger.debug("@@@@@@ fin modification");
	
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_cv_teacher")));
		
	}
	
	
public String supprimercvprof() {
	logger.debug("@@@@@@ debut suppression");
	try {
		cvteacherServicewsEndpoint.deleteCvteacherServicews(cvteacherDtos);
		
	} catch (Exception e) {
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_warn_delete_classe")));
		return null;

	}
	
	logger.debug("@@@@@@ fin suppression");
	
	FacesContext.getCurrentInstance().addMessage(
			"mesagesalert2",
			new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
					.getString("label_msg_delete_classe")));
	return null;
	
	
}
	
	
	

}

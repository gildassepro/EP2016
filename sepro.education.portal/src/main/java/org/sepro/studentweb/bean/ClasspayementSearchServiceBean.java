package org.sepro.studentweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.studentweb.serviceapi.ClassPaymentDto;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceimpl.ClassPaymentServicews;
import org.sepro.studentweb.serviceimpl.ClassPaymentServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
@ManagedBean
@ViewScoped
public class ClasspayementSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ClasspayementSearchServiceBean.class);
	
	private ClassPaymentServicewsEndpoint classPaymentServicewsEndpoint;
	private ClassPaymentServicews classPaymentServicews = new ClassPaymentServicews();
	
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	
	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();
	
	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();
	
	private ClassPaymentDto classPaymentDto = new  ClassPaymentDto();
	private List<ClassPaymentDto> listClassPaymentDtos = new ArrayList<ClassPaymentDto>();
	
	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<String> listMois = new ArrayList<String>();
	
	
	
	
	public List<String> getListMois() {
		return listMois;
	}


	public void setListMois(List<String> listMois) {
		this.listMois = listMois;
	}


	public ClasseProgrammDto getClasseProgrammDto() {
		return classeProgrammDto;
	}


	public void setClasseProgrammDto(ClasseProgrammDto classeProgrammDto) {
		this.classeProgrammDto = classeProgrammDto;
	}


	public List<ClasseProgrammDto> getListClass() {
		return listClass;
	}


	public void setListClass(List<ClasseProgrammDto> listClass) {
		this.listClass = listClass;
	}


	public ClassPaymentDto getClassPaymentDto() {
		return classPaymentDto;
	}


	public void setClassPaymentDto(ClassPaymentDto classPaymentDto) {
		this.classPaymentDto = classPaymentDto;
	}


	public List<ClassPaymentDto> getListClassPaymentDtos() {
		return listClassPaymentDtos;
	}


	public void setListClassPaymentDtos(List<ClassPaymentDto> listClassPaymentDtos) {
		this.listClassPaymentDtos = listClassPaymentDtos;
	}


	public List<PopuplistDto> getListAcademicYear() {
		return listAcademicYear;
	}


	public void setListAcademicYear(List<PopuplistDto> listAcademicYear) {
		this.listAcademicYear = listAcademicYear;
	}


	public void onSelectYears() {

		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		

		classeProgrammDto.setAcademicYear(classPaymentDto.getAcademicYear());
		
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);

	}
	
	
	public void saveClassPayement(){
		
	}
	
	public void listMoisInitialise(){
		
		listMois.add("Janvier");
		listMois.add("Fevrier");
		listMois.add("Mars");
		listMois.add("Mai");
		listMois.add("Avril");
		listMois.add("Juin");
		listMois.add("Juillet");
		listMois.add("Aout");
		listMois.add("Septembre");
		listMois.add("Octobre");
		listMois.add("Novembre");
		listMois.add("Octobre");
		
	}
	
	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			classeProgrammServicewsEndpoint = classeProgrammServicews
					.getClasseProgrammServicewsImplPort();
			classPaymentServicewsEndpoint = classPaymentServicews.getClassPaymentServicewsImplPort();

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}

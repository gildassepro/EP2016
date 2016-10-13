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
import org.sepro.parameterweb.bean.CursusSearchServiceBean;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceimpl.ClasseServicews;
import org.sepro.parameterweb.serviceimpl.ClasseServicewsEndpoint;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentEventsDto;
import org.sepro.studentweb.serviceimpl.ActivitiesServicews;
import org.sepro.studentweb.serviceimpl.ActivitiesServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentEventsServicews;
import org.sepro.studentweb.serviceimpl.StudentEventsServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;

@ManagedBean
@ViewScoped
public class AbsenceStudentSearchServiceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(AbsenceStudentSearchServiceBean.class);
	
	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();
	
	
	private StudentServicewsEndpoint studentServicewsEndpoint;
	private StudentServicews studentServicews = new StudentServicews();
	
	private StudentEventsServicewsEndpoint studentEventsServicewsEndpoint;
	private StudentEventsServicews studentEventsServicews = new StudentEventsServicews();
	
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private ClasseServicews classeServicews = new ClasseServicews();
	
	private ActivitiesServicewsEndpoint activitiesServicewsEndpoint;
	private ActivitiesServicews activitiesServicews = new ActivitiesServicews();
	
	private List<StudentClasseDto> listStudentClass = new ArrayList<StudentClasseDto>();
	
	private StudentClasseDto studentClasseDto = new StudentClasseDto();
	private StudentClasseDto studentClasseDtos = new StudentClasseDto();
	
	private StudentEventsDto studentEventsDto = new StudentEventsDto();
	private StudentEventsDto selectedEvents = new StudentEventsDto();
	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();
	
	private ClasseDto classeDto = new ClasseDto();
	private List<ClasseDto> listDesClass = new ArrayList<ClasseDto>();
	
	
	
	public List<StudentClasseDto> getListStudentClass() {
		return listStudentClass;
	}



	public void setListStudentClass(List<StudentClasseDto> listStudentClass) {
		this.listStudentClass = listStudentClass;
	}



	public StudentClasseDto getStudentClasseDto() {
		return studentClasseDto;
	}



	public void setStudentClasseDto(StudentClasseDto studentClasseDto) {
		this.studentClasseDto = studentClasseDto;
	}



	public StudentClasseDto getStudentClasseDtos() {
		return studentClasseDtos;
	}



	public void setStudentClasseDtos(StudentClasseDto studentClasseDtos) {
		this.studentClasseDtos = studentClasseDtos;
	}



	public StudentEventsDto getStudentEventsDto() {
		return studentEventsDto;
	}



	public void setStudentEventsDto(StudentEventsDto studentEventsDto) {
		this.studentEventsDto = studentEventsDto;
	}



	public StudentEventsDto getSelectedEvents() {
		return selectedEvents;
	}



	public void setSelectedEvents(StudentEventsDto selectedEvents) {
		this.selectedEvents = selectedEvents;
	}



	public List<StudentEventsDto> getListStudentEvent() {
		return listStudentEvent;
	}



	public void setListStudentEvent(List<StudentEventsDto> listStudentEvent) {
		this.listStudentEvent = listStudentEvent;
	}



	public ClasseDto getClasseDto() {
		return classeDto;
	}



	public void setClasseDto(ClasseDto classeDto) {
		this.classeDto = classeDto;
	}



	public List<ClasseDto> getListDesClass() {
		return listDesClass;
	}



	public void setListDesClass(List<ClasseDto> listDesClass) {
		this.listDesClass = listDesClass;
	}
	
	
	
//Update Liste Student by Class selected 
	public void updateListeStudentClasse(){
		
	}


	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init AbsenceStudentSearchServiceBean");
			
			listStudentClass = studentClasseServicewsEndpoint.searchStudentClasseServicews(studentClasseDto);
			
			logger.debug("end init AbsenceStudentSearchServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

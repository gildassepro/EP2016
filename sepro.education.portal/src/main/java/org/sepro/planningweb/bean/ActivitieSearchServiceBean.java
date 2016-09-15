package org.sepro.planningweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ClasseServicews;
import org.sepro.parameterweb.serviceimpl.ClasseServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeDtoServicewsEndpoint;
import org.sepro.studentweb.serviceapi.ActivitiesDto;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceapi.StudentEventsDto;
import org.sepro.studentweb.serviceimpl.ActivitiesServicews;
import org.sepro.studentweb.serviceimpl.ActivitiesServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentEventsServicews;
import org.sepro.studentweb.serviceimpl.StudentEventsServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicews;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicewsEndpoint;
@ManagedBean
@ViewScoped
public class ActivitieSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ActivitieSearchServiceBean.class);
	
	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();
	
	private StudentEventsServicewsEndpoint studentEventsServicewsEndpoint;
	private StudentEventsServicews studentEventsServicews = new StudentEventsServicews();
	
	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	
	private IdentityTeacherServicewsEndpoint identityTeacherServicewsEndpoint;
	private IdentityTeacherServicews identityTeacherServicews = new IdentityTeacherServicews();
	
	private ProgrammeDtoServicewsEndpoint programmeDtoServicewsEndpoint;
	private ProgrammeDtoServicews programmeDtoServicews = new ProgrammeDtoServicews();
	
	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();
	
	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;
	
	private List<AcademicModuleDto> listAcademicModule = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();
	
	private AcademicModuleDto academicModuleDto = new AcademicModuleDto();
	private List<ModuleCalendarDto> selectedlistemodulecalendar = new ArrayList<ModuleCalendarDto>();
	
	
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private ClasseServicews classeServicews = new ClasseServicews();
	
	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();
	
	private ActivitiesServicewsEndpoint activitiesServicewsEndpoint;
	private ActivitiesServicews activitiesServicews = new ActivitiesServicews();
	
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	
	private List<IdentityTeacherDto> listeTeacherEvent = new ArrayList<IdentityTeacherDto>();
	
	private StudentEventsDto studentEventsDto = new StudentEventsDto();
	private StudentEventsDto selectedEvents = new StudentEventsDto();
	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();
	
	private ClasseDto classeDto = new ClasseDto();
	private List<ClasseDto> listDesClass = new ArrayList<ClasseDto>();
	
	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();
	
	private ActivitiesDto activitiesDto = new ActivitiesDto();
	private ActivitiesDto activitiesDtos = new ActivitiesDto();
	private List<ActivitiesDto> listDesActivities = new ArrayList<ActivitiesDto>();
	
	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listTypeEvent = new ArrayList<PopuplistDto>();
	
	private boolean action = false;
	private boolean value;
	private boolean test = true;
	private ScheduleModel planningclasse;

	
	
	
	
	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
	
	
	public ScheduleModel getPlanningclasse() {
		return planningclasse;
	}

	public void setPlanningclasse(ScheduleModel planningclasse) {
		this.planningclasse = planningclasse;
	}

	public List<AcademicModuleDto> getSelectedlistAcademicModule() {
		return selectedlistAcademicModule;
	}

	public void setSelectedlistAcademicModule(
			List<AcademicModuleDto> selectedlistAcademicModule) {
		this.selectedlistAcademicModule = selectedlistAcademicModule;
	}

	public AcademicModuleDto getAcademicModuleDto() {
		return academicModuleDto;
	}

	public void setAcademicModuleDto(AcademicModuleDto academicModuleDto) {
		this.academicModuleDto = academicModuleDto;
	}

	public List<ClasseDto> getListDesClass() {
		return listDesClass;
	}

	public void setListDesClass(List<ClasseDto> listDesClass) {
		this.listDesClass = listDesClass;
	}

	public ClasseDto getClasseDto() {
		return classeDto;
	}

	public void setClasseDto(ClasseDto classeDto) {
		this.classeDto = classeDto;
	}

	public List<IdentityTeacherDto> getListeTeacherEvent() {
		return listeTeacherEvent;
	}

	public void setListeTeacherEvent(List<IdentityTeacherDto> listeTeacherEvent) {
		this.listeTeacherEvent = listeTeacherEvent;
	}

	public StudentEventsDto getSelectedEvents() {
		return selectedEvents;
	}

	public void setSelectedEvents(StudentEventsDto selectedEvents) {
		this.selectedEvents = selectedEvents;
	}

	public StudentEventsDto getStudentEventsDto() {
		return studentEventsDto;
	}

	public void setStudentEventsDto(StudentEventsDto studentEventsDto) {
		this.studentEventsDto = studentEventsDto;
	}

	public List<StudentEventsDto> getListStudentEvent() {
		return listStudentEvent;
	}

	public void setListStudentEvent(List<StudentEventsDto> listStudentEvent) {
		this.listStudentEvent = listStudentEvent;
	}

	public List<AcademicModuleDto> getListAcademicModule() {
		return listAcademicModule;
	}

	public void setListAcademicModule(List<AcademicModuleDto> listAcademicModule) {
		this.listAcademicModule = listAcademicModule;
	}

	public List<ModuleCalendarDto> getSelectedlistemodulecalendar() {
		return selectedlistemodulecalendar;
	}

	public void setSelectedlistemodulecalendar(
			List<ModuleCalendarDto> selectedlistemodulecalendar) {
		this.selectedlistemodulecalendar = selectedlistemodulecalendar;
	}

	public List<PopuplistDto> getListTypeEvent() {
		return listTypeEvent;
	}

	public void setListTypeEvent(List<PopuplistDto> listTypeEvent) {
		this.listTypeEvent = listTypeEvent;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public List<ClasseProgrammDto> getListClass() {
		return listClass;
	}

	public void setListClass(List<ClasseProgrammDto> listClass) {
		this.listClass = listClass;
	}

	public ClasseProgrammDto getClasseProgrammDto() {
		return classeProgrammDto;
	}

	public void setClasseProgrammDto(ClasseProgrammDto classeProgrammDto) {
		this.classeProgrammDto = classeProgrammDto;
	}

	public ClasseProgrammDto getClasseProgrammDtos() {
		return classeProgrammDtos;
	}

	public void setClasseProgrammDtos(ClasseProgrammDto classeProgrammDtos) {
		this.classeProgrammDtos = classeProgrammDtos;
	}

	public ActivitiesDto getActivitiesDto() {
		return activitiesDto;
	}

	public void setActivitiesDto(ActivitiesDto activitiesDto) {
		this.activitiesDto = activitiesDto;
	}

	public ActivitiesDto getActivitiesDtos() {
		return activitiesDtos;
	}

	public void setActivitiesDtos(ActivitiesDto activitiesDtos) {
		this.activitiesDtos = activitiesDtos;
	}

	public List<ActivitiesDto> getListDesActivities() {
		return listDesActivities;
	}

	public void setListDesActivities(List<ActivitiesDto> listDesActivities) {
		this.listDesActivities = listDesActivities;
	}

	public List<PopuplistDto> getListAcademicYear() {
		return listAcademicYear;
	}

	public void setListAcademicYear(List<PopuplistDto> listAcademicYear) {
		this.listAcademicYear = listAcademicYear;
	}
	
	public void updateModulesProgrammes(){
		logger.debug(Level.DEBUG);
		logger.debug("@@@@@@ JE SUIS LA @@@@@@@@@@@@@@");
		try{
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
			studentEventsServicewsEndpoint = studentEventsServicews.getStudentEventsServicewsImplPort();
			selectedlistAcademicModule = academicModuleDtoServicewsEndpoint.getAllAcademicModuleServicews();
			
			selectedEvents.setClasseProgramm(studentEventsDto.getClasseProgramm());
			listStudentEvent = studentEventsServicewsEndpoint.searchStudentEventsServicews(selectedEvents);
			
			for(AcademicModuleDto academic : studentEventsDto.getClasseProgramm().getProgrammeCalendar().getProgramme().getAcademicmodule().getAcademicmodule()){
				
				for(AcademicModuleDto academics : selectedlistAcademicModule){
				
					if(academics.getIdAcademicModule() == academic.getIdAcademicModule()){
						listAcademicModule.add(academics);
						break;
						
					}
					
				}
				
				
			}
			logger.debug("@@@@@@ JE SUIS A LA FIN @@@@@@@@@@@@@@");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addActivities(){
		
		logger.debug("@@@@@ DEBUT CREATION ACTIVITIES @@@@@@@@");
		
		StudentEventsDto addEvent = new StudentEventsDto();
		addEvent.setAcademicModule(studentEventsDto.getAcademicModule());
		addEvent.setAcademicYear(studentEventsDto.getAcademicYear());
		addEvent.setAllDayInd(studentEventsDto.isAllDayInd());
		addEvent.setClasseProgramm(studentEventsDto.getClasseProgramm());
		addEvent.setComments(studentEventsDto.getComments());
		addEvent.setDescription(studentEventsDto.getDescription());
		addEvent.setEnDate(studentEventsDto.getEnDate());
		addEvent.setEventType(studentEventsDto.getEventType());
		addEvent.setRoom(studentEventsDto.getRoom());
		logger.debug("@@@@@ CHOIX DE LA SALLE @@@@"+studentEventsDto.getRoom().getIdClass());
		logger.debug("@@@@@ CHOIX DE LA SALLE @@@@"+studentEventsDto.getRoom().getNameOfClass());
		addEvent.setStartDate(studentEventsDto.getStartDate());
		addEvent.setTeacher(studentEventsDto.getTeacher());
		addEvent.setTitle(studentEventsDto.getTitle());
		
		studentEventsServicewsEndpoint = studentEventsServicews.getStudentEventsServicewsImplPort();
		
		addEvent = studentEventsServicewsEndpoint.createStudentEventsServicews(addEvent);
		init();
		logger.debug("@@@@@ FIN CREATION ACTIVITIES @@@@@@@@");
		
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
			identityTeacherServicewsEndpoint = identityTeacherServicews.getIdentityTeacherServicewsImplPort();
			classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
			
			listClass = classeProgrammServicewsEndpoint
					.searchClasseProgrammServicews(classeProgrammDto);
			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listTypeEvent = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typeevent");
			
			listDesClass = classeServicewsEndpoint.getAllClasseServicews();
			listeTeacherEvent = identityTeacherServicewsEndpoint.getAllIdentityTeacherServicews();
			
			//selectedEvents.setClasseProgramm(studentEventsDto.getClasseProgramm());
			
			//listStudentEvent = studentEventsServicewsEndpoint.searchStudentEventsServicews(selectedEvents);
			
			
//			listAcademicModule = academicModuleDtoServicewsEndpoint.getAllAcademicModuleServicews();
			
			
			planningclasse = new LazyScheduleModel() {
	             
	            @Override
	            public void loadEvents(Date start, Date end) {
	                Date random = getRandomDate(start);
	                addEvent(new DefaultScheduleEvent("Anglais 2", random, random));
	                 
	                random = getRandomDate(start);
	                addEvent(new DefaultScheduleEvent("Science Politique", random, random));
	            }   
	        };
			
			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//	public void updatePlanningClasse(){
//		if()
//	}
	
	
	public Date getRandomDate(Date base) {
        Calendar date = Calendar.getInstance();
        date.setTime(base);
        date.add(Calendar.DATE, ((int) (Math.random()*30)) + 1);    //set random day of month
         
        return date.getTime();
    }
	
	 public void onSelect(SelectEvent event) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Classe selectionnée", event.getObject().toString()));
	    }
	 
	 
	 public void onSelectYears(SelectEvent event) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Année selectionnée", event.getObject().toString()));
	    }
}

package org.sepro.planningweb.bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.tools.ant.util.DateUtils;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.RoomInventoryDto;
import org.sepro.parameterweb.serviceapi.SessionDto;
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
import org.sepro.parameterweb.serviceimpl.RoomInventoryServicews;
import org.sepro.parameterweb.serviceimpl.RoomInventoryServicewsEndpoint;
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

import sepro.education.web.util.DateConvert;
import sepro.education.web.util.XMLCalendarTimeToDate;
import sepro.education.web.util.XMLCalendarToDate;
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
	
	private List<ProgrammeCalendarDto> listProgrammeCalendarDestination = new ArrayList<ProgrammeCalendarDto>();
	private List<ProgrammeCalendarDto> listProgrammeCalendarSources = new ArrayList<ProgrammeCalendarDto>();
	
	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();
	
	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;
	
	private List<AcademicModuleDto> listAcademicModule = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> selectedlistAcademicModules = new ArrayList<AcademicModuleDto>();
	
	
	private AcademicModuleDto academicModuleDto = new AcademicModuleDto();
	private List<ModuleCalendarDto> selectedlistemodulecalendar = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> selectedlistemodulecalendar2 = new ArrayList<ModuleCalendarDto>();
	
	
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private ClasseServicews classeServicews = new ClasseServicews();
	
	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();
	
	private ActivitiesServicewsEndpoint activitiesServicewsEndpoint;
	private ActivitiesServicews activitiesServicews = new ActivitiesServicews();
	
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	
	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendarDto = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarDtos = new ArrayList<ModuleCalendarDto>();
	
	private List<IdentityTeacherDto> listeTeacherEvent = new ArrayList<IdentityTeacherDto>();
	
	private StudentEventsDto studentEventsDto = new StudentEventsDto();
	private StudentEventsDto selectedEvents = new StudentEventsDto();
	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();
	
	private ClasseDto classeDto = new ClasseDto();
	private List<ClasseDto> listDesClass = new ArrayList<ClasseDto>();
	
	private List<ProgrammeCalendarDto> listProgrammeCalendars = new ArrayList<ProgrammeCalendarDto>();
	private List<ProgrammeCalendarDto> listProgrammeCalendart = new ArrayList<ProgrammeCalendarDto>();
	
	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();
	
	private ActivitiesDto activitiesDto = new ActivitiesDto();
	private ActivitiesDto activitiesDtos = new ActivitiesDto();
	private List<ActivitiesDto> listDesActivities = new ArrayList<ActivitiesDto>();
	
	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listTypeEvent = new ArrayList<PopuplistDto>();
	private List<SessionDto> listSession = new ArrayList<SessionDto>();
	
	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean value;
	private boolean test = true;
	private ScheduleModel planningclasse;
	private XMLGregorianCalendar start;
	private XMLGregorianCalendar end;
	
	private XMLGregorianCalendar startDate;
	private XMLGregorianCalendar endDate;
	
	private String testStartDate;
	private String testEndDate;
	
	
	
	
	

	public List<ModuleCalendarDto> getListModuleCalendarDto() {
		return listModuleCalendarDto;
	}

	public void setListModuleCalendarDto(
			List<ModuleCalendarDto> listModuleCalendarDto) {
		this.listModuleCalendarDto = listModuleCalendarDto;
	}

	public List<ModuleCalendarDto> getListModuleCalendarDtos() {
		return listModuleCalendarDtos;
	}

	public void setListModuleCalendarDtos(
			List<ModuleCalendarDto> listModuleCalendarDtos) {
		this.listModuleCalendarDtos = listModuleCalendarDtos;
	}

	public List<ProgrammeCalendarDto> getListProgrammeCalendarDestination() {
		return listProgrammeCalendarDestination;
	}

	public void setListProgrammeCalendarDestination(
			List<ProgrammeCalendarDto> listProgrammeCalendarDestination) {
		this.listProgrammeCalendarDestination = listProgrammeCalendarDestination;
	}

	public List<ProgrammeCalendarDto> getListProgrammeCalendarSources() {
		return listProgrammeCalendarSources;
	}

	public void setListProgrammeCalendarSources(
			List<ProgrammeCalendarDto> listProgrammeCalendarSources) {
		this.listProgrammeCalendarSources = listProgrammeCalendarSources;
	}

	public List<ModuleCalendarDto> getSelectedlistemodulecalendar2() {
		return selectedlistemodulecalendar2;
	}

	public void setSelectedlistemodulecalendar2(
			List<ModuleCalendarDto> selectedlistemodulecalendar2) {
		this.selectedlistemodulecalendar2 = selectedlistemodulecalendar2;
	}

	public String getTestStartDate() {
		return testStartDate;
	}

	public void setTestStartDate(String testStartDate) {
		this.testStartDate = testStartDate;
	}

	public String getTestEndDate() {
		return testEndDate;
	}

	public void setTestEndDate(String testEndDate) {
		this.testEndDate = testEndDate;
	}

	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	public void setStartDate(XMLGregorianCalendar startDate) {
		this.startDate = startDate;
	}

	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	public void setEndDate(XMLGregorianCalendar endDate) {
		this.endDate = endDate;
	}

	public XMLGregorianCalendar getStart() {
		return start;
	}

	public void setStart(XMLGregorianCalendar start) {
		this.start = start;
	}

	public XMLGregorianCalendar getEnd() {
		return end;
	}

	public void setEnd(XMLGregorianCalendar end) {
		this.end = end;
	}

	public List<AcademicModuleDto> getSelectedlistAcademicModules() {
		return selectedlistAcademicModules;
	}

	public void setSelectedlistAcademicModules(
			List<AcademicModuleDto> selectedlistAcademicModules) {
		this.selectedlistAcademicModules = selectedlistAcademicModules;
	}

	public List<ProgrammeCalendarDto> getListProgrammeCalendart() {
		return listProgrammeCalendart;
	}

	public void setListProgrammeCalendart(
			List<ProgrammeCalendarDto> listProgrammeCalendart) {
		this.listProgrammeCalendart = listProgrammeCalendart;
	}

	public List<ProgrammeCalendarDto> getListProgrammeCalendars() {
		return listProgrammeCalendars;
	}

	public void setListProgrammeCalendars(
			List<ProgrammeCalendarDto> listProgrammeCalendars) {
		this.listProgrammeCalendars = listProgrammeCalendars;
	}

	public ModuleCalendarDto getModuleCalendarDto() {
		return moduleCalendarDto;
	}

	public void setModuleCalendarDto(ModuleCalendarDto moduleCalendarDto) {
		this.moduleCalendarDto = moduleCalendarDto;
	}

	public List<SessionDto> getListSession() {
		return listSession;
	}

	public void setListSession(List<SessionDto> listSession) {
		this.listSession = listSession;
	}

	public boolean isAction3() {
		return action3;
	}

	public void setAction3(boolean action3) {
		this.action3 = action3;
	}

	public boolean isAction2() {
		return action2;
	}

	public void setAction2(boolean action2) {
		this.action2 = action2;
	}

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
	
	
	public void initDualList(String baction){
		logger.debug("DEBUT initDualList +++++++++++++");
		listProgrammeCalendarDestination =  new ArrayList<ProgrammeCalendarDto>();
		listProgrammeCalendarSources =  new ArrayList<ProgrammeCalendarDto>();
		
		if (baction.equals("1")) {
			
			action2 = true;
			action3 = false;
			listAcademicYear = new ArrayList<PopuplistDto>();
			listTypeEvent = new ArrayList<PopuplistDto>();
			listAcademicModule = new ArrayList<AcademicModuleDto>();
			listSession = new ArrayList<SessionDto>();
			listClass = new ArrayList<ClasseProgrammDto>();
			listProgrammeCalendars = new ArrayList<ProgrammeCalendarDto>();
			listProgrammeCalendart = new ArrayList<ProgrammeCalendarDto>();
			
			initUpdate();
		} else {
			action2 = true;
			action3 = false;
			studentEventsDto = new StudentEventsDto();
			listAcademicYear = new ArrayList<PopuplistDto>();
			listTypeEvent = new ArrayList<PopuplistDto>();
			listAcademicModule = new ArrayList<AcademicModuleDto>();
			listSession = new ArrayList<SessionDto>();
			listClass = new ArrayList<ClasseProgrammDto>();
			listProgrammeCalendars = new ArrayList<ProgrammeCalendarDto>();
			listProgrammeCalendart = new ArrayList<ProgrammeCalendarDto>();
			
			initCreate();
		}
		logger.debug("DEBUT initDualList +++++++++++++");
		
	}
	
	public void initUpdate(){
		
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		identityTeacherServicewsEndpoint = identityTeacherServicews.getIdentityTeacherServicewsImplPort();
		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
		
		listAcademicYear = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("academic_years");
		listTypeEvent = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeevent");
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);
		
		
		listDesClass = classeServicewsEndpoint.getAllClasseServicews();
		listeTeacherEvent = identityTeacherServicewsEndpoint.getAllIdentityTeacherServicews();
		
	}
	
	public void initCreate(){
		
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		identityTeacherServicewsEndpoint = identityTeacherServicews.getIdentityTeacherServicewsImplPort();
		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
		
		listAcademicYear = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("academic_years");
		listTypeEvent = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeevent");
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);
		
		
//		listAcademicYear = popuplistDtoServicewsEndpoint
//				.searchPopuplistDtoServicews("academic_years");
//		listTypeEvent = popuplistDtoServicewsEndpoint
//				.searchPopuplistDtoServicews("typeevent");
//		listClass = classeProgrammServicewsEndpoint
//				.searchClasseProgrammServicews(classeProgrammDto);
//		
//		listDesClass = classeServicewsEndpoint.getAllClasseServicews();
//		listeTeacherEvent = identityTeacherServicewsEndpoint.getAllIdentityTeacherServicews();
		
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
			
//			for(AcademicModuleDto academic : studentEventsDto.getClasseProgramm().getProgrammeCalendar().getProgramme().getAcademicmodule().getAcademicmodule()){
//				
//				for(AcademicModuleDto academics : selectedlistAcademicModule){
//				
//					if(academics.getIdAcademicModule() == academic.getIdAcademicModule()){
//						listAcademicModule.add(academics);
//						break;
//						
//					}
//					
//				}
//				
//				
//			}
			logger.debug("@@@@@@ JE SUIS A LA FIN @@@@@@@@@@@@@@");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateModulesProgrammesCalendar(){
		logger.debug(Level.DEBUG);
		logger.debug("@@@@@@ JE SUIS LA @@@@@@@@@@@@@@");
		try{
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
			studentEventsServicewsEndpoint = studentEventsServicews.getStudentEventsServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews.getProgrammeCalendarDtoServicewsImplPort();
			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews.getModuleCalendarDtoServicewsImplPort();
			
			selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();
			logger.debug("@@@@@@ JE SUIS LA 111111 @@@@@@@@@@@@@@");
			
			listProgrammeCalendars = programmeCalendarDtoServicewsEndpoint
					.getAllProgrammeCalendarServicews();
			logger.debug("@@@@@@ teste liste programme Calendar @@@@@@"+listProgrammeCalendars.size());
			logger.debug("@@@@@@ JE SUIS LA 2222222 @@@@@@@@@@@@@@");
			
//			classeProgrammDto.setProgrammeCalendar(studentEventsDto.getClasseProgramm().getProgrammeCalendar());
//			listClass = classeProgrammServicewsEndpoint.searchClasseProgrammServicews(classeProgrammDto);
			
			listProgrammeCalendart = new ArrayList<ProgrammeCalendarDto>();
			logger.debug("@@@@@@ JE SUIS LA 33333333@@@@@@@@@@@@@@");
			listAcademicModule = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();
			
			if (studentEventsDto.getClasseProgramm() != null){
				logger.debug("@@@@ TEST NOM PROGRAMME CALENDRIER @@@@@@"+studentEventsDto.getClasseProgramm().getClasseName());
				if (classeProgrammDto != null) {
					logger.debug("@@@@@ ENTRE ICI @@@@@@@@@");
					for (ProgrammeCalendarDto pcalendar : studentEventsDto.getClasseProgramm().getProgrammeCalendar().getProgrammeCalendar()) {
						logger.debug("@@@@@ ENTRE ICI 11111 @@@@@@@@@");
						for (ProgrammeCalendarDto pcalendars : listProgrammeCalendars) {
							if (pcalendars.getIdProgrammeCalendar() == pcalendar.getIdProgrammeCalendar()) {
								listProgrammeCalendarDestination.add(pcalendars);
								logger.debug("@@@@ LISTE SUIVVANTESS @@@@@@"+pcalendars.getIdProgrammeCalendar());
								moduleCalendarDto.setProgrammeCalendar(pcalendars);
								logger.debug("@@@@ LISTE SUIVVANTESS 22 @@@@@@"+pcalendars);
								if(pcalendars != null){
									logger.debug("@@@@ ZOOOOOO 1111 @@@@@@");
									listModuleCalendarDto = moduleCalendarDtoServicewsEndpoint.searchModuleCalendarServicews(moduleCalendarDto);
									logger.debug("@@@@ ZOOOOOO 22222 @@@@@@");
									for(ModuleCalendarDto mod : listModuleCalendarDto){
										listModuleCalendarDtos.add(mod);
									}
									pcalendars = new ProgrammeCalendarDto();
									for (int i = 0; i < listModuleCalendarDtos.size(); i ++){
										logger.debug("@@@@@@ MODULES AFFICHAGE @@@@@"+listModuleCalendarDtos.get(i).getIdModuleCalendar());
									}
									
								}
								
								break;
							}
							
							
						}
					}
				}
			}

			logger.debug("@@@@@@ JE SUIS A LA FIN LOOOO @@@@@@@@@@@@@@");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void updateSession(){
		logger.debug("@@@@ DANS LE UPDATE SESSION @@@@@@ ");
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
		moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews.getModuleCalendarDtoServicewsImplPort();
		programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews.getProgrammeCalendarDtoServicewsImplPort();
		
		for(ModuleCalendarDto mod : listModuleCalendarDto){
			listModuleCalendarDtos.add(mod);
			logger.debug("@@@@ TAILLE LISTE SECOND START @@@@@"+mod.getSession().getStartDate());
			logger.debug("@@@@ TAILLE LISTE SECOND END @@@@@"+mod.getSession().getEndDate());
		}
		
		//logger.debug("@@@@ TAILLE DE LA LISTE @@@@@@@"+selectedlistAcademicModules.size());
		
//		for(int i = 0; i < selectedlistAcademicModules.size(); i++){
//			logger.debug("@@@@ TAILLE DE LA LISTE @@@@@@@"+selectedlistAcademicModules.size());
//		}
		
	}
	
//	public Date dateTime(Date date, Date time){
//		
//		
//		return new Date(date.getYear(), date.getMonth(), date.getDay(), time.getHours(), time.getMinutes());
//	}
	
	public void addActivities(){
		
		logger.debug("@@@@@ DEBUT CREATION ACTIVITIES @@@@@@@@");
		
		
		moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews.getModuleCalendarDtoServicewsImplPort();
		StudentEventsDto addEvent = new StudentEventsDto();
		
		
		for(ModuleCalendarDto mod : listModuleCalendarDto){
			
			listModuleCalendarDtos.add(mod);
			logger.debug("@@@@ TAILLE LISTE SECOND START @@@@@"+mod.getSession().getStartDate());
			logger.debug("@@@@ TAILLE LISTE SECOND END @@@@@"+mod.getSession().getEndDate());
			
			start = studentEventsDto.getStartDate();
			start.setYear(mod.getSession().getStartDate().getYear());
			start.setMonth(mod.getSession().getStartDate().getMonth());
			start.setDay(mod.getSession().getStartDate().getDay());
			//start.setTimezone(mod.getSession().getStartDate().getTimezone());
			
			
			end = studentEventsDto.getEnDate();
			end.setYear(mod.getSession().getEndDate().getYear());
			end.setMonth(mod.getSession().getEndDate().getMonth());
			end.setDay(mod.getSession().getEndDate().getDay());
			//end.setTimezone(mod.getSession().getEndDate().getTimezone());
	
			addEvent.setAcademicModule(mod.getAcademicModule());
			addEvent.setAcademicYear(studentEventsDto.getAcademicYear());
			addEvent.setAllDayInd(studentEventsDto.isAllDayInd());
			addEvent.setClasseProgramm(studentEventsDto.getClasseProgramm());
			addEvent.setComments(studentEventsDto.getComments());
			addEvent.setDescription(studentEventsDto.getDescription());
//			logger.debug("@@@@@ DATE TAPE 1 @@@@"+studentEventsDto.getStartDate());
			addEvent.setStartDate(start);
//			logger.debug("@@@@@ DATE TAPE 2 @@@@"+studentEventsDto.getEnDate());
			addEvent.setEnDate(end);
			addEvent.setEventType(studentEventsDto.getEventType());
			addEvent.setRoom(studentEventsDto.getRoom());
			logger.debug("@@@@@ CHOIX DE LA SALLE @@@@"+studentEventsDto.getRoom().getIdClass());
			logger.debug("@@@@@ CHOIX DE LA SALLE @@@@"+studentEventsDto.getRoom().getNameOfClass());
			logger.debug("@@@@@ DATE TAPE @@@@"+start);
			logger.debug("@@@@@ DATE TAPE @@@@"+end);
			
			addEvent.setTeacher(studentEventsDto.getTeacher());
			addEvent.setTitle(studentEventsDto.getTitle());
			
			studentEventsServicewsEndpoint = studentEventsServicews.getStudentEventsServicewsImplPort();
			
			addEvent = studentEventsServicewsEndpoint.createStudentEventsServicews(addEvent);
			
		}
		
		
		init();
		logger.debug("@@@@@ FIN CREATION ACTIVITIES @@@@@@@@");
		
	}
	
//	public Date addHours(Date dateRef, Date hours){
//		Date dateFinal = new Date();
//		
//		int i = (int) DateUtils.getFragmentInHours(hours, Calendar.DAY_OF_YEAR);
//		dateFinal = DateUtils.setHours(dateRef,i);
//		
//		return dateFinal;
//	}
	public void updateDate(){
		logger.debug("++++DATE ++++"+XMLCalendarToDate.toDate(studentEventsDto.getStartDate()));
		logger.debug("++++DATE 777 ++++"+studentEventsDto.getStartDate());
		logger.debug("++++DATE 777 ++++"+studentEventsDto.getEnDate());
		logger.debug("++++DATE ++++"+XMLCalendarToDate.toDate(studentEventsDto.getEnDate()));
	}
	
//	public void dateChange(DateSelectEvent event){
//		Date date = event.getDate();
//		
//	}
	
	
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

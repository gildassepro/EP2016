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
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
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
				for (ProgrammeCalendarDto pcalendar : studentEventsDto.getClasseProgramm().getProgrammeCalendar().getProgrammeCalendar()){
					logger.debug("@@@@@@ ENTREE DU PCALENDAR 1 @@@@@@@@@@@@@@");
					for (ProgrammeCalendarDto pcalendars : listProgrammeCalendars){
						if(pcalendar.getIdProgrammeCalendar() == pcalendars.getIdProgrammeCalendar()){
							listProgrammeCalendart.add(pcalendars);
							break;
						}
						
						logger.debug("@@@@@  JE SUIS 1ERE ZONE @@@@@@");
					}
					
					for (int j =0; j < listProgrammeCalendart.size(); j++){
						
						listProgrammeCalendart.get(j).getProgramme().getAcademicmodule().getAcademicmodule().size();
						for(int k = 0; k < listProgrammeCalendart.get(j).getProgramme().getAcademicmodule().getAcademicmodule().size(); k++ ){
							
							selectedlistAcademicModules.add(listProgrammeCalendart.get(j).getProgramme().getAcademicmodule().getAcademicmodule().get(k));
							
						}
						
						logger.debug("@@@@@  JE SUIS 2EME ZONE @@@@@@");
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
		
		if ( studentEventsDto.getAcademicModule() != null ){
			moduleCalendarDto.setAcademicModule(studentEventsDto.getAcademicModule());
			selectedlistemodulecalendar = moduleCalendarDtoServicewsEndpoint.getAllModuleCalendarServicews();
			selectedlistemodulecalendar2 = new ArrayList<ModuleCalendarDto>();
			
			logger.debug("@@@ LISTE DE MODULE CALENDAR  @@@@@@"+selectedlistemodulecalendar.size());
			
			logger.debug("@@@@ AFFICHAGE MODULE ACAMDEMIQUE"+moduleCalendarDto.getAcademicModule().getModuleName());
			logger.debug("@@@@ AFFICHAGE MODULE ACAMDEMIQUE IDDD  "+moduleCalendarDto.getIdModuleCalendar());
			
			for(ModuleCalendarDto md : selectedlistemodulecalendar){
				if(md.getIdModuleCalendar() == moduleCalendarDto.getIdModuleCalendar()){
					selectedlistemodulecalendar2.add(md);
				}
				logger.debug("@@@@ AFFICHAGE DATE SESSION START "+selectedlistemodulecalendar2.size());
				//logger.debug("@@@@ AFFICHAGE DATE SESSION END  "+selectedlistemodulecalendar2.get(0).getSession().getEndDate());
			}
			
	
			
		}
		
	}
	
	public void updateSessionDate(){
//		if (moduleCalendarDto.getSession() != null){
//			moduleCalendarDto.getSession().getStartDate();
//			moduleCalendarDto.getSession().getEndDate();
//		}
		
	}
	
	public void addActivities(){
		
		logger.debug("@@@@@ DEBUT CREATION ACTIVITIES @@@@@@@@");
		
		if ( studentEventsDto.getAcademicModule() != null ){
			moduleCalendarDto.setAcademicModule(studentEventsDto.getAcademicModule());
			
			selectedlistemodulecalendar = moduleCalendarDtoServicewsEndpoint.searchModuleCalendarServicews(moduleCalendarDto);
			for (int m = 0; m < selectedlistemodulecalendar.size(); m ++){
				start = selectedlistemodulecalendar.get(m).getSession().getStartDate();
				end  = selectedlistemodulecalendar.get(m).getSession().getEndDate();
				
			}
//			startDate.setTime(start.getYear(), start.getMonth(), start.getDay(), studentEventsDto.getStartDate());
//			endDate.setTime(arg0, arg1, arg2, arg3);
			testStartDate = start.toString() + studentEventsDto.getStartDate().toString();
			testEndDate = end.toString() + studentEventsDto.getEnDate().toString();
			
			
			
		}
		
		
		
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

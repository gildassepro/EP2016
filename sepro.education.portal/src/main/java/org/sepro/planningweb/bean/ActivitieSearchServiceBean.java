package org.sepro.planningweb.bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Stream;

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
import org.jfree.data.time.Day;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.DaysofWeekDto;
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
import org.sepro.parameterweb.serviceimpl.DaysofWeekServicews;
import org.sepro.parameterweb.serviceimpl.DaysofWeekServicewsEndpoint;
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
import org.sepro.studentweb.serviceapi.EventsStatusDto;
import org.sepro.studentweb.serviceapi.StudentEventsDto;
import org.sepro.studentweb.serviceimpl.ActivitiesServicews;
import org.sepro.studentweb.serviceimpl.ActivitiesServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.EventsStatusServicews;
import org.sepro.studentweb.serviceimpl.EventsStatusServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentEventsServicews;
import org.sepro.studentweb.serviceimpl.StudentEventsServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicews;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicewsEndpoint;
import org.w3c.dom.events.Event;

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

	private EventsStatusServicewsEndpoint eventsStatusServicewsEndpoint;
	private EventsStatusServicews eventsStatusServicews = new EventsStatusServicews();
	
	private List<EventsStatusDto> listEventStatusp = new ArrayList<EventsStatusDto>();
	
	private EventsStatusDto eventsStatusDto = new EventsStatusDto();
	private List<EventsStatusDto> listEventStatus = new ArrayList<EventsStatusDto>();

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

	private DaysofWeekServicews dayofweekseServicews = new DaysofWeekServicews();
	private DaysofWeekServicewsEndpoint dayofweekserServicewsEndpoint;

	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendarDto = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarDtos = new ArrayList<ModuleCalendarDto>();

	private List<IdentityTeacherDto> listeTeacherEvent = new ArrayList<IdentityTeacherDto>();

	private StudentEventsDto studentEventsDto = new StudentEventsDto();
	private StudentEventsDto selectedEvents = new StudentEventsDto();
	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();

	private List<DaysofWeekDto> listjoursource = new ArrayList<DaysofWeekDto>();
	private List<DaysofWeekDto> listjourdestination = new ArrayList<DaysofWeekDto>();
	private DaysofWeekDto daysofWeekDto = new DaysofWeekDto();

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
	private List<PopuplistDto> listTypeAbsence = new ArrayList<PopuplistDto>();
	private List<SessionDto> listSession = new ArrayList<SessionDto>();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean value;
	private boolean test = true;
	private boolean test2 = true;
	private boolean test3 = false;
	private ScheduleModel planningclasse;
	private XMLGregorianCalendar start;
	private XMLGregorianCalendar end;

	private XMLGregorianCalendar startd;
	private XMLGregorianCalendar endd;

	boolean value2;

	private String testStartDate;
	private String testEndDate;
	
	
	
	public List<EventsStatusDto> getListEventStatusp() {
		return listEventStatusp;
	}

	public void setListEventStatusp(List<EventsStatusDto> listEventStatusp) {
		this.listEventStatusp = listEventStatusp;
	}

	public List<EventsStatusDto> getListEventStatus() {
		return listEventStatus;
	}

	public void setListEventStatus(List<EventsStatusDto> listEventStatus) {
		this.listEventStatus = listEventStatus;
	}

	public EventsStatusDto getEventsStatusDto() {
		return eventsStatusDto;
	}

	public void setEventsStatusDto(EventsStatusDto eventsStatusDto) {
		this.eventsStatusDto = eventsStatusDto;
	}

	public boolean isTest3() {
		return test3;
	}

	public void setTest3(boolean test3) {
		this.test3 = test3;
	}

	public List<PopuplistDto> getListTypeAbsence() {
		return listTypeAbsence;
	}

	public void setListTypeAbsence(List<PopuplistDto> listTypeAbsence) {
		this.listTypeAbsence = listTypeAbsence;
	}

	public boolean isTest2() {
		return test2;
	}

	public void setTest2(boolean test2) {
		this.test2 = test2;
	}

	public boolean isValue2() {
		return value2;
	}

	public void setValue2(boolean value2) {
		this.value2 = value2;
	}

	public XMLGregorianCalendar getStartd() {
		return startd;
	}

	public void setStartd(XMLGregorianCalendar startd) {
		this.startd = startd;
	}

	public XMLGregorianCalendar getEndd() {
		return endd;
	}

	public void setEndd(XMLGregorianCalendar endd) {
		this.endd = endd;
	}

	public List<DaysofWeekDto> getListjoursource() {
		return listjoursource;
	}

	public void setListjoursource(List<DaysofWeekDto> listjoursource) {
		this.listjoursource = listjoursource;
	}

	public List<DaysofWeekDto> getListjourdestination() {
		return listjourdestination;
	}

	public void setListjourdestination(List<DaysofWeekDto> listjourdestination) {
		this.listjourdestination = listjourdestination;
	}

	public DaysofWeekDto getDaysofWeekDto() {
		return daysofWeekDto;
	}

	public void setDaysofWeekDto(DaysofWeekDto daysofWeekDto) {
		this.daysofWeekDto = daysofWeekDto;
	}

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
		if (selectedEvents == null) {
			selectedEvents = studentEventsDto;
		}

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

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		listProgrammeCalendarDestination = new ArrayList<ProgrammeCalendarDto>();
		listProgrammeCalendarSources = new ArrayList<ProgrammeCalendarDto>();

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
			listjoursource = new ArrayList<DaysofWeekDto>();
			listjourdestination = new ArrayList<DaysofWeekDto>();

			initUpdate();
		} else {
			action2 = true;
			action3 = false;
			studentEventsDto = new StudentEventsDto();
			moduleCalendarDto = new ModuleCalendarDto();
			listAcademicYear = new ArrayList<PopuplistDto>();
			listTypeEvent = new ArrayList<PopuplistDto>();
			listAcademicModule = new ArrayList<AcademicModuleDto>();
			listSession = new ArrayList<SessionDto>();
			listClass = new ArrayList<ClasseProgrammDto>();
			listProgrammeCalendars = new ArrayList<ProgrammeCalendarDto>();
			listProgrammeCalendart = new ArrayList<ProgrammeCalendarDto>();
			listjoursource = new ArrayList<DaysofWeekDto>();
			listjourdestination = new ArrayList<DaysofWeekDto>();

			initCreate();
		}
		logger.debug("DEBUT initDualList +++++++++++++");

	}

	public void initUpdate() {

		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		dayofweekserServicewsEndpoint = dayofweekseServicews
				.getDaysofWeekServicewsImplPort();
		identityTeacherServicewsEndpoint = identityTeacherServicews
				.getIdentityTeacherServicewsImplPort();
		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();

		listAcademicYear = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("academic_years");
		listTypeEvent = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeevent");
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);

		listDesClass = classeServicewsEndpoint.getAllClasseServicews();
		listeTeacherEvent = identityTeacherServicewsEndpoint
				.getAllIdentityTeacherServicews();

	}

	public void initCreate() {

		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		dayofweekserServicewsEndpoint = dayofweekseServicews
				.getDaysofWeekServicewsImplPort();
		identityTeacherServicewsEndpoint = identityTeacherServicews
				.getIdentityTeacherServicewsImplPort();
		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();

		listAcademicYear = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("academic_years");
		listTypeEvent = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeevent");
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);

		listjoursource = dayofweekserServicewsEndpoint
				.getAllDaysofWeekServicews();

		for (DaysofWeekDto md : listjoursource) {

		}

	}

	public void addEvent() {
		FacesMessage msg = null;
		
		logger.debug("@@@@ TEST DE DEBUT ADD EVENT @@@@ ");
		eventsStatusServicewsEndpoint = eventsStatusServicews.getEventsStatusServicewsImplPort();
		
		EventsStatusDto createEventStatus = new EventsStatusDto();
		EventsStatusDto iventStatuss = new EventsStatusDto();
		
		logger.debug("@@@@@ ID ID @@@@@"+selectedEvents); 
		
		iventStatuss.setStudentEvents(selectedEvents);
		listEventStatus = eventsStatusServicewsEndpoint.searchEventsStatusServicews(iventStatuss);
		
		logger.debug("@@@ LISTE SIZE @@@@"+listEventStatus.size());
		createEventStatus.setActualEnDate(selectedEvents.getEnDate());
		createEventStatus.setActualStartDate(selectedEvents.getStartDate());
		logger.debug("@@@@ COMMENT @@@@"+eventsStatusDto.getComments());
		createEventStatus.setComments(eventsStatusDto.getComments());
		createEventStatus.setStatusEvent(eventsStatusDto.getStatusEvent());
		createEventStatus.setStudentEvents(selectedEvents);

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		logger.debug("@@@@ TEST DE FINS ADD EVENT 11111 @@@@ "+listEventStatus.size());
		if(listEventStatus.size() == 0){
			createEventStatus = eventsStatusServicewsEndpoint
					.createEventsStatusServicews(createEventStatus);
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_succesful"),
					rb.getString("label_msg_create_event"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
		}else{
			for(EventsStatusDto  s : listEventStatus){
				logger.debug("@@@@ TEST DE FINS ADD EVENT 22222 @@@@ "+listEventStatus.size());
				createEventStatus.setIdEventsStatus(s.getIdEventsStatus());
				createEventStatus = eventsStatusServicewsEndpoint
						.updateEventsStatusServicews(createEventStatus);
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						rb.getString("label_succesful"),
						rb.getString("label_msg_update_event"));
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(null, msg);
			}
			logger.debug("@@@@ TEST DE FINS ADD EVENT 33333 @@@@ ");
			
		}
		logger.debug("@@@@ TEST DE FINS ADD EVENT @@@@ ");
	}
//	public void onRowEdit(RowEditEvent event) {
//        FacesMessage msg = new FacesMessage("Car Edited", ((StudentEventsDto) event.getObject()).);
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }

	public void onActivitySelect(SelectEvent event) {
		// studentEventsServicewsEndpoint =
		// studentEventsServicews.getStudentEventsServicewsImplPort();
		FacesMessage msg = new FacesMessage("Actitivité selectionné ",
				((StudentEventsDto) event.getObject()).getIdStudentEvents()
						.toString());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		logger.debug("@@@@ TEST ID STUDENT @@@@@"
				+ ((StudentEventsDto) event.getObject()).getIdStudentEvents());
		logger.debug("@@@@@  TEST @@@@@" + selectedEvents);
		selectedEvents = ((StudentEventsDto) event.getObject());

		logger.debug("@@@@ SELECTED EVENT @@@@@ "
				+ selectedEvents.getIdStudentEvents());
		logger.debug("@@@@ SELECTED EVENT @@@@@ "
				+ XMLCalendarTimeToDate.toDate(selectedEvents.getStartDate()));
		selectedEvents.setStartDate(((StudentEventsDto) event.getObject())
				.getStartDate());
		selectedEvents.setEnDate(((StudentEventsDto) event.getObject())
				.getEnDate());
		selectedEvents.setTitle(((StudentEventsDto) event.getObject())
				.getTitle());

	}

	public void updateModulesProgrammes() {
		logger.debug(Level.DEBUG);
		logger.debug("@@@@@@ JE SUIS LA @@@@@@@@@@@@@@");
		try {
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			studentEventsServicewsEndpoint = studentEventsServicews
					.getStudentEventsServicewsImplPort();
			selectedlistAcademicModule = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();

			selectedEvents.setClasseProgramm(studentEventsDto
					.getClasseProgramm());
			listStudentEvent = studentEventsServicewsEndpoint
					.searchStudentEventsServicews(selectedEvents);

			logger.debug("@@@@@@ JE SUIS A LA FIN @@@@@@@@@@@@@@");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateModulesProgrammesCalendar() {
		logger.debug(Level.DEBUG);
		logger.debug("@@@@@@ JE SUIS LA @@@@@@@@@@@@@@");
		try {
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			studentEventsServicewsEndpoint = studentEventsServicews
					.getStudentEventsServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();
			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
					.getModuleCalendarDtoServicewsImplPort();

			selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();

			listProgrammeCalendars = programmeCalendarDtoServicewsEndpoint
					.getAllProgrammeCalendarServicews();

			listProgrammeCalendart = new ArrayList<ProgrammeCalendarDto>();
			listAcademicModule = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();

			if (studentEventsDto.getClasseProgramm() != null) {
				logger.debug("@@@@ TEST NOM PROGRAMME CALENDRIER @@@@@@"
						+ studentEventsDto.getClasseProgramm().getClasseName());
				

					logger.debug("@@@@ TEST NOM PROGRAMME CALENDRIER @@@@@@"
							+ studentEventsDto.getClasseProgramm().getClasseName());
					
						for (ProgrammeCalendarDto pcalendar : studentEventsDto
								.getClasseProgramm().getProgrammeCalendar()
								.getProgrammeCalendar()) {
							ModuleCalendarDto mod = new ModuleCalendarDto();
							
							mod.setProgrammeCalendar(pcalendar);
							
							listModuleCalendarDto = moduleCalendarDtoServicewsEndpoint.searchModuleCalendarServicews(mod);
							
							listModuleCalendarDtos.addAll(listModuleCalendarDto);
							
							
						}
				
			}

			logger.debug("@@@@@@ JE SUIS A LA FIN LOOOO @@@@@@@@@@@@@@");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public StudentEventsDto onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Actitivité selectionné ",
				((StudentEventsDto) event.getObject()).getIdStudentEvents()
						.toString());
		eventsStatusServicewsEndpoint = eventsStatusServicews.getEventsStatusServicewsImplPort();
		FacesContext.getCurrentInstance().addMessage(null, msg);
		EventsStatusDto eventstate = new EventsStatusDto();
		
		eventstate.setStudentEvents((StudentEventsDto) event.getObject());
		
		listEventStatusp = eventsStatusServicewsEndpoint.searchEventsStatusServicews(eventstate);
		logger.debug("@@@@@ LISTEZ STATUS @@@@@@@ "+listEventStatusp.size());
		
		if(listEventStatusp.size() != 0){
			for(EventsStatusDto pm : listEventStatusp){
				eventsStatusDto.setComments(pm.getComments());
				eventsStatusDto.setStatusEvent(pm.getStatusEvent());
			}
		}else {
			eventsStatusDto.setComments(null);
			eventsStatusDto.setStatusEvent(null);
		}
		
		//listEventStatusp = new ArrayList<EventsStatusDto>();
		
		
//		
//		for(EventsStatusDto vm : listEventStatusp){
//			eventsStatusDto.setComments(vm.getComments());
//			eventsStatusDto.setStatusEvent(vm.getStatusEvent());
//		}
		
		logger.debug("@@@@@ EVENT STATUS @@@@@@@ "+eventstate);
		logger.debug("@@@@@ EVENT STATUS @@@@@@@ "+eventstate.getIdEventsStatus());
		
		logger.debug("@@@@ TEST ID STUDENT @@@@@"
				+ ((StudentEventsDto) event.getObject()).getIdStudentEvents());
		logger.debug("@@@@@  TEST @@@@@" + selectedEvents);
		selectedEvents = ((StudentEventsDto) event.getObject());

		logger.debug("@@@@ SELECTED EVENT @@@@@ "
				+ selectedEvents.getIdStudentEvents());
		logger.debug("@@@@ SELECTED EVENT @@@@@ "
				+ XMLCalendarTimeToDate.toDate(selectedEvents.getStartDate()));
		selectedEvents.setStartDate(((StudentEventsDto) event.getObject())
				.getStartDate());
		selectedEvents.setEnDate(((StudentEventsDto) event.getObject())
				.getEnDate());
		selectedEvents.setTitle(((StudentEventsDto) event.getObject())
				.getTitle());
		
		
		
		return selectedEvents;
	}

	public ModuleCalendarDto getModuleCalendar() {

		return moduleCalendarDto;
	}

	public void testComboHour() {
		test2 = false;
	}

	public List<DaysofWeekDto> getListDest() {
		for (DaysofWeekDto mod : listjourdestination) {
			logger.debug("+++++ LEDSSS +++++" + mod.getDays());
		}
		return listjourdestination;
	}

	public void addActivitiess() {

		FacesMessage msg = null;

		StudentEventsDto addEvent = new StudentEventsDto();
		dayofweekserServicewsEndpoint = dayofweekseServicews
				.getDaysofWeekServicewsImplPort();
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();
		moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
				.getModuleCalendarDtoServicewsImplPort();
		programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
				.getProgrammeCalendarDtoServicewsImplPort();

		Date startDate, endDate = new Date();

		startDate = XMLCalendarToDate.toDate(getModuleCalendar().getSession()
				.getStartDate());
		endDate = XMLCalendarToDate.toDate(getModuleCalendar().getSession()
				.getEndDate());

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(startDate);
		int jour = 0;

		while (calendar.getTime().compareTo(endDate) <= 0) {

			jour = calendar.get(Calendar.DAY_OF_WEEK);

			for (DaysofWeekDto day : listjourdestination) {

				if (day.getIdDayofWeek() == jour) {

					Calendar f = (Calendar) calendar.clone();

					if (addMessage() == false) {

						startd = XMLCalendarTimeToDate.toXMLGregorianCalendar(f
								.getTime());

						startd.setHour(studentEventsDto.getStartDate()
								.getHour());
						startd.setMinute(studentEventsDto.getStartDate()
								.getMinute());
						startd.setSecond(studentEventsDto.getStartDate()
								.getSecond());

						endd = XMLCalendarTimeToDate.toXMLGregorianCalendar(f
								.getTime());
						endd.setHour(studentEventsDto.getEnDate().getHour());
						endd.setMinute(studentEventsDto.getEnDate().getMinute());
						endd.setSecond(studentEventsDto.getEnDate().getSecond());

						addEvent.setAllDayInd(addMessage());
					}

					if (addMessage() == true) {

						addEvent.setAllDayInd(addMessage());

					}

					addEvent.setAcademicModule(moduleCalendarDto
							.getAcademicModule());
					addEvent.setAcademicYear(studentEventsDto.getAcademicYear());
					addEvent.setClasseProgramm(studentEventsDto
							.getClasseProgramm());
					addEvent.setComments(studentEventsDto.getComments());
					addEvent.setDescription(studentEventsDto.getDescription());
					addEvent.setStartDate(startd);
					addEvent.setEnDate(endd);
					addEvent.setEventType(studentEventsDto.getEventType());
					addEvent.setRoom(studentEventsDto.getRoom());

					addEvent.setTeacher(studentEventsDto.getTeacher());
					addEvent.setTitle(studentEventsDto.getTitle());

					studentEventsServicewsEndpoint = studentEventsServicews
							.getStudentEventsServicewsImplPort();

					addEvent = studentEventsServicewsEndpoint
							.createStudentEventsServicews(addEvent);

				}

			}

			calendar.add(Calendar.DATE, 1);
		}
		
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_sucess_create_activity"));
		FacesContext context3 = FacesContext.getCurrentInstance();

		context3.addMessage(null, msg);
		

	}

	public Boolean addMessage() {

		String summary = value2 ? rb.getString("label_msg_checked") : rb
				.getString("label_msg_unchecked");
		logger.debug("@@@@ VOIR @@@@ " + value2);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(summary));

		return value2;
	}

	public Boolean testboolean() {

		return testboolean();
	}

	public void updateDate() {

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
			dayofweekserServicewsEndpoint = dayofweekseServicews
					.getDaysofWeekServicewsImplPort();
			identityTeacherServicewsEndpoint = identityTeacherServicews
					.getIdentityTeacherServicewsImplPort();
			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();

			listClass = classeProgrammServicewsEndpoint
					.searchClasseProgrammServicews(classeProgrammDto);
			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listTypeEvent = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typeevent");

			listTypeAbsence = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("eventstatus");

			listDesClass = classeServicewsEndpoint.getAllClasseServicews();
			listeTeacherEvent = identityTeacherServicewsEndpoint
					.getAllIdentityTeacherServicews();
			listjoursource = dayofweekserServicewsEndpoint
					.getAllDaysofWeekServicews();

			// selectedEvents.setClasseProgramm(studentEventsDto.getClasseProgramm());

			// listStudentEvent =
			// studentEventsServicewsEndpoint.searchStudentEventsServicews(selectedEvents);

			// listAcademicModule =
			// academicModuleDtoServicewsEndpoint.getAllAcademicModuleServicews();

			planningclasse = new LazyScheduleModel() {

				@Override
				public void loadEvents(Date start, Date end) {
					Date random = getRandomDate(start);
					addEvent(new DefaultScheduleEvent("Anglais 2", random,
							random));

					random = getRandomDate(start);
					addEvent(new DefaultScheduleEvent("Science Politique",
							random, random));
				}
			};

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// public void updatePlanningClasse(){
	// if()
	// }

	public Date getRandomDate(Date base) {
		Calendar date = Calendar.getInstance();
		date.setTime(base);
		date.add(Calendar.DATE, ((int) (Math.random() * 30)) + 1); // set random
																	// day of
																	// month

		return date.getTime();
	}

	public void onSelect(SelectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Classe selectionnée", event.getObject().toString()));
	}

	public void onSelectYears(SelectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Année selectionnée", event.getObject().toString()));
	}
}

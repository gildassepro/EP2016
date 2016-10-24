package org.sepro.planningweb.bean;

import groovyjarjarantlr.debug.Event;

import java.awt.event.ActionEvent;
import java.beans.EventSetDescriptor;
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
import org.apache.poi.ss.formula.functions.Today;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
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

import sepro.education.web.util.XMLCalendarTimeToDate;
import sepro.education.web.util.XMLCalendarToDate;

@ManagedBean
@ViewScoped
public class PlanningSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(PlanningSearchServiceBean.class);

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

	private EventsStatusDto eventsStatusDto = new EventsStatusDto();

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
	private StudentEventsDto selectedEventsClasse = new StudentEventsDto();
	private StudentEventsDto selectedEventsProf = new StudentEventsDto();
	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();

	private List<StudentEventsDto> listClasseEvent = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listProfEvent = new ArrayList<StudentEventsDto>();

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
	private List<PopuplistDto> listTypeAbsence = new ArrayList<PopuplistDto>();

	private boolean action = false;
	private boolean value;
	private boolean test = true;
	private boolean test2 = false;
	private ScheduleModel planningprof;
	private ScheduleModel planningclasse;

	private ScheduleModel eventClasse;
	private ScheduleModel eventProf;
	private ScheduleModel event = new DefaultScheduleModel();
	private ScheduleEvent eventp = new DefaultScheduleEvent();
	private ScheduleModel model;

	private int idEvent;

	
	
	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public boolean isTest2() {
		return test2;
	}

	public void setTest2(boolean test2) {
		this.test2 = test2;
	}

	public EventsStatusDto getEventsStatusDto() {
		return eventsStatusDto;
	}

	public void setEventsStatusDto(EventsStatusDto eventsStatusDto) {
		this.eventsStatusDto = eventsStatusDto;
	}

	public ScheduleEvent getEventp() {
		return eventp;
	}

	public void setEventp(ScheduleEvent eventp) {
		this.eventp = eventp;
	}

	public List<PopuplistDto> getListTypeAbsence() {
		return listTypeAbsence;
	}

	public void setListTypeAbsence(List<PopuplistDto> listTypeAbsence) {
		this.listTypeAbsence = listTypeAbsence;
	}

	public ScheduleModel getEvent() {
		return event;
	}

	public void setEvent(ScheduleModel event) {
		this.event = event;
	}

	public ScheduleModel getModel() {
		return model;
	}

	public ScheduleModel getEventProf() {
		return eventProf;
	}

	public void setEventProf(ScheduleModel eventProf) {
		this.eventProf = eventProf;
	}

	public ScheduleModel getEventClasse() {
		return eventClasse;
	}

	public void setEventClasse(ScheduleModel eventClasse) {
		this.eventClasse = eventClasse;
	}

	public List<StudentEventsDto> getListClasseEvent() {
		return listClasseEvent;
	}

	public void setListClasseEvent(List<StudentEventsDto> listClasseEvent) {
		this.listClasseEvent = listClasseEvent;
	}

	public List<StudentEventsDto> getListProfEvent() {
		return listProfEvent;
	}

	public void setListProfEvent(List<StudentEventsDto> listProfEvent) {
		this.listProfEvent = listProfEvent;
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

	public List<ModuleCalendarDto> getSelectedlistemodulecalendar() {
		return selectedlistemodulecalendar;
	}

	public void setSelectedlistemodulecalendar(
			List<ModuleCalendarDto> selectedlistemodulecalendar) {
		this.selectedlistemodulecalendar = selectedlistemodulecalendar;
	}

	public ScheduleModel getPlanningprof() {
		return planningprof;
	}

	public void setPlanningprof(ScheduleModel planningprof) {
		this.planningprof = planningprof;
	}

	public List<AcademicModuleDto> getListAcademicModule() {
		return listAcademicModule;
	}

	public void setListAcademicModule(List<AcademicModuleDto> listAcademicModule) {
		this.listAcademicModule = listAcademicModule;
	}

	public AcademicModuleDto getAcademicModuleDto() {
		return academicModuleDto;
	}

	public void setAcademicModuleDto(AcademicModuleDto academicModuleDto) {
		this.academicModuleDto = academicModuleDto;
	}

	public List<IdentityTeacherDto> getListeTeacherEvent() {
		return listeTeacherEvent;
	}

	public void setListeTeacherEvent(List<IdentityTeacherDto> listeTeacherEvent) {
		this.listeTeacherEvent = listeTeacherEvent;
	}

	public StudentEventsDto getStudentEventsDto() {
		return studentEventsDto;
	}

	public void setStudentEventsDto(StudentEventsDto studentEventsDto) {
		this.studentEventsDto = studentEventsDto;
	}

	public StudentEventsDto getSelectedEventsClasse() {
		return selectedEventsClasse;
	}

	public void setSelectedEventsClasse(StudentEventsDto selectedEventsClasse) {
		this.selectedEventsClasse = selectedEventsClasse;
	}

	public StudentEventsDto getSelectedEventsProf() {
		return selectedEventsProf;
	}

	public void setSelectedEventsProf(StudentEventsDto selectedEventsProf) {
		this.selectedEventsProf = selectedEventsProf;
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

	public List<ClasseProgrammDto> getListClass() {
		return listClass;
	}

	public void setListClass(List<ClasseProgrammDto> listClass) {
		this.listClass = listClass;
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

	public List<PopuplistDto> getListTypeEvent() {
		return listTypeEvent;
	}

	public void setListTypeEvent(List<PopuplistDto> listTypeEvent) {
		this.listTypeEvent = listTypeEvent;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

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
				"Classe selectionn�e", event.getObject().toString()));
	}

	public void onSelectYears(SelectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Ann�e selectionn�e", event.getObject().toString()));
	}

	public void onDateSelect(SelectEvent selectEvent) {
		eventp = new DefaultScheduleEvent("", (Date) selectEvent.getObject(),
				(Date) selectEvent.getObject());
		logger.debug("@@@@@ ID 11111 @@@@" + eventp.getId());
	}

	public void onEventSelect(SelectEvent selectEvent) {
		eventp = (ScheduleEvent) selectEvent.getObject();
		
		logger.debug("@@@@ EVENT SELECTED @@@@" + selectEvent.getSource());
		logger.debug("@@@@@ ID 2222 @@@@" + eventp.getId());
//		logger.debug("@@@@@ ID 3333 @@@@" +((StudentEventsDto) selectEvent.getObject()).getIdStudentEvents());
		
	}

	// public void redirect(){
	//
	// }

	public void onEventChange(SelectEvent selectEvents) {
		studentEventsServicewsEndpoint = studentEventsServicews.getStudentEventsServicewsImplPort();
		
		logger.debug("@@@@@ ID SSSSSS 22222 @@@@"
				+ ((StudentEventsDto) selectEvents.getObject())
						.getIdStudentEvents());

	}

	public void addEvent() {
		logger.debug("@@@@@ INIT ADD EVENT @@@@");
		if (eventp.getId() == null)
			eventProf.clear();
		else
			logger.debug("@@@ AFFICHE ID EVENT @@@" + eventp.getId());
		logger.debug("@@@ AFFICHE ID COMMENT @@@" + eventp.getDescription());
		logger.debug("@@@ AFFICHE ID START DATE @@@" + eventp.getStartDate());
		logger.debug("@@@ AFFICHE ID END DATE @@@" + eventp.getEndDate());

		logger.debug("@@@@@ INIT END EVENT @@@@@");
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

			eventClasse = new DefaultScheduleModel();
			eventClasse.addEvent(new DefaultScheduleEvent("TODAY", today1Pm(),
					today6Pm()));

			eventProf = new DefaultScheduleModel();
			eventProf.addEvent(new DefaultScheduleEvent("TODAY", today1Pm(),
					today6Pm()));

			logger.debug("@@@@ AFICHAGE EVENT TIME 111 @@@@@@ " + today1Pm());
			logger.debug("@@@@ AFICHAGE EVENT TIME  222 @@@@@@ " + today6Pm());

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Calendar today() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DATE), 0, 0, 0);

		return calendar;
	}

	private Date today1Pm() {
		Calendar t = (Calendar) today().clone();
		t.set(Calendar.AM_PM, Calendar.PM);
		t.set(Calendar.HOUR, 1);

		return t.getTime();
	}

	private Date today6Pm() {
		Calendar t = (Calendar) today().clone();
		t.set(Calendar.AM_PM, Calendar.PM);
		t.set(Calendar.HOUR, 6);

		return t.getTime();
	}

	public void updatePlanningClasse() {
		logger.debug("@@@@@@@ DEBUT UPDATE PLALNNING CLASSE @@@@@"
				+ selectedEventsClasse.getClasseProgramm().getClasseName());
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();
		selectedEventsClasse.setClasseProgramm(selectedEventsClasse
				.getClasseProgramm());
		eventClasse = new DefaultScheduleModel();
		listClasseEvent = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEventsClasse);
		logger.debug("@@@ TAILLE @@@@@@@" + listClasseEvent.size());
		logger.debug("@@@ TAILLE @@@@@@@" + listClasseEvent.size());

		for (StudentEventsDto stu : listClasseEvent) {
			eventClasse.addEvent(new DefaultScheduleEvent(stu.getTitle() + " "
					+ stu.getRoom().getNameOfClass(), XMLCalendarTimeToDate
					.toDate(stu.getStartDate()), XMLCalendarTimeToDate
					.toDate(stu.getEnDate()), stu.isAllDayInd()));
			logger.debug("++++++++++++ TEST 2 +++++++++++++++++++"
					+ XMLCalendarTimeToDate.toDate(stu.getStartDate()));
			logger.debug("++++++++++++ TEST 1 +++++++++++++++++++"
					+ XMLCalendarTimeToDate.toDate(stu.getEnDate()));
			logger.debug("++++++++++++ TEST 1 +++++++++++++++++++"
					+ stu.isAllDayInd());
		}

		logger.debug("@@@@@@@ FIN UPDATE PLALNNING CLASSE @@@@@"
				+ selectedEventsClasse.getClasseProgramm().getClasseName());

	}

	public void updatePlanningProf() {
		logger.debug("@@@@@@@ DEBUT UPDATE PLALNNING PROF @@@@@"
				+ selectedEventsProf.getTeacher().getIdIdentityTeacher());
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();
		eventProf = new DefaultScheduleModel();

		if (selectedEventsProf.getTeacher().getIdIdentityTeacher() != null) {
			selectedEventsProf.setTeacher(selectedEventsProf.getTeacher());
			listProfEvent = studentEventsServicewsEndpoint
					.searchStudentEventsServicews(selectedEventsProf);

			for (StudentEventsDto mp : listProfEvent) {

				eventProf.addEvent(new DefaultScheduleEvent(mp.getTitle() + " "
						+ mp.getClasseProgramm().getClasseName() + " "
						+ mp.getRoom().getNameOfClass(), XMLCalendarToDate
						.toDate(mp.getStartDate()), XMLCalendarToDate.toDate(mp
						.getEnDate()), mp.isAllDayInd()));

			}

		}

		logger.debug("@@@@@@@ FIN UPDATE PLALNNING PROF @@@@@"
				+ selectedEventsProf.getTeacher().getIdIdentityTeacher());
	}

}

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
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
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
import org.sepro.studentweb.serviceapi.ExamDto;
import org.sepro.studentweb.serviceapi.ExamGroupDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceapi.StudentEventsDto;
import org.sepro.studentweb.serviceapi.StudentExamDto;
import org.sepro.studentweb.serviceapi.StudentPresenceDto;
import org.sepro.studentweb.serviceimpl.ActivitiesServicews;
import org.sepro.studentweb.serviceimpl.ActivitiesServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.EventsStatusServicews;
import org.sepro.studentweb.serviceimpl.EventsStatusServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamGroupServicews;
import org.sepro.studentweb.serviceimpl.ExamGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamServicews;
import org.sepro.studentweb.serviceimpl.ExamServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentEventsServicews;
import org.sepro.studentweb.serviceimpl.StudentEventsServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentExamServicews;
import org.sepro.studentweb.serviceimpl.StudentExamServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentPresenceServicews;
import org.sepro.studentweb.serviceimpl.StudentPresenceServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicews;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicewsEndpoint;

import sepro.education.web.util.DefaultScheduleEventExtends;
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

	private ExamServicewsEndpoint examServicewsEndpoint;
	private ExamServicews examServicews = new ExamServicews();

	private ExamGroupServicewsEndpoint examGroupServicewsEndpoint;
	private ExamGroupServicews examGroupServicews = new ExamGroupServicews();

	private StudentEventsServicewsEndpoint studentEventsServicewsEndpoint;
	private StudentEventsServicews studentEventsServicews = new StudentEventsServicews();

	private StudentServicewsEndpoint studentServicewsEndpoint;
	private StudentServicews studentServicews = new StudentServicews();

	private StudentDto studentDto = new StudentDto();

	private StudentPresenceServicewsEndpoint studentPresenceServicewsEndpoint;
	private StudentPresenceServicews studentPresenceServicews = new StudentPresenceServicews();

	private StudentExamServicewsEndpoint studentExamServicewsEndpoint;
	private StudentExamServicews studentExamServicews = new StudentExamServicews();

	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();

	private IdentityTeacherServicewsEndpoint identityTeacherServicewsEndpoint;
	private IdentityTeacherServicews identityTeacherServicews = new IdentityTeacherServicews();

	private ProgrammeDtoServicewsEndpoint programmeDtoServicewsEndpoint;
	private ProgrammeDtoServicews programmeDtoServicews = new ProgrammeDtoServicews();

	private EventsStatusServicewsEndpoint eventsStatusServicewsEndpoint;
	private EventsStatusServicews eventsStatusServicews = new EventsStatusServicews();

	private EventsStatusDto eventsStatusDto = new EventsStatusDto();
	private EventsStatusDto eventsStatusDtos = new EventsStatusDto();
	private EventsStatusDto eventsStatusDton = new EventsStatusDto();
	private EventsStatusDto eventsStatusDto3 = new EventsStatusDto();

	private ExamDto examDto = new ExamDto();
	private ExamDto examDto2 = new ExamDto();
	private ExamDto examDtos = new ExamDto();
	private ExamDto examDtop = new ExamDto();

	private ExamGroupDto examGroupDto = new ExamGroupDto();
	private ExamGroupDto examGroupDtos = new ExamGroupDto();
	private List<ExamGroupDto> listExamGroupDtos = new ArrayList<ExamGroupDto>();
	private List<ExamGroupDto> selectedListExamGroup = new ArrayList<ExamGroupDto>();

	private StudentExamDto studentExamDto = new StudentExamDto();
	private StudentExamDto studentExamDtos = new StudentExamDto();
	private List<StudentExamDto> listStudentExam = new ArrayList<StudentExamDto>();
	private List<StudentExamDto> listStudentExams = new ArrayList<StudentExamDto>();

	private List<ExamDto> listexam = new ArrayList<ExamDto>();
	private List<ExamDto> listexams = new ArrayList<ExamDto>();
	private List<ExamDto> listexam2 = new ArrayList<ExamDto>();

	private List<EventsStatusDto> listEventStatusp = new ArrayList<EventsStatusDto>();
	private List<EventsStatusDto> listEventStatuspp = new ArrayList<EventsStatusDto>();
	private List<EventsStatusDto> listEventStatusn = new ArrayList<EventsStatusDto>();
	private List<EventsStatusDto> listEventStatus3 = new ArrayList<EventsStatusDto>();

	private List<EventsStatusDto> listEventStatus = new ArrayList<EventsStatusDto>();
	private List<EventsStatusDto> listEventStatus2 = new ArrayList<EventsStatusDto>();

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
	private List<StudentClasseDto> listStudentClass = new ArrayList<StudentClasseDto>();

	private ActivitiesServicewsEndpoint activitiesServicewsEndpoint;
	private ActivitiesServicews activitiesServicews = new ActivitiesServicews();

	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();

	private List<PopuplistDto> listpoList = new ArrayList<PopuplistDto>();
	private PopuplistDto popuplistDto = new PopuplistDto();

	private List<IdentityTeacherDto> listeTeacherEvent = new ArrayList<IdentityTeacherDto>();

	private StudentEventsDto studentEventsDto = new StudentEventsDto();
	private StudentEventsDto studentEventsDton = new StudentEventsDto();
	private StudentEventsDto studentEventsDtos = new StudentEventsDto();
	private StudentEventsDto selectedEventsClasse = new StudentEventsDto();
	private StudentEventsDto selectedEventsProf = new StudentEventsDto();

	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listStudentEvent2 = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listStudentEvents = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listStudentEventss = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listStudentEvent3 = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listStudentEvent4 = new ArrayList<StudentEventsDto>();

	private StudentEventsDto selectedEvents = new StudentEventsDto();
	private StudentEventsDto selectedEvents2 = new StudentEventsDto();
	private StudentEventsDto selectedEvents3 = new StudentEventsDto();
	private StudentEventsDto selectedEvents4 = new StudentEventsDto();

	private List<StudentEventsDto> listClasseEvent = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listClasseEvent2 = new ArrayList<StudentEventsDto>();

	private List<StudentEventsDto> listClasseEventOuvert = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listClasseEventFerme = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listClasseEventReporte = new ArrayList<StudentEventsDto>();

	private List<StudentEventsDto> listProfEvent = new ArrayList<StudentEventsDto>();

	private ClasseDto classeDto = new ClasseDto();
	private List<ClasseDto> listDesClass = new ArrayList<ClasseDto>();

	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();

	private StudentClasseDto studentClasseDto = new StudentClasseDto();
	private StudentClasseDto studentClasseDtos = new StudentClasseDto();

	private StudentPresenceDto studentPresenceDto = new StudentPresenceDto();
	private StudentPresenceDto studentPresenceDtos = new StudentPresenceDto();
	private StudentPresenceDto studentPresenceDtos2 = new StudentPresenceDto();
	private StudentPresenceDto studentPresenceDt = new StudentPresenceDto();

	private List<StudentPresenceDto> listeStudentPresence = new ArrayList<StudentPresenceDto>();
	private List<StudentPresenceDto> listeStudentPresences = new ArrayList<StudentPresenceDto>();
	private List<StudentPresenceDto> listeStudentPresence2 = new ArrayList<StudentPresenceDto>();

	private ActivitiesDto activitiesDto = new ActivitiesDto();
	private ActivitiesDto activitiesDtos = new ActivitiesDto();
	private List<ActivitiesDto> listDesActivities = new ArrayList<ActivitiesDto>();

	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listTypeEvent = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listTypeAbsence = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listTypeExam = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listStatusExam = new ArrayList<PopuplistDto>();

	private boolean action = false;

	private boolean actionExam = false;
	private boolean actionExam2 = true;

	private boolean actions = false;
	private boolean btnote = true;
	private boolean action2 = true;
	private boolean value;
	private boolean test = true;
	private boolean test2 = false;
	private ScheduleModel planningprof;
	private ScheduleModel planningclasse;

	private ScheduleModel eventClasse;
	private ScheduleModel eventProf;
	private ScheduleModel event = new DefaultScheduleModel();
	private DefaultScheduleEventExtends eventp = new DefaultScheduleEventExtends();
	private ScheduleModel model;

	private int idEvent;
	private boolean buttonpresence = true;
	private boolean buttonclass = true;
	private boolean testblokliste = true;
	private boolean testbtn = true;
	private String dialogHeader;
	private String text;
	private String text2;
	private String text3;
	private String text4;

	
	
	public String getText4() {
		return text4;
	}

	public void setText4(String text4) {
		this.text4 = text4;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public String getText3() {
		return text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

	public List<StudentExamDto> getListStudentExams() {
		return listStudentExams;
	}

	public void setListStudentExams(List<StudentExamDto> listStudentExams) {
		this.listStudentExams = listStudentExams;
	}

	public String getDialogHeader() {
		return dialogHeader;
	}

	public void setDialogHeader(String dialogHeader) {
		this.dialogHeader = dialogHeader;
	}

	public List<ExamGroupDto> getSelectedListExamGroup() {
		return selectedListExamGroup;
	}

	public void setSelectedListExamGroup(
			List<ExamGroupDto> selectedListExamGroup) {
		this.selectedListExamGroup = selectedListExamGroup;
	}

	public ExamGroupDto getExamGroupDto() {
		return examGroupDto;
	}

	public void setExamGroupDto(ExamGroupDto examGroupDto) {
		this.examGroupDto = examGroupDto;
	}

	public ExamGroupDto getExamGroupDtos() {
		return examGroupDtos;
	}

	public void setExamGroupDtos(ExamGroupDto examGroupDtos) {
		this.examGroupDtos = examGroupDtos;
	}

	public List<ExamGroupDto> getListExamGroupDtos() {
		return listExamGroupDtos;
	}

	public void setListExamGroupDtos(List<ExamGroupDto> listExamGroupDtos) {
		this.listExamGroupDtos = listExamGroupDtos;
	}

	public StudentPresenceDto getStudentPresenceDtos2() {
		return studentPresenceDtos2;
	}

	public void setStudentPresenceDtos2(StudentPresenceDto studentPresenceDtos2) {
		this.studentPresenceDtos2 = studentPresenceDtos2;
	}

	public List<PopuplistDto> getListStatusExam() {
		return listStatusExam;
	}

	public void setListStatusExam(List<PopuplistDto> listStatusExam) {
		this.listStatusExam = listStatusExam;
	}

	public ExamDto getExamDtop() {
		return examDtop;
	}

	public void setExamDtop(ExamDto examDtop) {
		this.examDtop = examDtop;
	}

	public List<ExamDto> getListexam2() {
		return listexam2;
	}

	public void setListexam2(List<ExamDto> listexam2) {
		this.listexam2 = listexam2;
	}

	public StudentDto getStudentDto() {
		return studentDto;
	}

	public void setStudentDto(StudentDto studentDto) {
		this.studentDto = studentDto;
	}

	public StudentExamDto getStudentExamDto() {
		return studentExamDto;
	}

	public void setStudentExamDto(StudentExamDto studentExamDto) {
		this.studentExamDto = studentExamDto;
	}

	public StudentExamDto getStudentExamDtos() {
		return studentExamDtos;
	}

	public void setStudentExamDtos(StudentExamDto studentExamDtos) {
		this.studentExamDtos = studentExamDtos;
	}

	public List<StudentExamDto> getListStudentExam() {
		return listStudentExam;
	}

	public void setListStudentExam(List<StudentExamDto> listStudentExam) {
		this.listStudentExam = listStudentExam;
	}

	public ExamDto getExamDto2() {
		return examDto2;
	}

	public void setExamDto2(ExamDto examDto2) {
		this.examDto2 = examDto2;
	}

	public boolean isActionExam() {
		return actionExam;
	}

	public void setActionExam(boolean actionExam) {
		this.actionExam = actionExam;
	}

	public boolean isActionExam2() {
		return actionExam2;
	}

	public void setActionExam2(boolean actionExam2) {
		this.actionExam2 = actionExam2;
	}

	public List<PopuplistDto> getListTypeExam() {
		return listTypeExam;
	}

	public void setListTypeExam(List<PopuplistDto> listTypeExam) {
		this.listTypeExam = listTypeExam;
	}

	public StudentEventsDto getSelectedEvents4() {
		return selectedEvents4;
	}

	public void setSelectedEvents4(StudentEventsDto selectedEvents4) {
		this.selectedEvents4 = selectedEvents4;
	}

	public ExamDto getExamDto() {
		return examDto;
	}

	public void setExamDto(ExamDto examDto) {
		this.examDto = examDto;
	}

	public ExamDto getExamDtos() {
		return examDtos;
	}

	public void setExamDtos(ExamDto examDtos) {
		this.examDtos = examDtos;
	}

	public List<ExamDto> getListexam() {
		return listexam;
	}

	public void setListexam(List<ExamDto> listexam) {
		this.listexam = listexam;
	}

	public List<ExamDto> getListexams() {
		return listexams;
	}

	public void setListexams(List<ExamDto> listexams) {
		this.listexams = listexams;
	}

	public List<StudentEventsDto> getListStudentEvent4() {
		return listStudentEvent4;
	}

	public void setListStudentEvent4(List<StudentEventsDto> listStudentEvent4) {
		this.listStudentEvent4 = listStudentEvent4;
	}

	public boolean isActions() {
		return actions;
	}

	public void setActions(boolean actions) {
		this.actions = actions;
	}

	public boolean isBtnote() {
		return btnote;
	}

	public void setBtnote(boolean btnote) {
		this.btnote = btnote;
	}

	public List<PopuplistDto> getListpoList() {
		return listpoList;
	}

	public void setListpoList(List<PopuplistDto> listpoList) {
		this.listpoList = listpoList;
	}

	public PopuplistDto getPopuplistDto() {
		return popuplistDto;
	}

	public void setPopuplistDto(PopuplistDto popuplistDto) {
		this.popuplistDto = popuplistDto;
	}

	public List<StudentPresenceDto> getListeStudentPresence2() {
		return listeStudentPresence2;
	}

	public void setListeStudentPresence2(
			List<StudentPresenceDto> listeStudentPresence2) {
		this.listeStudentPresence2 = listeStudentPresence2;
	}

	public List<StudentEventsDto> getListClasseEventOuvert() {
		return listClasseEventOuvert;
	}

	public void setListClasseEventOuvert(
			List<StudentEventsDto> listClasseEventOuvert) {
		this.listClasseEventOuvert = listClasseEventOuvert;
	}

	public List<StudentEventsDto> getListClasseEventFerme() {
		return listClasseEventFerme;
	}

	public void setListClasseEventFerme(
			List<StudentEventsDto> listClasseEventFerme) {
		this.listClasseEventFerme = listClasseEventFerme;
	}

	public List<StudentEventsDto> getListClasseEventReporte() {
		return listClasseEventReporte;
	}

	public void setListClasseEventReporte(
			List<StudentEventsDto> listClasseEventReporte) {
		this.listClasseEventReporte = listClasseEventReporte;
	}

	public List<StudentEventsDto> getListClasseEvent2() {
		return listClasseEvent2;
	}

	public void setListClasseEvent2(List<StudentEventsDto> listClasseEvent2) {
		this.listClasseEvent2 = listClasseEvent2;
	}

	public List<EventsStatusDto> getListEventStatus3() {
		return listEventStatus3;
	}

	public void setListEventStatus3(List<EventsStatusDto> listEventStatus3) {
		this.listEventStatus3 = listEventStatus3;
	}

	public EventsStatusDto getEventsStatusDto3() {
		return eventsStatusDto3;
	}

	public void setEventsStatusDto3(EventsStatusDto eventsStatusDto3) {
		this.eventsStatusDto3 = eventsStatusDto3;
	}

	public List<StudentEventsDto> getListStudentEvent3() {
		return listStudentEvent3;
	}

	public void setListStudentEvent3(List<StudentEventsDto> listStudentEvent3) {
		this.listStudentEvent3 = listStudentEvent3;
	}

	public List<StudentPresenceDto> getListeStudentPresences() {
		return listeStudentPresences;
	}

	public void setListeStudentPresences(
			List<StudentPresenceDto> listeStudentPresences) {
		this.listeStudentPresences = listeStudentPresences;
	}

	public StudentPresenceDto getStudentPresenceDt() {
		return studentPresenceDt;
	}

	public void setStudentPresenceDt(StudentPresenceDto studentPresenceDt) {
		this.studentPresenceDt = studentPresenceDt;
	}

	public EventsStatusDto getEventsStatusDton() {
		return eventsStatusDton;
	}

	public void setEventsStatusDton(EventsStatusDto eventsStatusDton) {
		this.eventsStatusDton = eventsStatusDton;
	}

	public List<EventsStatusDto> getListEventStatusn() {
		return listEventStatusn;
	}

	public void setListEventStatusn(List<EventsStatusDto> listEventStatusn) {
		this.listEventStatusn = listEventStatusn;
	}

	public StudentEventsDto getSelectedEvents3() {
		return selectedEvents3;
	}

	public void setSelectedEvents3(StudentEventsDto selectedEvents3) {
		this.selectedEvents3 = selectedEvents3;
	}

	public boolean isTestbtn() {
		return testbtn;
	}

	public void setTestbtn(boolean testbtn) {
		this.testbtn = testbtn;
	}

	public StudentClasseDto getStudentClasseDtos() {
		return studentClasseDtos;
	}

	public void setStudentClasseDtos(StudentClasseDto studentClasseDtos) {
		this.studentClasseDtos = studentClasseDtos;
	}

	public StudentEventsDto getSelectedEvents2() {
		return selectedEvents2;
	}

	public void setSelectedEvents2(StudentEventsDto selectedEvents2) {
		this.selectedEvents2 = selectedEvents2;
	}

	public List<EventsStatusDto> getListEventStatuspp() {
		return listEventStatuspp;
	}

	public void setListEventStatuspp(List<EventsStatusDto> listEventStatuspp) {
		this.listEventStatuspp = listEventStatuspp;
	}

	public List<StudentEventsDto> getListStudentEventss() {
		return listStudentEventss;
	}

	public void setListStudentEventss(List<StudentEventsDto> listStudentEventss) {
		this.listStudentEventss = listStudentEventss;
	}

	public StudentEventsDto getStudentEventsDton() {
		return studentEventsDton;
	}

	public void setStudentEventsDton(StudentEventsDto studentEventsDton) {
		this.studentEventsDton = studentEventsDton;
	}

	public List<StudentEventsDto> getListStudentEvent2() {
		return listStudentEvent2;
	}

	public void setListStudentEvent2(List<StudentEventsDto> listStudentEvent2) {
		this.listStudentEvent2 = listStudentEvent2;
	}

	public EventsStatusDto getEventsStatusDtos() {
		return eventsStatusDtos;
	}

	public void setEventsStatusDtos(EventsStatusDto eventsStatusDtos) {
		this.eventsStatusDtos = eventsStatusDtos;
	}

	public List<EventsStatusDto> getListEventStatus2() {
		return listEventStatus2;
	}

	public void setListEventStatus2(List<EventsStatusDto> listEventStatus2) {
		this.listEventStatus2 = listEventStatus2;
	}

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

	public boolean isButtonclass() {
		return buttonclass;
	}

	public void setButtonclass(boolean buttonclass) {
		this.buttonclass = buttonclass;
	}

	public StudentEventsDto getStudentEventsDtos() {
		return studentEventsDtos;
	}

	public void setStudentEventsDtos(StudentEventsDto studentEventsDtos) {
		this.studentEventsDtos = studentEventsDtos;
	}

	public List<StudentEventsDto> getListStudentEvents() {
		return listStudentEvents;
	}

	public void setListStudentEvents(List<StudentEventsDto> listStudentEvents) {
		this.listStudentEvents = listStudentEvents;
	}

	public StudentPresenceDto getStudentPresenceDto() {
		return studentPresenceDto;
	}

	public void setStudentPresenceDto(StudentPresenceDto studentPresenceDto) {
		this.studentPresenceDto = studentPresenceDto;
	}

	public StudentPresenceDto getStudentPresenceDtos() {
		return studentPresenceDtos;
	}

	public void setStudentPresenceDtos(StudentPresenceDto studentPresenceDtos) {
		this.studentPresenceDtos = studentPresenceDtos;
	}

	public List<StudentPresenceDto> getListeStudentPresence() {
		return listeStudentPresence;
	}

	public void setListeStudentPresence(
			List<StudentPresenceDto> listeStudentPresence) {
		this.listeStudentPresence = listeStudentPresence;
	}

	public boolean isTestblokliste() {
		return testblokliste;
	}

	public void setTestblokliste(boolean testblokliste) {
		this.testblokliste = testblokliste;
	}

	public boolean isAction2() {
		return action2;
	}

	public void setAction2(boolean action2) {
		this.action2 = action2;
	}

	public boolean isButtonpresence() {
		return buttonpresence;
	}

	public void setButtonpresence(boolean buttonpresence) {
		this.buttonpresence = buttonpresence;
	}

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

	public StudentEventsDto getSelectedEvents() {
		return selectedEvents;
	}

	public void setSelectedEvents(StudentEventsDto selectedEvents) {
		this.selectedEvents = selectedEvents;
	}

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

	public DefaultScheduleEventExtends getEventp() {
		return eventp;
	}

	public void setEventp(DefaultScheduleEventExtends eventp) {
		this.eventp = eventp;
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

	public void onDateSelect(SelectEvent selectEvent) {
		eventp = new DefaultScheduleEventExtends("",
				(Date) selectEvent.getObject(), (Date) selectEvent.getObject());
		logger.debug("@@@@@ ID 11111 @@@@" + eventp.getIdStudentEvent());
	}

	public StudentEventsDto onEventSelect(SelectEvent selectEvent) {

		renderedExam2();

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		examServicewsEndpoint = examServicews.getExamServicewsImplPort();
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		listpoList = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeevent");

		eventp = (DefaultScheduleEventExtends) selectEvent.getObject();
		logger.debug(" @@@  MT @@@@ " + eventp.getMod().getModuleName());

		FacesMessage msg = new FacesMessage("Actitivité selectionné ",
				((DefaultScheduleEventExtends) selectEvent.getObject())
						.getIdStudentEvent().toString());

		FacesContext.getCurrentInstance().addMessage(null, msg);
		EventsStatusDto eventstate = new EventsStatusDto();

		studentEventsDto.setIdStudentEvents(eventp.getIdStudentEvent());
		examDtop.setStudentEvents(studentEventsDto);

		eventstate.setStudentEvents(studentEventsDto);

		listEventStatusp = eventsStatusServicewsEndpoint
				.searchEventsStatusServicews(eventstate);

		listexam2 = examServicewsEndpoint.searchExamServicews(examDtop);

		listStudentEvents = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(studentEventsDto);

		logger.debug(" @@@@ TAILLE DE LA LISTE STUDENTEVENT 222 @@@@"
				+ listClasseEvent.size());

		if (listEventStatusp.size() != 0) {
			for (EventsStatusDto pm : listEventStatusp) {

				eventsStatusDto.setComments(pm.getComments());
				eventsStatusDto.setStatusEvent(pm.getStatusEvent());

				if (eventp.getTypeStudentEvent().equals("Examen")) {
					setDialogHeader("Details Examen");

					examGroupDtos.setAcademicModule(eventp.getMod());
					selectedListExamGroup = examGroupServicewsEndpoint
							.searchExamGroupServicews(examGroupDtos);
					logger.debug("@@@ LISTE LISTE @@@"
							+ selectedListExamGroup.size());

					if (pm.getStatusEvent().getValue().equals("Ouvert")) {
						renderedExam();

						if (listexam2.size() != 0) {
							for (ExamDto e : listexam2) {

								if (e.getStudentEvents().getIdStudentEvents()
										.equals(eventp.getIdStudentEvent())) {
									examDtos.setAverageMark(e.getAverageMark());
									examDtos.setComments(e.getComments());
									examDtos.setMaxMark(e.getMaxMark());
									examDtos.setCoefficient(e.getCoefficient());
									examDtos.setExamGroup(e.getExamGroup());
									examDtos.setTitle(e.getTitle());
									examDtos.setMinimumMark(e.getMinimumMark());
									examDtos.setTypeExam(e.getTypeExam());
									
								} else {
									examDtos.setAverageMark(null);
									examDtos.setComments(null);
									examDtos.setMaxMark(null);
									examDtos.setCoefficient(null);
									examDtos.setTitle(null);
									examDtos.setMinimumMark(null);
									examDtos.setTypeExam(null);
								}

							}

						}

						actiondisabledbutton();
						actionnotebtndisabled();
					} else {

						actionenabledbutton();
						actionnotebtndisabled();

					}
				} else if (eventp.getTypeStudentEvent().equals("TP")) {
					setDialogHeader("Details TP");
					renderedExam2();
					if (pm.getStatusEvent().getValue().equals("Ouvert")) {
						actiondisabledbutton();
						actionnotebtnenabled();
					} else {

						actionenabledbutton();
						actionnotebtndisabled();

					}
				} else if (eventp.getTypeStudentEvent().equals("Cours")) {
					setDialogHeader("Details Cours");
					renderedExam2();
					if (pm.getStatusEvent().getValue().equals("Ouvert")) {
						actiondisabledbutton();
						actionnotebtnenabled();

					} else {

						actionenabledbutton();
						actionnotebtnenabled();

					}
				}
			}

		} else {
			eventsStatusDto.setComments(null);
			eventsStatusDto.setStatusEvent(null);
			actionenabledbutton();
			actionnotebtnenabled();

		}


		return selectedEvents;
	}

	public void actiondisabledbutton() {
		buttonpresence = false;
	}

	public void actionenabledbutton() {
		buttonpresence = true;
	}

	public void actionnotebtndisabled() {
		btnote = false;
	}

	public void actionnotebtnenabled() {
		btnote = true;
	}

	public void addEvent() {
		FacesMessage msg = null;

		logger.debug("@@@@ TEST DE DEBUT ADD EVENT @@@@ ");
		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();

		examServicewsEndpoint = examServicews.getExamServicewsImplPort();

		ExamDto addexam = new ExamDto();
		EventsStatusDto createEventStatus = new EventsStatusDto();
		EventsStatusDto iventStatuss = new EventsStatusDto();

		selectedEvents.setIdStudentEvents(eventp.getIdStudentEvent());
		iventStatuss.setStudentEvents(selectedEvents);
		examDto2.setStudentEvents(selectedEvents);

		listEventStatus = eventsStatusServicewsEndpoint
				.searchEventsStatusServicews(iventStatuss);
		listStudentEvent = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEvents);

		createEventStatus.setActualEnDate(eventp.getStartDateEvent());
		createEventStatus.setActualStartDate(eventp.getEndDateEvent());

		createEventStatus.setComments(eventsStatusDto.getComments());
		createEventStatus.setStatusEvent(eventsStatusDto.getStatusEvent());
		createEventStatus.setStudentEvents(selectedEvents);

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();

		examGroupDtos.setAcademicModule(eventp.getMod());

		listexam = examServicewsEndpoint.searchExamServicews(examDto2);

		if (listexam.size() != 0) {
			for (ExamDto c : listexam) {
				if (c.getStudentEvents().getIdStudentEvents()
						.equals(eventp.getIdStudentEvent())) {

					logger.debug("TEST QI-1");

					addexam.setIdExam(c.getIdExam());
					examServicewsEndpoint = examServicews
							.getExamServicewsImplPort();
					addexam = examServicewsEndpoint
							.updateExamServicews(addexam);
				} else {

					logger.debug("TEST QI-22");

					addexam.setActualEnDate(eventp.getEndDateEvent());
					addexam.setActualStartDate(eventp.getStartDateEvent());
					addexam.setExamGroup(examDtos.getExamGroup());
					addexam.setTitle(eventp.getTitle());
					addexam.setCoefficient(examDtos.getCoefficient());
					addexam.setAverageMark(examDtos.getAverageMark());
					addexam.setComments(examDtos.getComments());
					addexam.setMaxMark(examDtos.getMaxMark());
					addexam.setMinimumMark(examDtos.getMinimumMark());
					addexam.setStudentEvents(examDto2.getStudentEvents());
					addexam.setTypeExam(examDtos.getTypeExam());
					         

					examServicewsEndpoint = examServicews
							.getExamServicewsImplPort();
					addexam = examServicewsEndpoint
							.createExamServicews(addexam);
				}
			}

		} 

		if (listEventStatus.size() == 0) {

			createEventStatus = eventsStatusServicewsEndpoint
					.createEventsStatusServicews(createEventStatus);
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_succesful"),
					rb.getString("label_msg_create_event"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

		} else {
			for (EventsStatusDto s : listEventStatus) {
				logger.debug("@@@@ TEST DE FINS ADD EVENT 22222 @@@@ "
						+ listEventStatus.size());
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

	public void renderedExam() {
		actionExam2 = false;
		actionExam = true;
	}

	public void renderedExam2() {
		actionExam2 = true;
		actionExam = false;
	}

	public void addExamm() {
		examServicewsEndpoint = examServicews.getExamServicewsImplPort();

		logger.debug(" DEBUT ADD EXAMM");
		ExamDto addexam = new ExamDto();

		selectedEvents.setIdStudentEvents(eventp.getIdStudentEvent());
		logger.debug("0" + selectedEvents.getIdStudentEvents());

		examDto2.setStudentEvents(selectedEvents);

		listStudentEvent = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEvents);

		logger.debug("2         " + listStudentEvent.size());

		listexam = examServicewsEndpoint.searchExamServicews(examDto2);
		

		if (listexam.size() != 0) {
			for (ExamDto a : listexam) {
				addexam.setIdExam(a.getIdExam());
				examServicewsEndpoint = examServicews
						.getExamServicewsImplPort();
				addexam = examServicewsEndpoint.updateExamServicews(addexam);
			}

		} else {

			for (StudentEventsDto b : listStudentEvent) {

				addexam.setActualEnDate(b.getEnDate());
				addexam.setActualStartDate(b.getStartDate());

			}

			addexam.setAverageMark(examDtos.getAverageMark());
			addexam.setComments(examDtos.getComments());
			addexam.setMaxMark(examDtos.getMaxMark());
			addexam.setMinimumMark(examDtos.getMinimumMark());
			addexam.setCoefficient(examDtos.getCoefficient());
			addexam.setStudentEvents(examDto2.getStudentEvents());
			addexam.setTypeExam(examDtos.getTypeExam());

			examServicewsEndpoint = examServicews.getExamServicewsImplPort();
			addexam = examServicewsEndpoint.createExamServicews(addexam);

		}

	}

	public void onEventChange(SelectEvent selectEvents) {
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();

		logger.debug("@@@@@ ID SSSSSS 22222 @@@@"
				+ ((StudentEventsDto) selectEvents.getObject())
						.getIdStudentEvents());

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

			listTypeExam = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("eventexam");

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
		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();

		selectedEventsClasse.setClasseProgramm(selectedEventsClasse
				.getClasseProgramm());

		eventClasse = new DefaultScheduleModel();
		listClasseEvent = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEventsClasse);

		listEventStatus3 = eventsStatusServicewsEndpoint
				.searchEventsStatusServicews(eventsStatusDto3);

		logger.debug("+++++ TAILLE EVENT CLASSE ++++" + listEventStatus3.size());

		logger.debug("@@@ TAILLE @@@@@@@" + listClasseEvent.size());

		for (StudentEventsDto stu : listClasseEvent) {

			DefaultScheduleEventExtends ev = new DefaultScheduleEventExtends(
					stu.getTitle() + " " + stu.getRoom().getNameOfClass(),
					XMLCalendarTimeToDate.toDate(stu.getStartDate()),
					XMLCalendarTimeToDate.toDate(stu.getEnDate()),
					stu.isAllDayInd());

			if (stu.getEventType().getValue().equals("Cours")) {
				ev.setStyleClass("cours-schedule");
			}
			if (stu.getEventType().getValue().equals("TP")) {
				ev.setStyleClass("tp-schedule");
			}
			if (stu.getEventType().getValue().equals("Examen")) {
				ev.setStyleClass("examen-schedule");
			}

			for (EventsStatusDto sto5 : listEventStatus3) {
				if (stu.getIdStudentEvents().equals(
						sto5.getStudentEvents().getIdStudentEvents())
						&& sto5.getStatusEvent().getValue().equals("Ouvert")) {
					ev.setStyleClass("open-status");
				}
				if (stu.getIdStudentEvents().equals(
						sto5.getStudentEvents().getIdStudentEvents())
						&& sto5.getStatusEvent().getValue().equals("Ferme")) {
					ev.setStyleClass("close-status");
				}
				if (stu.getIdStudentEvents().equals(
						sto5.getStudentEvents().getIdStudentEvents())
						&& sto5.getStatusEvent().getValue().equals("Reporte")) {
					ev.setStyleClass("follow-status");
				}
			}

			ev.setIdStudentEvent(stu.getIdStudentEvents());
			ev.setTypeStudentEvent(stu.getEventType().getValue());
			ev.setMod(stu.getAcademicModule());
			ev.setEndDateEvent(stu.getEnDate());
			ev.setStartDateEvent(stu.getStartDate());

			eventClasse.addEvent(ev);

		}

	}

	public void updatePlanningProf() {
		
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

	}

	public void testEvent() {

	}

	public void actionPresencePage() {
		
		action = true;
		action2 = false;

	}

	public String initDualList(String baction) {

		logger.debug("DEBUT ACTION PRESENCE PAGE");
		if (baction.equals("1")) {
			logger.debug("001@  " + selectedEvents);
			studentEventsDtos = selectedEventsClasse;
			selectedEvents2 = selectedEvents;
			action = true;
			actions = false;
			action2 = false;
			buttonclass = true;
			initUpdateActivities();
			return null;

		} else {
			logger.debug("001@  " + selectedEvents);
			studentEventsDtos = selectedEventsClasse;
			selectedEvents2 = selectedEvents;
			actions = true;
			action = false;
			action2 = false;
			buttonclass = true;
			initUpdateNotes();

		}

		logger.debug("@@@ END ACTION PRESENCE PAGE 2");
		return null;
	}

	public void initUpdateActivities() {

		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();
		studentClasseServicewsEndpoint = studentClasseServicews
				.getStudentClasseServicewsImplPort();

		logger.debug("@@@@ ICI 1 @@@@" + studentEventsDtos.getClasseProgramm());

		studentClasseDto.setClasseProgramm(studentEventsDtos
				.getClasseProgramm());

		listTypeAbsence = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeabsence");

		listTypeExam = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("eventexam");

		selectedEvents.setIdStudentEvents(eventp.getIdStudentEvent());

		listStudentEvents = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEvents);
		logger.debug("@@@@@ SELECTED LISTE ID @@@@@" + listStudentEvents.size());

		for (StudentEventsDto sdto : listStudentEvents) {
			if (sdto.getIdStudentEvents().equals(
					selectedEvents.getIdStudentEvents())) {
				selectedEvents2.setTitle(sdto.getTitle());
			}
		}

		logger.debug("@@@@ TAILLE LISTE ACITVITY FILTRED @@@@@"
				+ listStudentEventss.size());

		listStudentClass = studentClasseServicewsEndpoint
				.searchStudentClasseServicews(studentClasseDto);

		for (StudentClasseDto stv : listStudentClass) {

			StudentPresenceDto createpresence = new StudentPresenceDto();
			
			createpresence.setComments(null);
			createpresence.setEventsStatus(null);
			createpresence.setStatusStudent(null);
			createpresence.setStudent(stv.getStudent());

			listeStudentPresence.add(createpresence);
			
		}

		logger.debug("init updateActivity");

	}

	public void initUpdateNotes() {
		logger.debug("@@@@   G   @@@@@");
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		examServicewsEndpoint = examServicews.getExamServicewsImplPort();
		studentExamServicewsEndpoint = studentExamServicews
				.getStudentExamServicewsImplPort();

		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();
		studentClasseServicewsEndpoint = studentClasseServicews
				.getStudentClasseServicewsImplPort();

		studentClasseDto.setClasseProgramm(studentEventsDtos
				.getClasseProgramm());

		listTypeAbsence = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typeabsence");
		examDto2.setStudentEvents(selectedEvents);
		listStatusExam = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("statusexam");

		selectedEvents.setIdStudentEvents(eventp.getIdStudentEvent());

		listStudentEvents = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEvents);

		listexams = examServicewsEndpoint.searchExamServicews(examDto2);

		for (StudentEventsDto sdto : listStudentEvents) {
			if (sdto.getIdStudentEvents().equals(
					selectedEvents.getIdStudentEvents())) {
				selectedEvents2.setTitle(sdto.getTitle());
			}
		}

		listStudentClass = studentClasseServicewsEndpoint
				.searchStudentClasseServicews(studentClasseDto);

		logger.debug("@@@ TAILLLZ STUDENT CLASSE 1111 @@@@@@ "
				+ listStudentClass.size());

		for (StudentClasseDto sto : listStudentClass) {

			StudentExamDto create = new StudentExamDto();

			create.setComments(null);
			create.setExam(null);
			create.setStudent(sto.getStudent());
			create.setRattrapageMark(null);
			create.setStatusExam(null);
			create.setMark(null);

			listStudentExams.add(create);

		}

		logger.debug("@@@@ LISTE STUDENT CLASS" + listStudentExams.size());

	}

	public StudentClasseDto onRowStudentSave(SelectEvent event) {

		studentClasseServicewsEndpoint = studentClasseServicews
				.getStudentClasseServicewsImplPort();
		studentPresenceServicewsEndpoint = studentPresenceServicews
				.getStudentPresenceServicewsImplPort();
		studentExamServicewsEndpoint = studentExamServicews
				.getStudentExamServicewsImplPort();

		FacesMessage msg = new FacesMessage(
				rb.getString("label_msg_student_selected"),
				((StudentClasseDto) event.getObject()).getStudent()
						.getFirstName()
						+ " "
						+ ((StudentClasseDto) event.getObject()).getStudent()
								.getName());

		studentClasseDto.setStudent(((StudentClasseDto) event.getObject())
				.getStudent());

		FacesContext.getCurrentInstance().addMessage(null, msg);

		return studentClasseDto;
	}

	

	public void addEventPresence2() {

		logger.debug("DEBUT ADD EVENTPRESENCE2");
		FacesMessage msg = null;

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		listpoList = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("presencestatus");
		EventsStatusDto createEventStatus2 = new EventsStatusDto();
		selectedEvents3.setIdStudentEvents(eventp.getIdStudentEvent());
		eventsStatusDton.setStudentEvents(selectedEvents3);
		listStudentEventss = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEvents3);

		createEventStatus2.setStudentEvents(selectedEvents3);

		listEventStatusn = eventsStatusServicewsEndpoint
				.searchEventsStatusServicews(eventsStatusDton);

		for (PopuplistDto ppo : listpoList) {
			if (ppo.getValue().equals("Deverrouille")) {
				createEventStatus2.setStatusEvent(ppo);
			}
		}

		for (EventsStatusDto evt2 : listEventStatusn) {
			createEventStatus2.setComments(evt2.getComments());
		}

		for (StudentEventsDto lsp : listStudentEventss) {

			createEventStatus2.setActualEnDate(lsp.getEnDate());
			createEventStatus2.setActualStartDate(lsp.getStartDate());

		}
		createEventStatus2 = eventsStatusServicewsEndpoint
				.createEventsStatusServicews(createEventStatus2);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_event"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

		logger.debug("FIN ADD EVENTPRESENCE2");

	}

	public void addEventPresence3() {

		logger.debug("DEBUT ADD EVENTPRESENCE3");
		FacesMessage msg = null;

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		listpoList = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("presencestatus");

		EventsStatusDto createEventStatus3 = new EventsStatusDto();
		selectedEvents3.setIdStudentEvents(eventp.getIdStudentEvent());
		eventsStatusDton.setStudentEvents(selectedEvents3);
		listStudentEventss = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(selectedEvents3);

		createEventStatus3.setComments(eventsStatusDton.getComments());
		createEventStatus3.setStudentEvents(selectedEvents3);

		listEventStatusn = eventsStatusServicewsEndpoint
				.searchEventsStatusServicews(eventsStatusDton);

		for (PopuplistDto ppos : listpoList) {
			if (ppos.getValue().equals("Verrouille")) {
				createEventStatus3.setStatusEvent(ppos);
			}
		}

		for (EventsStatusDto evt3 : listEventStatusn) {
			createEventStatus3.setComments(evt3.getComments());
		}

		for (StudentEventsDto lsp : listStudentEventss) {

			createEventStatus3.setActualEnDate(lsp.getEnDate());
			createEventStatus3.setActualStartDate(lsp.getStartDate());

		}
		createEventStatus3 = eventsStatusServicewsEndpoint
				.createEventsStatusServicews(createEventStatus3);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_event"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

		logger.debug("FIN ADD EVENTPRESENCE3");

	}

	public void getStatusPresent() {

		logger.debug("@@@@@ START init getStatusPresent @@@@@");

		testbtn = false;

		logger.debug("@@@@@ END init getStatusPresent @@@@@");

	}
	
	public void saveAbsence() {
		FacesMessage msg = null;

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();

		studentPresenceServicewsEndpoint = studentPresenceServicews
				.getStudentPresenceServicewsImplPort();

		logger.debug("@@@@@@@ init Save Absence @@@@@@");
		

		selectedEvents3.setIdStudentEvents(eventp.getIdStudentEvent());
		eventsStatusDton.setStudentEvents(selectedEvents3);
		listEventStatusn = eventsStatusServicewsEndpoint
				.searchEventsStatusServicews(eventsStatusDton);

		
			
			for (StudentPresenceDto studentPresenceP : listeStudentPresence) {

				StudentPresenceDto createStudentPresence = new StudentPresenceDto();
				

				for (EventsStatusDto p : listEventStatusn) {
				createStudentPresence.setEventsStatus(p);
				}
				
				createStudentPresence.setComments(studentPresenceP.getComments());
				createStudentPresence.setStatusStudent(studentPresenceP.getStatusStudent());
				
				createStudentPresence.setActualEnDate(eventp.endDateEvent);
				createStudentPresence.setActualStartDate(eventp.getStartDateEvent());
				createStudentPresence.setStudent(studentPresenceP.getStudent());
				
				studentPresenceServicewsEndpoint = studentPresenceServicews.getStudentPresenceServicewsImplPort();
				createStudentPresence = studentPresenceServicewsEndpoint.createStudentPresenceServicews(createStudentPresence);

			}

			testbtn = true;

			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_succesful"),
					rb.getString("label_msg_update_list_presence"));
			FacesContext context = FacesContext.getCurrentInstance();

			context.addMessage(null, msg);

		}
	

	public void blockListe() {

		logger.debug("DEBUT END LISTE ");
		studentPresenceServicewsEndpoint = studentPresenceServicews
				.getStudentPresenceServicewsImplPort();
		StudentPresenceDto updatEventPresence = new StudentPresenceDto();
		listeStudentPresence = studentPresenceServicewsEndpoint
				.searchStudentPresenceServicews(studentPresenceDt);

		logger.debug("@@@ VERIFICATION LISTE TAILLE @@@@"
				+ listeStudentPresence.size());
		logger.debug("@@@ SELECTED EVENT 000 @@@@"
				+ selectedEvents.getStartDate());
		logger.debug("@@@ SELECTED EVENT 111 @@@@" + selectedEvents.getEnDate());

		RequestContext context = RequestContext.getCurrentInstance();
		context.execute("PF('confirmation').show();");

		addEventPresence3();
		testblokliste = true;

		logger.debug("FIN LISTE ");
	}
	
	
				


	public void saveNote() {

		FacesMessage msg = null;

		eventsStatusServicewsEndpoint = eventsStatusServicews
				.getEventsStatusServicewsImplPort();
		examServicewsEndpoint = examServicews.getExamServicewsImplPort();
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();

		selectedEvents.setIdStudentEvents(eventp.getIdStudentEvent());
		studentExamServicewsEndpoint = studentExamServicews
				.getStudentExamServicewsImplPort();

		studentDto.setIdStudent(eventp.getIdStudentEvent());
		examDto2.setStudentEvents(selectedEvents);

		listexams = examServicewsEndpoint.searchExamServicews(examDto2);

		logger.debug("@@@@  LISTE DE PERSONNES 4444 @@@@"
				+ listStudentClass.size());

		for (StudentExamDto studentExamD : listStudentExams) {

			StudentExamDto addnote = new StudentExamDto();
			
			logger.debug("NOTE " + studentExamD.getStudent().getName());

			for (ExamDto t : listexams) {
				addnote.setExam(t);
			}
			
			addnote.setComments(studentExamD.getComments());
			addnote.setMark(studentExamD.getMark());
			addnote.setRattrapageMark(studentExamD.getRattrapageMark());
			addnote.setStatusExam(studentExamD.getStatusExam());
			addnote.setStudent(studentExamD.getStudent());

			studentExamServicewsEndpoint = studentExamServicews
					.getStudentExamServicewsImplPort();

			addnote = studentExamServicewsEndpoint
					.createStudentExamServicews(addnote);

		}

		testbtn = true;

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_list_note"));
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, msg);

	}
	
	public void handleKeyEvent(){
		text = text.toUpperCase();
		text2 = text2.toUpperCase();
		text3 = text3.toUpperCase();
		text4 = text4.toUpperCase();
	}

}

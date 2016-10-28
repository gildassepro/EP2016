package org.sepro.studentweb.bean;

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
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.parameterweb.bean.CursusSearchServiceBean;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceimpl.ClasseServicews;
import org.sepro.parameterweb.serviceimpl.ClasseServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceapi.EventsStatusDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentEventsDto;
import org.sepro.studentweb.serviceapi.StudentPresenceDto;
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
import org.sepro.studentweb.serviceimpl.StudentPresenceServicews;
import org.sepro.studentweb.serviceimpl.StudentPresenceServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;

import com.itextpdf.tool.xml.css.parser.State;

@ManagedBean
@ViewScoped
public class AbsenceStudentSearchServiceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(AbsenceStudentSearchServiceBean.class);

	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();
	
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();

	private StudentPresenceServicewsEndpoint studentPresenceServicewsEndpoint;
	private StudentPresenceServicews studentPresenceServicews = new StudentPresenceServicews();
	
	private StudentServicewsEndpoint studentServicewsEndpoint;
	private StudentServicews studentServicews = new StudentServicews();

	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();

	private StudentEventsServicewsEndpoint studentEventsServicewsEndpoint;
	private StudentEventsServicews studentEventsServicews = new StudentEventsServicews();

	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private ClasseServicews classeServicews = new ClasseServicews();

	private EventsStatusServicewsEndpoint eventsStatusServicewsEndpoint;
	private EventsStatusServicews eventsStatusServicews = new EventsStatusServicews();

	private EventsStatusDto eventsStatusDto = new EventsStatusDto();
	private List<EventsStatusDto> listEventStatus = new ArrayList<EventsStatusDto>();
	private List<EventsStatusDto> listEventStatusp = new ArrayList<EventsStatusDto>();
	
	private ActivitiesServicewsEndpoint activitiesServicewsEndpoint;
	private ActivitiesServicews activitiesServicews = new ActivitiesServicews();
	
	private StudentPresenceDto studentPresenceDto = new StudentPresenceDto();
	private StudentPresenceDto studentPresenceDtos = new StudentPresenceDto();
	
	private List<StudentPresenceDto> listeStudentPresence = new ArrayList<StudentPresenceDto>();

	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();

	private List<StudentClasseDto> listStudentClass = new ArrayList<StudentClasseDto>();

	private StudentClasseDto studentClasseDto = new StudentClasseDto();
	private StudentClasseDto studentClasseDtos = new StudentClasseDto();

	private StudentEventsDto studentEventsDto = new StudentEventsDto();
	private StudentEventsDto selectedEvents = new StudentEventsDto();
	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();
	private List<StudentEventsDto> listStudentEvents = new ArrayList<StudentEventsDto>();
	
	private List<PopuplistDto> listTypeAbsence =  new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listTypeStatusEvent = new ArrayList<PopuplistDto>();
	

	private ClasseDto classeDto = new ClasseDto();
	private List<ClasseDto> listDesClass = new ArrayList<ClasseDto>();

	private boolean value1;
	private boolean value2;
	private boolean value3;

	private String pointage;
	
	
	
	
	public List<EventsStatusDto> getListEventStatusp() {
		return listEventStatusp;
	}

	public void setListEventStatusp(List<EventsStatusDto> listEventStatusp) {
		this.listEventStatusp = listEventStatusp;
	}

	public List<StudentEventsDto> getListStudentEvents() {
		return listStudentEvents;
	}

	public void setListStudentEvents(List<StudentEventsDto> listStudentEvents) {
		this.listStudentEvents = listStudentEvents;
	}

	public EventsStatusDto getEventsStatusDto() {
		return eventsStatusDto;
	}

	public void setEventsStatusDto(EventsStatusDto eventsStatusDto) {
		this.eventsStatusDto = eventsStatusDto;
	}

	public List<EventsStatusDto> getListEventStatus() {
		return listEventStatus;
	}

	public void setListEventStatus(List<EventsStatusDto> listEventStatus) {
		this.listEventStatus = listEventStatus;
	}

	public List<PopuplistDto> getListTypeStatusEvent() {
		return listTypeStatusEvent;
	}

	public void setListTypeStatusEvent(List<PopuplistDto> listTypeStatusEvent) {
		this.listTypeStatusEvent = listTypeStatusEvent;
	}

	public List<PopuplistDto> getListTypeAbsence() {
		return listTypeAbsence;
	}

	public void setListTypeAbsence(List<PopuplistDto> listTypeAbsence) {
		this.listTypeAbsence = listTypeAbsence;
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

	public String getPointage() {
		return pointage;
	}

	public void setPointage(String pointage) {
		this.pointage = pointage;
	}

	public boolean isValue1() {
		return value1;
	}

	public void setValue1(boolean value1) {
		this.value1 = value1;
	}

	public boolean isValue2() {
		return value2;
	}

	public void setValue2(boolean value2) {
		this.value2 = value2;
	}

	public boolean isValue3() {
		return value3;
	}

	public void setValue3(boolean value3) {
		this.value3 = value3;
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

	// Update Liste Student by Class selected
	public void updateListeStudentClasse() {

	}

	public void saveAbsence() {
		
		logger.debug("init Save Absence");
		StudentPresenceDto createStudentPresence = new StudentPresenceDto();
		FacesMessage msg = null;
		logger.debug("@@@@  LISTE DE PERSONNES 4444 @@@@"+listStudentClass.size());
		
		createStudentPresence.setActualStartDate(null);
		createStudentPresence.setActualEnDate(null);
		createStudentPresence.setComments(null);
		createStudentPresence.setEventsStatus(null);
		createStudentPresence.setStatusStudent(null);
		createStudentPresence.setStudent(null);
		
		studentPresenceServicewsEndpoint = studentPresenceServicews.getStudentPresenceServicewsImplPort();
		
		createStudentPresence = studentPresenceServicewsEndpoint.createStudentPresenceServicews(createStudentPresence);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_list_presence"));
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, msg);
		
		logger.debug("init Save Absence");
	}

	public StudentEventsDto getDate(){
		logger.debug("@@@@ studentevent  @@@@@"+studentEventsDto.getIdStudentEvents());
		return studentEventsDto;
	}
	
	public void endListe(){
		
	}
	
	
	public void updateActivity() {
		logger.debug("init updateActivity");
		popuplistDtoServicewsEndpoint = popuplistDtoServicews.getPopuplistDtoServicewsImplPort();
		eventsStatusServicewsEndpoint = eventsStatusServicews.getEventsStatusServicewsImplPort();
		studentEventsServicewsEndpoint = studentEventsServicews
				.getStudentEventsServicewsImplPort();
		studentClasseServicewsEndpoint = studentClasseServicews
				.getStudentClasseServicewsImplPort();
		

		logger.debug("@@@@ ICI 1 @@@@" + studentEventsDto.getClasseProgramm());
		studentEventsDto
				.setClasseProgramm(studentEventsDto.getClasseProgramm());

		studentClasseDto
				.setClasseProgramm(studentEventsDto.getClasseProgramm());
		
		listEventStatus = eventsStatusServicewsEndpoint.searchEventsStatusServicews(eventsStatusDto);
		
		logger.debug(" @@@@@@ TAILLLE EVENTSTAZTUS @@@@" +listEventStatus.size());
		
		listTypeAbsence = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("typeabsence");
		
		listStudentEvent = studentEventsServicewsEndpoint
				.searchStudentEventsServicews(studentEventsDto);
		
		
			logger.debug("@@@@ ENTREE ICI @@@@@ ");
			
			for(EventsStatusDto p : listEventStatus ){
				if(p.getStatusEvent().getIdPopuplist() == 61){
					listEventStatusp.add(p);
				}
			}
			logger.debug("@@@@ TAILLE LISTE ACITVITY FILTRED 333333333 @@@@@"+listEventStatusp.size());
			
			for(EventsStatusDto stat : listEventStatusp){
				for(StudentEventsDto evt : listStudentEvent){
					
					if(evt.getIdStudentEvents().equals(stat.getStudentEvents().getIdStudentEvents())){
						listStudentEvents.add(evt);
					}
					logger.debug("@@@@ LISTE ABSENCE @@@@@ "+listStudentEvents.size());
				}
				
			}
			logger.debug("@@@@ TAILLE LISTE ACITVITY FILTRED @@@@@"+listStudentEvents.size());
			
			
		listStudentClass = studentClasseServicewsEndpoint
				.searchStudentClasseServicews(studentClasseDto);

		logger.debug("@@@ TAILLE LISTE ACTIVITY @@@@" + listStudentEvent.size());

		logger.debug("init updateActivity");
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init AbsenceStudentSearchServiceBean");
			studentClasseServicewsEndpoint = studentClasseServicews
					.getStudentClasseServicewsImplPort();
			classeProgrammServicewsEndpoint = classeProgrammServicews
					.getClasseProgrammServicewsImplPort();

			// listStudentClass = studentClasseServicewsEndpoint
			// .searchStudentClasseServicews(studentClasseDto);
			listClass = classeProgrammServicewsEndpoint
					.searchClasseProgrammServicews(classeProgrammDto);
			logger.debug("end init AbsenceStudentSearchServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

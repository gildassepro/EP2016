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

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicewsEndpoint;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceapi.StudentCVDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentContactServicews;
import org.sepro.studentweb.serviceimpl.StudentContactServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentDataDtoServicews;
import org.sepro.studentweb.serviceimpl.StudentDataDtoServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicews;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicewsEndpoint;

@ManagedBean
@ViewScoped
public class StudentClassSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(StudentClassSearchServiceBean.class);

	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();

	private StudentServicewsEndpoint studentServicewsEndpoint;
	private StudentServicews studentServicews = new StudentServicews();
	private List<StudentDto> listeStudentInscritp = new ArrayList<StudentDto>();
	private List<StudentDto> selectedlistEtudiantClass = new ArrayList<StudentDto>();
	private StudentDto studentDto = new StudentDto();
	private StudentDto studentDtos = new StudentDto();

	private StudentDataDtoServicewsEndpoint studentDataDtoServicewsEndpoint;
	private StudentDataDtoServicews studentDataDtoServicews = new StudentDataDtoServicews();
	

	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	private List<ProgrammeCalendarDto> listProgrammeCalendar = new ArrayList<ProgrammeCalendarDto>();

	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();

	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	

	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtost = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos2 = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();

	private StudentClasseDto studentClasseDto = new StudentClasseDto();
	private StudentClasseDto studentClasseDtos = new StudentClasseDto();
	private StudentClasseDto studentClasseDtos2 = new StudentClasseDto();
	private List<StudentClasseDto> listEtudiantClass = new ArrayList<StudentClasseDto>();

	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listFiliere = new ArrayList<PopuplistDto>();

	public boolean status;
	private boolean action = false;

	private boolean action2 = false;
	private boolean action3 = true;
	private boolean action4 = false;
	private boolean test = true;
	private boolean testtable = true;
	private boolean testbutton = false;

	
	
	public StudentDto getStudentDtos() {
		return studentDtos;
	}

	public void setStudentDtos(StudentDto studentDtos) {
		this.studentDtos = studentDtos;
	}

	

	public StudentClasseDto getStudentClasseDtos2() {
		return studentClasseDtos2;
	}

	public void setStudentClasseDtos2(StudentClasseDto studentClasseDtos2) {
		this.studentClasseDtos2 = studentClasseDtos2;
	}

	public ClasseProgrammDto getClasseProgrammDtos2() {
		return classeProgrammDtos2;
	}

	public void setClasseProgrammDtos2(ClasseProgrammDto classeProgrammDtos2) {
		this.classeProgrammDtos2 = classeProgrammDtos2;
	}

	public List<StudentDto> getSelectedlistEtudiantClass() {
		return selectedlistEtudiantClass;
	}

	public void setSelectedlistEtudiantClass(
			List<StudentDto> selectedlistEtudiantClass) {
		this.selectedlistEtudiantClass = selectedlistEtudiantClass;
	}

	public ClasseProgrammDto getClasseProgrammDtost() {
		return classeProgrammDtost;
	}

	public void setClasseProgrammDtost(ClasseProgrammDto classeProgrammDtost) {
		this.classeProgrammDtost = classeProgrammDtost;
	}

	public boolean isAction4() {
		return action4;
	}

	public void setAction4(boolean action4) {
		this.action4 = action4;
	}

	public StudentDto getStudentDto() {
		return studentDto;
	}

	public void setStudentDto(StudentDto studentDto) {
		this.studentDto = studentDto;
	}

	public boolean isTestbutton() {
		return testbutton;
	}

	public void setTestbutton(boolean testbutton) {
		this.testbutton = testbutton;
	}

	public List<StudentDto> getListeStudentInscritp() {
		return listeStudentInscritp;
	}

	public void setListeStudentInscritp(List<StudentDto> listeStudentInscritp) {
		this.listeStudentInscritp = listeStudentInscritp;
	}

	public boolean isAction3() {
		return action3;
	}

	public void setAction3(boolean action3) {
		this.action3 = action3;
	}

	public List<ProgrammeCalendarDto> getListProgrammeCalendar() {
		return listProgrammeCalendar;
	}

	public void setListProgrammeCalendar(
			List<ProgrammeCalendarDto> listProgrammeCalendar) {
		this.listProgrammeCalendar = listProgrammeCalendar;
	}

	public boolean isTesttable() {
		return testtable;
	}

	public void setTesttable(boolean testtable) {
		this.testtable = testtable;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
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

	public List<StudentClasseDto> getListEtudiantClass() {
		if (classeProgrammDtos != null) {
			logger.debug("@@@@@++ JE SUIS DANS LE GETLISTETUDIANT ++@@@@@");
			studentClasseDtos2.setClasseProgramm(classeProgrammDtos);
			listEtudiantClass = studentClasseServicewsEndpoint
					.searchStudentClasseServicews(studentClasseDtos2);
			logger.debug("@@@@++++ LISTE LISTE ETUDIANT ++++@@@"
					+ listEtudiantClass.size());
			logger.debug("@@@@++++ LISTE LISTE ETUDIANT ++++@@@"
					+ listEtudiantClass.size());
		}
		return listEtudiantClass;
	}

	public void setListEtudiantClass(List<StudentClasseDto> listEtudiantClass) {
		this.listEtudiantClass = listEtudiantClass;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public boolean isAction2() {
		return action2;
	}

	public void setAction2(boolean action2) {
		this.action2 = action2;
	}

	public List<PopuplistDto> getListAcademicYear() {
		return listAcademicYear;
	}

	public void setListAcademicYear(List<PopuplistDto> listAcademicYear) {
		this.listAcademicYear = listAcademicYear;
	}

	public List<PopuplistDto> getListFiliere() {
		return listFiliere;
	}

	public void setListFiliere(List<PopuplistDto> listFiliere) {
		this.listFiliere = listFiliere;
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			classeProgrammDto = classeProgrammDtos;
			studentClasseDto = studentClasseDtos;
			listEtudiantClass = new ArrayList<StudentClasseDto>();
			action2 = true;
			test = false;
			action3 = false;
			testtable = false;
			testbutton = true;
			selectedlistEtudiantClass = new ArrayList<StudentDto>();
			listAcademicYear = new ArrayList<PopuplistDto>();
			listFiliere = new ArrayList<PopuplistDto>();
			
			

			initUpdateStudentClass();

		} else {

			studentClasseDto = new StudentClasseDto();
			classeProgrammDto = new ClasseProgrammDto();
			action2 = true;
			action3 = false;
			test = false;
			testtable = true;
			testbutton = true;
			selectedlistEtudiantClass = new ArrayList<StudentDto>();
			listEtudiantClass = new ArrayList<StudentClasseDto>();
			listAcademicYear = new ArrayList<PopuplistDto>();
			listFiliere = new ArrayList<PopuplistDto>();

			initCreateStudentClasse();

		}

	}

	public void initUpdateStudentClass() {
		logger.debug("@@@BEGIN INIT UPDATE @@@@");
		action = false;
		try {
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listFiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listProgrammeCalendar = programmeCalendarDtoServicewsEndpoint
					.getAllProgrammeCalendarServicews();
			listeStudentInscritp = studentServicewsEndpoint
					.searchStudentServicews(studentDto);
			
			studentClasseDto.setClasseProgramm(classeProgrammDtos);
			studentDtos.setIdStudent(studentClasseDto.getStudent().getIdStudent());
			selectedlistEtudiantClass = studentServicewsEndpoint.searchStudentServicews(studentDtos);

		} catch (Exception ex) {

		}
		logger.debug("@@@FIN INIT UPDATE @@@@");
	}

	public void initCreateStudentClasse() {
		action = true;
		try {
			logger.debug("@@@@BEGIN INITCREATE@@@@");
			

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();
			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listFiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listProgrammeCalendar = programmeCalendarDtoServicewsEndpoint
					.getAllProgrammeCalendarServicews();
			listeStudentInscritp = studentServicewsEndpoint
					.searchStudentServicews(studentDto);
			

		} catch (Exception ex) {

		}

	}

	public void createClass() {
		FacesMessage msg = null;
		ClasseProgrammDto createClass = new ClasseProgrammDto();

		createClass.setAcademicSector(classeProgrammDto.getAcademicSector());
		createClass.setAcademicYear(classeProgrammDto.getAcademicYear());
		createClass.setClasseName(classeProgrammDto.getClasseName());
		createClass.setNombreEleve(classeProgrammDto.getNombreEleve());
		createClass.setProgrammeCalendar(classeProgrammDto
				.getProgrammeCalendar());

		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		createClass = classeProgrammServicewsEndpoint
				.createClasseProgrammServicews(createClass);

		classeProgrammDtost.setIdClasseProgramm(createClass
				.getIdClasseProgramm());
		ActiveDatatable();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_class_programm"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		
	}

	public void ActiveDatatable() {
		logger.debug("@@@@DEBUT@@@@@@");
		testtable = false;
		testbutton = false;
		logger.debug("@@@@FIN@@@@@@");
	}

	public String supprimerClass() {
		FacesMessage msg = null;
		try {
			classeProgrammServicewsEndpoint
					.deleteClasseProgrammServicews(classeProgrammDtos);
			init();
		} catch (Exception ex) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"), rb.getString("label_msg_failed_delete_class_programm"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_class_programm"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public void updateClass() {
		logger.debug("@@@@DEBUT MODIFICATION CLASSE@@@@@");
		FacesMessage msg = null;
		try {

			ClasseProgrammDto updateClass = new ClasseProgrammDto();

			updateClass
					.setAcademicSector(classeProgrammDto.getAcademicSector());
			updateClass.setAcademicYear(classeProgrammDto.getAcademicYear());
			updateClass.setClasseName(classeProgrammDto.getClasseName());
			updateClass.setNombreEleve(classeProgrammDto.getNombreEleve());
			updateClass.setProgrammeCalendar(classeProgrammDto
					.getProgrammeCalendar());
			classeProgrammServicewsEndpoint = classeProgrammServicews
					.getClasseProgrammServicewsImplPort();

			updateClass.setIdClasseProgramm(classeProgrammDto
					.getIdClasseProgramm());
			updateClass = classeProgrammServicewsEndpoint
					.updateClasseProgrammServicews(updateClass);
		} catch (Exception ex) {
			
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_class_programm"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("@@@@FIN MODIFICATION CLASSE@@@@@");

	}

	public String createStudentClasse() {
		FacesMessage msg = null;
		logger.debug("++++@@@@ BEGIN CREATE STUDENT CLASSE @@@+++++++");
		
		try {
			for (int i = 0; i < selectedlistEtudiantClass.size(); i++) {

				StudentClasseDto createStudentClass = new StudentClasseDto();
				StudentDto studentost = new StudentDto();
				createStudentClass.setClasseProgramm(classeProgrammDtost);	
				
				studentost.setIdStudent(selectedlistEtudiantClass.get(i)
						.getIdStudent());
				createStudentClass.setStudent(studentost);
				studentClasseServicewsEndpoint = studentClasseServicews
						.getStudentClasseServicewsImplPort();

				createStudentClass = studentClasseServicewsEndpoint
						.createStudentClasseServicews(createStudentClass);
			}
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"), rb.getString("label_msg_failed_delete_class_programm"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

			return null;
		}
		
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_add_student_class"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("++++@@@@ FIN CREATE STUDENT CLASSE @@@+++++++");
		return null;
		
	}

	public String updateStudentClasse() {
		FacesMessage msg = null;
		logger.debug("++++@@@@ BEGIN UPDATE STUDENT CLASSE @@@+++++++");
		try {
			for (int i = 0; i < selectedlistEtudiantClass.size(); i++) {

				StudentClasseDto updateStudentClass = new StudentClasseDto();
				StudentDto studentost = new StudentDto();
				studentost.setIdStudent(selectedlistEtudiantClass.get(i)
						.getIdStudent());

				logger.debug("@@@@++++  AFFICHAGE CLASSPROGRAMME  ++++++@@@@@"
						+ classeProgrammDto);
				logger.debug("@@@@++++  AFFICHAGE TAILLE LISTE  ++++++@@@@@"
						+ selectedlistEtudiantClass.size());
				updateStudentClass.setClasseProgramm(classeProgrammDto);
				logger.debug("@@@@++++  CLASS PROGRAMME  ++++++@@@@@"
						+ classeProgrammDto.getClasseName());
				updateStudentClass.setStudent(studentost);
				studentClasseServicewsEndpoint = studentClasseServicews
						.getStudentClasseServicewsImplPort();

				updateStudentClass = studentClasseServicewsEndpoint
						.createStudentClasseServicews(updateStudentClass);
			}
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"), rb.getString("label_msg_failed_delete_class_programm"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

			return null;
		}
		
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_add_student_class"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("++++@@@@ FIN UPDATE STUDENT CLASSE @@@+++++++");
		return null;
		
		
	}

	// public void onTransfer(TransferEvent event) {
	// StringBuilder builder = new StringBuilder();
	// for(Object item : event.getItems()) {
	// builder.append(((Theme) item).getName()).append("<br />");
	// }
	//
	// FacesMessage msg = new FacesMessage();
	// msg.setSeverity(FacesMessage.SEVERITY_INFO);
	// msg.setSummary("Items Transferred");
	// msg.setDetail(builder.toString());
	//
	// FacesContext.getCurrentInstance().addMessage(null, msg);
	// }

	public void onSelect(SelectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Item Selected", event.getObject().toString()));
	}

	public void onUnselect(UnselectEvent event) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Item Unselected", event.getObject().toString()));
	}

	public void onReorder() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"List Reordered", null));
	}
	
	public void updateListStudentSector() {
		logger.debug("@@@@@@ DANS LE UPDATE LISTE STUDENT FILIERE @@@@@@@");
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");

			classeProgrammServicewsEndpoint = classeProgrammServicews
					.getClasseProgrammServicewsImplPort();
			listClass = classeProgrammServicewsEndpoint
					.searchClasseProgrammServicews(classeProgrammDto);

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

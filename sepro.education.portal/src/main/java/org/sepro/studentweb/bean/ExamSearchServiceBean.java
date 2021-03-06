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
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
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
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceapi.ExamDto;
import org.sepro.studentweb.serviceapi.ExamGroupDto;
import org.sepro.studentweb.serviceapi.ExamModuleGroupDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceapi.StudentEventsDto;
import org.sepro.studentweb.serviceapi.StudentExamDto;
import org.sepro.studentweb.serviceapi.StudentExamGroupDto;
import org.sepro.studentweb.serviceapi.StudentPresenceDto;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamGroupServicews;
import org.sepro.studentweb.serviceimpl.ExamGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamModuleGroupServicews;
import org.sepro.studentweb.serviceimpl.ExamModuleGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamServicews;
import org.sepro.studentweb.serviceimpl.ExamServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentEventsServicews;
import org.sepro.studentweb.serviceimpl.StudentEventsServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentExamGroupServicews;
import org.sepro.studentweb.serviceimpl.StudentExamGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentExamServicews;
import org.sepro.studentweb.serviceimpl.StudentExamServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicews;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicewsEndpoint;

import sepro.education.web.util.XMLCalendarTimeToDate;
import sepro.education.web.util.XMLCalendarToDate;

@ManagedBean
@ViewScoped
public class ExamSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ExamSearchServiceBean.class);

	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();

	private StudentExamGroupServicewsEndpoint studentExamGroupServicewsEndpoint;
	private StudentExamGroupServicews studentExamGroupServicews = new StudentExamGroupServicews();

	private StudentExamServicewsEndpoint studentExamServicewsEndpoint;
	private StudentExamServicews studentExamServicews = new StudentExamServicews();

	private ExamServicewsEndpoint examServicewsEndpoint;
	private ExamServicews examServicews = new ExamServicews();

	private ExamGroupServicewsEndpoint examGroupServicewsEndpoint;
	private ExamGroupServicews examGroupServicews = new ExamGroupServicews();

	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();

	private List<ProgrammeCalendarDto> listProgrammeCalendarDestination = new ArrayList<ProgrammeCalendarDto>();
	private List<ProgrammeCalendarDto> listProgrammeCalendarSources = new ArrayList<ProgrammeCalendarDto>();

	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;

	private List<AcademicModuleDto> listAcademicModule = new ArrayList<AcademicModuleDto>();

	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();

	private StudentExamGroupDto studentExamGroupDto = new StudentExamGroupDto();
	private StudentExamGroupDto studentExamGroupDtos = new StudentExamGroupDto();

	private List<StudentExamGroupDto> listStudentExamGroup = new ArrayList<StudentExamGroupDto>();
	private List<StudentExamGroupDto> listStudentExamGroups = new ArrayList<StudentExamGroupDto>();

	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();

	private ExamGroupDto examGroupDto = new ExamGroupDto();
	private ExamGroupDto examGroupDtos = new ExamGroupDto();

	private List<ExamGroupDto> listeexamgroupes = new ArrayList<ExamGroupDto>();

	private ExamDto examDto = new ExamDto();
	private List<ExamDto> listExam = new ArrayList<ExamDto>();

	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendarDto = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarDtos = new ArrayList<ModuleCalendarDto>();

	private List<StudentEventsDto> listStudentEvent = new ArrayList<StudentEventsDto>();
	private StudentClasseDto studentClasseDto = new StudentClasseDto();

	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();

	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();
	private List<StudentClasseDto> listStudentClass = new ArrayList<StudentClasseDto>();

	private StudentExamDto studentExamDto = new StudentExamDto();
	private List<StudentExamDto> liststudentExam = new ArrayList<StudentExamDto>();

	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listStatusExam = new ArrayList<PopuplistDto>();

	private Double averageExamGroup = 0.0;
	private Double sommeExamGroup = 0.0;
	private Double coefficientExamGroup = 0.0;
	private Long idStudent = 0L;

	
	private String text1;
	private String text2;

	
	
	public ClasseProgrammDto getClasseProgrammDto() {
		return classeProgrammDto;
	}

	public void setClasseProgrammDto(ClasseProgrammDto classeProgrammDto) {
		this.classeProgrammDto = classeProgrammDto;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public List<PopuplistDto> getListStatusExam() {
		return listStatusExam;
	}

	public void setListStatusExam(List<PopuplistDto> listStatusExam) {
		this.listStatusExam = listStatusExam;
	}

	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public Double getSommeExamGroup() {
		return sommeExamGroup;
	}

	public void setSommeExamGroup(Double sommeExamGroup) {
		this.sommeExamGroup = sommeExamGroup;
	}

	public Double getCoefficientExamGroup() {
		return coefficientExamGroup;
	}

	public void setCoefficientExamGroup(Double coefficientExamGroup) {
		this.coefficientExamGroup = coefficientExamGroup;
	}

	public void setAverageExamGroup(Double averageExamGroup) {
		this.averageExamGroup = averageExamGroup;
	}

	public StudentExamDto getStudentExamDto() {
		return studentExamDto;
	}

	public void setStudentExamDto(StudentExamDto studentExamDto) {
		this.studentExamDto = studentExamDto;
	}

	public List<StudentExamDto> getListstudentExam() {
		return liststudentExam;
	}

	public void setListstudentExam(List<StudentExamDto> liststudentExam) {
		this.liststudentExam = liststudentExam;
	}

	public StudentExamGroupDto getStudentExamGroupDto() {
		return studentExamGroupDto;
	}

	public void setStudentExamGroupDto(StudentExamGroupDto studentExamGroupDto) {
		this.studentExamGroupDto = studentExamGroupDto;
	}

	public StudentExamGroupDto getStudentExamGroupDtos() {
		return studentExamGroupDtos;
	}

	public void setStudentExamGroupDtos(StudentExamGroupDto studentExamGroupDtos) {
		this.studentExamGroupDtos = studentExamGroupDtos;
	}

	public List<StudentClasseDto> getListStudentClass() {
		return listStudentClass;
	}

	public void setListStudentClass(List<StudentClasseDto> listStudentClass) {
		this.listStudentClass = listStudentClass;
	}

	public List<StudentExamGroupDto> getListStudentExamGroup() {
		return listStudentExamGroup;
	}

	public void setListStudentExamGroup(
			List<StudentExamGroupDto> listStudentExamGroup) {
		this.listStudentExamGroup = listStudentExamGroup;
	}

	public List<StudentExamGroupDto> getListStudentExamGroups() {
		return listStudentExamGroups;
	}

	public void setListStudentExamGroups(
			List<StudentExamGroupDto> listStudentExamGroups) {
		this.listStudentExamGroups = listStudentExamGroups;
	}

	public StudentClasseDto getStudentClasseDto() {
		return studentClasseDto;
	}

	public void setStudentClasseDto(StudentClasseDto studentClasseDto) {
		this.studentClasseDto = studentClasseDto;
	}

	public ExamDto getExamDto() {
		return examDto;
	}

	public void setExamDto(ExamDto examDto) {
		this.examDto = examDto;
	}

	public List<ExamDto> getListExam() {
		return listExam;
	}

	public void setListExam(List<ExamDto> listExam) {
		this.listExam = listExam;
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

	public List<ExamGroupDto> getListeexamgroupes() {
		return listeexamgroupes;
	}

	public void setListeexamgroupes(List<ExamGroupDto> listeexamgroupes) {
		this.listeexamgroupes = listeexamgroupes;
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

	public List<AcademicModuleDto> getListAcademicModule() {
		return listAcademicModule;
	}

	public void setListAcademicModule(List<AcademicModuleDto> listAcademicModule) {
		this.listAcademicModule = listAcademicModule;
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

	public List<StudentEventsDto> getListStudentEvent() {
		return listStudentEvent;
	}

	public void setListStudentEvent(List<StudentEventsDto> listStudentEvent) {
		this.listStudentEvent = listStudentEvent;
	}

	public List<ClasseProgrammDto> getListClass() {
		return listClass;
	}

	public void setListClass(List<ClasseProgrammDto> listClass) {
		this.listClass = listClass;
	}

	public List<PopuplistDto> getListAcademicYear() {
		return listAcademicYear;
	}

	public void setListAcademicYear(List<PopuplistDto> listAcademicYear) {
		this.listAcademicYear = listAcademicYear;
	}

	public ModuleCalendarDto getModuleCalendarDto() {
		return moduleCalendarDto;
	}

	public void setModuleCalendarDto(ModuleCalendarDto moduleCalendarDto) {
		this.moduleCalendarDto = moduleCalendarDto;
	}

	public void onSelectYears() {

		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();

		classeProgrammDto.setAcademicYear(examGroupDto.getAcademicYear());
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);

	}

	public void updateModulesProgrammesCalendar() {
		logger.debug(Level.DEBUG);
		logger.debug("@@@@@@ JE SUIS LA @@@@@@@@@@@@@@");
		try {
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			examGroupServicewsEndpoint = examGroupServicews
					.getExamGroupServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();
			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
					.getModuleCalendarDtoServicewsImplPort();
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			studentClasseServicewsEndpoint = studentClasseServicews
					.getStudentClasseServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();

			studentClasseDto
					.setClasseProgramm(examGroupDto.getClasseProgramm());

			listStudentClass = studentClasseServicewsEndpoint
					.searchStudentClasseServicews(studentClasseDto);
			listAcademicModule = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();

			if (examGroupDto.getClasseProgramm() != null) {

				logger.debug("@@@@ TEST NOM PROGRAMME CALENDRIER @@@@@@"
						+ examGroupDto.getClasseProgramm().getClasseName());

				for (ProgrammeCalendarDto pcalendar : examGroupDto
						.getClasseProgramm().getProgrammeCalendar()
						.getProgrammeCalendar()) {

					ModuleCalendarDto moduleCalendarD = new ModuleCalendarDto();

					moduleCalendarD.setProgrammeCalendar(pcalendar);

					listModuleCalendarDto = moduleCalendarDtoServicewsEndpoint
							.searchModuleCalendarServicews(moduleCalendarD);

					listModuleCalendarDtos.addAll(listModuleCalendarDto);

				}

			}

			for (StudentClasseDto stv : listStudentClass) {

				StudentExamGroupDto createstdexam = new StudentExamGroupDto();

				createstdexam.setComments(null);
				createstdexam.setExamGroup(examGroupDto);
				createstdexam.setMark(null);
				createstdexam.setRattrapageMark(null);
				createstdexam.setStatusExam(null);
				createstdexam.setStudent(stv.getStudent());

				listStudentExamGroup.add(createstdexam);

			}

			logger.debug("@@@@@@ JE SUIS A LA FIN LOOOO @@@@@@@@@@@@@@");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updatelistexam() {
		logger.debug("+++++++");

		examServicewsEndpoint = examServicews.getExamServicewsImplPort();

		examDto.setExamGroup(examGroupDto);

		listExam = examServicewsEndpoint.searchExamServicews(examDto);

		logger.debug("+++++++" + listExam.size());
	}

	public Double getAverageExamGroup(StudentExamGroupDto studentExamGroupDto) {
		if (coefficientExamGroup > 0) {

			studentExamGroupDto.setMark(sommeExamGroup / coefficientExamGroup);
			return sommeExamGroup / coefficientExamGroup;

		} else {
			studentExamGroupDto.setMark(0.0);
			return null;
		}
	}

	public Double getNote(ExamDto examDto, StudentDto studentDto) {

		if (idStudent == 0L) {
			coefficientExamGroup = 0.0;
			sommeExamGroup = 0.0;
			idStudent = studentDto.getIdStudent();
		} else {
			if (idStudent != studentDto.getIdStudent()) {
				coefficientExamGroup = 0.0;
				sommeExamGroup = 0.0;
				idStudent = studentDto.getIdStudent();
			}
		}
		StudentExamDto studentExamDto = new StudentExamDto();
		studentExamDto.setExam(examDto);
		studentExamDto.setStudent(studentDto);
		studentExamServicewsEndpoint = studentExamServicews
				.getStudentExamServicewsImplPort();

		liststudentExam = studentExamServicewsEndpoint
				.searchStudentExamServicews(studentExamDto);
		if (liststudentExam.size() == 1) {
			if (sommeExamGroup == 0.0) {
				sommeExamGroup = (double) liststudentExam.get(0).getMark()
						* examDto.getCoefficient();
				coefficientExamGroup = (double) examDto.getCoefficient();
			} else {
				sommeExamGroup = sommeExamGroup
						+ ((double) liststudentExam.get(0).getMark() * examDto
								.getCoefficient());
				coefficientExamGroup = coefficientExamGroup
						+ examDto.getCoefficient();

			}
			return (double) liststudentExam.get(0).getMark();
		} else {
			return null;
		}

	}

	public void saveNoteGroupExam() {

		for (StudentExamGroupDto str : listStudentExamGroup) {

			StudentExamGroupDto createstudentexamgrpr = new StudentExamGroupDto();

			logger.debug("++++++++++++++     " + examGroupDto.getIdExamGroup());

			createstudentexamgrpr.setComments(str.getComments());
			createstudentexamgrpr.setExamGroup(examGroupDto);
			createstudentexamgrpr.setMark(str.getMark());
			logger.debug("+++++++++++++222+     " + str.getMark());
			createstudentexamgrpr.setStatusExam(str.getStatusExam());
			createstudentexamgrpr.setStudent(str.getStudent());
			createstudentexamgrpr.setRattrapageMark(str.getRattrapageMark());

			studentExamGroupServicewsEndpoint = studentExamGroupServicews
					.getStudentExamGroupServicewsImplPort();
			createstudentexamgrpr = studentExamGroupServicewsEndpoint
					.createStudentExamGroupServicews(createstudentexamgrpr);

		}

	}

	public ModuleCalendarDto getModuleCalendar() {
		logger.debug("ME ME ���@@@@@");
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();

		examGroupDto.setAcademicModule(moduleCalendarDto.getAcademicModule());
		listeexamgroupes = examGroupServicewsEndpoint
				.searchExamGroupServicews(examGroupDto);

		return moduleCalendarDto;
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

			examGroupServicewsEndpoint = examGroupServicews
					.getExamGroupServicewsImplPort();

			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listStatusExam = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("statusexam");

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void handleKeyEvent() {

		text1 = text1.toUpperCase();
		text2 = text2.toUpperCase();

	}

}

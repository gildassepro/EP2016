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
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
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
import org.sepro.studentweb.serviceapi.ModuleAcademiExamDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceapi.StudentExamDto;
import org.sepro.studentweb.serviceapi.StudentExamGroupDto;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamGroupServicews;
import org.sepro.studentweb.serviceimpl.ExamGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ExamModuleGroupServicews;
import org.sepro.studentweb.serviceimpl.ExamModuleGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.ModuleAcademiExamServicews;
import org.sepro.studentweb.serviceimpl.ModuleAcademiExamServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentExamGroupServicews;
import org.sepro.studentweb.serviceimpl.StudentExamGroupServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ModuleAcademicExamSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ModuleAcademicExamSearchServiceBean.class);


	private ExamModuleGroupServicewsEndpoint examModuleGroupServicewsEndpoint;
	private ExamModuleGroupServicews examModuleGroupServicews = new ExamModuleGroupServicews();
	
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	
	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	
	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();
	
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private ClasseServicews classeServicews = new ClasseServicews();

	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();
	
	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;
	
	private StudentExamGroupServicewsEndpoint studentExamGroupServicewsEndpoint;
	private StudentExamGroupServicews studentExamGroupServicews = new StudentExamGroupServicews();
	
	
	private List<AcademicModuleDto> listAcademicModule = new ArrayList<AcademicModuleDto>();
	
	private ExamGroupServicewsEndpoint examGroupServicewsEndpoint;
	private ExamGroupServicews examGroupServicews = new ExamGroupServicews();
	
	private ModuleAcademiExamServicewsEndpoint moduleAcademiExamServicewsEndpoint;
	private ModuleAcademiExamServicews moduleAcademiExamServicews = new ModuleAcademiExamServicews();
	
	private StudentExamGroupDto studentExamGroupDto = new StudentExamGroupDto();
	private StudentExamGroupDto studentExamGroupDtos= new StudentExamGroupDto();
	private List<StudentExamGroupDto> lisStudentExamGroup = new ArrayList<StudentExamGroupDto>();
	
	private ModuleAcademiExamDto moduleAcademiExamDto = new ModuleAcademiExamDto();
	private ModuleAcademiExamDto moduleAcademiExamDtos = new ModuleAcademiExamDto();
	private List<ModuleAcademiExamDto> listModuleAcademiExam = new ArrayList<ModuleAcademiExamDto>();

	private ExamModuleGroupDto examModuleGroupDto = new ExamModuleGroupDto();
	private ExamModuleGroupDto examModuleGroupDtos = new ExamModuleGroupDto();
	
	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();
	private List<StudentClasseDto> listStudentClass = new ArrayList<StudentClasseDto>();
	
	private StudentClasseDto studentClasseDto = new StudentClasseDto();
	
	private List<ExamModuleGroupDto> listexamModuleGroup = new ArrayList<ExamModuleGroupDto>();
	private List<ModuleAcademiExamDto> listStudentExamModuleGroup = new ArrayList<ModuleAcademiExamDto>();
	
	private AcademicModuleDto academicModuleDto = new AcademicModuleDto();
	private List<AcademicModuleDto> listAcademicModuleDto = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> listAcademicModuleDtos = new ArrayList<AcademicModuleDto>();
	
	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendarDto = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarDtos = new ArrayList<ModuleCalendarDto>();
	
	private ExamGroupDto examGroupDto = new ExamGroupDto();
	private ExamGroupDto examGroupDtos = new ExamGroupDto();
	private List<ExamGroupDto> lisExamGroupDtos = new ArrayList<ExamGroupDto>();
	
	private List<PopuplistDto> listStatusExam = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	

	private Double averageExamGroup = 0.0;
	private Double sommeExamGroup = 0.0;
	private Double coefficientExamGroup = 0.0;
	private Long idStudent = 0L;
	private String text1;
	private String text2;
	
	
	
	
	
	public AcademicModuleDto getAcademicModuleDto() {
		return academicModuleDto;
	}
	public void setAcademicModuleDto(AcademicModuleDto academicModuleDto) {
		this.academicModuleDto = academicModuleDto;
	}
	public List<AcademicModuleDto> getListAcademicModuleDto() {
		return listAcademicModuleDto;
	}
	public void setListAcademicModuleDto(
			List<AcademicModuleDto> listAcademicModuleDto) {
		this.listAcademicModuleDto = listAcademicModuleDto;
	}
	public List<AcademicModuleDto> getListAcademicModuleDtos() {
		return listAcademicModuleDtos;
	}
	public void setListAcademicModuleDtos(
			List<AcademicModuleDto> listAcademicModuleDtos) {
		this.listAcademicModuleDtos = listAcademicModuleDtos;
	}
	public Double getCoefficientExamGroup() {
		return coefficientExamGroup;
	}
	public void setCoefficientExamGroup(Double coefficientExamGroup) {
		this.coefficientExamGroup = coefficientExamGroup;
	}
	public List<ExamGroupDto> getLisExamGroupDtos() {
		return lisExamGroupDtos;
	}
	public void setLisExamGroupDtos(List<ExamGroupDto> lisExamGroupDtos) {
		this.lisExamGroupDtos = lisExamGroupDtos;
	}
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public List<PopuplistDto> getListAcademicYear() {
		return listAcademicYear;
	}
	public void setListAcademicYear(List<PopuplistDto> listAcademicYear) {
		this.listAcademicYear = listAcademicYear;
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
	public List<StudentExamGroupDto> getLisStudentExamGroup() {
		return lisStudentExamGroup;
	}
	public void setLisStudentExamGroup(List<StudentExamGroupDto> lisStudentExamGroup) {
		this.lisStudentExamGroup = lisStudentExamGroup;
	}
	
	public void setAverageExamGroup(Double averageExamGroup) {
		this.averageExamGroup = averageExamGroup;
	}
	public Double getSommeExamGroup() {
		return sommeExamGroup;
	}
	public void setSommeExamGroup(Double sommeExamGroup) {
		this.sommeExamGroup = sommeExamGroup;
	}
	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	public List<ModuleAcademiExamDto> getListStudentExamModuleGroup() {
		return listStudentExamModuleGroup;
	}
	public void setListStudentExamModuleGroup(
			List<ModuleAcademiExamDto> listStudentExamModuleGroup) {
		this.listStudentExamModuleGroup = listStudentExamModuleGroup;
	}
	public ModuleAcademiExamDto getModuleAcademiExamDto() {
		return moduleAcademiExamDto;
	}
	public void setModuleAcademiExamDto(ModuleAcademiExamDto moduleAcademiExamDto) {
		this.moduleAcademiExamDto = moduleAcademiExamDto;
	}
	public ModuleAcademiExamDto getModuleAcademiExamDtos() {
		return moduleAcademiExamDtos;
	}
	public void setModuleAcademiExamDtos(ModuleAcademiExamDto moduleAcademiExamDtos) {
		this.moduleAcademiExamDtos = moduleAcademiExamDtos;
	}
	public List<ModuleAcademiExamDto> getListModuleAcademiExam() {
		return listModuleAcademiExam;
	}
	public void setListModuleAcademiExam(
			List<ModuleAcademiExamDto> listModuleAcademiExam) {
		this.listModuleAcademiExam = listModuleAcademiExam;
	}
	public ExamModuleGroupDto getExamModuleGroupDto() {
		return examModuleGroupDto;
	}
	public void setExamModuleGroupDto(ExamModuleGroupDto examModuleGroupDto) {
		this.examModuleGroupDto = examModuleGroupDto;
	}
	public ExamModuleGroupDto getExamModuleGroupDtos() {
		return examModuleGroupDtos;
	}
	public void setExamModuleGroupDtos(ExamModuleGroupDto examModuleGroupDtos) {
		this.examModuleGroupDtos = examModuleGroupDtos;
	}
	public List<ExamModuleGroupDto> getListexamModuleGroup() {
		return listexamModuleGroup;
	}
	public void setListexamModuleGroup(List<ExamModuleGroupDto> listexamModuleGroup) {
		this.listexamModuleGroup = listexamModuleGroup;
	}
	public List<PopuplistDto> getListStatusExam() {
		return listStatusExam;
	}
	public void setListStatusExam(List<PopuplistDto> listStatusExam) {
		this.listStatusExam = listStatusExam;
	}
	
	public List<AcademicModuleDto> getListAcademicModule() {
		return listAcademicModule;
	}
	public void setListAcademicModule(List<AcademicModuleDto> listAcademicModule) {
		this.listAcademicModule = listAcademicModule;
	}
	public ClasseProgrammDto getClasseProgrammDto() {
		return classeProgrammDto;
	}
	public void setClasseProgrammDto(ClasseProgrammDto classeProgrammDto) {
		this.classeProgrammDto = classeProgrammDto;
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
	public ModuleCalendarDto getModuleCalendarDto() {
		return moduleCalendarDto;
	}
	public void setModuleCalendarDto(ModuleCalendarDto moduleCalendarDto) {
		this.moduleCalendarDto = moduleCalendarDto;
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
					
					ModuleCalendarDto moduleCale = new ModuleCalendarDto();
					moduleCale.setProgrammeCalendar(pcalendar);
					
					listModuleCalendarDto = moduleCalendarDtoServicewsEndpoint
							.searchModuleCalendarServicews(moduleCale);
					

					listModuleCalendarDtos.addAll(listModuleCalendarDto);

				}

			

			for (StudentClasseDto stv : listStudentClass) {

				ModuleAcademiExamDto createstdexam = new ModuleAcademiExamDto();

				createstdexam.setComments(null);
				createstdexam.setExamModuleGroup(null);
				createstdexam.setMark(null);
				createstdexam.setRattrapageMark(null);
				createstdexam.setStatusModuleAcademiExam(null);
				createstdexam.setStudent(stv.getStudent());

				listStudentExamModuleGroup.add(createstdexam);

			  }
			}
			
			logger.debug("@@@@@@ JE SUIS A LA FIN LOOOO @@@@@@@@@@@@@@");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void lisStudentExam() {
		logger.debug("+++++++");
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();
		studentExamGroupServicewsEndpoint = studentExamGroupServicews.getStudentExamGroupServicewsImplPort();
		
		lisExamGroupDtos = examGroupServicewsEndpoint.searchExamGroupServicews(examGroupDto);
		

		logger.debug("+++++++" + lisExamGroupDtos.size());
	}
	
	public Double getAverageExamGroup(ModuleAcademiExamDto moduleAcademiExamDto) {
		if (coefficientExamGroup > 0) {

			moduleAcademiExamDto.setMark(sommeExamGroup / coefficientExamGroup);
			return sommeExamGroup / coefficientExamGroup;

		} else {
			moduleAcademiExamDto.setMark(0.0);
			return null;
		}
	}
	
	public Double getNote(ExamGroupDto examgrpeDto, StudentDto studentDto) {
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
		
		StudentExamGroupDto studentExamGroupDt = new StudentExamGroupDto();
		studentExamGroupDt.setStudent(studentDto);
		studentExamGroupDt.setExamGroup(examgrpeDto);
		studentExamGroupServicewsEndpoint = studentExamGroupServicews.getStudentExamGroupServicewsImplPort();
		lisStudentExamGroup = studentExamGroupServicewsEndpoint.searchStudentExamGroupServicews(studentExamGroupDt);
			
		if (lisStudentExamGroup.size() == 1) {
			if (sommeExamGroup == 0.0) {
				sommeExamGroup = (double) lisStudentExamGroup.get(0).getMark()
						* examgrpeDto.getCoefficient();
				coefficientExamGroup = (double) examgrpeDto.getCoefficient();
			} else {
				sommeExamGroup = sommeExamGroup
						+ ((double) lisStudentExamGroup.get(0).getMark() * examgrpeDto
								.getCoefficient());
				coefficientExamGroup = coefficientExamGroup
						+ examgrpeDto.getCoefficient();

			}
			return (double)lisStudentExamGroup.get(0).getMark();
		} else {
			return null;
		}

	}
	
	public void saveAcademicNoteGroupExam() {

		for (ModuleAcademiExamDto str : listStudentExamModuleGroup) {

			ModuleAcademiExamDto createstudentexam = new ModuleAcademiExamDto();

			logger.debug("++++++++++++++     " + examGroupDto.getIdExamGroup());

			createstudentexam.setComments(str.getComments());
			createstudentexam.setExamModuleGroup(examGroupDto.getExamModuleGroup());
			createstudentexam.setMark(str.getMark());
			logger.debug("+++++++++++++222+     " + str.getMark());
			createstudentexam.setStatusModuleAcademiExam(str.getStatusModuleAcademiExam());
			createstudentexam.setStudent(str.getStudent());
			createstudentexam.setRattrapageMark(str.getRattrapageMark());

			moduleAcademiExamServicewsEndpoint = moduleAcademiExamServicews
					.getModuleAcademiExamServicewsImplPort();
			createstudentexam = moduleAcademiExamServicewsEndpoint.createModuleAcademiExamServicews(createstudentexam);
			

		}

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
	

	public ModuleCalendarDto getModuleCalendar() {
		logger.debug("ME ME ‡‡‡@@@@@");
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();

		examGroupDto.setAcademicModule(moduleCalendarDto.getAcademicModule());
//		listeexamgroupes = examGroupServicewsEndpoint
//				.searchExamGroupServicews(examGroupDto);

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

			examModuleGroupServicewsEndpoint = examModuleGroupServicews
					.getExamModuleGroupServicewsImplPort();

			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listStatusExam = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("statusexam");

			listexamModuleGroup = examModuleGroupServicewsEndpoint
					.searchExamModuleGroupServicews(examModuleGroupDtos);

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

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
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
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
import org.sepro.studentweb.serviceapi.StudentExamDto;
import org.sepro.studentweb.serviceapi.StudentExamGroupDto;
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
import org.sepro.studentweb.serviceimpl.StudentExamGroupServicews;
import org.sepro.studentweb.serviceimpl.StudentExamGroupServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentExamServicews;
import org.sepro.studentweb.serviceimpl.StudentExamServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ExamGroupeSearchServiceBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ExamGroupeSearchServiceBean.class);

	private Double averageExamGroup = 0.0;
	private Double sommeExamGroup = 0.0;
	private Double coefficientExamGroup = 0.0;
	private Long idStudent = 0L;
	private ArrayList<AcademicModuleDto> selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();

	private StudentClasseServicewsEndpoint studentClasseServicewsEndpoint;
	private StudentClasseServicews studentClasseServicews = new StudentClasseServicews();

	private StudentExamGroupServicewsEndpoint studentExamGroupServicewsEndpoint;
	private StudentExamGroupServicews studentExamGroupServicews = new StudentExamGroupServicews();

	private ExamServicewsEndpoint examServicewsEndpoint;
	private ExamServicews examServicews = new ExamServicews();
	
	private StudentExamServicewsEndpoint studentExamServicewsEndpoint;
	private StudentExamServicews studentExamServicews = new StudentExamServicews();

	private ExamGroupServicewsEndpoint examGroupServicewsEndpoint;
	private ExamGroupServicews examGroupServicews = new ExamGroupServicews();

	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();

	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;
	
	private ExamModuleGroupServicewsEndpoint examModuleGroupServicewsEndpoint;
	private ExamModuleGroupServicews examModuleGroupServicews = new ExamModuleGroupServicews();

	private List<AcademicModuleDto> listAcademicModule = new ArrayList<AcademicModuleDto>();
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private ClasseServicews classeServicews = new ClasseServicews();

	private ClasseProgrammServicewsEndpoint classeProgrammServicewsEndpoint;
	private ClasseProgrammServicews classeProgrammServicews = new ClasseProgrammServicews();
	
	private ExamModuleGroupDto examModuleGroupDtos = new ExamModuleGroupDto();
	private List<ExamModuleGroupDto> listexamModuleGroup = new ArrayList<ExamModuleGroupDto>();

	private List<StudentExamGroupDto> listStudentExamGroup = new ArrayList<StudentExamGroupDto>();
	private List<StudentExamGroupDto> listStudentExamGroups = new ArrayList<StudentExamGroupDto>();

	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();

	private ExamGroupDto examGroupDto = new ExamGroupDto();
	private ExamGroupDto examGroupDtos = new ExamGroupDto();
	private ExamGroupDto examGroupDtos2 = new ExamGroupDto();
	
	private List<ExamGroupDto> listeexamgroupe = new ArrayList<ExamGroupDto>();
	private List<ExamGroupDto> listeexamgroupes = new ArrayList<ExamGroupDto>();
	
	private ExamDto examDto = new ExamDto();
	private List<ExamDto> listExam = new ArrayList<ExamDto>();

	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendarDtos = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarDto = new ArrayList<ModuleCalendarDto>();
	
	private StudentClasseDto studentClasseDto = new StudentClasseDto();
	private ClasseDto classeDto = new ClasseDto();
	private List<ClasseDto> listDesClass = new ArrayList<ClasseDto>();
	
	private ClasseProgrammDto classeProgrammDto = new ClasseProgrammDto();
	private ClasseProgrammDto classeProgrammDtos = new ClasseProgrammDto();
	private List<ClasseProgrammDto> listClass = new ArrayList<ClasseProgrammDto>();
	
	private List<StudentClasseDto> listStudentClass = new ArrayList<StudentClasseDto>();

	private StudentExamDto studentExamDto = new StudentExamDto();
	private List<StudentExamDto> liststudentExam = new ArrayList<StudentExamDto>();

	private List<PopuplistDto> listAcademicYear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listStatusExam = new ArrayList<PopuplistDto>();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;

	boolean value2;
	private String text1;
	private String text2;
	
	
	
	public ExamGroupDto getExamGroupDtos2() {
		return examGroupDtos2;
	}
	public void setExamGroupDtos2(ExamGroupDto examGroupDtos2) {
		this.examGroupDtos2 = examGroupDtos2;
	}
	public List<ExamGroupDto> getListeexamgroupes() {
		return listeexamgroupes;
	}
	public void setListeexamgroupes(List<ExamGroupDto> listeexamgroupes) {
		this.listeexamgroupes = listeexamgroupes;
	}
	public List<ModuleCalendarDto> getListModuleCalendarDto() {
		return listModuleCalendarDto;
	}
	public void setListModuleCalendarDto(
			List<ModuleCalendarDto> listModuleCalendarDto) {
		this.listModuleCalendarDto = listModuleCalendarDto;
	}
	public Double getAverageExamGroup() {
		return averageExamGroup;
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
	public Double getCoefficientExamGroup() {
		return coefficientExamGroup;
	}
	public void setCoefficientExamGroup(Double coefficientExamGroup) {
		this.coefficientExamGroup = coefficientExamGroup;
	}
	public ArrayList<AcademicModuleDto> getSelectedlistAcademicModule() {
		return selectedlistAcademicModule;
	}
	public void setSelectedlistAcademicModule(
			ArrayList<AcademicModuleDto> selectedlistAcademicModule) {
		this.selectedlistAcademicModule = selectedlistAcademicModule;
	}
	public List<AcademicModuleDto> getListAcademicModule() {
		return listAcademicModule;
	}
	public void setListAcademicModule(List<AcademicModuleDto> listAcademicModule) {
		this.listAcademicModule = listAcademicModule;
	}
	public List<ExamModuleGroupDto> getListexamModuleGroup() {
		return listexamModuleGroup;
	}
	public void setListexamModuleGroup(List<ExamModuleGroupDto> listexamModuleGroup) {
		this.listexamModuleGroup = listexamModuleGroup;
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
	public List<ExamGroupDto> getListeexamgroupe() {
		return listeexamgroupe;
	}
	public void setListeexamgroupe(List<ExamGroupDto> listeexamgroupe) {
		this.listeexamgroupe = listeexamgroupe;
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
	public ModuleCalendarDto getModuleCalendarDto() {
		return moduleCalendarDto;
	}
	public void setModuleCalendarDto(ModuleCalendarDto moduleCalendarDto) {
		this.moduleCalendarDto = moduleCalendarDto;
	}
	public List<ModuleCalendarDto> getListModuleCalendarDtos() {
		return listModuleCalendarDtos;
	}
	public void setListModuleCalendarDtos(
			List<ModuleCalendarDto> listModuleCalendarDtos) {
		this.listModuleCalendarDtos = listModuleCalendarDtos;
	}
	public StudentClasseDto getStudentClasseDto() {
		return studentClasseDto;
	}
	public void setStudentClasseDto(StudentClasseDto studentClasseDto) {
		this.studentClasseDto = studentClasseDto;
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
	public List<StudentClasseDto> getListStudentClass() {
		return listStudentClass;
	}
	public void setListStudentClass(List<StudentClasseDto> listStudentClass) {
		this.listStudentClass = listStudentClass;
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
	public List<PopuplistDto> getListAcademicYear() {
		return listAcademicYear;
	}
	public void setListAcademicYear(List<PopuplistDto> listAcademicYear) {
		this.listAcademicYear = listAcademicYear;
	}
	public List<PopuplistDto> getListStatusExam() {
		return listStatusExam;
	}
	public void setListStatusExam(List<PopuplistDto> listStatusExam) {
		this.listStatusExam = listStatusExam;
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
	public boolean isAction3() {
		return action3;
	}
	public void setAction3(boolean action3) {
		this.action3 = action3;
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
	
	
	public void onSelectYears() {
		logger.debug("ICI ET ICI ");
		
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();
		logger.debug("ICI ET IC111I "+examGroupDtos2.getAcademicYear().getIdPopuplist());
		
		classeProgrammDto.setAcademicYear(examGroupDtos2.getAcademicYear());
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);

		
		logger.debug("ICI ET ICI  222 ");
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

			selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();

			studentClasseDto
					.setClasseProgramm(examGroupDtos2.getClasseProgramm());

			listStudentClass = studentClasseServicewsEndpoint
					.searchStudentClasseServicews(studentClasseDto);
			listAcademicModule = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();

			if (examGroupDtos2.getClasseProgramm() != null) {

				logger.debug("@@@@ TEST NOM PROGRAMME CALENDRIER @@@@@@"
						+ examGroupDtos2.getClasseProgramm().getClasseName());

				for (ProgrammeCalendarDto pcalendar : examGroupDtos2
						.getClasseProgramm().getProgrammeCalendar()
						.getProgrammeCalendar()) {
					
					ModuleCalendarDto moduleCalenda = new ModuleCalendarDto();
					
					moduleCalenda.setProgrammeCalendar(pcalendar);

					listModuleCalendarDto = moduleCalendarDtoServicewsEndpoint
							.searchModuleCalendarServicews(moduleCalenda);

					listModuleCalendarDtos.addAll(listModuleCalendarDto);

				}

			}

			for (StudentClasseDto stv : listStudentClass) {

				StudentExamGroupDto createstdexam = new StudentExamGroupDto();

				createstdexam.setComments(null);
				createstdexam.setExamGroup(null);
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
	
	
	
	public String initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");

		if (baction.equals("1")) {
			
			examGroupDtos2 = examGroupDtos;
			action2 = true;
			action3 = false;
			listClass = new ArrayList<ClasseProgrammDto>(); 
			listAcademicYear = new ArrayList<PopuplistDto>();
			listClass = new ArrayList<ClasseProgrammDto>();
			

			initUpdate();
			return null;
		} else {
			examGroupDtos2 = new ExamGroupDto();
			action2 = true;
			action3 = false;
			
			listAcademicYear = new ArrayList<PopuplistDto>();
			listeexamgroupes = new ArrayList<ExamGroupDto>();
			listClass = new ArrayList<ClasseProgrammDto>(); 
			
			
			initCreate();
			return null;
		}

	}

	public void initUpdate() {
		action = false;
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		examGroupServicewsEndpoint = examGroupServicews.getExamGroupServicewsImplPort();
		
		examModuleGroupServicewsEndpoint = examModuleGroupServicews.getExamModuleGroupServicewsImplPort();
		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		
//		moduleCalendarDto.setAcademicModule(examGroupDtos2.getAcademicModule());
//		listModuleCalendarDtos = moduleCalendarDtoServicewsEndpoint.searchModuleCalendarServicews(moduleCalendarDto);
		
		listAcademicYear = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("academic_years");
		
//		listClass = classeProgrammServicewsEndpoint
//				.searchClasseProgrammServicews(examGroupDtos2.getClasseProgramm());


	}

	public void initCreate() {
		action = true;
		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();
		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();
		examModuleGroupServicewsEndpoint = examModuleGroupServicews.getExamModuleGroupServicewsImplPort();
		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();

		listAcademicYear = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("academic_years");
		
		examGroupDtos2.setAcademicModule(moduleCalendarDto.getAcademicModule());
		
//		listeexamgroupes = examGroupServicewsEndpoint
//				.searchExamGroupServicews(examGroupDtos2);
		
		classeProgrammDto.setAcademicYear(examGroupDtos2.getAcademicYear());
		
		listClass = classeProgrammServicewsEndpoint
				.searchClasseProgrammServicews(classeProgrammDto);
		
		listModuleCalendarDtos = moduleCalendarDtoServicewsEndpoint.searchModuleCalendarServicews(moduleCalendarDto);
//		listexamModuleGroup = examModuleGroupServicewsEndpoint.searchExamModuleGroupServicews(examModuleGroupDtos);

	}


	public Boolean addMessage() {

		String summary = value2 ? rb.getString("label_msg_checked") : rb
				.getString("label_msg_unchecked");
		logger.debug("@@@@ VOIR @@@@ " + value2);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(summary));

		return value2;
	}

	public void addGroupExam() {

		FacesMessage msg = null;

		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();
		examModuleGroupServicewsEndpoint = examModuleGroupServicews.getExamModuleGroupServicewsImplPort();
		
		ExamGroupDto addexamgroup = new ExamGroupDto();

		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();
		moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
				.getModuleCalendarDtoServicewsImplPort();
		programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
				.getProgrammeCalendarDtoServicewsImplPort();
		
		addexamgroup.setAcademicModule(moduleCalendarDto.getAcademicModule());
		addexamgroup.setAcademicYear(examGroupDtos2.getAcademicYear());
		addexamgroup.setClasseProgramm(examGroupDtos2.getClasseProgramm());
		addexamgroup.setExamGroup(examGroupDto.getExamGroup());
		addexamgroup.setTitle(examGroupDtos2.getTitle());
		addexamgroup.setCoefficient(examGroupDtos2.getCoefficient());
		addexamgroup.setExamModuleGroup(examGroupDtos2.getExamModuleGroup());
		addexamgroup.setAverageMark(null);
		addexamgroup.setMaxMark(null);
		addexamgroup.setMinimumMark(null);

		addexamgroup = examGroupServicewsEndpoint
				.createExamGroupServicews(addexamgroup);

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_sucess_create_groupexam"));
		FacesContext context3 = FacesContext.getCurrentInstance();

		context3.addMessage(null, msg);

	}
	
	public String updateExamGroup() {
		
		ExamGroupDto updateexamgroup = new ExamGroupDto();
		
		FacesMessage msg = null;
		try {
			updateexamgroup.setCoefficient(examGroupDtos2.getCoefficient());
			updateexamgroup.setExamGroup(examGroupDtos2.getExamGroup());
			updateexamgroup.setTitle(examGroupDtos2.getTitle());
			updateexamgroup.setExamModuleGroup(examGroupDtos2.getExamModuleGroup());
			updateexamgroup.setAcademicModule(examGroupDtos2.getAcademicModule());
			updateexamgroup.setClasseProgramm(examGroupDtos2.getClasseProgramm());
			
			examGroupServicewsEndpoint = examGroupServicews.getExamGroupServicewsImplPort();
			updateexamgroup.setIdExamGroup(examGroupDtos2.getIdExamGroup());
			
			updateexamgroup = examGroupServicewsEndpoint.updateExamGroupServicews(updateexamgroup);
		
			init();
			
		} catch (Exception ex) {
			
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;

	}

	public ModuleCalendarDto getModuleCalendar() {
		logger.debug("ME ME ‡‡‡@@@@@");
		examGroupServicewsEndpoint = examGroupServicews
				.getExamGroupServicewsImplPort();

		examGroupDtos2.setAcademicModule(moduleCalendarDto.getAcademicModule());
		listeexamgroupes = examGroupServicewsEndpoint
				.searchExamGroupServicews(examGroupDtos2);

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

			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listStatusExam = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("statusexam");
			
			
			
			listDesClass = classeServicewsEndpoint.getAllClasseServicews();

	

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

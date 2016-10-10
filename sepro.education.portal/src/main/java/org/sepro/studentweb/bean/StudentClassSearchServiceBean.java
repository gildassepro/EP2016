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
import org.sepro.authentificationweb.serviceapi.MenuDto;
import org.sepro.authentificationweb.serviceapi.ModuleDto.Menus;
<<<<<<< HEAD
import org.sepro.filter.FilteredCursusDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
import org.sepro.inscriptionweb.serviceimpl.InscriptionAuthServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionAuthServicewsEndpoint;
=======
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
>>>>>>> origin/master
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptreeServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptreeServicewsEndpoint;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
<<<<<<< HEAD
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
=======
>>>>>>> origin/master
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
<<<<<<< HEAD
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicewsEndpoint;
=======
>>>>>>> origin/master
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicewsEndpoint;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto;
import org.sepro.studentweb.serviceapi.ClasseProgrammDto.ProgrammeCalendar;
import org.sepro.studentweb.serviceapi.StudentCVDto;
import org.sepro.studentweb.serviceapi.StudentClasseDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceapi.StudentProgramDto;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicews;
import org.sepro.studentweb.serviceimpl.ClasseProgrammServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentClasseServicews;
import org.sepro.studentweb.serviceimpl.StudentClasseServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentContactServicews;
import org.sepro.studentweb.serviceimpl.StudentContactServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentDataDtoServicews;
import org.sepro.studentweb.serviceimpl.StudentDataDtoServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentProgramServicews;
import org.sepro.studentweb.serviceimpl.StudentProgramServicewsEndpoint;
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
	
<<<<<<< HEAD
	private IdentityTeacherServicewsEndpoint identityTeacherServicewsEndpoint;
	private IdentityTeacherServicews identityTeacherServicews = new IdentityTeacherServicews();
	
=======
>>>>>>> origin/master
	private StudentProgramServicewsEndpoint studentProgramServicewsEndpoint;
	private StudentProgramServicews studentProgramServicews = new StudentProgramServicews();
	
	private StudentProgramDto studentProgramDto = new StudentProgramDto();
	private StudentProgramDto studentProgramDtos = new StudentProgramDto();
	private List<StudentProgramDto> listStudentClasse = new ArrayList<StudentProgramDto>();
	private List<StudentProgramDto> listStudentClasses = new ArrayList<StudentProgramDto>();
	private List<StudentProgramDto> selectedlistStudentClasse = new ArrayList<StudentProgramDto>();

	private StudentServicewsEndpoint studentServicewsEndpoint;
	private StudentServicews studentServicews = new StudentServicews();
	private List<StudentDto> listeStudentInscritp = new ArrayList<StudentDto>();
	private List<StudentDto> selectedlistEtudiantClass = new ArrayList<StudentDto>();
	private StudentDto studentDto = new StudentDto();
	private StudentDto studentDtos = new StudentDto();

	private StudentDataDtoServicewsEndpoint studentDataDtoServicewsEndpoint;
	private StudentDataDtoServicews studentDataDtoServicews = new StudentDataDtoServicews();
	
<<<<<<< HEAD
	private InscriptionAuthServicewsEndpoint inscriptionAuthServicewsEndpoint;
	private InscriptionAuthServicews inscriptionAuthServicews = new InscriptionAuthServicews();
	
	private List<IdentityTeacherDto> listeTeacherEvent = new ArrayList<IdentityTeacherDto>();
	
	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();
	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendarDto = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarDtos = new ArrayList<ModuleCalendarDto>();
	
=======
>>>>>>> origin/master
	private InscriptionSteptreeServicewsEndpoint inscriptionSteptreeServicewsEndpoint;
	private InscriptionSteptreeServicews inscriptionSteptreeServicews = new InscriptionSteptreeServicews();
	
	private InscriptionSteptreeDto inscriptionSteptreeDto = new InscriptionSteptreeDto();
	
	private List<InscriptionSteptreeDto> ListeEtu = new ArrayList<InscriptionSteptreeDto>();
<<<<<<< HEAD
	private List<InscriptionSteptreeDto> listeProspectStep3 = new ArrayList<InscriptionSteptreeDto>();
=======
>>>>>>> origin/master

	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	private List<ProgrammeCalendarDto> listProgrammeCalendar = new ArrayList<ProgrammeCalendarDto>();
	private List<ProgrammeCalendarDto> listProgrammeCalendarDestination = new ArrayList<ProgrammeCalendarDto>();
	private List<ProgrammeCalendarDto> listProgrammeCalendarSources = new ArrayList<ProgrammeCalendarDto>();

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

	
	
	
	
<<<<<<< HEAD
	public List<InscriptionSteptreeDto> getListeProspectStep3() {
		return listeProspectStep3;
	}

	public void setListeProspectStep3(
			List<InscriptionSteptreeDto> listeProspectStep3) {
		this.listeProspectStep3 = listeProspectStep3;
	}

	public List<IdentityTeacherDto> getListeTeacherEvent() {
		return listeTeacherEvent;
	}

	public void setListeTeacherEvent(List<IdentityTeacherDto> listeTeacherEvent) {
		this.listeTeacherEvent = listeTeacherEvent;
	}

	public List<ModuleCalendarDto> getListModuleCalendarDtos() {
		return listModuleCalendarDtos;
	}

	public void setListModuleCalendarDtos(
			List<ModuleCalendarDto> listModuleCalendarDtos) {
		this.listModuleCalendarDtos = listModuleCalendarDtos;
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

=======
>>>>>>> origin/master
	public InscriptionSteptreeDto getInscriptionSteptreeDto() {
		return inscriptionSteptreeDto;
	}

	public void setInscriptionSteptreeDto(
			InscriptionSteptreeDto inscriptionSteptreeDto) {
		this.inscriptionSteptreeDto = inscriptionSteptreeDto;
	}

	public List<InscriptionSteptreeDto> getListeEtu() {
		return ListeEtu;
	}

	public void setListeEtu(List<InscriptionSteptreeDto> listeEtu) {
		ListeEtu = listeEtu;
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

	public List<StudentProgramDto> getListStudentClasses() {
		return listStudentClasses;
	}

	public void setListStudentClasses(List<StudentProgramDto> listStudentClasses) {
		this.listStudentClasses = listStudentClasses;
	}

	public List<StudentProgramDto> getSelectedlistStudentClasse() {
		return selectedlistStudentClasse;
	}

	public void setSelectedlistStudentClasse(
			List<StudentProgramDto> selectedlistStudentClasse) {
		this.selectedlistStudentClasse = selectedlistStudentClasse;
	}

	public StudentProgramDto getStudentProgramDto() {
		return studentProgramDto;
	}

	public void setStudentProgramDto(StudentProgramDto studentProgramDto) {
		this.studentProgramDto = studentProgramDto;
	}

	public StudentProgramDto getStudentProgramDtos() {
		return studentProgramDtos;
	}

	public void setStudentProgramDtos(StudentProgramDto studentProgramDtos) {
		this.studentProgramDtos = studentProgramDtos;
	}

	public List<StudentProgramDto> getListStudentClasse() {
		return listStudentClasse;
	}

	public void setListStudentClasse(List<StudentProgramDto> listStudentClasse) {
		this.listStudentClasse = listStudentClasse;
	}

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
		listProgrammeCalendarDestination =  new ArrayList<ProgrammeCalendarDto>();
		listProgrammeCalendarSources =  new ArrayList<ProgrammeCalendarDto>();
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
<<<<<<< HEAD
			listStudentClasse = new ArrayList<StudentProgramDto>();
			listeTeacherEvent = new ArrayList<IdentityTeacherDto>();
=======
			
>>>>>>> origin/master
			

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
<<<<<<< HEAD
			listStudentClasse = new ArrayList<StudentProgramDto>();
			listeTeacherEvent = new ArrayList<IdentityTeacherDto>();
=======
>>>>>>> origin/master

			initCreateStudentClasse();

		}

	}

	public void initUpdateStudentClass() {
		logger.debug("@@@BEGIN INIT UPDATE @@@@");
		try {

			action = false;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();
<<<<<<< HEAD
			identityTeacherServicewsEndpoint = identityTeacherServicews.getIdentityTeacherServicewsImplPort();
			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews.getProgrammeCalendarDtoServicewsImplPort();
			listProgrammeCalendarSources = programmeCalendarDtoServicewsEndpoint.getAllProgrammeCalendarServicews();
			inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews.getModuleCalendarDtoServicewsImplPort();
			
			logger.debug("@@@@ ID POPULIST @@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
			logger.debug("@@@@ ID POPULIST @@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
			StudentDto studentDtop = new StudentDto();
=======
			
			logger.debug("7777777777777777777777777"+classeProgrammDto.getAcademicSector().getIdPopuplist());
			logger.debug("7777777777777777777777777"+classeProgrammDto.getAcademicSector().getIdPopuplist());
>>>>>>> origin/master

			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listFiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listeStudentInscritp = studentServicewsEndpoint
					.searchStudentServicews(studentDto);
<<<<<<< HEAD
			listeTeacherEvent = identityTeacherServicewsEndpoint.getAllIdentityTeacherServicews();
			
//			studentDtos.setIdStudent(studentClasseDto.getStudent().getIdStudent());
//			selectedlistEtudiantClass = studentServicewsEndpoint.searchStudentServicews(studentDtos);
			
				if (classeProgrammDto != null) {
					logger.debug("@@@@@ ENTRE ICI @@@@@@@@@");
					for (ProgrammeCalendarDto pcalendar : classeProgrammDto.getProgrammeCalendar().getProgrammeCalendar()) {
						logger.debug("@@@@@ ENTRE ICI 11111 @@@@@@@@@");
						for (ProgrammeCalendarDto pcalendars : listProgrammeCalendarSources) {
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
				filteredCursus();
			
			if(classeProgrammDto.getAcademicSector().getIdPopuplist() != 0){
				
				logger.debug("@@@@@@@ ID POPULISTE@@@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
				logger.debug("@@@@@@@ ID POPULISTE@@@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
				
				InscriptionSteptreeDto inscr3 = new InscriptionSteptreeDto();
//				studentDto.setInscriptionAuthentification(value)
				listeStudentInscritp = studentServicewsEndpoint.searchStudentServicews(studentDto);
				logger.debug("@@@@ VERIFICATION LISTE @@@@@"+listeStudentInscritp.size());
				for(int k = 0; k< listeStudentInscritp.size(); k ++){
					logger.debug("@@@@@@@ VUE NOM 1111 @@@@"+listeStudentInscritp.get(k).getName());
					logger.debug("@@@@@@@ VUE PRENOM 111111 @@@@"+listeStudentInscritp.get(k).getFirstName());
					logger.debug("@@@@@@@ VUE PRENOM 11111 @@@@"+listeStudentInscritp.get(k).getInscriptionAuthentification().getIdInscription());
				}
//				inscr3.setAcademicSector(classeProgrammDto.getAcademicSector());
				
				ListeEtu = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
				logger.debug("@@@@ VERIFICATION LISTE STEP3 TAILLE @@@@@"+ListeEtu.size());
				
				for(int k = 0; k< ListeEtu.size(); k ++){
					logger.debug("@@@@@@@ VUE NOM 333333 @@@@"+ListeEtu.get(k).getAcademicSector().getValue());
					logger.debug("@@@@@@@ VUE PRENOM 333333 @@@@"+ListeEtu.get(k).getInscriptionAuthentification().getIdInscription());
				}
				
				logger.debug("@@@@ VERIFICATION LISTE STEP3 @@@@@"+ListeEtu.size());
				
				FilteredCursusDto flts = new FilteredCursusDto();
				List<FilteredCursusDto> tlist = new ArrayList<FilteredCursusDto>();
				
				flts.getData(classeProgrammDto.getAcademicSector().getIdPopuplist(), listeStudentInscritp, ListeEtu);
				tlist = flts.getData(classeProgrammDto.getAcademicSector().getIdPopuplist(), listeStudentInscritp, ListeEtu);
				//tlist.add(flts);
			
				logger.debug("@@@@@@ VERIFIONS LA LISTE RETOURNEE"+tlist.size());
				
				for(int i = 0;  i < tlist.size(); i ++){
					logger.debug("@@@@@@@ VUE NOM @@@@"+tlist.get(i).getNom());
					logger.debug("@@@@@@@ VUE PRENOM @@@@"+tlist.get(i).getPrenom());
					logger.debug("@@@@@@@ VUE FILIERE @@@@"+tlist.get(i).getListfilliere());
				}
				
				
			}
			
=======
			studentDtos.setIdStudent(studentClasseDto.getStudent().getIdStudent());
			selectedlistEtudiantClass = studentServicewsEndpoint.searchStudentServicews(studentDtos);
			
			if (classeProgrammDto != null) {
				programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews.getProgrammeCalendarDtoServicewsImplPort();
				listProgrammeCalendarSources = programmeCalendarDtoServicewsEndpoint.getAllProgrammeCalendarServicews();
				
				if (classeProgrammDto != null) {
					for (ProgrammeCalendarDto pcalendar : classeProgrammDto.getProgrammeCalendar().getProgrammeCalendar()) {
						for (ProgrammeCalendarDto pcalendars : listProgrammeCalendarSources) {
							if (pcalendars.getIdProgrammeCalendar() == pcalendar.getIdProgrammeCalendar()) {
								listProgrammeCalendarDestination.add(pcalendars);
								break;
							}
						}
					}
				}
			}
>>>>>>> origin/master

		} catch (Exception ex) {

		}
		logger.debug("@@@FIN INIT UPDATE @@@@");
	}

<<<<<<< HEAD
	public void filteredCursus(){
		studentServicewsEndpoint = studentServicews.getStudentServicewsImplPort();
		inscriptionAuthServicewsEndpoint = inscriptionAuthServicews.getInscriptionAuthServicewsImplPort();
		inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
		popuplistDtoServicewsEndpoint = popuplistDtoServicews.getPopuplistDtoServicewsImplPort();
		listeProspectStep3 = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
		listeStudentInscritp = studentServicewsEndpoint.searchStudentServicews(studentDto);
		
		
		logger.debug("@@@@ TAILLE DE LA LISTE DES FIULTREDCURUS 1111 @@@@@@@"+listeProspectStep3.size());
		logger.debug("@@@@ TAILLE DE LA LISTE DES FIULTREDCURUS 22222 @@@@@@@"+listeStudentInscritp.size());
		
		if(classeProgrammDto.getAcademicSector() != null){
			logger.debug("@@@@ FLAG 1 IN FILTRED CURSUS @@@@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
			 for(InscriptionSteptreeDto ips : listeProspectStep3){
				 if(ips.getAcademicSector().getIdPopuplist() == classeProgrammDto.getAcademicSector().getIdPopuplist()){
					 ListeEtu.add(ips);
					
				 }
			 }
			 
		}
		
		for(StudentDto stu : listeStudentInscritp){
			 logger.debug("@@@@ FLAG 1 IN FILTRED CURSUS 77777 @@@@@@@"+ListeEtu.size());
			 for(InscriptionSteptreeDto inst : ListeEtu){
				 logger.debug("!!!!!!!!!!! I AM HERE !!!!!!!!! "+stu.getInscriptionAuthentification().getIdInscription());
				/// logger.debug("!!!!!!!!!!! I AM HERE !!!!!!!!! "+inst.getInscriptionAuthentification().getIdInscription());
				 if(stu != null){
					 logger.debug("JJJJJJJJJJJJJJJJJJJ");
					 if(stu.getInscriptionAuthentification().getIdInscription() == inst.getInscriptionAuthentification().getIdInscription()){
						 logger.debug("!!!!!!!!!!! I AM HERE 88888 !!!!!!!!! ");
						 selectedlistEtudiantClass.add(stu);
						 logger.debug("!!!!!!!!!!!!!!!!!!! LISTE FILTRAGE STUDENT 88888 !!!!!!!!!!!!!!!!"+selectedlistEtudiantClass.size());
						
					 }
				 }
				 
				
			 }
		 }
		
//		for(int i = 0; i < selectedlistEtudiantClass.size(); i ++){
//			logger.debug("!!!!!!!!!!!!!!!!!!! LISTE FILTRAGE STUDENT !!!!!!!!!!!!!!!!"+selectedlistEtudiantClass.get(i).getName());
//			logger.debug("!!!!!!!!!!!!!!!!!!! LISTE FILTRAGE STUDENT !!!!!!!!!!!!!!!!"+selectedlistEtudiantClass.get(i).getIdStudent());
//		}
		
		//listeStudentInscritp = studentServicewsEndpoint.searchStudentServicews(studentDto);
		
	}
	
=======
>>>>>>> origin/master
	public void initCreateStudentClasse() {

		try {
			logger.debug("@@@@BEGIN INITCREATE@@@@");
			action = true;

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();
<<<<<<< HEAD
			
			identityTeacherServicewsEndpoint = identityTeacherServicews.getIdentityTeacherServicewsImplPort();
			
=======

>>>>>>> origin/master
			listAcademicYear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listFiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
//			listProgrammeCalendar = programmeCalendarDtoServicewsEndpoint
//					.getAllProgrammeCalendarServicews();
			listeStudentInscritp = studentServicewsEndpoint
					.searchStudentServicews(studentDto);
<<<<<<< HEAD
			listeTeacherEvent = identityTeacherServicewsEndpoint.getAllIdentityTeacherServicews();
=======
>>>>>>> origin/master
			
			if (classeProgrammDto != null) {
				programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews.getProgrammeCalendarDtoServicewsImplPort();
				listProgrammeCalendarSources = programmeCalendarDtoServicewsEndpoint.getAllProgrammeCalendarServicews();
				
				if (classeProgrammDto != null) {
					for (ProgrammeCalendarDto pcalendar : classeProgrammDto.getProgrammeCalendar().getProgrammeCalendar()) {
						for (ProgrammeCalendarDto pcalendars : listProgrammeCalendarSources) {
							if (pcalendars.getIdProgrammeCalendar() == pcalendar.getIdProgrammeCalendar()) {
								listProgrammeCalendarDestination.add(pcalendars);
								break;
							}
						}
					}
				}
			}

		} catch (Exception ex) {

		}

	}

	public void createClass() {
		FacesMessage msg = null;
		ClasseProgrammDto createClass = new ClasseProgrammDto();
		ProgrammeCalendar proCalendarDto = new ProgrammeCalendar();
		proCalendarDto.getProgrammeCalendar().addAll(listProgrammeCalendarDestination);
		
		logger.debug("SIZE LISTE AFFICHER   "+proCalendarDto.getProgrammeCalendar().size());
		createClass.setAcademicSector(classeProgrammDto.getAcademicSector());
		createClass.setAcademicYear(classeProgrammDto.getAcademicYear());
		createClass.setClasseName(classeProgrammDto.getClasseName());
		createClass.setNombreEleve(classeProgrammDto.getNombreEleve());
<<<<<<< HEAD
		createClass.setTeacherResponsable(classeProgrammDto.getTeacherResponsable());
=======
>>>>>>> origin/master
		createClass.setProgrammeCalendar(proCalendarDto);
		

		classeProgrammServicewsEndpoint = classeProgrammServicews
				.getClasseProgrammServicewsImplPort();
		createClass = classeProgrammServicewsEndpoint
				.createClasseProgrammServicews(createClass);
		
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
			ProgrammeCalendar poCalendarDto = new ProgrammeCalendar();
			poCalendarDto.getProgrammeCalendar().removeAll(listProgrammeCalendarDestination);
			poCalendarDto.getProgrammeCalendar().addAll(listProgrammeCalendarDestination);
			updateClass.setProgrammeCalendar(poCalendarDto);
			updateClass
					.setAcademicSector(classeProgrammDto.getAcademicSector());
			updateClass.setAcademicYear(classeProgrammDto.getAcademicYear());
			updateClass.setClasseName(classeProgrammDto.getClasseName());
			updateClass.setNombreEleve(classeProgrammDto.getNombreEleve());
<<<<<<< HEAD
			updateClass.setTeacherResponsable(classeProgrammDto.getTeacherResponsable());
=======
>>>>>>> origin/master
			
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
	
	public String updateListStudentSector() {
		logger.debug("@@@@@@ DANS LE UPDATE LISTE STUDENT FILIERE @@@@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
		studentProgramServicewsEndpoint = studentProgramServicews.getStudentProgramServicewsImplPort();
		popuplistDtoServicewsEndpoint = popuplistDtoServicews.getPopuplistDtoServicewsImplPort();
		listeStudentInscritp = studentServicewsEndpoint.searchStudentServicews(studentDto);
		ListeEtu = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
		StudentDto studentDtop = new StudentDto();
		
		try {
				
			if(classeProgrammDto.getAcademicSector().getIdPopuplist() != null){
<<<<<<< HEAD
				logger.debug("@@@@@@ JE SUIS DANS LE UPDATE LISTE STUDENT SECTOR @@@@@@@");
				for (int i = 0 ; i < ListeEtu.size(); i ++){
					if(ListeEtu.get(i).getAcademicSector().getIdPopuplist() == classeProgrammDto.getAcademicSector().getIdPopuplist()){
						logger.debug("@@@@@@ JE SUIS DANS LE UPDATE LISTE STUDENT SECTOR 2222 @@@@@@@"+classeProgrammDto.getAcademicSector().getIdPopuplist());
						logger.debug("@@@@@@ JE SUIS DANS LE UPDATE LISTE STUDENT SECTOR 2222 @@@@@@@"+classeProgrammDto.getAcademicSector().getValue());
						
						for(int j = 0; j < listeStudentInscritp.size(); j ++){
							logger.debug("@@@@@@ JE SUIS DANS LE UPDATE LISTE STUDENT SECTOR 33333 @@@@@@@"+listeStudentInscritp.size());
							
=======
				for (int i = 0 ; i < ListeEtu.size(); i ++){
					if(ListeEtu.get(i).getAcademicSector().getIdPopuplist() == classeProgrammDto.getAcademicSector().getIdPopuplist()){
						for(int j = 0; j < listeStudentInscritp.size(); j ++){
>>>>>>> origin/master
							if (listeStudentInscritp.get(j).getInscriptionAuthentification().getIdInscription() == ListeEtu.get(i).getInscriptionAuthentification().getIdInscription() ){
								studentDtop.setName(listeStudentInscritp.get(j).getName());
								studentDtop.setFirstName(listeStudentInscritp.get(j).getFirstName());
								studentDtop.setInscriptionAuthentification(listeStudentInscritp.get(j).getInscriptionAuthentification());
								studentDtop.setBirthday(listeStudentInscritp.get(j).getBirthday());
								selectedlistEtudiantClass.add(studentDtop);
							}
						}
					}
				}
				
				
			}
		}catch(Exception ex){
			
		}
		
		logger.debug("@@@@@@ FIN DU UPDATE LISTE STUDENT FILIERE @@@@@@@");
		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");
<<<<<<< HEAD
			
=======

>>>>>>> origin/master
			classeProgrammServicewsEndpoint = classeProgrammServicews
					.getClasseProgrammServicewsImplPort();
			listClass = classeProgrammServicewsEndpoint.searchClasseProgrammServicews(classeProgrammDto);

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

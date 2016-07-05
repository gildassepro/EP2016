package org.sepro.parameterweb.bean;

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
import org.sepro.parameterweb.serviceapi.CourseSubjectDto;
import org.sepro.parameterweb.serviceapi.CourseSubjectDto.Academicmodules;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeDto.Academicmodule;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CourseSubjectDtoServicews;
import org.sepro.parameterweb.serviceimpl.CourseSubjectDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;

@ManagedBean
@ViewScoped
public class MatiereSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(MatiereSearchServiceBean.class);

	private CourseSubjectDtoServicews matiereServicews = new CourseSubjectDtoServicews();
	private CourseSubjectDtoServicewsEndpoint matiereServicewsEndpoint;
	private List<CourseSubjectDto> listmatiere = new ArrayList<CourseSubjectDto>();
	private CourseSubjectDto matiereDto = new CourseSubjectDto();
	private CourseSubjectDto matierDto = new CourseSubjectDto();

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listtypedeclasse = new ArrayList<PopuplistDto>();

	private AcademicModuleDtoServicews moduleacademiqueServicews = new AcademicModuleDtoServicews();
	private List<AcademicModuleDto> listDesModuleAcademicSource = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDtoServicewsEndpoint moduleacademiqueServicewsEndpoint;
	private List<AcademicModuleDto> listmoduleacademique = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> selectedAcademicmodule = new ArrayList<AcademicModuleDto>();

	private List<AcademicModuleDto> selectedacademiquemodule = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDto selectedacademiquemodules;

	private boolean action = false;

	public List<AcademicModuleDto> getSelectedAcademicmodule() {
		return selectedAcademicmodule;
	}

	public void setSelectedAcademicmodule(
			List<AcademicModuleDto> selectedAcademicmodule) {
		this.selectedAcademicmodule = selectedAcademicmodule;
	}

	public List<AcademicModuleDto> getListDesModuleAcademicSource() {
		return listDesModuleAcademicSource;
	}

	public void setListDesModuleAcademicSource(
			List<AcademicModuleDto> listDesModuleAcademicSource) {
		this.listDesModuleAcademicSource = listDesModuleAcademicSource;
	}

	public List<CourseSubjectDto> getListmatiere() {
		return listmatiere;
	}

	public void setListmatiere(List<CourseSubjectDto> listmatiere) {
		this.listmatiere = listmatiere;
	}

	public List<PopuplistDto> getListanneeacademique() {
		return listanneeacademique;
	}

	public void setListanneeacademique(List<PopuplistDto> listanneeacademique) {
		this.listanneeacademique = listanneeacademique;
	}

	public List<PopuplistDto> getListfiliere() {
		return listfiliere;
	}

	public void setListfiliere(List<PopuplistDto> listfiliere) {
		this.listfiliere = listfiliere;
	}

	public List<PopuplistDto> getListtypedeclasse() {
		return listtypedeclasse;
	}

	public void setListtypedeclasse(List<PopuplistDto> listtypedeclasse) {
		this.listtypedeclasse = listtypedeclasse;
	}

	public List<AcademicModuleDto> getListmoduleacademique() {
		return listmoduleacademique;
	}

	public void setListmoduleacademique(
			List<AcademicModuleDto> listmoduleacademique) {
		this.listmoduleacademique = listmoduleacademique;
	}

	public List<AcademicModuleDto> getSelectedacademiquemodule() {
		return selectedacademiquemodule;
	}

	public void setSelectedacademiquemodule(
			List<AcademicModuleDto> selectedacademiquemodule) {
		this.selectedacademiquemodule = selectedacademiquemodule;
	}

	public AcademicModuleDto getSelectedacademiquemodules() {
		return selectedacademiquemodules;
	}

	public void setSelectedacademiquemodules(
			AcademicModuleDto selectedacademiquemodules) {
		this.selectedacademiquemodules = selectedacademiquemodules;
	}

	public CourseSubjectDto getMatiereDto() {
		return matiereDto;
	}

	public void setMatiereDto(CourseSubjectDto matiereDto) {
		this.matiereDto = matiereDto;
	}

	public CourseSubjectDto getMatierDto() {
		return matierDto;
	}

	public void setMatierDto(CourseSubjectDto matierDto) {
		this.matierDto = matierDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public String initDualList(String baction) {
		if (baction.equals("1")) {
			matiereDto = matierDto;
			listDesModuleAcademicSource = new ArrayList<AcademicModuleDto>();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listtypedeclasse = new ArrayList<PopuplistDto>();

			initUpdate();
			return null;
		} else {
			matiereDto = new CourseSubjectDto();
			listanneeacademique = new ArrayList<PopuplistDto>();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listtypedeclasse = new ArrayList<PopuplistDto>();
			initCreate();
		}
		return null;
	}

	public void initUpdate() {

		action = false;
		try {
			logger.debug("BEGIN initUpdate");

			if (matiereDto != null) {
				matiereServicewsEndpoint = matiereServicews
						.getCourseSubjectDtoServicewsImplPort();

				moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
						.getAcademicModuleDtoServicewsImplPort();
				listDesModuleAcademicSource = moduleacademiqueServicewsEndpoint.getAllAcademicModuleServicews();
				
				if (matiereDto != null) {
					for (AcademicModuleDto module : matiereDto
							.getAcademicmodules().getAcademicmodule()) {
						for (AcademicModuleDto modules : listDesModuleAcademicSource) {
							if (modules.getIdAcademicModule() == module
									.getIdAcademicModule()) {
								selectedAcademicmodule.add(modules);
								break;
							}
						}
					}
				}

			}

			logger.debug("fin dual");

			logger.debug("END init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			action = true;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
					.getAcademicModuleDtoServicewsImplPort();

			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");

			listtypedeclasse = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typeclasse");
			listDesModuleAcademicSource = moduleacademiqueServicewsEndpoint
					.getAllAcademicModuleServicews();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			matiereServicewsEndpoint = matiereServicews
					.getCourseSubjectDtoServicewsImplPort();
			listmatiere = matiereServicewsEndpoint
					.getAllCourseSubjectServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createMatiere() {

		CourseSubjectDto creatematiere = new CourseSubjectDto();

		Academicmodules academicmodules = new Academicmodules();
		academicmodules.getAcademicmodule().addAll(selectedAcademicmodule);

		creatematiere.setAcademicGrade(matiereDto.getAcademicGrade());
		creatematiere.setAcademicmodules(academicmodules);
		creatematiere.setAcademiqueYear(matiereDto.getAcademiqueYear());
		creatematiere.setNumberOfAttendentMax(matiereDto
				.getNumberOfAttendentMax());
		creatematiere.setNumberOfAttendentMin(matiereDto
				.getNumberOfAttendentMin());
		creatematiere.setNumberOfHours(matiereDto.getNumberOfHours());
		creatematiere.setSubjectName(matiereDto.getSubjectName());
		creatematiere.setTeacheRate(matiereDto.getTeacheRate());
		creatematiere.setTypeOfClasse(matiereDto.getTypeOfClasse());

		matiereServicewsEndpoint = matiereServicews
				.getCourseSubjectDtoServicewsImplPort();
		creatematiere = matiereServicewsEndpoint
				.createCourseSubjectServicews(creatematiere);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_matiere")));
	}

	public void updateMatiere() {
		CourseSubjectDto modifmatiere = new CourseSubjectDto();
		Academicmodules academicmodule = new Academicmodules();

		academicmodule.getAcademicmodule().removeAll(selectedAcademicmodule);
		academicmodule.getAcademicmodule().addAll(selectedAcademicmodule);

		modifmatiere.setAcademicGrade(matiereDto.getAcademicGrade());
		modifmatiere.setAcademicmodules(academicmodule);
		modifmatiere.setAcademiqueYear(matiereDto.getAcademiqueYear());
		modifmatiere.setNumberOfAttendentMax(matiereDto
				.getNumberOfAttendentMax());
		modifmatiere.setNumberOfAttendentMin(matiereDto
				.getNumberOfAttendentMin());
		modifmatiere.setNumberOfHours(matiereDto.getNumberOfHours());
		modifmatiere.setSubjectName(matiereDto.getSubjectName());
		modifmatiere.setTeacheRate(matiereDto.getTeacheRate());
		modifmatiere.setTypeOfClasse(matiereDto.getTypeOfClasse());

		matiereServicewsEndpoint = matiereServicews
				.getCourseSubjectDtoServicewsImplPort();
		modifmatiere.setIdCourseSubject(matiereDto.getIdCourseSubject());
		modifmatiere = matiereServicewsEndpoint
				.updateCourseSubjectServicews(modifmatiere);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_matieres")));

	}

	public void supprimerMatiere() {
		matiereServicewsEndpoint.deleteCourseSubjectServicews(matierDto);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_matieres")));

	}
}
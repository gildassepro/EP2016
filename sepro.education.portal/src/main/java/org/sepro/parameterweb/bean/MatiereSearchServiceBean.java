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

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;

	private CourseSubjectDtoServicews matiereServicews = new CourseSubjectDtoServicews();
	private CourseSubjectDtoServicewsEndpoint matiereServicewsEndpoint;

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;

	private List<CourseSubjectDto> listmatiere = new ArrayList<CourseSubjectDto>();
	private CourseSubjectDto matiereDto = new CourseSubjectDto();
	private CourseSubjectDto matiereDtos = new CourseSubjectDto();

	private List<PopuplistDto> listPopuplistAY = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopuplistFIL = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopuplistTYPECLASSE = new ArrayList<PopuplistDto>();

	private List<AcademicModuleDto> listDesModuleAcademicSource = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> listDesModuleAcademicDestination = new ArrayList<AcademicModuleDto>();

	private List<AcademicModuleDto> selectedAcademicmodule = new ArrayList<AcademicModuleDto>();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;

	
	
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

	public List<PopuplistDto> getListPopuplistAY() {
		return listPopuplistAY;
	}

	public void setListPopuplistAY(List<PopuplistDto> listPopuplistAY) {
		this.listPopuplistAY = listPopuplistAY;
	}

	public List<PopuplistDto> getListPopuplistFIL() {
		return listPopuplistFIL;
	}

	public void setListPopuplistFIL(List<PopuplistDto> listPopuplistFIL) {
		this.listPopuplistFIL = listPopuplistFIL;
	}

	public List<PopuplistDto> getListPopuplistTYPECLASSE() {
		return listPopuplistTYPECLASSE;
	}

	public void setListPopuplistTYPECLASSE(
			List<PopuplistDto> listPopuplistTYPECLASSE) {
		this.listPopuplistTYPECLASSE = listPopuplistTYPECLASSE;
	}

	public List<AcademicModuleDto> getListDesModuleAcademicDestination() {
		return listDesModuleAcademicDestination;
	}

	public void setListDesModuleAcademicDestination(
			List<AcademicModuleDto> listDesModuleAcademicDestination) {
		this.listDesModuleAcademicDestination = listDesModuleAcademicDestination;
	}

	public List<AcademicModuleDto> getListDesModuleAcademicSource() {
		return listDesModuleAcademicSource;
	}

	public void setListDesModuleAcademicSource(
			List<AcademicModuleDto> listDesModuleAcademicSource) {
		this.listDesModuleAcademicSource = listDesModuleAcademicSource;
	}

	public List<AcademicModuleDto> getSelectedAcademicmodule() {
		return selectedAcademicmodule;
	}

	public void setSelectedAcademicmodule(
			List<AcademicModuleDto> selectedAcademicmodule) {
		this.selectedAcademicmodule = selectedAcademicmodule;
	}

	public List<CourseSubjectDto> getListmatiere() {
		return listmatiere;
	}

	public void setListmatiere(List<CourseSubjectDto> listmatiere) {
		this.listmatiere = listmatiere;
	}

	public CourseSubjectDto getMatiereDto() {
		return matiereDto;
	}

	public void setMatiereDto(CourseSubjectDto matiereDto) {
		this.matiereDto = matiereDto;
	}

	public CourseSubjectDto getMatiereDtos() {
		return matiereDtos;
	}

	public void setMatiereDtos(CourseSubjectDto matiereDtos) {
		this.matiereDtos = matiereDtos;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void updateMatiere() {
		logger.debug("DEBUT MODIFICATION MATIERE");

		FacesMessage msg = null;

		CourseSubjectDto modifmatiere = new CourseSubjectDto();

		Academicmodules academicmodule = new Academicmodules();
		academicmodule.getAcademicmodule().removeAll(selectedAcademicmodule);
		academicmodule.getAcademicmodule().addAll(selectedAcademicmodule);

		modifmatiere.setSubjectName(matiereDto.getSubjectName());
		modifmatiere.setAcademicmodules(academicmodule);
		modifmatiere.setAcademicGrade(matiereDto.getAcademicGrade());
		modifmatiere.setAcademiqueYear(matiereDto.getAcademiqueYear());
		modifmatiere.setNumberOfAttendentMax(matiereDto
				.getNumberOfAttendentMax());
		modifmatiere.setNumberOfAttendentMin(matiereDto
				.getNumberOfAttendentMin());
		modifmatiere.setNumberOfHours(matiereDto.getNumberOfHours());
		modifmatiere.setTeacheRate(matiereDto.getTeacheRate());
		modifmatiere.setTypeOfClasse(matiereDto.getTypeOfClasse());

		matiereServicewsEndpoint = matiereServicews
				.getCourseSubjectDtoServicewsImplPort();

		modifmatiere.setIdCourseSubject(matiereDto.getIdCourseSubject());

		modifmatiere = matiereServicewsEndpoint
				.updateCourseSubjectServicews(modifmatiere);
		init();

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_matieres"));

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

		logger.debug("FIN DE MODIFICATION MATIERE");
	}

	public void createMatiere() {
		logger.debug("DEBUT CREATION**************");
		FacesMessage msg = null;
		Academicmodules academicmodule = new Academicmodules();
		academicmodule.getAcademicmodule().addAll(selectedAcademicmodule);

		CourseSubjectDto creatematiere = new CourseSubjectDto();

		creatematiere.setSubjectName(matiereDto.getSubjectName());
		creatematiere.setAcademicGrade(matiereDto.getAcademicGrade());
		creatematiere.setAcademicmodules(academicmodule);
		creatematiere.setAcademiqueYear(matiereDto.getAcademiqueYear());
		creatematiere.setNumberOfAttendentMax(matiereDto
				.getNumberOfAttendentMax());
		creatematiere.setNumberOfAttendentMin(matiereDto
				.getNumberOfAttendentMin());
		creatematiere.setNumberOfHours(matiereDto.getNumberOfHours());
		creatematiere.setTeacheRate(matiereDto.getTeacheRate());
		creatematiere.setTypeOfClasse(matiereDto.getTypeOfClasse());

		matiereServicewsEndpoint = matiereServicews
				.getCourseSubjectDtoServicewsImplPort();
		creatematiere = matiereServicewsEndpoint
				.createCourseSubjectServicews(creatematiere);
		init();

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_matiere"));

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN CREATION**************");

	}

	public String initDualList(String baction) {
		logger.debug("DEBUT INIDUALIST**************");
		if (baction.equals("1")) {
			matiereDto = matiereDtos;
			listDesModuleAcademicSource = new ArrayList<AcademicModuleDto>();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listPopuplistAY = new ArrayList<PopuplistDto>();
			listPopuplistFIL = new ArrayList<PopuplistDto>();
			listPopuplistTYPECLASSE = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initUpdate();
			return null;
		} else {
			matiereDto = new CourseSubjectDto();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listPopuplistAY = new ArrayList<PopuplistDto>();
			listPopuplistFIL = new ArrayList<PopuplistDto>();
			listPopuplistTYPECLASSE = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
		logger.debug("FIN INIDUALIST******************");
		return null;
	}

	public void initUpdate() {
		action = false;
		try {
			logger.debug("BEGIN initUpdate");

			if (matiereDto != null) {
				matiereServicewsEndpoint = matiereServicews
						.getCourseSubjectDtoServicewsImplPort();
				academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
						.getAcademicModuleDtoServicewsImplPort();
				popuplistDtoServicewsEndpoint = popuplistDtoServicews
						.getPopuplistDtoServicewsImplPort();  
				listDesModuleAcademicSource = academicModuleDtoServicewsEndpoint
						.getAllAcademicModuleServicews();
				logger.debug("*********LISTE DES MODULES SELECTIONNE 00**********"+selectedAcademicmodule.size());
				if (matiereDto != null) {
					logger.debug("+++++JE SUIS LA AAAAAAAAAA+*+*+*+");
					logger.debug("+++++JE SUIS LA A222222++++++++"+matiereDto.getAcademicmodules().getAcademicmodule().size());
					for (AcademicModuleDto matiere : matiereDto
							.getAcademicmodules().getAcademicmodule())
					{ 
						logger.debug("+++++JE SUIS LA A22277++++++++"+matiereDto.getAcademicmodules().getAcademicmodule());
						for (AcademicModuleDto modules : listDesModuleAcademicSource) {
							logger.debug("+++++JE SUIS LA BBBBBBBBB+*+*+*+");
							if (modules.getIdAcademicModule() == matiere
									.getIdAcademicModule()) {
								selectedAcademicmodule.add(modules);
								logger.debug("++++++LISTE DES MODULES SELECTIONNE 1111********** "+selectedAcademicmodule.size());
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
		action = true;
		try {
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			matiereServicewsEndpoint = matiereServicews
					.getCourseSubjectDtoServicewsImplPort();
			listDesModuleAcademicSource = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();
			listPopuplistAY = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			listPopuplistFIL = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listPopuplistTYPECLASSE = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typeclasse");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteMatiere() {
		FacesMessage msg = null;
		try {
			matiereServicewsEndpoint.deleteCourseSubjectServicews(matiereDtos);
			init();

		} catch (Exception ex) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_delete_matieres"));

			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_matieres"));

		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init initialisation ");

			matiereServicewsEndpoint = matiereServicews
					.getCourseSubjectDtoServicewsImplPort();
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			listmatiere = matiereServicewsEndpoint
					.getAllCourseSubjectServicews();

			logger.debug("fin init initialisation ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
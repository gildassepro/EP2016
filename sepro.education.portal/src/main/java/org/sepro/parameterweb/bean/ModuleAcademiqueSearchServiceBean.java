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
import org.sepro.parameterweb.serviceapi.AcademicModuleDto.RequiredModules;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ModuleAcademiqueSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(ModuleAcademiqueSearchServiceBean.class);

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;

	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listniveau = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();

	private List<AcademicModuleDto> listmoduleacademique = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDto moduleacademiqueDto = new AcademicModuleDto();
	private AcademicModuleDto moduleacademiquDto = new AcademicModuleDto();

	private List<AcademicModuleDto> selectedacademiquemodule = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDto selectedacademiquemodules;

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

	public List<AcademicModuleDto> getListmoduleacademique() {
		return listmoduleacademique;
	}

	public void setListmoduleacademique(
			List<AcademicModuleDto> listmoduleacademique) {
		this.listmoduleacademique = listmoduleacademique;
	}

	public List<PopuplistDto> getListanneeacademique() {
		return listanneeacademique;
	}

	public void setListanneeacademique(List<PopuplistDto> listanneeacademique) {
		this.listanneeacademique = listanneeacademique;
	}

	public List<PopuplistDto> getListniveau() {
		return listniveau;
	}

	public void setListniveau(List<PopuplistDto> listniveau) {
		this.listniveau = listniveau;
	}

	public List<PopuplistDto> getListfiliere() {
		return listfiliere;
	}

	public void setListfiliere(List<PopuplistDto> listfiliere) {
		this.listfiliere = listfiliere;
	}

	public AcademicModuleDto getModuleacademiqueDto() {
		return moduleacademiqueDto;
	}

	public void setModuleacademiqueDto(AcademicModuleDto moduleacademiqueDto) {
		this.moduleacademiqueDto = moduleacademiqueDto;
	}

	public AcademicModuleDto getModuleacademiquDto() {
		return moduleacademiquDto;
	}

	public void setModuleacademiquDto(AcademicModuleDto moduleacademiquDto) {
		this.moduleacademiquDto = moduleacademiquDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public String initDualList(String baction) {
		if (baction.equals("1")) {
			moduleacademiqueDto = moduleacademiquDto;
			listmoduleacademique = new ArrayList<AcademicModuleDto>();
			selectedacademiquemodule = new ArrayList<AcademicModuleDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listniveau = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initUpdate();
			return null;
		} else {
			moduleacademiqueDto = new AcademicModuleDto();
			selectedacademiquemodule = new ArrayList<AcademicModuleDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listniveau = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
		return null;
	}

	public void initUpdate() {
		action = false;
		try {

			if (moduleacademiqueDto != null) {
				popuplistDtoServicewsEndpoint = popuplistDtoServicews
						.getPopuplistDtoServicewsImplPort();

				academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
						.getAcademicModuleDtoServicewsImplPort();
				listanneeacademique = popuplistDtoServicewsEndpoint
						.searchPopuplistDtoServicews("academic_years");

				listfiliere = popuplistDtoServicewsEndpoint
						.searchPopuplistDtoServicews("filiere");
				listniveau = popuplistDtoServicewsEndpoint
						.searchPopuplistDtoServicews("niveau");

				listmoduleacademique = academicModuleDtoServicewsEndpoint
						.getAllAcademicModuleServicews();
				logger.debug("JE SUIS EN FIN DE ZONE 1******"
						+ moduleacademiqueDto.getRequiredModules()
								.getRequiredModule().size());
				if (moduleacademiqueDto != null) {
					logger.debug("JE SUIS DANS LA ZONE 2 ****"
							+ moduleacademiqueDto.getRequiredModules()
									.getRequiredModule().size());
					for (AcademicModuleDto requiredmodule : moduleacademiqueDto
							.getRequiredModules().getRequiredModule()) {
						for (AcademicModuleDto mod : listmoduleacademique) {
							if (mod.getIdAcademicModule() == requiredmodule
									.getIdAcademicModule()) {
								selectedacademiquemodule.add(mod);
							}
						}

					}
				}
			}

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

			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listniveau = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("niveau");
			listmoduleacademique = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("JE SUIS DANS LE INIT ZONE START");
			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			listmoduleacademique = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createModule() {
		FacesMessage msg = null;
		logger.debug("JE SUIS DANS LA ZONE CREATION *********");
		AcademicModuleDto moduleacademique = new AcademicModuleDto();

		RequiredModules requiredmodule = new RequiredModules();
		requiredmodule.getRequiredModule().addAll(selectedacademiquemodule);
		moduleacademique.setAcademicGrade(moduleacademiqueDto
				.getAcademicGrade());
		logger.debug("***GRADE ACADEMIQUE****"+moduleacademiqueDto.getAcademicGrade().getValue());
		moduleacademique.setAcademicSector(moduleacademiqueDto
				.getAcademicSector());
		logger.debug("*****SECTEUR ACADEMIQUE*********"+moduleacademiqueDto.getAcademicSector().getValue());
		moduleacademique.setAcademiqueYear(moduleacademiqueDto
				.getAcademiqueYear());
		logger.debug("*** ANNEE ACADEMIQUE *******"+moduleacademiqueDto.getAcademiqueYear().getValue());
		
		moduleacademique.setRequiredModules(requiredmodule);
		logger.debug("*******AFFICHAGE MODULE ACADEMIQUE*******"+requiredmodule.getRequiredModule().size());
		
		moduleacademique.setGradeEliminatory(moduleacademiqueDto
				.getGradeEliminatory());
		moduleacademique.setGradeRattrapage(moduleacademiqueDto
				.getGradeRattrapage());
		moduleacademique.setGradeSuccess(moduleacademiqueDto.getGradeSuccess());
		
		moduleacademique.setModuleDescription(moduleacademiqueDto
				.getModuleDescription());
		moduleacademique.setModuleName(moduleacademiqueDto.getModuleName());
		moduleacademique.setModulePrice(moduleacademiqueDto.getModulePrice());
		moduleacademique.setObjectives(moduleacademiqueDto.getObjectives());
		moduleacademique.setRateOfSuccess(moduleacademiqueDto
				.getRateOfSuccess());

		moduleacademique.setOnEntreprise(moduleacademiqueDto.getOnEntreprise());

		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();

		moduleacademique = academicModuleDtoServicewsEndpoint
				.createAcademicModuleServicews(moduleacademique);

		init();

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_MODULE_ACADEMIQUE"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}

	public void updateModule() {

		logger.debug("JE SUIS DANS LA ZONE MODIFICATION *********");

		AcademicModuleDto modifmoduleacademique = new AcademicModuleDto();
		RequiredModules requiredmodule = new RequiredModules();

		requiredmodule.getRequiredModule().removeAll(selectedacademiquemodule);
		requiredmodule.getRequiredModule().addAll(selectedacademiquemodule);

		modifmoduleacademique.setRequiredModules(requiredmodule);
		modifmoduleacademique.setAcademicGrade(moduleacademiqueDto
				.getAcademicGrade());
		modifmoduleacademique.setAcademicSector(moduleacademiqueDto
				.getAcademicSector());
		modifmoduleacademique.setAcademiqueYear(moduleacademiqueDto
				.getAcademiqueYear());
		modifmoduleacademique.setGradeEliminatory(moduleacademiqueDto
				.getGradeEliminatory());
		modifmoduleacademique.setGradeRattrapage(moduleacademiqueDto
				.getGradeRattrapage());
		modifmoduleacademique.setGradeSuccess(moduleacademiqueDto
				.getGradeSuccess());
		modifmoduleacademique.setModuleDescription(moduleacademiqueDto
				.getModuleDescription());
		modifmoduleacademique
				.setModuleName(moduleacademiqueDto.getModuleName());
		modifmoduleacademique.setModulePrice(moduleacademiqueDto
				.getModulePrice());
		modifmoduleacademique
				.setObjectives(moduleacademiqueDto.getObjectives());
		modifmoduleacademique.setRateOfSuccess(moduleacademiqueDto
				.getRateOfSuccess());
		modifmoduleacademique.setOnEntreprise(moduleacademiqueDto
				.getOnEntreprise());

		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
				.getAcademicModuleDtoServicewsImplPort();
		modifmoduleacademique.setIdAcademicModule(moduleacademiqueDto
				.getIdAcademicModule());
		modifmoduleacademique = academicModuleDtoServicewsEndpoint
				.updateAcademicModuleServicews(modifmoduleacademique);
		init();

		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_module_académique")));

	}

	public String supprimerModule() {
		try {
			academicModuleDtoServicewsEndpoint
					.deleteAcademicModuleServicews(moduleacademiquDto);
			init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_moduleacademique")));
			return null;

		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_moduleacademique")));
		return null;
	}

}

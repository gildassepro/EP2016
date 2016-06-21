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
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listniveau = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();

	private AcademicModuleDtoServicews moduleacademiqueServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint moduleacademiqueServicewsEndpoint;
	private List<AcademicModuleDto> listmoduleacademique = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDto moduleacademiqueDto = new AcademicModuleDto();
	private AcademicModuleDto moduleacademiquDto = new AcademicModuleDto();

	private List<AcademicModuleDto> selectedacademiquemodule = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDto selectedacademiquemodules;

	private boolean action = false;

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

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			moduleacademiqueDto = moduleacademiquDto;
			listanneeacademique = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listniveau = new ArrayList<PopuplistDto>();
			initUpdate();
		} else {
			moduleacademiqueDto = new AcademicModuleDto();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listniveau = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			initCreate();
		}
	}

	public void initUpdate() {
		try {
			action = false;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listniveau = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("niveau");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			action = true;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			listniveau = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("niveau");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		try {
			moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
					.getAcademicModuleDtoServicewsImplPort();
			listmoduleacademique = moduleacademiqueServicewsEndpoint
					.getAllAcademicModuleServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createModule() {
		AcademicModuleDto moduleacademique = new AcademicModuleDto();
		moduleacademique.setAcademicGrade(moduleacademiqueDto
				.getAcademicGrade());
		moduleacademique.setAcademicSector(moduleacademiqueDto
				.getAcademicSector());
		moduleacademique.setAcademiqueYear(moduleacademiqueDto
				.getAcademiqueYear());
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

		moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
				.getAcademicModuleDtoServicewsImplPort();
		moduleacademique = moduleacademiqueServicewsEndpoint
				.createAcademicModuleServicews(moduleacademique);

		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_MODULE_ACADEMIQUE")));
	}

	public String updateModule() {
		AcademicModuleDto modifmoduleacademique = new AcademicModuleDto();
		try {
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
			modifmoduleacademique.setModuleName(moduleacademiqueDto
					.getModuleName());
			modifmoduleacademique.setModulePrice(moduleacademiqueDto
					.getModulePrice());
			modifmoduleacademique.setObjectives(moduleacademiqueDto
					.getObjectives());
			modifmoduleacademique.setRateOfSuccess(moduleacademiqueDto
					.getRateOfSuccess());
			modifmoduleacademique.setOnEntreprise(moduleacademiqueDto
					.getOnEntreprise());
			moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
					.getAcademicModuleDtoServicewsImplPort();
			modifmoduleacademique.setIdAcademicModule(moduleacademiqueDto
					.getIdAcademicModule());
			modifmoduleacademique = moduleacademiqueServicewsEndpoint
					.updateAcademicModuleServicews(modifmoduleacademique);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_module_académique")));
		return null;

	}

	public String supprimerModule() {
		try {
			moduleacademiqueServicewsEndpoint
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

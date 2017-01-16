package org.sepro.parameterweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
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
import org.sepro.authentificationweb.serviceimpl.ModuleServicews;
import org.sepro.authentificationweb.serviceimpl.ModuleServicewsEndpoint;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.CurriculumDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.ProgrammeDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.RoomInventoryDto;
import org.sepro.parameterweb.serviceapi.SessionDto;
import org.sepro.parameterweb.serviceapi.ProgrammeDto.Academicmodule;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.BuildingServicews;
import org.sepro.parameterweb.serviceimpl.BuildingServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SessionDtoServicews;
import org.sepro.parameterweb.serviceimpl.SessionDtoServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ProgrammeCalendarCreateServiceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(ProgrammeCalendarCreateServiceBean.class);

	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;

	private ProgrammeCalendarDto programmeCalendarDto = new ProgrammeCalendarDto();
	private ProgrammeCalendarDto programmeCalendarDtos = new ProgrammeCalendarDto();
	private List<ProgrammeCalendarDto> listProgrammeCalendar = new ArrayList<ProgrammeCalendarDto>();
	private ProgrammeCalendarDto selectedprogramme = new ProgrammeCalendarDto();

	private ProgrammeDtoServicews programmeDtoServicews = new ProgrammeDtoServicews();
	private ProgrammeDtoServicewsEndpoint programmeDtoServicewsEndpoint;
	private List<ProgrammeDto> listProgramme = new ArrayList<ProgrammeDto>();

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	private List<PopuplistDto> listPopuplist = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopuplistAY = new ArrayList<PopuplistDto>();
	
	private PopuplistDto popuplistDto = new PopuplistDto();

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;
	private List<AcademicModuleDto> listModulesAcademique = new ArrayList<AcademicModuleDto>();  
	private List<AcademicModuleDto> selectedlistAcademicModule = new ArrayList<AcademicModuleDto>();
	private AcademicModuleDto academicModuleDto = new AcademicModuleDto();
	private List<AcademicModuleDto> selectedAcademicmodule = new ArrayList<AcademicModuleDto>();

	private SessionDtoServicews sessionDtoServicews = new SessionDtoServicews();
	private SessionDtoServicewsEndpoint sessionDtoServicewsEndpoint;
	private List<SessionDto> listSession = new ArrayList<SessionDto>();

	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();
	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private List<ModuleCalendarDto> selectedlistemodulecalendar = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendar = new ArrayList<ModuleCalendarDto>();
	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private ModuleCalendarDto moduleCalendarDtos = new ModuleCalendarDto();
	private boolean test = true;
	private boolean test2 = true;

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;

	
	
	public List<AcademicModuleDto> getSelectedlistAcademicModule() {
		return selectedlistAcademicModule;
	}

	public void setSelectedlistAcademicModule(
			List<AcademicModuleDto> selectedlistAcademicModule) {
		this.selectedlistAcademicModule = selectedlistAcademicModule;
	}

	public boolean isTest2() {
		return test2;
	}

	public void setTest2(boolean test2) {
		this.test2 = test2;
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

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public ModuleCalendarDto getModuleCalendarDtos() {
		return moduleCalendarDtos;
	}

	public void setModuleCalendarDtos(ModuleCalendarDto moduleCalendarDtos) {
		this.moduleCalendarDtos = moduleCalendarDtos;
	}

	public List<ProgrammeDto> getListProgramme() {
		return listProgramme;
	}

	public void setListProgramme(List<ProgrammeDto> listProgramme) {
		this.listProgramme = listProgramme;
	}

	public List<ModuleCalendarDto> getListModuleCalendar() {
		return listModuleCalendar;
	}

	public void setListModuleCalendar(List<ModuleCalendarDto> listModuleCalendar) {
		this.listModuleCalendar = listModuleCalendar;
	}

	public List<SessionDto> getListSession() {
		return listSession;
	}

	public void setListSession(List<SessionDto> listSession) {
		this.listSession = listSession;
	}
	
	public List<PopuplistDto> getListPopuplistAY() {
		return listPopuplistAY;
	}

	public void setListPopuplistAY(List<PopuplistDto> listPopuplistAY) {
		this.listPopuplistAY = listPopuplistAY;
	}

	public List<ModuleCalendarDto> getSelectedlistemodulecalendar() {
		selectedlistemodulecalendar = new ArrayList<ModuleCalendarDto>();

		if (programmeCalendarDto != null
				&& programmeCalendarDto.getIdProgrammeCalendar() != null) {
			ModuleCalendarDto modprogramme = new ModuleCalendarDto();
			modprogramme.setProgrammeCalendar(programmeCalendarDto);

			List<ModuleCalendarDto> listmodprogramme = moduleCalendarDtoServicewsEndpoint
					.getAllModuleCalendarServicews();

			for (ModuleCalendarDto modprogramm2 : listmodprogramme) {
				if (modprogramm2.getProgrammeCalendar()
						.getIdProgrammeCalendar() == programmeCalendarDto
						.getIdProgrammeCalendar()) {
					selectedlistemodulecalendar.add(modprogramm2);
				}
			}
		}

		return selectedlistemodulecalendar;
	}

	public void setSelectedlistemodulecalendar(
			List<ModuleCalendarDto> selectedlistemodulecalendar) {
		this.selectedlistemodulecalendar = selectedlistemodulecalendar;
	}

	public ModuleCalendarDto getModuleCalendarDto() {
		return moduleCalendarDto;
	}

	public void setModuleCalendarDto(ModuleCalendarDto moduleCalendarDto) {
		this.moduleCalendarDto = moduleCalendarDto;
	}

	public ProgrammeCalendarDto getProgrammeCalendarDtos() {
		return programmeCalendarDtos;
	}

	public void setProgrammeCalendarDtos(
			ProgrammeCalendarDto programmeCalendarDtos) {
		this.programmeCalendarDtos = programmeCalendarDtos;
	}

	public ProgrammeCalendarDto getSelectedprogramme() {
		return selectedprogramme;
	}

	public void setSelectedprogramme(ProgrammeCalendarDto selectedprogramme) {
		this.selectedprogramme = selectedprogramme;
	}

	public AcademicModuleDto getAcademicModuleDto() {
		return academicModuleDto;
	}

	public void setAcademicModuleDto(AcademicModuleDto academicModuleDto) {
		this.academicModuleDto = academicModuleDto;
	}

	public List<AcademicModuleDto> getSelectedAcademicmodule() {
		return selectedAcademicmodule;
	}

	public void setSelectedAcademicmodule(
			List<AcademicModuleDto> selectedAcademicmodule) {
		this.selectedAcademicmodule = selectedAcademicmodule;
	}

	public ProgrammeCalendarDto getProgrammeCalendarDto() {
		return programmeCalendarDto;
	}

	public void setProgrammeCalendarDto(
			ProgrammeCalendarDto programmeCalendarDto) {
		this.programmeCalendarDto = programmeCalendarDto;
	}

	public List<ProgrammeCalendarDto> getListProgrammeCalendar() {
		return listProgrammeCalendar;
	}

	public void setListProgrammeCalendar(
			List<ProgrammeCalendarDto> listProgrammeCalendar) {
		this.listProgrammeCalendar = listProgrammeCalendar;
	}

	public List<AcademicModuleDto> getListModulesAcademique() {
		return listModulesAcademique;
	}

	public void setListModulesAcademique(
			List<AcademicModuleDto> listModulesAcademique) {
		this.listModulesAcademique = listModulesAcademique;
	}

	public List<PopuplistDto> getListPopuplist() {
		return listPopuplist;
	}

	public void setListPopuplist(List<PopuplistDto> listPopuplist) {
		this.listPopuplist = listPopuplist;
	}

	public PopuplistDto getPopuplistDto() {
		return popuplistDto;
	}

	public void setPopuplistDto(PopuplistDto popuplistDto) {
		this.popuplistDto = popuplistDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void testformList() {
		
		if ((programmeCalendarDto != null && programmeCalendarDto.getIdProgrammeCalendar() !=0
				)
				&& (programmeCalendarDto != null && programmeCalendarDto.getProgramme().getNameProgramme().length() != 0)
				
				&& (programmeCalendarDto != null && programmeCalendarDto.getAcademiqueYear().getValue().length() != 0)
				
				)

			test = false;

		else
			test = true;
	}
	
	public void updateModuleProgramme(){
		
       logger.debug("@@@@@@ JE SUIS LA @@@@@@@@@@@@@@");
		
		academicModuleDtoServicewsEndpoint = academicModuleDtoServicews.getAcademicModuleDtoServicewsImplPort();
		
		selectedAcademicmodule.addAll(programmeCalendarDto.getProgramme().getAcademicmodule().getAcademicmodule());
		
		
		logger.debug("@@@@@@ JE SUIS A LA FIN @@@@@@@@@@@@@@");
		
	}
	
	
	public void updateProgrammeCalendar() {

		logger.debug("DEBUT modifierProgrammeCalendar");
		ProgrammeCalendarDto programmeCalendarmodif = new ProgrammeCalendarDto();
		FacesMessage msg = null;
		
		programmeCalendarmodif.setAcademiqueYear(programmeCalendarDto
				.getAcademiqueYear());
		programmeCalendarmodif
				.setStartDate(programmeCalendarDto.getStartDate());
		programmeCalendarmodif.setEndDate(programmeCalendarDto.getEndDate());
		
		programmeCalendarmodif
				.setProgramme(programmeCalendarDto.getProgramme());

		programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
				.getProgrammeCalendarDtoServicewsImplPort();

		programmeCalendarmodif.setIdProgrammeCalendar(programmeCalendarDto
				.getIdProgrammeCalendar());

		programmeCalendarmodif = programmeCalendarDtoServicewsEndpoint
				.updateProgrammeCalendarServicews(programmeCalendarmodif);
		init();
		logger.debug("Fin Modification ProgrammeCalendar");
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_programme_calendar"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}

	public void saveProgrammeCalendar() {
		FacesMessage msg = null;

		logger.debug("++++++++++DEBUT createProgramme Calendar +++++++++++++");
		ProgrammeCalendarDto programmeCalendarsave = new ProgrammeCalendarDto();

		programmeCalendarsave.setAcademiqueYear(programmeCalendarDto
				.getAcademiqueYear());
		programmeCalendarsave.setEndDate(programmeCalendarDto.getEndDate());
		programmeCalendarsave.setStartDate(programmeCalendarDto.getStartDate());
		programmeCalendarsave.setProgramme(programmeCalendarDto.getProgramme());

		programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
				.getProgrammeCalendarDtoServicewsImplPort();

		programmeCalendarsave = programmeCalendarDtoServicewsEndpoint
				.createProgrammeCalendarervicews(programmeCalendarsave);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_programme_calendar"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		activateTest();

		logger.debug("+++++++++FIN  createProgramme Calendar +++++++++++++");

	}
	
	public void activateTest(){
		test = false;
	}

	public String initDualList(String baction) {

		logger.debug("DEBUT initDualList +++++++++++++");

		if (baction.equals("1")) {
			programmeCalendarDto = programmeCalendarDtos;
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listPopuplistAY = new ArrayList<PopuplistDto>();
			listSession = new ArrayList<SessionDto>();
			listProgramme = new ArrayList<ProgrammeDto>();
			test = false;
			selectedlistemodulecalendar = new ArrayList<ModuleCalendarDto>();
			action2 = true;
			action3= false;
			test2 = false;
			initUpdateProgrammeCalendar();

		} else {

			programmeCalendarDto = new ProgrammeCalendarDto();
			listModulesAcademique = new ArrayList<AcademicModuleDto>();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listPopuplistAY = new ArrayList<PopuplistDto>();
			listSession = new ArrayList<SessionDto>();
			listProgramme = new ArrayList<ProgrammeDto>();
			test = true;
			test2 = false;
			selectedlistemodulecalendar = new ArrayList<ModuleCalendarDto>();
			action2 = true;
			action3= false;
			initCreate();

		}

		logger.debug("DEBUT initDualList +++++++++++++");
		return null;

	}
	
	

	public String addModuleProgramme() {
		FacesMessage msg = null;

		logger.debug("DEBUT ADD ModuleProgramme +++++++++++++");
		ModuleCalendarDto moduleprogrammecreate = new ModuleCalendarDto();
		try {
			moduleprogrammecreate.setProgrammeCalendar(programmeCalendarDto);

			moduleprogrammecreate.setAcademicModule(moduleCalendarDto
					.getAcademicModule());
			moduleprogrammecreate.setCoefficient(moduleCalendarDto
					.getCoefficient());
			moduleprogrammecreate.setSession(moduleCalendarDto.getSession());

			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
					.getModuleCalendarDtoServicewsImplPort();
			moduleprogrammecreate = moduleCalendarDtoServicewsEndpoint
					.createModuleCalendarServicews(moduleprogrammecreate);

		} catch (Exception ex) {

		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_add_module_calendar"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		logger.debug("FIND ADD ModuleProgramme +++++++++++++");
		return null;
	}

	public String supprimerModuleCalendar() {
		
		FacesMessage msg = null;
		moduleCalendarDtoServicewsEndpoint
				.deleteModuleCalendarServicews(moduleCalendarDtos);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_module_calendar"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		return null;
	}

	public String supprimerProgrammeCalendar() {
		
		FacesMessage msg = null;	
		try{
			programmeCalendarDtoServicewsEndpoint.deleteProgrammeCalendarServicews(programmeCalendarDtos);
			
		}catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warning_delete_programme_calendar"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_programme_calendar"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		
		return null;
	}

	public String initUpdateProgrammeCalendar() {
		try {
			logger.debug("***** BEGIN initUpdate *******");
			action = false;
			if (programmeCalendarDto != null) {
				programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
						.getProgrammeCalendarDtoServicewsImplPort();
				sessionDtoServicewsEndpoint = sessionDtoServicews
						.getSessionDtoServicewsImplPort();

				moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
						.getModuleCalendarDtoServicewsImplPort();

				listSession = sessionDtoServicewsEndpoint
						.getAllSessionServicews();

				academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
						.getAcademicModuleDtoServicewsImplPort();

				listModulesAcademique = academicModuleDtoServicewsEndpoint
						.getAllAcademicModuleServicews();

				selectedAcademicmodule.addAll(programmeCalendarDto
						.getProgramme().getAcademicmodule()
						.getAcademicmodule());

				moduleCalendarDto.setProgrammeCalendar(programmeCalendarDto);
				selectedlistemodulecalendar = moduleCalendarDtoServicewsEndpoint
						.searchModuleCalendarServicews(moduleCalendarDto);
			}
			init();		
			logger.debug("**********END initUpdate*******");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public void initCreate() {
		try {
			logger.debug("start initCreate");
			action = true;

			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			listPopuplistAY = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("academic_years");
			
			
			programmeDtoServicewsEndpoint = programmeDtoServicews
					.getProgrammeDtoServicewsImplPort();
			listProgramme = programmeDtoServicewsEndpoint
					.getAllProgrammeServicews();

			sessionDtoServicewsEndpoint = sessionDtoServicews
					.getSessionDtoServicewsImplPort();
			listSession = sessionDtoServicewsEndpoint.getAllSessionServicews();

			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
					.getModuleCalendarDtoServicewsImplPort();
			selectedlistemodulecalendar = moduleCalendarDtoServicewsEndpoint
					.getAllModuleCalendarServicews();

			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init ProgrammeCalendarServiceBean");

			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();
			listProgrammeCalendar = programmeCalendarDtoServicewsEndpoint
					.getAllProgrammeCalendarServicews();

			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
					.getModuleCalendarDtoServicewsImplPort();
			selectedlistemodulecalendar = moduleCalendarDtoServicewsEndpoint
					.getAllModuleCalendarServicews();

			logger.debug("end init ProgrammeCalendarServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

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
import org.sepro.authentificationweb.serviceapi.RoleDto;
import org.sepro.parameterweb.serviceapi.BuildingDto;
import org.sepro.parameterweb.serviceapi.BuildingDto.CleaningHours;
import org.sepro.parameterweb.serviceapi.CleanHoursDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.EstablishmentDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.SubEstablishmentDto;
import org.sepro.parameterweb.serviceimpl.BuildingServicews;
import org.sepro.parameterweb.serviceimpl.BuildingServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CleanHoursServicews;
import org.sepro.parameterweb.serviceimpl.CleanHoursServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicewsEndpoint;

@ManagedBean
@ViewScoped
public class BuildingSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(BuildingSearchServiceBean.class);
	private BuildingServicews buildingServicews = new BuildingServicews();
	private BuildingServicewsEndpoint buildingServicewsEndpoint;

	private CleanHoursServicews cleanHoursServicews = new CleanHoursServicews();
	private CleanHoursServicewsEndpoint cleanHoursServicewsEndpoint;
	private CleanHoursDto cleanHoursDto = new CleanHoursDto();

	private SubEstablishmentServicews subEstablishmentServicews = new SubEstablishmentServicews();
	private SubEstablishmentServicewsEndpoint subEstablishmentServicewsEndpoint;

	private EstablishmentServicews establishmentServicews = new EstablishmentServicews();
	private EstablishmentServicewsEndpoint establishmentServicewsEndpoint;

	private SubEstablishmentDto subEstablishmentDto = new SubEstablishmentDto();
	private List<SubEstablishmentDto> listSubEstablishment = new ArrayList<SubEstablishmentDto>();

	private EstablishmentDto establishmentDto = new EstablishmentDto();
	private List<EstablishmentDto> listEstablishment = new ArrayList<EstablishmentDto>();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean test = true;
	private List<BuildingDto> listBuilding = new ArrayList<BuildingDto>();
	private BuildingDto buildingDto = new BuildingDto();
	private List<CleanHoursDto> listCleanHours = new ArrayList<CleanHoursDto>();
	private List<CleanHoursDto> listCleanHoursSource = new ArrayList<CleanHoursDto>();
	private List<CleanHoursDto> listCleanHoursDestination = new ArrayList<CleanHoursDto>();
	private BuildingDto buildingsDto = new BuildingDto();

	
	
	
	
	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
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

	public List<CleanHoursDto> getListCleanHoursSource() {
		return listCleanHoursSource;
	}

	public void setListCleanHoursSource(List<CleanHoursDto> listCleanHoursSource) {
		this.listCleanHoursSource = listCleanHoursSource;
	}

	public List<CleanHoursDto> getListCleanHoursDestination() {
		return listCleanHoursDestination;
	}

	public void setListCleanHoursDestination(
			List<CleanHoursDto> listCleanHoursDestination) {
		this.listCleanHoursDestination = listCleanHoursDestination;
	}

	public List<CleanHoursDto> getListCleanHours() {
		return listCleanHours;
	}

	public void setListCleanHours(List<CleanHoursDto> listCleanHours) {
		this.listCleanHours = listCleanHours;
	}

	public List<BuildingDto> getListBuilding() {
		return listBuilding;
	}

	public void setListBuilding(List<BuildingDto> listBuilding) {
		this.listBuilding = listBuilding;
	}

	public SubEstablishmentDto getSubEstablishmentDto() {
		return subEstablishmentDto;
	}

	public void setSubEstablishmentDto(SubEstablishmentDto subEstablishmentDto) {
		this.subEstablishmentDto = subEstablishmentDto;
	}

	public List<SubEstablishmentDto> getListSubEstablishment() {
		return listSubEstablishment;
	}

	public void setListSubEstablishment(
			List<SubEstablishmentDto> listSubEstablishment) {
		this.listSubEstablishment = listSubEstablishment;
	}

	public EstablishmentDto getEstablishmentDto() {
		return establishmentDto;
	}

	public void setEstablishmentDto(EstablishmentDto establishmentDto) {
		this.establishmentDto = establishmentDto;
	}

	public List<EstablishmentDto> getListEstablishment() {
		return listEstablishment;
	}

	public void setListEstablishment(List<EstablishmentDto> listEstablishment) {
		this.listEstablishment = listEstablishment;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public BuildingDto getBuildingDto() {
		return buildingDto;
	}

	public void setBuildingDto(BuildingDto buildingDto) {
		this.buildingDto = buildingDto;
	}

	public BuildingDto getBuildingsDto() {
		return buildingsDto;
	}

	public void setBuildingsDto(BuildingDto buildingsDto) {
		this.buildingsDto = buildingsDto;
	}

	public String updateBuilding() {
		logger.debug("DEBUT modifierBatiment");
		FacesMessage msg = null;
		BuildingDto buildingmodif = new BuildingDto();
		CleaningHours cleaningHours = new CleaningHours();
		try {
			logger.debug("Batiment  Name  " + buildingDto.getNameBuilding());
			cleaningHours.getCleaningHour().removeAll(listCleanHoursDestination);
			cleaningHours.getCleaningHour().addAll(listCleanHoursDestination);
			
			buildingmodif.setNameBuilding(buildingDto.getNameBuilding());
			buildingmodif.setEstablishment(buildingDto.getEstablishment());
			buildingmodif
					.setSubestablishment(buildingDto.getSubestablishment());
			buildingmodif.setCleaningHours(cleaningHours);
			buildingmodif.setGeographicalLocation(buildingDto
					.getGeographicalLocation());
			buildingmodif.setNumberOfFloors(buildingDto.getNumberOfFloors());
			buildingmodif.setNumberOfBlocks(buildingDto.getNumberOfBlocks());
			buildingmodif.setNumberOfClassrooms(buildingDto
					.getNumberOfClassrooms());
			buildingmodif.setNumberOfMachinerooms(buildingDto
					.getNumberOfMachinerooms());
			buildingmodif.setNumberOfOffices(buildingDto.getNumberOfOffices());
			buildingmodif.setNumberOfLaboratories(buildingDto
					.getNumberOfLaboratories());

			buildingServicewsEndpoint = buildingServicews
					.getBuildingServicewsImplPort();
			buildingmodif.setIdBuilding(buildingDto.getIdBuilding());

			buildingmodif = buildingServicewsEndpoint
					.updateBuildingServicews(buildingmodif);
		} catch (Exception e) {
				return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_building"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		logger.debug("Fin Modification Batiment  +++++++++++++");
		
		return null;
	}

	public void createBuilding() {

		logger.debug("DEBUT CREATION BATIMENT +++++++++++++");
		FacesMessage msg = null;
		BuildingDto buildingcreate = new BuildingDto();
		CleaningHours cleaningHours = new CleaningHours();
		cleaningHours.getCleaningHour().addAll(listCleanHoursDestination);
		
		buildingcreate.setNameBuilding(buildingDto.getNameBuilding());
		buildingcreate.setEstablishment(buildingDto.getEstablishment());
		buildingcreate.setSubestablishment(buildingDto.getSubestablishment());
		
		buildingcreate.setCleaningHours(cleaningHours);
		buildingcreate.setGeographicalLocation(buildingDto
				.getGeographicalLocation());
		buildingcreate.setNumberOfFloors(buildingDto.getNumberOfFloors());
		buildingcreate.setNumberOfBlocks(buildingDto.getNumberOfBlocks());
		buildingcreate.setNumberOfClassrooms(buildingDto
				.getNumberOfClassrooms());
		buildingcreate.setNumberOfMachinerooms(buildingDto
				.getNumberOfMachinerooms());
		buildingcreate.setNumberOfOffices(buildingDto.getNumberOfOffices());
		buildingcreate.setNumberOfLaboratories(buildingDto
				.getNumberOfLaboratories());

		buildingServicewsEndpoint = buildingServicews
				.getBuildingServicewsImplPort();
		buildingcreate = buildingServicewsEndpoint
				.createBuildingServicews(buildingcreate);

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_building"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		logger.debug("FIN CREATE BATIMENT +++++++++++++");
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			buildingDto = buildingsDto;
			listEstablishment = new ArrayList<EstablishmentDto>();
			listSubEstablishment = new ArrayList<SubEstablishmentDto>();
			listCleanHoursSource = new ArrayList<CleanHoursDto>();
			listCleanHoursDestination = new ArrayList<CleanHoursDto>();
			action2 = true;
			action3= false;
			test = false;
			initUpdate();
		} else {
			buildingDto = new BuildingDto();
			listEstablishment = new ArrayList<EstablishmentDto>();
			listSubEstablishment = new ArrayList<SubEstablishmentDto>();
			listCleanHoursSource = new ArrayList<CleanHoursDto>();
			listCleanHoursDestination = new ArrayList<CleanHoursDto>();
			action2 = true;
			action3= false;
			test = false;
			initCreate();
		}
		logger.debug("FIN initDualList +++++++++++++");
	}

	public void initUpdate() {
		try {
			logger.debug("BEGIN initUpdate");
			action = false;
					
			if (buildingDto!= null) {
				establishmentServicewsEndpoint = establishmentServicews
						.getEstablishmentServicewsImplPort();
				subEstablishmentServicewsEndpoint = subEstablishmentServicews
						.getSubEstablishmentServicewsImplPort();
				cleanHoursServicewsEndpoint = cleanHoursServicews.getCleanHoursServicewsImplPort();
				listEstablishment = establishmentServicewsEndpoint
						.getAllEstablishmentServicews();
				listSubEstablishment = subEstablishmentServicewsEndpoint
						.getAllSubEstablishmentServicews();
				listCleanHoursSource = cleanHoursServicewsEndpoint.getAllCleanHoursServicews();
				
				listCleanHoursDestination.addAll(buildingDto.getCleaningHours().getCleaningHour());
				
				logger.debug("end init ChildMenuCreateServiceBean");
			}

			logger.debug("fin dual");

			logger.debug("END init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			
			establishmentServicewsEndpoint = establishmentServicews
					.getEstablishmentServicewsImplPort();
			listEstablishment = establishmentServicewsEndpoint
					.getAllEstablishmentServicews();

			subEstablishmentServicewsEndpoint = subEstablishmentServicews
					.getSubEstablishmentServicewsImplPort();

			listSubEstablishment = subEstablishmentServicewsEndpoint
					.getAllSubEstablishmentServicews();
			cleanHoursServicewsEndpoint = cleanHoursServicews.getCleanHoursServicewsImplPort();
			
			listCleanHoursSource = cleanHoursServicewsEndpoint.getAllCleanHoursServicews();

			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerBuilding() {
		logger.debug("DEBUT SUPPRESSION BATIMENT +++++++++++++");
		FacesMessage msg = null;
		try {
			buildingServicewsEndpoint.deleteBuildingServicews(buildingsDto);
		} catch (Exception ex) {

			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warn_building"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_building"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN SUPPRESSION BATIMENT +++++++++++++");
		init();
		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init BuildingServiceBean");
			buildingServicewsEndpoint = buildingServicews
					.getBuildingServicewsImplPort();

			listBuilding = buildingServicewsEndpoint.getAllBuildingServicews();
			logger.debug("end init BuildingServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

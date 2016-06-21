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
import org.sepro.parameterweb.serviceapi.BuildingDto;
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.BuildingDto.CleaningHours;
import org.sepro.parameterweb.serviceapi.ClasseDto.Dayofweek;
import org.sepro.parameterweb.serviceapi.CleanHoursDto;
import org.sepro.parameterweb.serviceapi.DaysofWeekDto;
import org.sepro.parameterweb.serviceapi.RoomInventoryDto;
import org.sepro.parameterweb.serviceapi.SubEstablishmentDto;
import org.sepro.parameterweb.serviceapi.TypeofClassDto;
import org.sepro.parameterweb.serviceimpl.BuildingServicews;
import org.sepro.parameterweb.serviceimpl.BuildingServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ClasseServicews;
import org.sepro.parameterweb.serviceimpl.ClasseServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CleanHoursServicews;
import org.sepro.parameterweb.serviceimpl.CleanHoursServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.DaysofWeekServicews;
import org.sepro.parameterweb.serviceimpl.DaysofWeekServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RoomInventoryServicews;
import org.sepro.parameterweb.serviceimpl.RoomInventoryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.TypeofClassServicews;
import org.sepro.parameterweb.serviceimpl.TypeofClassServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ClasseSearchServiceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ClasseSearchServiceBean.class);

	private ClasseServicews classeServicews = new ClasseServicews();
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private List<ClasseDto> listclasse = new ArrayList<ClasseDto>();
	private ClasseDto classeDto = new ClasseDto();
	private ClasseDto classDto = new ClasseDto();
	private ClasseDto selectedclasse = new ClasseDto();

	private RoomInventoryServicews roomInventoryServicews = new RoomInventoryServicews();
	private RoomInventoryServicewsEndpoint roomInventoryServicewsEndpoint;
	private List<RoomInventoryDto> listinventaire = new ArrayList<RoomInventoryDto>();
	private RoomInventoryDto roominventorydto = new RoomInventoryDto();
	private RoomInventoryDto roominventorrydto = new RoomInventoryDto();
	private RoomInventoryDto selectedinventaire = new RoomInventoryDto();

	private SubEstablishmentServicews sousetablissementServicews = new SubEstablishmentServicews();
	private SubEstablishmentServicewsEndpoint sousetablissementServicewsEndpoint;
	private List<SubEstablishmentDto> listsousetablissement = new ArrayList<SubEstablishmentDto>();

	private TypeofClassServicews typedeclasseServicews = new TypeofClassServicews();
	private TypeofClassServicewsEndpoint typedeclasseServicewsEndpoint;
	private List<TypeofClassDto> listtypedeclasse = new ArrayList<TypeofClassDto>();

	private BuildingServicews batimentServicews = new BuildingServicews();
	private BuildingServicewsEndpoint batimentServicewsEndpoint;
	private List<BuildingDto> listbatiment = new ArrayList<BuildingDto>();

	private DaysofWeekServicews dayofweekseServicews = new DaysofWeekServicews();
	private DaysofWeekServicewsEndpoint dayofweekserServicewsEndpoint;
	private List<DaysofWeekDto> listdayofweek = new ArrayList<DaysofWeekDto>();
	private List<DaysofWeekDto> listjoursource = new ArrayList<DaysofWeekDto>();
	private List<DaysofWeekDto> listjourdestination = new ArrayList<DaysofWeekDto>();

	

	private boolean action = false;
	private boolean test = false;

	public List<RoomInventoryDto> getListinventaire() {
		listinventaire = new ArrayList<RoomInventoryDto>();
		if (selectedclasse != null && selectedclasse.getIdClass() != null) {
			RoomInventoryDto roominventorydto1 = new RoomInventoryDto();
			roominventorydto1.setClasse(selectedclasse);
			List<RoomInventoryDto> listinventairetemp = roomInventoryServicewsEndpoint
					.getAllRoomInventoryServicews();
			for (RoomInventoryDto roomInventoryDto2 : listinventairetemp) {
				if (roomInventoryDto2.getClasse().getIdClass() == selectedclasse
						.getIdClass()) {
					listinventaire.add(roomInventoryDto2);
				}
			}
		}

		return listinventaire;
	}

	public RoomInventoryDto getSelectedinventaire() {
		return selectedinventaire;
	}

	public void setSelectedinventaire(RoomInventoryDto selectedinventaire) {
		this.selectedinventaire = selectedinventaire;
	}

	public RoomInventoryDto getRoominventorrydto() {
		return roominventorrydto;
	}

	public void setRoominventorrydto(RoomInventoryDto roominventorrydto) {
		this.roominventorrydto = roominventorrydto;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public void setListinventaire(List<RoomInventoryDto> listinventaire) {
		this.listinventaire = listinventaire;
	}

	public ClasseDto getSelectedclasse() {
		return selectedclasse;
	}

	public void setSelectedclasse(ClasseDto selectedclasse) {
		this.selectedclasse = selectedclasse;
	}


	public RoomInventoryDto getRoominventorydto() {
		return roominventorydto;
	}

	public void setRoominventorydto(RoomInventoryDto roominventorydto) {
		this.roominventorydto = roominventorydto;
	}


	public List<DaysofWeekDto> getListdayofweek() {
		return listdayofweek;
	}

	public void setListdayofweek(List<DaysofWeekDto> listdayofweek) {
		this.listdayofweek = listdayofweek;
	}

	public List<ClasseDto> getListclasse() {
		return listclasse;
	}

	public void setListclasse(List<ClasseDto> listclasse) {
		this.listclasse = listclasse;
	}

	public List<SubEstablishmentDto> getListsousetablissement() {
		return listsousetablissement;
	}

	public void setListsousetablissement(
			List<SubEstablishmentDto> listsousetablissement) {
		this.listsousetablissement = listsousetablissement;
	}

	public List<TypeofClassDto> getListtypedeclasse() {
		return listtypedeclasse;
	}

	public void setListtypedeclasse(List<TypeofClassDto> listtypedeclasse) {
		this.listtypedeclasse = listtypedeclasse;
	}

	public List<BuildingDto> getListbatiment() {
		return listbatiment;
	}

	public void setListbatiment(List<BuildingDto> listbatiment) {
		this.listbatiment = listbatiment;
	}

	public ClasseDto getClasseDto() {
		return classeDto;
	}

	public void setClasseDto(ClasseDto classeDto) {
		this.classeDto = classeDto;

	}

	public ClasseDto getClassDto() {
		return classDto;
	}

	public void setClassDto(ClasseDto classDto) {
		this.classDto = classDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public List<DaysofWeekDto> getListjoursource() {
		return listjoursource;
	}

	public void setListjoursource(List<DaysofWeekDto> listjoursource) {
		this.listjoursource = listjoursource;
	}

	public List<DaysofWeekDto> getListjourdestination() {
		return listjourdestination;
	}

	public void setListjourdestination(List<DaysofWeekDto> listjourdestination) {
		this.listjourdestination = listjourdestination;
	}

	public void createInventaire() {
		try {
			RoomInventoryDto inventaire = new RoomInventoryDto();
			inventaire.setClasse(selectedclasse);
			inventaire.setMaterial(roominventorydto.getMaterial());
			inventaire.setQuantity(roominventorydto.getQuantity());
			inventaire.setCommissioningDate(roominventorydto
					.getCommissioningDate());
			inventaire.setRef(roominventorydto.getRef());
			roomInventoryServicewsEndpoint = roomInventoryServicews
					.getRoomInventoryServicewsImplPort();
			inventaire = roomInventoryServicewsEndpoint
					.createRoomInventoryServicews(inventaire);
			init();
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_msg_create_inventaire")));

		} catch (Exception e) {

		}

	}

	public String updateInventaire() {
		RoomInventoryDto modifinventaire = new RoomInventoryDto();
		try {
			modifinventaire.setClasse(selectedclasse);
			modifinventaire.setMaterial(roominventorydto.getMaterial());
			modifinventaire.setQuantity(roominventorydto.getQuantity());
			modifinventaire.setCommissioningDate(roominventorydto
					.getCommissioningDate());
			modifinventaire.setRef(roominventorydto.getRef());
			roomInventoryServicewsEndpoint = roomInventoryServicews
					.getRoomInventoryServicewsImplPort();
			modifinventaire.setIdRoomInventory(roominventorydto
					.getIdRoomInventory());
			modifinventaire = roomInventoryServicewsEndpoint
					.updateRoomInventoryServicews(modifinventaire);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_inventaire")));
		return null;
	}

	public String supprimerInventaire() {
		
		try {
			roomInventoryServicewsEndpoint
					.deleteRoomInventoryServicews(roominventorrydto);
			init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_inventaire")));
			return null;

		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_inventaire")));
		return null;
		
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			classeDto = classDto;
			listsousetablissement = new ArrayList<SubEstablishmentDto>();
			listbatiment = new ArrayList<BuildingDto>();
			listtypedeclasse = new ArrayList<TypeofClassDto>();
			listjoursource = new ArrayList<DaysofWeekDto>();
			listjourdestination = new ArrayList<DaysofWeekDto>();
			initUpdate();
		} else {
			classeDto = new ClasseDto();
			listsousetablissement = new ArrayList<SubEstablishmentDto>();
			listbatiment = new ArrayList<BuildingDto>();
			listtypedeclasse = new ArrayList<TypeofClassDto>();
			listjoursource = new ArrayList<DaysofWeekDto>();
			listjourdestination = new ArrayList<DaysofWeekDto>();
			initCreate();
		}
	}

	public void initDualListInventaire(String caction) {
		if (caction.equals("1")) {
			roominventorydto = selectedinventaire;
			initUpdateInventaire();
		} else {
			roominventorydto = new RoomInventoryDto();
			try {

				if (selectedclasse != null) {
					roomInventoryServicewsEndpoint = roomInventoryServicews
							.getRoomInventoryServicewsImplPort();
					roominventorydto.setClasse(selectedclasse);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			initCreateInventaire();
		}
	}

	public void initUpdate() {
		try {
			action = false;
			listsousetablissement = new ArrayList<SubEstablishmentDto>();
			sousetablissementServicewsEndpoint = sousetablissementServicews
					.getSubEstablishmentServicewsImplPort();
			listsousetablissement = sousetablissementServicewsEndpoint
					.getAllSubEstablishmentServicews();
			listtypedeclasse = new ArrayList<TypeofClassDto>();
			typedeclasseServicewsEndpoint = typedeclasseServicews
					.getTypeofClassServicewsImplPort();
			listtypedeclasse = typedeclasseServicewsEndpoint
					.getAllTypeofClassServicews();
			listbatiment = new ArrayList<BuildingDto>();
			batimentServicewsEndpoint = batimentServicews
					.getBuildingServicewsImplPort();
			listbatiment = batimentServicewsEndpoint.getAllBuildingServicews();
			listdayofweek = new ArrayList<DaysofWeekDto>();
			dayofweekserServicewsEndpoint = dayofweekseServicews
					.getDaysofWeekServicewsImplPort();
			listdayofweek = dayofweekserServicewsEndpoint
					.getAllDaysofWeekServicews();
			

			if (classeDto != null) {
				classeServicewsEndpoint = classeServicews
						.getClasseServicewsImplPort();
				listjoursource = dayofweekserServicewsEndpoint
						.getAllDaysofWeekServicews();
				if (classeDto != null) {
					for (DaysofWeekDto day : classeDto.getDayofweek()
							.getDayofweek()) {
						for (DaysofWeekDto jour : listjoursource) {
							if (jour.getIdDayofWeek() == day.getIdDayofWeek()) {
								listjourdestination.add(jour);
								break;
							}
						}
					}
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initUpdateInventaire() {
		try {
			test = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			action = true;
			sousetablissementServicewsEndpoint = sousetablissementServicews
					.getSubEstablishmentServicewsImplPort();
			listsousetablissement = sousetablissementServicewsEndpoint
					.getAllSubEstablishmentServicews();
			typedeclasseServicewsEndpoint = typedeclasseServicews
					.getTypeofClassServicewsImplPort();
			listtypedeclasse = typedeclasseServicewsEndpoint
					.getAllTypeofClassServicews();
			batimentServicewsEndpoint = batimentServicews
					.getBuildingServicewsImplPort();
			listbatiment = batimentServicewsEndpoint.getAllBuildingServicews();
			dayofweekserServicewsEndpoint = dayofweekseServicews
					.getDaysofWeekServicewsImplPort();
			listdayofweek = dayofweekserServicewsEndpoint
					.getAllDaysofWeekServicews();
			listjoursource = dayofweekserServicewsEndpoint
					.getAllDaysofWeekServicews();
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreateInventaire() {
		try {
			test = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			listclasse = classeServicewsEndpoint.getAllClasseServicews();
			roomInventoryServicewsEndpoint = roomInventoryServicews
					.getRoomInventoryServicewsImplPort();
			listinventaire = roomInventoryServicewsEndpoint
					.getAllRoomInventoryServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initInventaire() {
		roominventorydto = new RoomInventoryDto();

	}

	public void createClasse() {
		ClasseDto classe = new ClasseDto();
		Dayofweek dayofweek = new Dayofweek();
		dayofweek.getDayofweek().addAll(listjourdestination);
		classe.setDayofweek(dayofweek);
		
		classe.setBuildiing(classeDto.getBuildiing());
		classe.setEndingHour(classeDto.getEndingHour());
		classe.setLocation(classeDto.getLocation());
		classe.setNameOfClass(classeDto.getNameOfClass());
		classe.setNumberOfSeats(classeDto.getNumberOfSeats());
		classe.setStartingHour(classeDto.getStartingHour());
		classe.setSubestablishment(classeDto.getSubestablishment());
		classe.setTelephoneNumber(classeDto.getTelephoneNumber());
		classe.setTypeOfClass(classeDto.getTypeOfClass());

		classeServicewsEndpoint = classeServicews.getClasseServicewsImplPort();
		classe = classeServicewsEndpoint.createClasseServicews(classe);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_classe")));

	}

	public String updateClasse() {
		ClasseDto classe = new ClasseDto();
		try {

			Dayofweek dayofweek = new Dayofweek();
			dayofweek.getDayofweek().addAll(listjourdestination);
			classe.setDayofweek(dayofweek);

			classe.setBuildiing(classeDto.getBuildiing());
			classe.setEndingHour(classeDto.getEndingHour());
			classe.setLocation(classeDto.getLocation());
			classe.setNameOfClass(classeDto.getNameOfClass());
			classe.setNumberOfSeats(classeDto.getNumberOfSeats());
			classe.setStartingHour(classeDto.getStartingHour());
			classe.setSubestablishment(classeDto.getSubestablishment());
			classe.setTelephoneNumber(classeDto.getTelephoneNumber());
			classe.setTypeOfClass(classeDto.getTypeOfClass());

			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			classe.setIdClass(classeDto.getIdClass());
			classe = classeServicewsEndpoint.updateClasseServicews(classe);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_classe")));
		return null;
	}

	public String supprimerClasse() {
		try {
			classeServicewsEndpoint.deleteClasseServicews(classDto);
			init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_classe")));
			return null;

		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_classe")));
		return null;
	}

}

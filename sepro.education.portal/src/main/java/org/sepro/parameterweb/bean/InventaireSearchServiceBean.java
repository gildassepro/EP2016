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
import org.sepro.parameterweb.serviceapi.ClasseDto;
import org.sepro.parameterweb.serviceapi.RoomInventoryDto;
import org.sepro.parameterweb.serviceimpl.ClasseServicews;
import org.sepro.parameterweb.serviceimpl.ClasseServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RoomInventoryServicews;
import org.sepro.parameterweb.serviceimpl.RoomInventoryServicewsEndpoint;

@ManagedBean
@ViewScoped
public class InventaireSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(InventaireSearchServiceBean.class);

	private RoomInventoryServicews roomInventoryServicews = new RoomInventoryServicews();
	private RoomInventoryServicewsEndpoint roomInventoryServicewsEndpoint;
	private List<RoomInventoryDto> listmateriels = new ArrayList<RoomInventoryDto>();
	private RoomInventoryDto roominventorydto = new RoomInventoryDto();
	private RoomInventoryDto roominventorrydto = new RoomInventoryDto();

	private ClasseServicews classeServicews = new ClasseServicews();
	private ClasseServicewsEndpoint classeServicewsEndpoint;
	private List<ClasseDto> listclasse = new ArrayList<ClasseDto>();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean test = true;

	
	
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

	public List<ClasseDto> getListclasse() {
		return listclasse;
	}

	public void setListclasse(List<ClasseDto> listclasse) {
		this.listclasse = listclasse;
	}

	public RoomInventoryDto getRoominventorrydto() {
		return roominventorrydto;
	}

	public void setRoominventorrydto(RoomInventoryDto roominventorrydto) {
		this.roominventorrydto = roominventorrydto;
	}

	public List<RoomInventoryDto> getListmateriels() {
		return listmateriels;
	}

	public void setListmateriels(List<RoomInventoryDto> listmateriels) {
		this.listmateriels = listmateriels;
	}

	public RoomInventoryDto getRoominventorydto() {
		return roominventorydto;
	}

	public void setRoominventorydto(RoomInventoryDto roominventorydto) {
		this.roominventorydto = roominventorydto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			roominventorydto = roominventorrydto;
			listclasse = new ArrayList<ClasseDto>();
			action2 = true;
			action3= false;
			test = false;
			initUpdate();
		} else {
			roominventorydto = new RoomInventoryDto();
			listclasse = new ArrayList<ClasseDto>();
			action2 = true;
			action3= false;
			test = false;
			initCreate();
		}
		logger.debug("DEBUT initDualList +++++++++++++");
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;
			listclasse = new ArrayList<ClasseDto>();
			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			listclasse = classeServicewsEndpoint.getAllClasseServicews();
			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			classeServicewsEndpoint = classeServicews
					.getClasseServicewsImplPort();
			listclasse = classeServicewsEndpoint.getAllClasseServicews();
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init ClasseSearchServiceBean");
			roomInventoryServicewsEndpoint = roomInventoryServicews
					.getRoomInventoryServicewsImplPort();
			listmateriels = roomInventoryServicewsEndpoint
					.getAllRoomInventoryServicews();
			logger.debug("end init ClasseCreateServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createInventaire() {
		logger.debug("DEBUT createInventaire +++++++++++++");
		RoomInventoryDto inventaire = new RoomInventoryDto();
		inventaire.setClasse(roominventorydto.getClasse());
		inventaire.setMaterial(roominventorydto.getMaterial());
		inventaire.setQuantity(roominventorydto.getQuantity());
		roomInventoryServicewsEndpoint = roomInventoryServicews
				.getRoomInventoryServicewsImplPort();
		inventaire = roomInventoryServicewsEndpoint
				.createRoomInventoryServicews(inventaire);
		init();
		logger.debug("FIN createinventaire +++++++++++++");
		logger.debug("begin exception Exception");
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_inventaire")));

	}

	public String updateInventaire() {
		logger.debug("DEBUT modifier Inventaire +++++++++++++");
		RoomInventoryDto modifinventaire = new RoomInventoryDto();
		try {
			modifinventaire.setClasse(roominventorydto.getClasse());
			modifinventaire.setMaterial(roominventorydto.getMaterial());
			modifinventaire.setQuantity(roominventorydto.getQuantity());
			roomInventoryServicewsEndpoint = roomInventoryServicews
					.getRoomInventoryServicewsImplPort();
			modifinventaire.setIdRoomInventory(modifinventaire
					.getIdRoomInventory());
			logger.debug("id inventaire ="
					+ roominventorydto.getIdRoomInventory());
			modifinventaire = roomInventoryServicewsEndpoint
					.updateRoomInventoryServicews(modifinventaire);
			init();
			logger.debug("FIN modifier inventaire +++++++++++++");
		} catch (Exception ex) {

			return null;
		}
		logger.debug("begin exception Exception");
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_inventaire")));
		return null;
	}

	public String supprimerInventaire() {
		try {
			logger.debug("DEBUT Suppression INVENTAIRE @@@@@@@@@@@");
			roomInventoryServicewsEndpoint
					.deleteRoomInventoryServicews(roominventorrydto);
			logger.debug("FIN Suppression INVENTAIRE @@@@@@@@@@@");
			init();
		} catch (Exception e) {
			logger.debug("begin exception Exception");
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_inventaire")));
			return null;

		}

		logger.debug("begin exception Exception");
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_inventaire")));
		return null;
	}

}

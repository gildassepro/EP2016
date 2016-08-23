package org.sepro.parameterweb.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
import org.sepro.parameterweb.serviceimpl.CityServicews;
import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RegionServicews;
import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ZipServicews;
import org.sepro.parameterweb.serviceimpl.ZipServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ZipCodeSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ZipCodeSearchServiceBean.class);
	private ZipServicews zipServicews = new ZipServicews();
	private ZipServicewsEndpoint zipServicewsEndpoint;
	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;

	private ZipcodeDto zipcodeDto = new ZipcodeDto();
	private ZipcodeDto zipscodeDto = new ZipcodeDto();
	private List<ZipcodeDto> listZipcode = new ArrayList<ZipcodeDto>();

	private String zipcode = new String();
	private String description = new String();

	private CityDto city = new CityDto();
	private List<CityDto> listCity = new ArrayList<CityDto>();

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

	public ZipcodeDto getZipcodeDto() {
		return zipcodeDto;
	}

	public void setZipcodeDto(ZipcodeDto zipcodeDto) {
		this.zipcodeDto = zipcodeDto;
	}

	public ZipcodeDto getZipscodeDto() {
		return zipscodeDto;
	}

	public void setZipscodeDto(ZipcodeDto zipscodeDto) {
		this.zipscodeDto = zipscodeDto;
	}

	public List<ZipcodeDto> getListZipcode() {
		return listZipcode;
	}

	public void setListZipcode(List<ZipcodeDto> listZipcode) {
		this.listZipcode = listZipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CityDto getCity() {
		return city;
	}

	public void setCity(CityDto city) {
		this.city = city;
	}

	public List<CityDto> getListCity() {
		return listCity;
	}

	public void setListCity(List<CityDto> listCity) {
		this.listCity = listCity;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void createZipCode() {
		logger.debug("DEBUT createZIPCODE +++++++++++++");
		FacesMessage msg = null;

		ZipcodeDto zipcodecreate = new ZipcodeDto();
		zipcodecreate.setCity(zipcodeDto.getCity());
		zipcodecreate.setZipCode(zipcodeDto.getZipCode());
		zipcodecreate.setAreaName(zipcodeDto.getAreaName());

		zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
		zipcodecreate = zipServicewsEndpoint
				.createZipcodeServicews(zipcodecreate);

		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_zipcode"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN createZIPCODE +++++++++++++");
	}

	public String updateZipCode() {
		logger.debug("DEBUT modifierZipCode");
		FacesMessage msg = null;
		ZipcodeDto zipcodemodif = new ZipcodeDto();
		try {

			logger.debug("Code Postale  " + zipcodeDto.getZipCode());

			zipcodemodif.setCity(zipcodeDto.getCity());
			zipcodemodif.setZipCode(zipcodeDto.getZipCode());
			zipcodemodif.setAreaName(zipcodeDto.getAreaName());

			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
			zipcodemodif.setIdZipcode(zipcodeDto.getIdZipcode());
			zipcodemodif = zipServicewsEndpoint
					.updateZipcodeServicews(zipcodemodif);
			init();

		} catch (Exception ex) {
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_zipcode"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

		logger.debug("Fin Modification ZipCode  +++++++++++++");
		return null;
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			zipcodeDto = zipscodeDto;
			listCity = new ArrayList<CityDto>();
			action2 = true;
			action3= false;
			test = false;
			initUpdate();
		} else {
			zipcodeDto = new ZipcodeDto();
			listCity = new ArrayList<CityDto>();
			action2 = true;
			test = false;
			action3= false;
			initCreate();
		}
		logger.debug("DEBUT initDualList +++++++++++++");
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			listCity = cityServicewsEndpoint.getAllCityServicews();

			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerZipCode() {
		logger.debug("DEBUT Suppression ZipCode +++++++++++++");
		FacesMessage msg = null;

		try {
			zipServicewsEndpoint.deleteZipcodeServicews(zipscodeDto);
			init();

		} catch (Exception ex) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_warn_delete_zipcode"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_zipcode"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN SuppressionZipCode +++++++++++++");

		return null;
	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			listCity = cityServicewsEndpoint.getAllCityServicews();
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init ZipCodeServiceBean");
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
			listZipcode = zipServicewsEndpoint.getAllZipcodeServicews();
			logger.debug("end init ZipCodeServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

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
import org.sepro.parameterweb.serviceimpl.CityServicews;
import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RegionServicews;
import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;

@ManagedBean
@ViewScoped
public class CitySearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(CitySearchServiceBean.class);
	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;
	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;

	private CityDto cityDto = new CityDto();
	private CityDto citiesDto = new CityDto();
	private List<CityDto> listCity = new ArrayList<CityDto>();

	private String citycode = new String();
	private String cityname = new String();
	private RegionDto region = new RegionDto();
	private List<RegionDto> listRegion = new ArrayList<RegionDto>();

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

	public CityDto getCityDto() {
		return cityDto;
	}

	public void setCityDto(CityDto cityDto) {
		this.cityDto = cityDto;
	}

	public CityDto getCitiesDto() {
		return citiesDto;
	}

	public void setCitiesDto(CityDto citiesDto) {
		this.citiesDto = citiesDto;
	}

	public List<CityDto> getListCity() {
		return listCity;
	}

	public void setListCity(List<CityDto> listCity) {
		this.listCity = listCity;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public RegionDto getRegion() {
		return region;
	}

	public void setRegion(RegionDto region) {
		this.region = region;
	}

	public List<RegionDto> getListRegion() {
		return listRegion;
	}

	public void setListRegion(List<RegionDto> listRegion) {
		this.listRegion = listRegion;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void createCity() {
		logger.debug("DEBUT createVille +++++++++++++");
		FacesMessage msg = null;
		CityDto citycreate = new CityDto();

		citycreate.setRegion(cityDto.getRegion());
		citycreate.setCityCode(cityDto.getCityCode());
		citycreate.setCityName(cityDto.getCityName());

		cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
		citycreate = cityServicewsEndpoint.createCityServicews(citycreate);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_ville"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN createVille +++++++++++++");
	}

	public String updateCity() {
		logger.debug("DEBUT modifierCity");
		CityDto citymodif = new CityDto();
		FacesMessage msg = null;
		try {

			logger.debug("City Name  " + cityDto.getCityName());
			citymodif.setRegion(cityDto.getRegion());
			citymodif.setCityCode(cityDto.getCityCode());
			citymodif.setCityName(cityDto.getCityName());

			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			citymodif.setIdCity(cityDto.getIdCity());
			citymodif = cityServicewsEndpoint.updateCityServicews(citymodif);
			init();

		} catch (Exception ex) {
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_ville"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("Fin Modification City  +++++++++++++");
		return null;
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			cityDto = citiesDto;
			listRegion = new ArrayList<RegionDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			cityDto = new CityDto();
			listRegion = new ArrayList<RegionDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
		logger.debug("DEBUT initDualList +++++++++++++");
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			listRegion = regionServicewsEndpoint.getAllRegionServicews();

			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerCity() {
		
		logger.debug("DEBUT Suppresssion Ville +++++++++++++");
		FacesMessage msg = null;
		try {
			cityServicewsEndpoint.deleteCityServicews(citiesDto);
			init();
			
		}catch(Exception e){
			
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_warn_delete_city"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_ville"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
		
	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			listRegion = regionServicewsEndpoint.getAllRegionServicews();
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init CityServiceBean");
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			listCity = cityServicewsEndpoint.getAllCityServicews();
			logger.debug("end init CityServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

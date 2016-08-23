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

import org.apache.log4j.Logger;
import org.aspectj.apache.bcel.generic.ReturnaddressType;

import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto.Modules;
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
public class RegionSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(RegionSearchServiceBean.class);
	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;
	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;
	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private RegionDto regionsDto = new RegionDto();
	private CityDto cityDto = new CityDto();

	private List<RegionDto> listRegion = new ArrayList<RegionDto>();
	private String regioncode = new String();
	private String regionname = new String();
	private CountryDto country = new CountryDto();
	private List<CountryDto> listCountry = new ArrayList<CountryDto>();

	private boolean action = false;
	
	private boolean action2 = false;
	private boolean action3 = true;
	private boolean test = true;
	private RegionDto regionDto = new RegionDto();

	
	
	
	
	
	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public boolean isAction3() {
		return action3;
	}

	public void setAction3(boolean action3) {
		this.action3 = action3;
	}

	public boolean isAction2() {
		return action2;
	}

	public void setAction2(boolean action2) {
		this.action2 = action2;
	}

	public CityDto getCityDto() {
		return cityDto;
	}

	public void setCityDto(CityDto cityDto) {
		this.cityDto = cityDto;
	}

	public String getRegioncode() {
		return regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	public List<RegionDto> getListRegion() {
		return listRegion;
	}

	public void setListRegion(List<RegionDto> listRegion) {
		this.listRegion = listRegion;
	}

	public List<CountryDto> getListCountry() {
		return listCountry;
	}

	public void setListCountry(List<CountryDto> listCountry) {
		this.listCountry = listCountry;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public CountryDto getCountry() {
		return country;
	}

	public void setCountry(CountryDto country) {
		this.country = country;
	}

	public RegionDto getRegionDto() {
		return regionDto;
	}

	public void setRegionDto(RegionDto regionDto) {
		this.regionDto = regionDto;
	}

	public RegionDto getRegionsDto() {
		return regionsDto;
	}

	public void setRegionsDto(RegionDto regionsDto) {
		this.regionsDto = regionsDto;
	}

	public String updateRegion() {
		logger.debug("DEBUT modifierRegion");
		RegionDto regionmodif = new RegionDto();
		FacesMessage msg = null;
		try {
			regionmodif.setCountry(regionDto.getCountry());
			regionmodif.setRegionCode(regionDto.getRegionCode());
			regionmodif.setRegionName(regionDto.getRegionName());

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			regionmodif.setIdRegion(regionDto.getIdRegion());
			regionmodif = regionServicewsEndpoint
					.updateRegionServicews(regionmodif);
			init();
			logger.debug("Fin Modification Region  +++++++++++++");
		} catch (Exception ex) {
			
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_region"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;

	}

	public void createRegion() {
		logger.debug("DEBUT createRegion +++++++++++++");
		FacesMessage msg = null;
		RegionDto regioncreate = new RegionDto();	

		regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
		regioncreate = regionServicewsEndpoint
				.createRegionServicews(regionDto);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_region"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN createRegion +++++++++++++");
	}

	public String initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			regionDto = regionsDto;
			listCountry = new ArrayList<CountryDto>();
			action2 = true;
			action3= false;
			test = false;
			initUpdate();
			return null;
		} else {
			regionDto = new RegionDto();
			listCountry = new ArrayList<CountryDto>();
			action2 = true;
			action3= false;
			test = false;
			initCreate();
			return null;
		}
		
		
	}
	
	public void reinitialiser(){
		init();
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;
	
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listCountry = countryServicewsEndpoint.getAllCountryServicews();

			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerRegion() {
		FacesMessage msg = null;
		logger.debug("DEBUT SuppressionRegion +++++++++++++");
		try {
			
			regionServicewsEndpoint.deleteRegionServicews(regionsDto);
			init();
		}catch(Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_warn_delete_region"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_region"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listCountry = countryServicewsEndpoint.getAllCountryServicews();
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init RegionServiceBean");
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			listRegion = regionServicewsEndpoint.getAllRegionServicews();
			logger.debug("end init RegionServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

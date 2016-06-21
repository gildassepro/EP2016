//package org.sepro.etablissementweb.bean;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Locale;
//import java.util.ResourceBundle;
//
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.context.FacesContext;
//
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
//import org.sepro.parameterweb.bean.CountrySearchServiceBean;
//import org.sepro.parameterweb.serviceapi.CityDto;
//import org.sepro.parameterweb.serviceapi.CountryDto;
//import org.sepro.parameterweb.serviceapi.LanguageDto;
//import org.sepro.parameterweb.serviceapi.PhoneFormatDto;
//import org.sepro.parameterweb.serviceapi.RegionDto;
//import org.sepro.parameterweb.serviceimpl.CityServicews;
//import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
//import org.sepro.parameterweb.serviceimpl.CountryServicews;
//import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
//import org.sepro.parameterweb.serviceimpl.RegionServicews;
//import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;
//
//
//
//
//@ManagedBean
//@ViewScoped
//public class EtablissementSearchServiceBean implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	private Locale locale = FacesContext.getCurrentInstance()     
//			.getExternalContext().getRequestLocale();
//	ResourceBundle rb = ResourceBundle.getBundle(
//			"sepro.education.language.messages", locale);
//	private Logger logger = Logger.getLogger(EtablissementSearchServiceBean.class);
//	
//	private CountryServicews countryServicews = new CountryServicews();
//	private CountryServicewsEndpoint countryServicewsEndpoint;
//	
//	private RegionServicews regionServicews = new RegionServicews();
//	private RegionServicewsEndpoint regionServicewsEndpoint;
//	
//	private CityServicews cityServicews = new CityServicews();
//	private CityServicewsEndpoint  cityServicewsEndpoint;
//	
//	private List<CountryDto> listcountry  = new ArrayList<CountryDto>();
//	private List<RegionDto> listregion = new ArrayList<RegionDto>();
//	private List<CityDto> listcity = new ArrayList<CityDto>();
//	
//	private CountryDto country = new CountryDto();
//	private RegionDto region = new RegionDto();
//	private CityDto city = new CityDto(); 
//	
//	private boolean action = false;
//
//	public List<CountryDto> getListcountry() {
//		return listcountry;
//	}
//
//	public void setListcountry(List<CountryDto> listcountry) {
//		this.listcountry = listcountry;
//	}
//
//	public List<RegionDto> getListregion() {
//		return listregion;
//	}
//
//	public void setListregion(List<RegionDto> listregion) {
//		this.listregion = listregion;
//	}
//
//	public List<CityDto> getListcity() {
//		return listcity;
//	}
//
//	public void setListcity(List<CityDto> listcity) {
//		this.listcity = listcity;
//	}
//
//	public CountryDto getCountry() {
//		return country;
//	}
//
//	public void setCountry(CountryDto country) {
//		this.country = country;
//	}
//
//	public RegionDto getRegion() {
//		return region;
//	}
//
//	public void setRegion(RegionDto region) {
//		this.region = region;
//	}
//
//	public CityDto getCity() {
//		return city;
//	}
//
//	public void setCity(CityDto city) {
//		this.city = city;
//	}
//
//	public boolean isAction() {
//		return action;
//	}
//
//	public void setAction(boolean action) {
//		this.action = action;
//	}
//	
//	public void initDualList(String baction){
//		logger.debug("DEBUT initDualList +++++++++++++");
//		if(baction.equals("1")){
//	//		 countryDto = contryDto ;
//			listcity = new ArrayList<CityDto>();
//			listregion = new ArrayList<RegionDto>();
//			listcountry = new ArrayList<CountryDto>();
//			initUpdate();
//		}else{
//	//		countryDto = new CountryDto();
//			listcity = new ArrayList<CityDto>();
//			listregion = new ArrayList<RegionDto>();
//			listcountry = new ArrayList<CountryDto>();
//			initCreate();
//		}
//		logger.debug("DEBUT initDualList +++++++++++++");
//	}
//	
//	public void initUpdate() {
//		try {
//			logger.debug("end initUpdate");
//			action=false;
//			
//			 listcity = new ArrayList<CityDto>();
//			 cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
//			 listcity = cityServicewsEndpoint.getAllCityServicews();
//			listregion = new ArrayList<RegionDto>();
//			regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
//			listregion = regionServicewsEndpoint.getAllRegionServicews();
//			listcountry = new ArrayList<CountryDto>();
//			countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
//			listcountry = countryServicewsEndpoint.getAllCountryServicews();
//			logger.debug("fin dual");
//
//			logger.debug("end init initUpdate");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public void initCreate() {
//		try {
//			logger.debug("fin initCreate");
//			action=true;
//			 cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
//			 listcity = cityServicewsEndpoint.getAllCityServicews();
//			 regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
//				listregion = regionServicewsEndpoint.getAllRegionServicews();
//				countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
//				listcountry = countryServicewsEndpoint.getAllCountryServicews();
//			
//			logger.debug("end init initCreate");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	@PostConstruct
//	public void init() {
//		logger.setLevel(Level.DEBUG);
//		try {
//			logger.debug("begin init CountrySearchServiceBean");
//            countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
//			listcountry = countryServicewsEndpoint.getAllCountryServicews();
//			 regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
//				listregion = regionServicewsEndpoint.getAllRegionServicews();
//				 cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
//				 listcity = cityServicewsEndpoint.getAllCityServicews();
//			logger.debug("end init CountryCreateServiceBean");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//	
//	public void createCountry() {
//		logger.debug("DEBUT createCountry +++++++++++++");
//		
//		
//		init();
//		logger.debug("FIN createcountry +++++++++++++");
//	}
//	
//	
//	   public void updateCountry(){
//		   
//		   logger.debug("DEBUT @@@@@@@@ update country");
//		  
//			
//			init();
//			logger.debug("Fin Modification Region  +++++++++++++");
//		
//	   }
//	   
//	   public void supprimerCountry() {
//		 
//			   logger.debug("DEBUT Suppression Country @@@@@@@@@@@");
//			  
//				  
//					logger.debug("FIN Suppression Country @@@@@@@@@@@");
//				init();	
//	   }		
//		
//	
//	
//	
//	
//
//}

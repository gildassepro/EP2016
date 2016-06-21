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
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.LanguageDto;
import org.sepro.parameterweb.serviceapi.PhoneFormatDto;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.LanguageServicews;
import org.sepro.parameterweb.serviceimpl.LanguageServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PhoneFormatServicews;
import org.sepro.parameterweb.serviceimpl.PhoneFormatServicewsEndpoint;

@ManagedBean
@ViewScoped
public class CountrySearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(CountrySearchServiceBean.class);

	private LanguageServicews languageServicews = new LanguageServicews();
	private LanguageServicewsEndpoint languageServicewsEndpoint;

	private PhoneFormatServicews phoneFormatServicews = new PhoneFormatServicews();
	private PhoneFormatServicewsEndpoint phoneFormatServicewsEndpoint;

	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private List<CountryDto> listcountry = new ArrayList<CountryDto>();
	private CountryDto countryDto = new CountryDto();
	private CountryDto contryDto = new CountryDto();

	private List<LanguageDto> listlanguage = new ArrayList<LanguageDto>();
	private List<PhoneFormatDto> listmobilephoneformat = new ArrayList<PhoneFormatDto>();
	private List<PhoneFormatDto> listlanphoneformat = new ArrayList<PhoneFormatDto>();
	private LanguageDto language = new LanguageDto();

	private boolean action = false;

	public LanguageDto getLanguage() {
		return language;
	}

	public void setLanguage(LanguageDto language) {
		this.language = language;
	}

	public List<PhoneFormatDto> getListmobilephoneformat() {
		return listmobilephoneformat;
	}

	public void setListmobilephoneformat(
			List<PhoneFormatDto> listmobilephoneformat) {
		this.listmobilephoneformat = listmobilephoneformat;
	}

	public List<PhoneFormatDto> getListlanphoneformat() {
		return listlanphoneformat;
	}

	public void setListlanphoneformat(List<PhoneFormatDto> listlanphoneformat) {
		this.listlanphoneformat = listlanphoneformat;
	}

	public List<LanguageDto> getListlanguage() {
		return listlanguage;
	}

	public void setListlanguage(List<LanguageDto> listlanguage) {
		this.listlanguage = listlanguage;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public CountryDto getCountryDto() {
		return countryDto;
	}

	public void setCountryDto(CountryDto countryDto) {
		this.countryDto = countryDto;
	}

	public CountryDto getContryDto() {
		return contryDto;
	}

	public void setContryDto(CountryDto contryDto) {
		this.contryDto = contryDto;
	}

	public List<CountryDto> getListcountry() {
		return listcountry;
	}

	public void setListcountry(List<CountryDto> listcountry) {
		this.listcountry = listcountry;
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			countryDto = contryDto;
			listlanguage = new ArrayList<LanguageDto>();
			listmobilephoneformat = new ArrayList<PhoneFormatDto>();
			listlanphoneformat = new ArrayList<PhoneFormatDto>();
			initUpdate();
		} else {
			countryDto = new CountryDto();
			listlanguage = new ArrayList<LanguageDto>();
			listmobilephoneformat = new ArrayList<PhoneFormatDto>();
			listlanphoneformat = new ArrayList<PhoneFormatDto>();
			initCreate();
		}
	}

	public void initUpdate() {
		try {
			action = false;
			listlanguage = new ArrayList<LanguageDto>();
			languageServicewsEndpoint = languageServicews
					.getLanguageServicewsImplPort();
			listlanguage = languageServicewsEndpoint.getAllLanguageServicews();
			listmobilephoneformat = new ArrayList<PhoneFormatDto>();
			phoneFormatServicewsEndpoint = phoneFormatServicews
					.getPhoneFormatServicewsImplPort();
			listmobilephoneformat = phoneFormatServicewsEndpoint
					.getAllPhoneFormatServicews();
			listlanphoneformat = new ArrayList<PhoneFormatDto>();
			phoneFormatServicewsEndpoint = phoneFormatServicews
					.getPhoneFormatServicewsImplPort();
			listlanphoneformat = phoneFormatServicewsEndpoint
					.getAllPhoneFormatServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			action = true;
			languageServicewsEndpoint = languageServicews
					.getLanguageServicewsImplPort();
			listlanguage = languageServicewsEndpoint.getAllLanguageServicews();
			phoneFormatServicewsEndpoint = phoneFormatServicews
					.getPhoneFormatServicewsImplPort();
			listmobilephoneformat = phoneFormatServicewsEndpoint
					.getAllPhoneFormatServicews();
			listlanphoneformat = phoneFormatServicewsEndpoint
					.getAllPhoneFormatServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listcountry = countryServicewsEndpoint.getAllCountryServicews();
			logger.debug("end init CountryCreateServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createCountry() {
		CountryDto count = new CountryDto();
		count.setIsoCountryCode(countryDto.getIsoCountryCode());
		count.setAlpha2(countryDto.getAlpha2());
		count.setAlpha3(countryDto.getAlpha3());
		count.setCountryName(countryDto.getCountryName());
		count.setLanPhoneFormat(countryDto.getLanPhoneFormat());
		count.setMobilePhoneFormat(countryDto.getMobilePhoneFormat());
		count.setLanguage(countryDto.getLanguage());

		countryServicewsEndpoint = countryServicews
				.getCountryServicewsImplPort();
		count = countryServicewsEndpoint.createCountryServicews(count);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_country")));

	}

	public String updateCountry() {
		CountryDto modifcount = new CountryDto();

		try {
			modifcount.setLanguage(countryDto.getLanguage());
			modifcount.setAlpha2(countryDto.getAlpha2());
			modifcount.setAlpha3(countryDto.getAlpha3());
			modifcount.setCountryName(countryDto.getCountryName());
			modifcount.setIsoCountryCode(countryDto.getIsoCountryCode());
			modifcount.setLanPhoneFormat(countryDto.getLanPhoneFormat());
			modifcount.setMobilePhoneFormat(countryDto.getMobilePhoneFormat());

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			modifcount.setIdCountry(countryDto.getIdCountry());
			modifcount = countryServicewsEndpoint
					.updateCountyServicews(modifcount);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_pays")));
		return null;

	}

	public String supprimerCountry() {
		
		try {
			countryServicewsEndpoint.deleteCountryServicews(contryDto);
			init();
		}catch (Exception e){
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_country")));
			return null;

		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_country")));
		return null;
	}
		
}

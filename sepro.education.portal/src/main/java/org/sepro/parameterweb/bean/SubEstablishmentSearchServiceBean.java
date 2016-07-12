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
import org.primefaces.event.FlowEvent;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.EstablishmentDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.SubEstablishmentDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
import org.sepro.parameterweb.serviceimpl.CityServicews;
import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RegionServicews;
import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.SubEstablishmentServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ZipServicews;
import org.sepro.parameterweb.serviceimpl.ZipServicewsEndpoint;
import org.w3c.dom.ls.LSInput;

import sepro.education.web.util.FormatNumberPhoneUtil;

@ManagedBean
@ViewScoped
public class SubEstablishmentSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(SubEstablishmentSearchServiceBean.class);
	private SubEstablishmentServicews subEstablishmentServicews = new SubEstablishmentServicews();
	private SubEstablishmentServicewsEndpoint subEstablishmentServicewsEndpoint;
	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;
	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;
	private ZipServicews zipServicews = new ZipServicews();
	private ZipServicewsEndpoint zipServicewsEndpoint;
	private SubEstablishmentDto subEstablishmentDto = new SubEstablishmentDto();
	private SubEstablishmentDto subEstablishmentsDto = new SubEstablishmentDto();
	private List<SubEstablishmentDto> listSubEstablishment = new ArrayList<SubEstablishmentDto>();
	private List<CountryDto> listCountry = new ArrayList<CountryDto>();
	private List<RegionDto> listRegion = new ArrayList<RegionDto>();
	private List<CityDto> listCity = new ArrayList<CityDto>();
	private List<ZipcodeDto> listZipCode = new ArrayList<ZipcodeDto>();
	private boolean skip;
	private CountryDto countryDto = new CountryDto();
	private RegionDto region = new RegionDto();
	private CityDto cityDto = new CityDto();
	private ZipcodeDto zipcodeDto = new ZipcodeDto();
	private RegionDto regionDto = new RegionDto();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	
	public boolean status;
	private String maskphonformatadresse;
	private String maskphonformatgerant;
	private String maskphonformatcontact;

	private EstablishmentServicews establishmentServicews = new EstablishmentServicews();
	private EstablishmentServicewsEndpoint establishmentServicewsEndpoint;
	private List<EstablishmentDto> listetablissement = new ArrayList<EstablishmentDto>();

	
	
	
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

	public String getMaskphonformatadresse() {
		return maskphonformatadresse;
	}

	public void setMaskphonformatadresse(String maskphonformatadresse) {
		this.maskphonformatadresse = maskphonformatadresse;
	}

	public String getMaskphonformatgerant() {
		return maskphonformatgerant;
	}

	public void setMaskphonformatgerant(String maskphonformatgerant) {
		this.maskphonformatgerant = maskphonformatgerant;
	}

	public String getMaskphonformatcontact() {
		return maskphonformatcontact;
	}

	public void setMaskphonformatcontact(String maskphonformatcontact) {
		this.maskphonformatcontact = maskphonformatcontact;
	}

	public SubEstablishmentDto getSubEstablishmentDto() {
		return subEstablishmentDto;
	}

	public void setSubEstablishmentDto(SubEstablishmentDto subEstablishmentDto) {
		this.subEstablishmentDto = subEstablishmentDto;
	}

	public SubEstablishmentDto getSubEstablishmentsDto() {
		return subEstablishmentsDto;
	}

	public void setSubEstablishmentsDto(SubEstablishmentDto subEstablishmentsDto) {
		this.subEstablishmentsDto = subEstablishmentsDto;
	}

	public List<SubEstablishmentDto> getListSubEstablishment() {
		return listSubEstablishment;
	}

	public void setListSubEstablishment(
			List<SubEstablishmentDto> listSubEstablishment) {
		this.listSubEstablishment = listSubEstablishment;
	}

	public List<CountryDto> getListCountry() {
		return listCountry;
	}

	public void setListCountry(List<CountryDto> listCountry) {
		this.listCountry = listCountry;
	}

	public List<RegionDto> getListRegion() {
		return listRegion;
	}

	public void setListRegion(List<RegionDto> listRegion) {
		this.listRegion = listRegion;
	}

	public List<CityDto> getListCity() {
		return listCity;
	}

	public void setListCity(List<CityDto> listCity) {
		this.listCity = listCity;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<ZipcodeDto> getListZipCode() {
		return listZipCode;
	}

	public void setListZipCode(List<ZipcodeDto> listZipCode) {
		this.listZipCode = listZipCode;
	}

	public ZipcodeDto getZipcodeDto() {
		return zipcodeDto;
	}

	public void setZipcodeDto(ZipcodeDto zipcodeDto) {
		this.zipcodeDto = zipcodeDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public String updateSubEstablishment() {
		logger.debug("DEBUT modifierSubEstablishment");

		FacesMessage msg = null;
		SubEstablishmentDto SubEstablishmentModif = new SubEstablishmentDto();
		try {
			logger.debug("SubEstablishment Name  "
					+ subEstablishmentDto.getNameSubestablishment());
			SubEstablishmentModif.setNameSubestablishment(subEstablishmentDto
					.getNameSubestablishment());
			SubEstablishmentModif.setAddressLigne1(subEstablishmentDto
					.getAddressLigne1());
			SubEstablishmentModif.setAddressLigne2(subEstablishmentDto
					.getAddressLigne2());
			SubEstablishmentModif.setAddressLigne3(subEstablishmentDto
					.getAddressLigne3());
			SubEstablishmentModif.setAddressLigne4(subEstablishmentDto
					.getAddressLigne4());
			SubEstablishmentModif.setCareOf(subEstablishmentDto.getCareOf());
			SubEstablishmentModif.setCity(subEstablishmentDto.getCity());
			SubEstablishmentModif.setCountry(subEstablishmentDto.getCountry());
			SubEstablishmentModif.setRegion(subEstablishmentDto.getRegion());
			SubEstablishmentModif.setZipcode(subEstablishmentDto.getZipcode());
			SubEstablishmentModif.setDescription(subEstablishmentDto
					.getDescription());
			SubEstablishmentModif.setEmailAddress(subEstablishmentDto
					.getEmailAddress());

			SubEstablishmentModif.setStatus(subEstablishmentDto.getStatus());

			SubEstablishmentModif.setFaxNumber(subEstablishmentDto
					.getFaxNumber());
			SubEstablishmentModif.setLanPhoneNumber1(subEstablishmentDto
					.getLanPhoneNumber1());
			SubEstablishmentModif.setLanPhoneNumber2(subEstablishmentDto
					.getLanPhoneNumber2());
			SubEstablishmentModif
					.setLocation(subEstablishmentDto.getLocation());
			SubEstablishmentModif.setFacebookId(subEstablishmentDto
					.getFacebookId());
			SubEstablishmentModif.setTwitterId(subEstablishmentDto
					.getTwitterId());
			SubEstablishmentModif.setWebsiteAddress(subEstablishmentDto
					.getWebsiteAddress());
			SubEstablishmentModif.setYoutubechannel(subEstablishmentDto
					.getYoutubechannel());
			SubEstablishmentModif.setContactAddressLigne1(subEstablishmentDto
					.getContactAddressLigne1());
			SubEstablishmentModif.setContactAddressLigne2(subEstablishmentDto
					.getContactAddressLigne2());
			SubEstablishmentModif.setContactAddressLigne3(subEstablishmentDto
					.getContactAddressLigne3());
			SubEstablishmentModif.setContactAddressLigne4(subEstablishmentDto
					.getContactAddressLigne4());
			SubEstablishmentModif.setContactCareOf(subEstablishmentDto
					.getContactCareOf());
			SubEstablishmentModif.setContactPosition(subEstablishmentDto
					.getContactPosition());
			SubEstablishmentModif.setContactEmailAddress(subEstablishmentDto
					.getContactEmailAddress());
			SubEstablishmentModif.setContactFaxNumber(subEstablishmentDto
					.getContactFaxNumber());
			SubEstablishmentModif.setContactFistName(subEstablishmentDto
					.getContactFistName());
			SubEstablishmentModif.setContactLastName(subEstablishmentDto
					.getContactLastName());
			SubEstablishmentModif.setContactMiddleName(subEstablishmentDto
					.getContactMiddleName());
			SubEstablishmentModif.setContactLanPhoneNumber1(subEstablishmentDto
					.getContactLanPhoneNumber1());
			SubEstablishmentModif.setContactLanPhoneNumber2(subEstablishmentDto
					.getContactLanPhoneNumber2());
			SubEstablishmentModif.setContactCountry(subEstablishmentDto
					.getContactCountry());
			SubEstablishmentModif.setContactRegion(subEstablishmentDto
					.getContactRegion());
			SubEstablishmentModif.setContactZipcode(subEstablishmentDto
					.getContactZipcode());
			SubEstablishmentModif.setContactCity(subEstablishmentDto
					.getContactCity());
			SubEstablishmentModif.setManagerAddressLigne1(subEstablishmentDto
					.getManagerAddressLigne1());
			SubEstablishmentModif.setManagerAddressLigne2(subEstablishmentDto
					.getManagerAddressLigne2());
			SubEstablishmentModif.setManagerAddressLigne3(subEstablishmentDto
					.getManagerAddressLigne3());
			SubEstablishmentModif.setManagerAddressLigne4(subEstablishmentDto
					.getManagerAddressLigne4());
			SubEstablishmentModif.setManagerPosition(subEstablishmentDto
					.getManagerPosition());
			SubEstablishmentModif.setManagerCareOf(subEstablishmentDto
					.getManagerCareOf());
			SubEstablishmentModif.setManagerCountry(subEstablishmentDto
					.getManagerCountry());
			SubEstablishmentModif.setManagerCity(subEstablishmentDto
					.getManagerCity());
			SubEstablishmentModif.setManagerZipcode(subEstablishmentDto
					.getManagerZipcode());
			SubEstablishmentModif.setManagerRegion(subEstablishmentDto
					.getManagerRegion());
			SubEstablishmentModif.setManagerEmailAddress(subEstablishmentDto
					.getManagerEmailAddress());
			SubEstablishmentModif.setManagerFaxNumber(subEstablishmentDto
					.getManagerFaxNumber());
			SubEstablishmentModif.setManagerFistName(subEstablishmentDto
					.getManagerFistName());
			SubEstablishmentModif.setManagerLastName(subEstablishmentDto
					.getManagerLastName());
			SubEstablishmentModif.setManagerMiddleName(subEstablishmentDto
					.getManagerMiddleName());
			SubEstablishmentModif.setManagerLanPhoneNumber1(subEstablishmentDto
					.getManagerLanPhoneNumber1());
			SubEstablishmentModif.setManagerLanPhoneNumber2(subEstablishmentDto
					.getManagerLanPhoneNumber2());
			subEstablishmentServicewsEndpoint = subEstablishmentServicews
					.getSubEstablishmentServicewsImplPort();
			SubEstablishmentModif.setIdSubEstablishmentDto(subEstablishmentDto
					.getIdSubEstablishmentDto());
			SubEstablishmentModif = subEstablishmentServicewsEndpoint
					.updateSubEstablishmentServicews(SubEstablishmentModif);
		} catch (Exception e) {

			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_subestablishment"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		logger.debug("Fin Modification SubEstablishment  +++++++++++++");

		return null;
	}

	public void onchangeCityAdresse() {

		if (subEstablishmentDto.getCountry().getIdCountry() != null) {

			if (listRegion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(subEstablishmentDto.getRegion());
				listCity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}

		}
	}

	public void onchangeZipCodeAdresse() {

		if (subEstablishmentDto.getCountry().getIdCountry() != null) {

			if (listCity.size() != 0) {
				ZipcodeDto zipcodesearch = new ZipcodeDto();
				zipcodesearch.setCity(subEstablishmentDto.getCity());
				listZipCode = zipServicewsEndpoint
						.searchZipcodeServicews(zipcodesearch);

			}

		}
	}

	public void maskPhoneAdresse() {

		if (subEstablishmentDto.getCountry().getIdCountry() != null) {
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(subEstablishmentDto.getCountry());
			listRegion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}

		if (subEstablishmentDto.getCountry().getIdCountry() != null) {
			maskphonformatadresse = subEstablishmentDto.getCountry()
					.getMobilePhoneFormat().getIndicatif();
		}

		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (subEstablishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatadresse = maskphonformatadresse
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		subEstablishmentDto.setLanPhoneNumber1("221");
		subEstablishmentDto.setLanPhoneNumber2("221");
		subEstablishmentDto.setFaxNumber("221");
		logger.debug("maskphonformatadresse:" + maskphonformatadresse);

	}

	public void onchangeCityGerant() {

		if (subEstablishmentDto.getManagerCountry().getIdCountry() != null) {

			if (listRegion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(subEstablishmentDto.getManagerRegion());
				listCity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}

		}
	}

	public void onchangeZipCodeGerant() {

		if (subEstablishmentDto.getManagerCountry().getIdCountry() != null) {

			if (listCity.size() != 0) {
				ZipcodeDto zipcodesearch = new ZipcodeDto();
				zipcodesearch.setCity(subEstablishmentDto.getManagerCity());
				listZipCode = zipServicewsEndpoint
						.searchZipcodeServicews(zipcodesearch);

			}

		}
	}

	public void maskPhoneGerant() {

		if (subEstablishmentDto.getManagerCountry().getIdCountry() != null) {
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(subEstablishmentDto.getManagerCountry());
			listRegion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);
		}

		if (subEstablishmentDto.getManagerCountry().getIdCountry() != null) {
			maskphonformatgerant = subEstablishmentDto.getManagerCountry()
					.getMobilePhoneFormat().getIndicatif();
		}

		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (subEstablishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		subEstablishmentDto.setManagerLanPhoneNumber1("221");
		subEstablishmentDto.setManagerLanPhoneNumber2("221");
		subEstablishmentDto.setManagerFaxNumber("221");
		logger.debug("maskphonformatgerant:" + maskphonformatgerant);

	}
	
	public void onchangeCityContact() {

		if (subEstablishmentDto.getContactCountry().getIdCountry() != null) {

			if (listRegion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(subEstablishmentDto.getContactRegion());
				listCity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}

		}
	}

	public void onchangeZipCodeContact() {

		if (subEstablishmentDto.getContactCountry().getIdCountry() != null) {

			if (listCity.size() != 0) {
				ZipcodeDto zipcodesearch = new ZipcodeDto();
				zipcodesearch.setCity(subEstablishmentDto.getContactCity());
				listZipCode = zipServicewsEndpoint
						.searchZipcodeServicews(zipcodesearch);

			}

		}
	}

	public void maskPhoneContact() {

		if(subEstablishmentDto.getContactCountry().getIdCountry() != null){
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(subEstablishmentDto.getContactCountry());
			listRegion = regionServicewsEndpoint.searchRegionServicews(regionsearch);
		}
		
		if (subEstablishmentDto.getContactCountry().getIdCountry() != null) {
			maskphonformatcontact = subEstablishmentDto.getContactCountry()
					.getMobilePhoneFormat().getIndicatif();
		}

		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (subEstablishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(subEstablishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		subEstablishmentDto.setContactLanPhoneNumber1("221");
		subEstablishmentDto.setContactLanPhoneNumber2("221");
		subEstablishmentDto.setContactFaxNumber("221");
		logger.debug("maskphonformatcontact:" + maskphonformatcontact);

	}

	public String createSubEstablishment() {
		logger.debug("DEBUT CREATESUBESTABLISHMENT +++++++++++++");
		FacesMessage msg;

		SubEstablishmentDto subestablishmentcreate = new SubEstablishmentDto();

		subEstablishmentServicewsEndpoint = subEstablishmentServicews
				.getSubEstablishmentServicewsImplPort();
		subestablishmentcreate = subEstablishmentServicewsEndpoint
				.createSubEstablishmentServicews(subEstablishmentDto);

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_subestablishment"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		logger.debug("FIN CREATESUBESTABLISHMENT +++++++++++++");

		return null;
	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualist");
		if (baction.equals("1")) {
			subEstablishmentDto = subEstablishmentsDto;
			listCity = new ArrayList<CityDto>();
			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listZipCode = new ArrayList<ZipcodeDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			establishmentServicewsEndpoint = establishmentServicews
					.getEstablishmentServicewsImplPort();
			listetablissement = establishmentServicewsEndpoint
					.getAllEstablishmentServicews();
			subEstablishmentDto = new SubEstablishmentDto();
			subEstablishmentDto.setEstablishment(listetablissement.get(0));
			listCity = new ArrayList<CityDto>();
			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listZipCode = new ArrayList<ZipcodeDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
		logger.debug("FIN initDualList +++++++++++++");
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listCountry = countryServicewsEndpoint.getAllCountryServicews();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerSubEstablishment() {

		logger.debug("DEBUT SuppressionSubEstablishment +++++++++++++");
		FacesMessage msg;
		try {
			subEstablishmentServicewsEndpoint
					.deleteSubEstablishmentServicews(subEstablishmentsDto);

		} catch (Exception ex) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_warn_subestablishment"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_subestablishment"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN SuppressionSubEstablishment +++++++++++++");
		init();
		return null;
	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listCountry = countryServicewsEndpoint.getAllCountryServicews();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init SubEstablishmentServiceBean");

			subEstablishmentServicewsEndpoint = subEstablishmentServicews
					.getSubEstablishmentServicewsImplPort();
			listSubEstablishment = subEstablishmentServicewsEndpoint
					.getAllSubEstablishmentServicews();

			logger.debug("end init SubEstablishmentServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

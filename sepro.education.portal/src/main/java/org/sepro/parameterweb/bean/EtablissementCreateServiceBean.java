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
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.EstablishmentDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
import org.sepro.parameterweb.serviceimpl.CityServicews;
import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicews;
import org.sepro.parameterweb.serviceimpl.EstablishmentServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RegionServicews;
import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ZipServicews;
import org.sepro.parameterweb.serviceimpl.ZipServicewsEndpoint;

import sepro.education.web.util.FormatNumberPhoneUtil;

@ManagedBean
@ViewScoped
public class EtablissementCreateServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(EtablissementCreateServiceBean.class);

	private EstablishmentServicews establishmentServicews = new EstablishmentServicews();
	private EstablishmentServicewsEndpoint establishmentServicewsEndpoint;

	private EstablishmentDto establishmentDto = new EstablishmentDto();
	private EstablishmentDto etablissementDto = new EstablishmentDto();
	private List<EstablishmentDto> listetablissement = new ArrayList<EstablishmentDto>();

	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private List<CountryDto> listcountry = new ArrayList<CountryDto>();
	private CountryDto country = new CountryDto();

	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;
	private List<RegionDto> listregion = new ArrayList<RegionDto>();

	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;
	private List<CityDto> listcity = new ArrayList<CityDto>();

	private ZipServicews zipServicews = new ZipServicews();
	private ZipServicewsEndpoint zipServicewsEndpoint;
	private List<ZipcodeDto> listzipcode = new ArrayList<ZipcodeDto>();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;

	private String maskphonformatetablishment;
	private String maskphonformatgerant;
	private String maskphonformatproprietaire;
	private String maskphonformatcontact;

	
	
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

	public String getMaskphonformatetablishment() {
		return maskphonformatetablishment;
	}

	public void setMaskphonformatetablishment(String maskphonformatetablishment) {
		this.maskphonformatetablishment = maskphonformatetablishment;
	}

	public String getMaskphonformatgerant() {
		return maskphonformatgerant;
	}

	public void setMaskphonformatgerant(String maskphonformatgerant) {
		this.maskphonformatgerant = maskphonformatgerant;
	}

	public String getMaskphonformatproprietaire() {
		return maskphonformatproprietaire;
	}

	public void setMaskphonformatproprietaire(String maskphonformatproprietaire) {
		this.maskphonformatproprietaire = maskphonformatproprietaire;
	}

	public String getMaskphonformatcontact() {
		return maskphonformatcontact;
	}

	public void setMaskphonformatcontact(String maskphonformatcontact) {
		this.maskphonformatcontact = maskphonformatcontact;
	}

	public List<ZipcodeDto> getListzipcode() {
		return listzipcode;
	}

	public void setListzipcode(List<ZipcodeDto> listzipcode) {
		this.listzipcode = listzipcode;
	}

	public List<CityDto> getListcity() {
		return listcity;
	}

	public void setListcity(List<CityDto> listcity) {
		this.listcity = listcity;
	}

	public List<RegionDto> getListregion() {
		return listregion;
	}

	public void setListregion(List<RegionDto> listregion) {
		this.listregion = listregion;
	}

	public List<EstablishmentDto> getListetablissement() {
		return listetablissement;
	}

	public void setListetablissement(List<EstablishmentDto> listetablissement) {
		this.listetablissement = listetablissement;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public EstablishmentDto getEstablishmentDto() {
		return establishmentDto;
	}

	public void setEstablishmentDto(EstablishmentDto establishmentDto) {
		this.establishmentDto = establishmentDto;
	}

	public EstablishmentDto getEtablissementDto() {
		return etablissementDto;
	}

	public void setEtablissementDto(EstablishmentDto etablissementDto) {
		this.etablissementDto = etablissementDto;
	}

	public CountryDto getCountry() {
		return country;
	}

	public void setCountry(CountryDto country) {
		this.country = country;
	}

	public List<CountryDto> getListcountry() {
		return listcountry;
	}

	public void setListcountry(List<CountryDto> listcountry) {
		this.listcountry = listcountry;
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			logger.debug("name sd");
			listcity = new ArrayList<CityDto>();
			listcountry = new ArrayList<CountryDto>();
			listregion = new ArrayList<RegionDto>();
			listzipcode = new ArrayList<ZipcodeDto>();
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			establishmentServicewsEndpoint = establishmentServicews
					.getEstablishmentServicewsImplPort();
			listetablissement = establishmentServicewsEndpoint
					.getAllEstablishmentServicews();
			listcity = new ArrayList<CityDto>();
			listcountry = new ArrayList<CountryDto>();
			listregion = new ArrayList<RegionDto>();
			listzipcode = new ArrayList<ZipcodeDto>();
			action2 = true;
			action3= false;
			initCreate();
		}
	}

	public void initUpdate() {
		try {
			action = false;
			listcountry = new ArrayList<CountryDto>();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listcountry = countryServicewsEndpoint.getAllCountryServicews();

			listregion = new ArrayList<RegionDto>();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();

			listcity = new ArrayList<CityDto>();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();

			listzipcode = new ArrayList<ZipcodeDto>();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void testLieucityestablishment() {

		if (establishmentDto.getRegion().getIdRegion() != null) {
			if (listregion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(establishmentDto.getRegion());
				listcity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}
		}

	}

	public void testLieuzipcodeestablishment() {

		if (establishmentDto.getCity().getIdCity() != null) {

			if (listcity.size() != 0) {

				ZipcodeDto zipsearch = new ZipcodeDto();
				zipsearch.setCity(establishmentDto.getCity());
				listzipcode = zipServicewsEndpoint
						.searchZipcodeServicews(zipsearch);
			}
		}

	}

	public void testLieucitygerant() {

		if (establishmentDto.getManagerRegion().getIdRegion() != null) {
			if (listregion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(establishmentDto.getManagerRegion());
				listcity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}
		}

	}

	public void testLieuzipcodegerant() {

		if (establishmentDto.getManagerCity().getIdCity() != null) {

			if (listcity.size() != 0) {

				ZipcodeDto zipsearch = new ZipcodeDto();
				zipsearch.setCity(establishmentDto.getManagerCity());
				listzipcode = zipServicewsEndpoint
						.searchZipcodeServicews(zipsearch);
			}
		}

	}

	public void testLieucityowner() {

		if (establishmentDto.getOwnerRegion().getIdRegion() != null) {
			if (listregion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(establishmentDto.getOwnerRegion());
				listcity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}
		}

	}

	public void testLieuzipcodeowner() {

		if (establishmentDto.getOwnerCity().getIdCity() != null) {

			if (listcity.size() != 0) {

				ZipcodeDto zipsearch = new ZipcodeDto();
				zipsearch.setCity(establishmentDto.getOwnerCity());
				listzipcode = zipServicewsEndpoint
						.searchZipcodeServicews(zipsearch);
			}
		}

	}

	public void testLieucitycontact() {

		if (establishmentDto.getContactRegion().getIdRegion() != null) {
			if (listregion.size() != 0) {

				CityDto citysearch = new CityDto();
				citysearch.setRegion(establishmentDto.getContactRegion());
				listcity = cityServicewsEndpoint
						.searchCityServicews(citysearch);
			}
		}

	}

	public void testLieuzipcodecontact() {

		if (establishmentDto.getContactCity().getIdCity() != null) {

			if (listcity.size() != 0) {

				ZipcodeDto zipsearch = new ZipcodeDto();
				zipsearch.setCity(establishmentDto.getContactCity());
				listzipcode = zipServicewsEndpoint
						.searchZipcodeServicews(zipsearch);
			}
		}

	}

	public void maskPhone_etablishment() {

		if (establishmentDto.getCountry().getIdCountry() != null) {

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(establishmentDto.getCountry());
			listregion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}

		if (establishmentDto.getCountry().getIdCountry() != null) {
			maskphonformatetablishment = "("
					+ establishmentDto.getCountry().getMobilePhoneFormat()
							.getIndicatif() + ")";
		}

		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (establishmentDto.getCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatetablishment = maskphonformatetablishment
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		establishmentDto.setLanPhoneNumber1("221");
		establishmentDto.setLanPhoneNumber2("221");
		logger.debug("maskphonformat:" + maskphonformatetablishment);

	}

	public void maskPhone_gerant() {

		if (establishmentDto.getManagerCountry().getIdCountry() != null) {

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(establishmentDto.getManagerCountry());
			listregion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}

		if (establishmentDto.getManagerCountry().getIdCountry() != null) {
			maskphonformatgerant = "("
					+ establishmentDto.getManagerCountry()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (establishmentDto.getManagerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatgerant = maskphonformatgerant
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getManagerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		establishmentDto.setManagerLanPhoneNumber1("221");
		establishmentDto.setManagerLanPhoneNumber1("221");
		logger.debug("maskphonformatgerant:" + maskphonformatgerant);

	}

	public void maskPhone_owner() {

		if (establishmentDto.getOwnerCountry().getIdCountry() != null) {

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(establishmentDto.getOwnerCountry());
			listregion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}

		if (establishmentDto.getOwnerCountry().getIdCountry() != null) {
			maskphonformatproprietaire = "("
					+ establishmentDto.getOwnerCountry().getMobilePhoneFormat()
							.getIndicatif() + ")";
		}

		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (establishmentDto.getOwnerCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatproprietaire = maskphonformatproprietaire
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getOwnerCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		establishmentDto.setOwnerLanPhoneNumber1("221");
		establishmentDto.setOwnerLanPhoneNumber2("221");
		logger.debug("maskphonformatproprietaire:" + maskphonformatproprietaire);

	}

	public void maskPhone_contact() {

		if (establishmentDto.getContactCountry().getIdCountry() != null) {

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(establishmentDto.getContactCountry());
			listregion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}
		if (establishmentDto.getContactCountry().getIdCountry() != null) {
			maskphonformatcontact = "("
					+ establishmentDto.getContactCountry()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (establishmentDto.getContactCountry().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatcontact = maskphonformatcontact
					+ FormatNumberPhoneUtil.getFormat(establishmentDto
							.getContactCountry().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		establishmentDto.setContactLanPhoneNumber1("221");
		establishmentDto.setContactLanPhoneNumber2("221");
		logger.debug("maskphonformatcontact:" + maskphonformatcontact);

	}

	public void initCreate() {
		try {
			action = true;
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listcountry = countryServicewsEndpoint.getAllCountryServicews();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();

			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			listcountry = new ArrayList<CountryDto>();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listcountry = countryServicewsEndpoint.getAllCountryServicews();
			// listregion = new ArrayList<RegionDto>();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			// listcity = new ArrayList<CityDto>();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();

			// listzipcode = new ArrayList<ZipcodeDto>();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
			establishmentServicewsEndpoint = establishmentServicews
					.getEstablishmentServicewsImplPort();
			listetablissement = establishmentServicewsEndpoint
					.getAllEstablishmentServicews();

			if (listetablissement.size() > 0) {
				establishmentDto = listetablissement.get(0);
				action = false;
				establishmentDto.setContactCountry(new CountryDto());
			} else if (listetablissement.size() == 0) {
				action = true;
				establishmentDto = new EstablishmentDto();
				establishmentDto.setCountry(new CountryDto());
				establishmentDto.setRegion(new RegionDto());
				establishmentDto.setCity(new CityDto());
				establishmentDto.setZipcode(new ZipcodeDto());
				establishmentDto.setContactCountry(new CountryDto());
				establishmentDto.setContactRegion(new RegionDto());
				establishmentDto.setContactCity(new CityDto());
				establishmentDto.setContactZipcode(new ZipcodeDto());
				establishmentDto.setOwnerCountry(new CountryDto());
				establishmentDto.setOwnerRegion(new RegionDto());
				establishmentDto.setOwnerCity(new CityDto());
				establishmentDto.setOwnerZipcode(new ZipcodeDto());
				establishmentDto.setManagerCountry(new CountryDto());
				establishmentDto.setManagerRegion(new RegionDto());
				establishmentDto.setManagerCity(new CityDto());
				establishmentDto.setManagerZipcode(new ZipcodeDto());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createEtablissement() {
		EstablishmentDto etablissement = new EstablishmentDto();
		etablissement.setAddressLigne1(establishmentDto.getAddressLigne1());
		etablissement.setAddressLigne2(establishmentDto.getAddressLigne2());
		etablissement.setAddressLigne3(establishmentDto.getAddressLigne3());
		etablissement.setCareOf(establishmentDto.getCareOf());
		etablissement.setCity(establishmentDto.getCity());
		logger.debug("etablissement conutry @@@@@@@@@"+establishmentDto.getCountry().getCountryName());
		logger.debug("etablissement région @@@@@@@@@"+establishmentDto.getRegion().getRegionName());
		logger.debug("etablissement city @@@@@@@@@"+establishmentDto.getCity().getCityName());
		logger.debug("etablissement zip code @@@@@@@@@"+establishmentDto.getZipcode().getAreaName());
		
		logger.debug("manager conutry @@@@@@@@@"+establishmentDto.getManagerCountry().getCountryName());
		logger.debug("manager région @@@@@@@@@"+establishmentDto.getManagerRegion().getRegionName());
		logger.debug("manager city @@@@@@@@@"+establishmentDto.getManagerCity().getCityName());
		logger.debug("manager zip code @@@@@@@@@"+establishmentDto.getManagerZipcode().getAreaName());
		etablissement.setContactAddressLigne1(establishmentDto
				.getContactAddressLigne1());
		etablissement.setContactAddressLigne2(establishmentDto
				.getContactAddressLigne2());
		etablissement.setContactAddressLigne3(establishmentDto
				.getContactAddressLigne3());
		etablissement.setContactCareOf(establishmentDto.getContactCareOf());
		etablissement.setContactCity(establishmentDto.getContactCity());
		etablissement.setContactCountry(establishmentDto.getContactCountry());
		etablissement.setContactEmailAddress(establishmentDto
				.getContactEmailAddress());
		etablissement.setContactFaxNumber(establishmentDto
				.getContactFaxNumber());
		etablissement.setContactFistName(establishmentDto.getContactFistName());
		etablissement.setContactLanPhoneNumber1(establishmentDto
				.getContactLanPhoneNumber1());
		etablissement.setContactLanPhoneNumber2(establishmentDto
				.getContactLanPhoneNumber2());
		etablissement.setContactLastName(establishmentDto.getContactLastName());
		etablissement.setContactMiddleName(establishmentDto
				.getContactMiddleName());
		etablissement.setContactPosition(establishmentDto.getContactPosition());
		etablissement.setContactRegion(establishmentDto.getContactRegion());
		etablissement.setContactZipcode(establishmentDto.getContactZipcode());
		etablissement.setCountry(establishmentDto.getCountry());
		etablissement.setDescription(establishmentDto.getDescription());
		etablissement.setEmailAddress(establishmentDto.getEmailAddress());
		etablissement.setFacebookId(establishmentDto.getFacebookId());
		etablissement.setFaxNumber(establishmentDto.getFaxNumber());
		etablissement.setFounder(establishmentDto.getFounder());
		etablissement.setInitials(establishmentDto.getInitials());
		etablissement.setLanPhoneNumber1(establishmentDto.getLanPhoneNumber1());
		etablissement.setLanPhoneNumber2(establishmentDto.getLanPhoneNumber2());
		etablissement.setLocation(establishmentDto.getLocation());
		etablissement.setManagerAddressLigne1(establishmentDto
				.getManagerAddressLigne1());
		etablissement.setManagerAddressLigne2(establishmentDto
				.getManagerAddressLigne2());
		etablissement.setManagerAddressLigne3(establishmentDto
				.getManagerAddressLigne3());
		etablissement.setManagerCareOf(establishmentDto.getManagerCareOf());
		etablissement.setManagerCity(establishmentDto.getManagerCity());
		etablissement.setManagerCountry(establishmentDto.getManagerCountry());
		etablissement.setManagerEmailAddress(establishmentDto
				.getManagerEmailAddress());
		etablissement.setManagerFaxNumber(establishmentDto
				.getManagerFaxNumber());
		etablissement.setManagerFistName(establishmentDto.getManagerFistName());
		etablissement.setManagerLanPhoneNumber1(establishmentDto
				.getManagerLanPhoneNumber1());
		etablissement.setManagerLanPhoneNumber2(establishmentDto
				.getManagerLanPhoneNumber2());
		etablissement.setManagerLastName(establishmentDto.getManagerLastName());
		etablissement.setManagerMiddleName(establishmentDto
				.getManagerMiddleName());
		etablissement.setManagerPosition(establishmentDto.getManagerPosition());
		etablissement.setManagerRegion(establishmentDto.getManagerRegion());
		etablissement.setManagerZipcode(establishmentDto.getManagerZipcode());
		etablissement.setNameEstablishment(establishmentDto
				.getNameEstablishment());
		etablissement.setOwnerAddressLigne1(establishmentDto
				.getOwnerAddressLigne1());
		etablissement.setOwnerAddressLigne2(establishmentDto
				.getOwnerAddressLigne2());
		etablissement.setOwnerAddressLigne3(establishmentDto
				.getOwnerAddressLigne3());
		etablissement.setOwnerCareOf(establishmentDto.getOwnerCareOf());
		etablissement.setOwnerCity(establishmentDto.getOwnerCity());
		etablissement.setOwnerCountry(establishmentDto.getOwnerCountry());
		etablissement.setOwnerEmailAddress(establishmentDto
				.getOwnerEmailAddress());
		etablissement.setOwnerFaxNumber(establishmentDto.getOwnerFaxNumber());
		etablissement.setOwnerFistName(establishmentDto.getOwnerFistName());
		etablissement.setOwnerLanPhoneNumber1(establishmentDto
				.getOwnerLanPhoneNumber1());
		etablissement.setOwnerLanPhoneNumber2(establishmentDto
				.getOwnerLanPhoneNumber2());
		etablissement.setOwnerLastName(establishmentDto.getOwnerLastName());
		etablissement.setOwnerMiddleName(establishmentDto.getOwnerMiddleName());
		etablissement.setOwnerPosition(establishmentDto.getOwnerPosition());
		etablissement.setOwnerRegion(establishmentDto.getOwnerRegion());
		;
		etablissement.setOwnerZipcode(establishmentDto.getOwnerZipcode());
		etablissement.setPatent(establishmentDto.getPatent());
		etablissement.setRegion(establishmentDto.getRegion());
		etablissement.setRegistrationName(establishmentDto
				.getRegistrationName());
		etablissement.setTwitterId(establishmentDto.getTwitterId());
		etablissement.setWebsiteAddress(establishmentDto.getWebsiteAddress());
		etablissement.setWelcomeWords(establishmentDto.getWelcomeWords());
		etablissement.setYearOfCreation(establishmentDto.getYearOfCreation());
		etablissement.setYoutubechannel(establishmentDto.getYoutubechannel());
		etablissement.setZipcode(establishmentDto.getZipcode());

		establishmentServicewsEndpoint = establishmentServicews
				.getEstablishmentServicewsImplPort();
		if (action) {

			long id = 1;
			establishmentDto.setIdEstablishment(id);
			establishmentDto = establishmentServicewsEndpoint
					.createEstablishmentServicews(establishmentDto);
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_msg_create_etablissement")));
		} else {
			logger.debug("DEBUT Modification ETABLISSEMENT  +++++++++++++");
			establishmentDto = establishmentServicewsEndpoint
					.updateEstablishmentServicews(establishmentDto);
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_msg_update_etablissement")));

		}

		init();
	}

}

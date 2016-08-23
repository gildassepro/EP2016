package org.sepro.teacherweb.bean;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;

import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CityServicews;
import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RegionServicews;
import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ZipServicews;
import org.sepro.parameterweb.serviceimpl.ZipServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceapi.TeacherModuleDto;
import org.sepro.teacherweb.serviceapi.CvteacherDto;
import org.sepro.teacherweb.serviceapi.DetailteacherDto;
import org.sepro.teacherweb.serviceimpl.CvteacherServicews;
import org.sepro.teacherweb.serviceimpl.CvteacherServicewsEndpoint;
import org.sepro.teacherweb.serviceimpl.DetailteacherServicews;
import org.sepro.teacherweb.serviceimpl.DetailteacherServicewsEndpoint;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicews;
import org.sepro.teacherweb.serviceimpl.IdentityTeacherServicewsEndpoint;
import org.sepro.teacherweb.serviceimpl.TeachedModuleServicews;
import org.sepro.teacherweb.serviceimpl.TeachedModuleServicewsEndpoint;

import sepro.education.web.util.FormatNumberPhoneUtil;

@ManagedBean
@ViewScoped
public class TeacherSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(TeacherSearchServiceBean.class);

	private TeachedModuleServicews teachedModuleServicews = new TeachedModuleServicews();
	private TeachedModuleServicewsEndpoint teachedModuleServicewsEndpoint;

	private IdentityTeacherServicews identityTeacherServicews = new IdentityTeacherServicews();
	private IdentityTeacherServicewsEndpoint identityTeacherServicewsEndpoint;
	private List<IdentityTeacherDto> listTeacher = new ArrayList<IdentityTeacherDto>();
	private IdentityTeacherDto identityTeacherDto = new IdentityTeacherDto();
	private IdentityTeacherDto identityTeacherDtos = new IdentityTeacherDto();
	private IdentityTeacherDto selectedidentityTeacherDto = new IdentityTeacherDto();

	private TeacherModuleDto teacherDto = new TeacherModuleDto();
	private TeacherModuleDto teacherDtos = new TeacherModuleDto();
	private TeacherModuleDto teacherModuleDto = new TeacherModuleDto();
	private TeacherModuleDto teacherModuleDtos = new TeacherModuleDto();
	private TeacherModuleDto selectedteacherModuleDto = new TeacherModuleDto();
	private List<TeacherModuleDto> listdetal = new ArrayList<TeacherModuleDto>();

	private CvteacherServicews cvteacherServicews = new CvteacherServicews();
	private CvteacherServicewsEndpoint cvteacherServicewsEndpoint;

	private CvteacherDto cvteacherDto = new CvteacherDto();
	private CvteacherDto cvteacherDtos = new CvteacherDto();
	private CvteacherDto selectedcvteacherDto = new CvteacherDto();
	private List<CvteacherDto> listexperienceprof = new ArrayList<CvteacherDto>();

	private DetailteacherServicews detailteacherServicews = new DetailteacherServicews();
	private DetailteacherServicewsEndpoint detailteacherServicewsEndpoint;

	private DetailteacherDto detailteacherDto = new DetailteacherDto();
	private DetailteacherDto selecteddetailteacherDto = new DetailteacherDto();
	private DetailteacherDto detailteacherDtos = new DetailteacherDto();
	private List<DetailteacherDto> listdetailprof = new ArrayList<DetailteacherDto>();

	private AcademicModuleDtoServicews moduleacademiqueServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint moduleacademiqueServicewsEndpoint;
	private List<AcademicModuleDto> listmodule = new ArrayList<AcademicModuleDto>();

	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;
	private List<CityDto> listCity = new ArrayList<CityDto>();
	private List<CityDto> listCity2 = new ArrayList<CityDto>();

	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;
	private List<RegionDto> listRegion = new ArrayList<RegionDto>();
	private List<RegionDto> listRegion2 = new ArrayList<RegionDto>();

	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private List<CountryDto> listCountry = new ArrayList<CountryDto>();

	private ZipServicews zipServicews = new ZipServicews();
	private ZipServicewsEndpoint zipServicewsEndpoint;
	private List<ZipcodeDto> listZipcode = new ArrayList<ZipcodeDto>();
	private List<ZipcodeDto> listZipcode2 = new ArrayList<ZipcodeDto>();

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;

	private List<PopuplistDto> listetatcivile = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listdocumentidentity = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listnationalite = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listspecialite = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listsexe = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listspecialitedestination = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listspecialitesource = new ArrayList<PopuplistDto>();

	private List<PopuplistDto> listhoraire = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listmois = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listpriorite = new ArrayList<PopuplistDto>();

	public boolean status;
	private boolean action = false;
	private boolean action1 = false;
	private boolean action2 = false;
	private boolean action4 = false;
	private boolean action3 = true;
	
	private boolean render2 = false;
	private boolean render3 = true;
	private boolean render4 = true;
	private boolean render5 = true;
	private boolean testdetail = true;
	private boolean test = true;
	private String maskphonformatteacher;

	private UploadedFile myfile;
	private String filename;
	private String destination = "D:\\DossierCVTeacher\\";
	File file;
	private static final int DEFAULT_BUFFER_SIZE = 10240;

	
	
	
	
	
	public boolean isTest() {
		return test;
	}



	public void setTest(boolean test) {
		this.test = test;
	}



	public boolean isRender4() {
		return render4;
	}



	public void setRender4(boolean render4) {
		this.render4 = render4;
	}



	public boolean isRender5() {
		return render5;
	}



	public void setRender5(boolean render5) {
		this.render5 = render5;
	}



	public boolean isRender2() {
		return render2;
	}



	public void setRender2(boolean render2) {
		this.render2 = render2;
	}



	public boolean isRender3() {
		return render3;
	}



	public void setRender3(boolean render3) {
		this.render3 = render3;
	}



	public boolean isAction4() {
		return action4;
	}



	public void setAction4(boolean action4) {
		this.action4 = action4;
	}



	public boolean isAction3() {
		return action3;
	}



	public void setAction3(boolean action3) {
		this.action3 = action3;
	}



	public boolean isTestdetail() {
		return testdetail;
	}



	public void setTestdetail(boolean testdetail) {
		this.testdetail = testdetail;
	}



	public List<CityDto> getListCity2() {
		return listCity2;
	}

	public void setListCity2(List<CityDto> listCity2) {
		this.listCity2 = listCity2;
	}

	public List<ZipcodeDto> getListZipcode2() {
		return listZipcode2;
	}

	public void setListZipcode2(List<ZipcodeDto> listZipcode2) {
		this.listZipcode2 = listZipcode2;
	}

	public List<RegionDto> getListRegion2() {
		return listRegion2;
	}

	public void setListRegion2(List<RegionDto> listRegion2) {
		this.listRegion2 = listRegion2;
	}

	public TeacherModuleDto getTeacherModuleDtos() {
		return teacherModuleDtos;
	}

	public void setTeacherModuleDtos(TeacherModuleDto teacherModuleDtos) {
		this.teacherModuleDtos = teacherModuleDtos;
	}

	public UploadedFile getMyfile() {
		return myfile;
	}

	public void setMyfile(UploadedFile myfile) {
		this.myfile = myfile;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public TeacherModuleDto getSelectedteacherModuleDto() {
		return selectedteacherModuleDto;
	}

	public void setSelectedteacherModuleDto(
			TeacherModuleDto selectedteacherModuleDto) {
		this.selectedteacherModuleDto = selectedteacherModuleDto;
	}

	public TeacherModuleDto getTeacherModuleDto() {
		return teacherModuleDto;
	}

	public void setTeacherModuleDto(TeacherModuleDto teacherModuleDto) {
		this.teacherModuleDto = teacherModuleDto;
	}

	public IdentityTeacherDto getSelectedidentityTeacherDto() {
		return selectedidentityTeacherDto;
	}

	public void setSelectedidentityTeacherDto(
			IdentityTeacherDto selectedidentityTeacherDto) {
		this.selectedidentityTeacherDto = selectedidentityTeacherDto;
	}

	public CvteacherDto getCvteacherDto() {
		return cvteacherDto;
	}

	public void setCvteacherDto(CvteacherDto cvteacherDto) {
		this.cvteacherDto = cvteacherDto;
	}

	public CvteacherDto getCvteacherDtos() {
		return cvteacherDtos;
	}

	public void setCvteacherDtos(CvteacherDto cvteacherDtos) {
		this.cvteacherDtos = cvteacherDtos;
	}

	public CvteacherDto getSelectedcvteacherDto() {
		return selectedcvteacherDto;
	}

	public void setSelectedcvteacherDto(CvteacherDto selectedcvteacherDto) {
		this.selectedcvteacherDto = selectedcvteacherDto;
	}

	public List<CvteacherDto> getListexperienceprof() {
		if (cvteacherDto.getIdentityTeacher() != null) {
			CvteacherDto cvtserchaeacherDto = new CvteacherDto();
			cvtserchaeacherDto.setIdentityTeacher(cvteacherDto
					.getIdentityTeacher());
			logger.debug("TEST GET IDENTITY"+cvtserchaeacherDto.getIdentityTeacher());
			listexperienceprof = cvteacherServicewsEndpoint
					.searchCvteacherServicews(cvtserchaeacherDto);
			logger.debug(" @@@@@@@@@@@@@@ la taille de la liste est "+listexperienceprof.size());
		}
		return listexperienceprof;
	}

	public void setListexperienceprof(List<CvteacherDto> listexperienceprof) {
		this.listexperienceprof = listexperienceprof;
	}

	public DetailteacherDto getDetailteacherDto() {
		return detailteacherDto;
	}

	public void setDetailteacherDto(DetailteacherDto detailteacherDto) {
		this.detailteacherDto = detailteacherDto;
	}

	public DetailteacherDto getSelecteddetailteacherDto() {
		return selecteddetailteacherDto;
	}

	public void setSelecteddetailteacherDto(
			DetailteacherDto selecteddetailteacherDto) {
		this.selecteddetailteacherDto = selecteddetailteacherDto;
	}

	public DetailteacherDto getDetailteacherDtos() {
		return detailteacherDtos;
	}

	public void setDetailteacherDtos(DetailteacherDto detailteacherDtos) {
		this.detailteacherDtos = detailteacherDtos;
	}

	public List<DetailteacherDto> getListdetailprof() {
		logger.debug("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		return listdetailprof;
	}

	public void setListdetailprof(List<DetailteacherDto> listdetailprof) {
		this.listdetailprof = listdetailprof;
	}

	public List<TeacherModuleDto> getListdetal() {
         logger.debug("kkkkkkkkkkkkk");
		if (teacherModuleDto.getDetailteacher() != null) {
			logger.debug("llllllllllll");
			if (detailteacherDto.getIdentityTeacher() != null) {
				 logger.debug("mmmmmmmmmmmmmmmmm");
				TeacherModuleDto tm = new TeacherModuleDto();
				detailteacherDto.setIdDetailteacher(detailteacherDto
						.getIdentityTeacher().getIdIdentityTeacher());
				tm.setDetailteacher(teacherModuleDto.getDetailteacher());
				logger.debug("nnnnnnnnnnnnnnnnnnn"+detailteacherDto.getIdDetailteacher());
				listdetal = teachedModuleServicewsEndpoint
						.searchTeachedModuleServicews(tm);
			}

			detailteacherDto.setIdentityTeacher(detailteacherDto
					.getIdentityTeacher());
			listdetailprof = detailteacherServicewsEndpoint.searchDetailteacherServicews(detailteacherDto);
			logger.debug("taille detaille "+listdetailprof.size());

		}

		return listdetal;
	}

	public void setListdetal(List<TeacherModuleDto> listdetal) {
		this.listdetal = listdetal;
	}

	public List<PopuplistDto> getListhoraire() {
		return listhoraire;
	}

	public void setListhoraire(List<PopuplistDto> listhoraire) {
		this.listhoraire = listhoraire;
	}

	public List<PopuplistDto> getListmois() {
		return listmois;
	}

	public void setListmois(List<PopuplistDto> listmois) {
		this.listmois = listmois;
	}

	public List<PopuplistDto> getListfiliere() {
		return listfiliere;
	}

	public void setListfiliere(List<PopuplistDto> listfiliere) {
		this.listfiliere = listfiliere;
	}

	public List<PopuplistDto> getListanneeacademique() {
		return listanneeacademique;
	}

	public void setListanneeacademique(List<PopuplistDto> listanneeacademique) {
		this.listanneeacademique = listanneeacademique;
	}

	public List<PopuplistDto> getListpriorite() {
		return listpriorite;
	}

	public void setListpriorite(List<PopuplistDto> listpriorite) {
		this.listpriorite = listpriorite;
	}

	public List<AcademicModuleDto> getListmodule() {
		return listmodule;
	}

	public void setListmodule(List<AcademicModuleDto> listmodule) {
		this.listmodule = listmodule;
	}

	public boolean isAction1() {
		return action1;
	}

	public void setAction1(boolean action1) {
		this.action1 = action1;
	}

	public boolean isAction2() {
		return action2;
	}

	public void setAction2(boolean action2) {
		this.action2 = action2;
	}

	public List<PopuplistDto> getListspecialitedestination() {
		return listspecialitedestination;
	}

	public void setListspecialitedestination(
			List<PopuplistDto> listspecialitedestination) {
		this.listspecialitedestination = listspecialitedestination;
	}

	public List<PopuplistDto> getListspecialitesource() {
		return listspecialitesource;
	}

	public void setListspecialitesource(List<PopuplistDto> listspecialitesource) {
		this.listspecialitesource = listspecialitesource;
	}

	public List<PopuplistDto> getListsexe() {
		return listsexe;
	}

	public void setListsexe(List<PopuplistDto> listsexe) {
		this.listsexe = listsexe;
	}

	public List<IdentityTeacherDto> getListTeacher() {
		return listTeacher;
	}

	public void setListTeacher(List<IdentityTeacherDto> listTeacher) {
		this.listTeacher = listTeacher;
	}

	public IdentityTeacherDto getIdentityTeacherDto() {
		return identityTeacherDto;
	}

	public void setIdentityTeacherDto(IdentityTeacherDto identityTeacherDto) {
		this.identityTeacherDto = identityTeacherDto;
	}

	public IdentityTeacherDto getIdentityTeacherDtos() {
		return identityTeacherDtos;
	}

	public void setIdentityTeacherDtos(IdentityTeacherDto identityTeacherDtos) {
		this.identityTeacherDtos = identityTeacherDtos;
	}

	public TeacherModuleDto getTeacherDto() {
		return teacherDto;
	}

	public void setTeacherDto(TeacherModuleDto teacherDto) {
		this.teacherDto = teacherDto;
	}

	public TeacherModuleDto getTeacherDtos() {
		return teacherDtos;
	}

	public void setTeacherDtos(TeacherModuleDto teacherDtos) {
		this.teacherDtos = teacherDtos;
	}

	public List<CityDto> getListCity() {
		return listCity;
	}

	public void setListCity(List<CityDto> listCity) {
		this.listCity = listCity;
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

	public List<ZipcodeDto> getListZipcode() {
		return listZipcode;
	}

	public void setListZipcode(List<ZipcodeDto> listZipcode) {
		this.listZipcode = listZipcode;
	}

	public List<PopuplistDto> getListetatcivile() {
		return listetatcivile;
	}

	public void setListetatcivile(List<PopuplistDto> listetatcivile) {
		this.listetatcivile = listetatcivile;
	}

	public List<PopuplistDto> getListdocumentidentity() {
		return listdocumentidentity;
	}

	public void setListdocumentidentity(List<PopuplistDto> listdocumentidentity) {
		this.listdocumentidentity = listdocumentidentity;
	}

	public List<PopuplistDto> getListnationalite() {
		return listnationalite;
	}

	public void setListnationalite(List<PopuplistDto> listnationalite) {
		this.listnationalite = listnationalite;
	}

	public List<PopuplistDto> getListspecialite() {
		return listspecialite;
	}

	public void setListspecialite(List<PopuplistDto> listspecialite) {
		this.listspecialite = listspecialite;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public String getMaskphonformatteacher() {
		return maskphonformatteacher;
	}

	public void setMaskphonformatteacher(String maskphonformatteacher) {
		this.maskphonformatteacher = maskphonformatteacher;
	}
	
	public void onchangeCity(){
		
		if (identityTeacherDto.getCountryAddress().getIdCountry() != null) {
			
			if(listRegion.size() != 0){
				
				CityDto citysearch = new CityDto();
				citysearch.setRegion(identityTeacherDto.getRegionAddress());
				listCity = cityServicewsEndpoint.searchCityServicews(citysearch);
			}	

		}
	}
	
public void onchangeZipCode(){
		
		if (identityTeacherDto.getCountryAddress().getIdCountry() != null) {
			
			if(listCity.size() != 0){
				ZipcodeDto zipcodesearch = new ZipcodeDto();
				zipcodesearch.setCity(identityTeacherDto.getCityAddress());
				listZipcode = zipServicewsEndpoint.searchZipcodeServicews(zipcodesearch);
				
			}	

		}
	}
	
	public void maskPhone() {

		if (identityTeacherDto.getCountryAddress().getIdCountry() != null) {
			regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
			
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(identityTeacherDto.getCountryAddress());
			listRegion = regionServicewsEndpoint.searchRegionServicews(regionsearch);
		 	
		}

		if (identityTeacherDto.getCountryAddress().getIdCountry() != null) {
			maskphonformatteacher = "("
					+ identityTeacherDto.getCountryAddress()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (identityTeacherDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatteacher = maskphonformatteacher
					+ FormatNumberPhoneUtil.getFormat(identityTeacherDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}

		identityTeacherDto.setPhoneNumber("221");

		logger.debug("maskphonformatteacher:" + maskphonformatteacher);

	}

	public void initDualListcv(String caction) {

		if (caction.equals("1")) {
			cvteacherDto = selectedcvteacherDto;
			render2 = true;
			render4 = false;
			test = false;
			initUpdatecvprof();
		}

		else {
			cvteacherDto = new CvteacherDto();
			identityTeacherDto = identityTeacherDtos;
			render2 = true;
			test = false;
			render4 = false;

			try {

				if (identityTeacherDtos != null) {
					cvteacherServicewsEndpoint = cvteacherServicews
							.getCvteacherServicewsImplPort();
					cvteacherDto.setIdentityTeacher(identityTeacherDtos);

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			initCreatecvprof();
		}

	}

	public void initUpdatecvprof() {

		try {
			action1 = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreatecvprof() {
		try {
			action1 = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initDualListdetail(String daction) {
		logger.debug("debut init dualist detail");
		if (daction.equals("1")) {
			teacherModuleDto = teacherModuleDtos;
			identityTeacherDto = identityTeacherDtos;
			listhoraire = new ArrayList<PopuplistDto>();
			listpriorite = new ArrayList<PopuplistDto>();
			listmois = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			action = true;
			render2 = true;
			render5 = false;
			test = false;
			initUpdateteachermodule();
		}

		else {

			testdetail = true;
			teacherModuleDto = new TeacherModuleDto();
			detailteacherDto = new DetailteacherDto();
			identityTeacherDto = identityTeacherDtos;
			listhoraire = new ArrayList<PopuplistDto>();
			listpriorite = new ArrayList<PopuplistDto>();
			listmois = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			action = true;
			test = false;
			render2 = true;
			render5 = false;
			initCreatedetailprof();
			try {
				logger.debug("je suis dans le try");
				if (identityTeacherDtos != null) {
					logger.debug("111111111111111111111");
					detailteacherServicewsEndpoint = detailteacherServicews
							.getDetailteacherServicewsImplPort();
					teachedModuleServicewsEndpoint = teachedModuleServicews
							.getTeachedModuleServicewsImplPort();
					
					teacherModuleDto.setDetailteacher(detailteacherDto);
					detailteacherDto
							.setIdentityTeacher(identityTeacherDtos);
					logger.debug("id = "+detailteacherDto.getIdDetailteacher());
					logger.debug("id = "+detailteacherDto);
					

				}
			
			
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public void initUpdateteachermodule() {
		try {
			action2 = false;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listpriorite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("priorite");

			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");

			listmois = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mois");

			listhoraire = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("horaire");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreatedetailprof() {
		try {
			logger.debug("debut init create dualist detail");
			action2 = true;
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			teachedModuleServicewsEndpoint = teachedModuleServicews.getTeachedModuleServicewsImplPort();
			detailteacherServicewsEndpoint = detailteacherServicews.getDetailteacherServicewsImplPort();
			listpriorite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("priorite");

			listanneeacademique = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");

			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");

			listmois = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mois");

			listhoraire = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("horaire");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String enregistrerCvprof() {
		FacesMessage msg = null;
		try {
			CvteacherDto createcvprof = new CvteacherDto();
			createcvprof.setIdentityTeacher(identityTeacherDto);
			createcvprof.setStartDate(cvteacherDto.getStartDate());
			createcvprof.setEnDate(cvteacherDto.getEnDate());
			createcvprof.setDiploma(cvteacherDto.getDiploma());
			createcvprof.setLinkdiploma(file.getAbsolutePath());
			cvteacherServicewsEndpoint = cvteacherServicews
					.getCvteacherServicewsImplPort();
			createcvprof = cvteacherServicewsEndpoint
					.createCvteacherServicews(createcvprof);
		} catch (Exception ex) {

		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_cv_teacher"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		return null;
	}

	public String modifierCvprof() {
		FacesMessage msg = null;
		try {
			CvteacherDto cvprofmodif = new CvteacherDto();
			cvprofmodif.setIdentityTeacher(identityTeacherDto);
			cvprofmodif.setDiploma(cvteacherDto.getDiploma());
			cvprofmodif.setEnDate(cvteacherDto.getEnDate());
			cvprofmodif.setLinkdiploma(file.getAbsolutePath());
			cvprofmodif.setStartDate(cvteacherDto.getStartDate());
			cvteacherServicewsEndpoint = cvteacherServicews
					.getCvteacherServicewsImplPort();
			cvprofmodif.setIdCvteacher(cvteacherDto.getIdCvteacher());
			cvprofmodif = cvteacherServicewsEndpoint
					.updateCvteacherServicews(cvprofmodif);
			init();
		} catch (Exception ex) {
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_modif_cv_teacher"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public String supprimerCvprof() {
		FacesMessage msg = null;
		try {
			cvteacherServicewsEndpoint.deleteCvteacherServicews(cvteacherDtos);
			init();
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warn_delete_cvteacher"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_cvteacher"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public String enregistrerDetailprof() {
		FacesMessage msg = null;
		
		try {
			DetailteacherDto createdetailprof = new DetailteacherDto();
			createdetailprof.setHourRate(detailteacherDto.getHourRate());
			createdetailprof.setIdentityTeacher(identityTeacherDto);
			createdetailprof.setNumberOfHoursWorked(detailteacherDto
					.getNumberOfHoursWorked());
			createdetailprof.setStartHour(detailteacherDto.getStartHour());
			createdetailprof.setStopHour(detailteacherDto.getStopHour());
			createdetailprof
					.setWorkingMonth(detailteacherDto.getWorkingMonth());
			detailteacherServicewsEndpoint = detailteacherServicews
					.getDetailteacherServicewsImplPort();
			createdetailprof = detailteacherServicewsEndpoint
					.createDetailteacherServicews(createdetailprof);
			activatebuton();
			

		} catch (Exception ex) {

		}

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_detail_teacher"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		return null;
	}
	
	public void activatebuton(){
		testdetail = false;
	}

	public String addModuleTeacher() {
		FacesMessage msg = null;
		TeacherModuleDto teachermodulecreate = new TeacherModuleDto();
		logger.debug("*******JE SUIS DANS MODULE TEACHER*********");
		try {
			teachermodulecreate.setDetailteacher(detailteacherDto);
			logger.debug("******++DETAIL TEACHER +**+***+*+"+detailteacherDto);
			teachermodulecreate.setAcademicModule(teacherModuleDto
					.getAcademicModule());
			logger.debug("******++DETAIL TEACHER 22 +**+***+*+"+teacherModuleDto
					.getAcademicModule());
			teachermodulecreate.setAcademicSector(teacherModuleDto
					.getAcademicSector());
			logger.debug("******++DETAIL TEACHER 33 +**+***+*+"+teacherModuleDto
					.getAcademicSector());
			teachermodulecreate.setAcademiqueYear(teacherModuleDto
					.getAcademiqueYear());
			logger.debug("******++DETAIL TEACHER 44 +**+***+*+"+teacherModuleDto
					.getAcademiqueYear());
			teachermodulecreate.setPriority(teacherModuleDto.getPriority());
			logger.debug("******++DETAIL TEACHER 55 +**+***+*+"+teacherModuleDto.getPriority());
			teachedModuleServicewsEndpoint = teachedModuleServicews
					.getTeachedModuleServicewsImplPort();
			teachedModuleServicewsEndpoint
					.createTeachedModuleServicews(teachermodulecreate);

		} catch (Exception ex) {

		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_add_module_teacher"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		init();
		return null;
	}
	
	public String modifModuleTeacher() {
		FacesMessage msg = null;
		TeacherModuleDto teachermodulemodif = new TeacherModuleDto();
		try {
			teachermodulemodif.setDetailteacher(detailteacherDto);
			logger.debug("******++DETAIL TEACHER +**+***+*+"+detailteacherDto);
			teachermodulemodif.setAcademicModule(teacherModuleDto
					.getAcademicModule());
			teachermodulemodif.setAcademicSector(teacherModuleDto
					.getAcademicSector());
			teachermodulemodif.setAcademiqueYear(teacherModuleDto
					.getAcademiqueYear());
			teachermodulemodif.setPriority(teacherModuleDto.getPriority());
			teachermodulemodif.setIdTeacherModule(teacherModuleDto
					.getIdTeacherModule());
			teachedModuleServicewsEndpoint = teachedModuleServicews
					.getTeachedModuleServicewsImplPort();
			teachedModuleServicewsEndpoint
					.updateTeachedModuleServicews(teachermodulemodif);
			init();
		} catch (Exception ex) {
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_modif_module_teacher"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public String supprimerModuleteacher() {
		FacesMessage msg = null;

		try {
			teachedModuleServicewsEndpoint
					.deleteTeachedModuleServicews(teacherModuleDtos);
			init();
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warn_delete_teachermodule"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_teachermodule"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public void upload(FileUploadEvent event) throws IOException {
		FacesMessage msg = new FacesMessage("Success! ", event.getFile()
				.getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, msg);

		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
		String fname = cvteacherDto.getIdentityTeacher().getIdIdentityTeacher()
				+ fmt.format(new Date()) + event.getFile().getFileName();

		file = new File(destination + fname);

		filename = destination + fname;

		InputStream is = event.getFile().getInputstream();
		OutputStream out = new FileOutputStream(file);
		byte buf[] = new byte[1024];
		int len;
		while ((len = is.read(buf)) > 0)
			out.write(buf, 0, len);
		is.close();
		out.close();

	}

	public void loadPDF() throws IOException {

		cvteacherDto = cvteacherDtos;
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		HttpServletResponse response = (HttpServletResponse) externalContext
				.getResponse();
		String gul = cvteacherDto.getLinkdiploma();

		File file = new File(gul);
		BufferedInputStream input = null;
		BufferedOutputStream output = null;

		try {
			input = new BufferedInputStream(new FileInputStream(file),
					DEFAULT_BUFFER_SIZE);

			response.reset();
			response.setHeader("Content-Type", "application/pdf");
			response.setHeader("Content-Length", String.valueOf(file.length()));
			response.setHeader("Content-Disposition", "inline; filename=\""
					+ gul + "\"");
			output = new BufferedOutputStream(response.getOutputStream(),
					DEFAULT_BUFFER_SIZE);

			byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
			int length;
			while ((length = input.read(buffer)) > 0) {
				output.write(buffer, 0, length);
			}

			output.flush();
		} finally {

			close(output);
			close(input);
		}

		facesContext.responseComplete();
	}

	private static void close(Closeable resource) {
		if (resource != null) {
			try {
				resource.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}


	public String updateProf() {
		logger.debug("DEBUT modifierProf");
		IdentityTeacherDto teachermodif = new IdentityTeacherDto();
		FacesMessage msg = null;
		try {

			teachermodif
					.setAddressLigne1(identityTeacherDto.getAddressLigne1());
			teachermodif
					.setAddressLigne2(identityTeacherDto.getAddressLigne2());
			teachermodif
					.setAddressLigne3(identityTeacherDto.getAddressLigne3());
			teachermodif
					.setAddressLigne4(identityTeacherDto.getAddressLigne4());
			teachermodif.setBirthday(identityTeacherDto.getBirthday());
			teachermodif.setPlaceOfBirthday(identityTeacherDto.getPlaceOfBirthday());
			teachermodif.setPhoneNumber(identityTeacherDto.getPhoneNumber());
			teachermodif.setEmailAdd(identityTeacherDto.getEmailAdd());
			teachermodif.setNationality(identityTeacherDto.getNationality());
			teachermodif.setCityAddress(identityTeacherDto.getCityAddress());
			teachermodif.setCountryAddress(identityTeacherDto
					.getCountryAddress());
			teachermodif.setFirstName(identityTeacherDto.getFirstName());
			teachermodif.setIdentityNumber(identityTeacherDto
					.getIdentityNumber());
			teachermodif
					.setMaritalStatus(identityTeacherDto.getMaritalStatus());
			teachermodif.setName(identityTeacherDto.getName());
			teachermodif.setZipcodeAddress(identityTeacherDto
					.getZipcodeAddress());
			teachermodif.setTypeOfDocument(identityTeacherDto
					.getTypeOfDocument());
			teachermodif.setSexe(identityTeacherDto.getSexe());
			teachermodif.setSpeciality(identityTeacherDto.getSpeciality());
			teachermodif
					.setRegionAddress(identityTeacherDto.getRegionAddress());
			teachermodif.setCountryOfBirthday(identityTeacherDto
					.getCountryOfBirthday());

			identityTeacherServicewsEndpoint = identityTeacherServicews
					.getIdentityTeacherServicewsImplPort();

			teachermodif.setIdIdentityTeacher(identityTeacherDto
					.getIdIdentityTeacher());

			teachermodif = identityTeacherServicewsEndpoint
					.updateIdentityTeacherServicews(teachermodif);

			init();
			logger.debug("Fin Modification Prof  +++++++++++++");
		} catch (Exception ex) {

			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_prof"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;

	}

	public void createProf() {
		FacesMessage msg = null;

		IdentityTeacherDto teachercreate = new IdentityTeacherDto();

		identityTeacherServicewsEndpoint = identityTeacherServicews
				.getIdentityTeacherServicewsImplPort();
		teachercreate = identityTeacherServicewsEndpoint
				.createIdentityTeacherServicews(identityTeacherDto);

		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_prof"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			identityTeacherDto = identityTeacherDtos;
			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();
			listetatcivile = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();
			listspecialite = new ArrayList<PopuplistDto>();
			listsexe = new ArrayList<PopuplistDto>();
			action4 = true;
			action3= false;
			render2 = true;
			test = false;
			render3= false;

			initUpdate();
		} else {
			identityTeacherDto = new IdentityTeacherDto();
			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();
			listetatcivile = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();
			listspecialite = new ArrayList<PopuplistDto>();
			listsexe = new ArrayList<PopuplistDto>();
			action4 = true;
			action3= false;
			render2 = true;
			render3= false;
			test = false;

			initCreate();
		}
	}

	public void initUpdate() {
		try {
			logger.debug("end initUpdate");
			action = false;

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
			popuplistDtoServicewsEndpoint = popuplistDtoServicews.getPopuplistDtoServicewsImplPort();

			listCountry = countryServicewsEndpoint.getAllCountryServicews();
			listCity = cityServicewsEndpoint.getAllCityServicews();
			listRegion = regionServicewsEndpoint.getAllRegionServicews();
			listZipcode = zipServicewsEndpoint.getAllZipcodeServicews();
			
			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");

			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");

			listdocumentidentity = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");

			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");

			listspecialite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("speciality");

			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerProf() {
		FacesMessage msg = null;
		try {
			identityTeacherServicewsEndpoint
					.deleteIdentityTeacherServicews(identityTeacherDtos);
			init();
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warn_delete_prof"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_prof"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	public void initCreate() {
		try {
			action = true;
			identityTeacherServicewsEndpoint = identityTeacherServicews
					.getIdentityTeacherServicewsImplPort();

			teachedModuleServicewsEndpoint = teachedModuleServicews
					.getTeachedModuleServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");

			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");

			listdocumentidentity = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");

			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");

			listspecialite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("speciality");

			listCountry = countryServicewsEndpoint.getAllCountryServicews();

			listTeacher = identityTeacherServicewsEndpoint
					.getAllIdentityTeacherServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			identityTeacherServicewsEndpoint = identityTeacherServicews
					.getIdentityTeacherServicewsImplPort();

			teachedModuleServicewsEndpoint = teachedModuleServicews
					.getTeachedModuleServicewsImplPort();

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();

			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();

			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");

			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");

			listdocumentidentity = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");

			listspecialite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("speciality");

			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");

			moduleacademiqueServicewsEndpoint = moduleacademiqueServicews
					.getAcademicModuleDtoServicewsImplPort();
			listmodule = moduleacademiqueServicewsEndpoint
					.getAllAcademicModuleServicews();

			listCountry = countryServicewsEndpoint.getAllCountryServicews();


			listTeacher = identityTeacherServicewsEndpoint
					.getAllIdentityTeacherServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

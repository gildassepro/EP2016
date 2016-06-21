package org.sepro.inscriptionweb.bean;

import java.io.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;  
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;
import org.sepro.authentificationweb.serviceapi.ProfileDto;
import org.sepro.authentificationweb.serviceapi.ProfileDto.Modules;
import org.sepro.authentificationweb.serviceimpl.ProfileServicews;
import org.sepro.authentificationweb.serviceimpl.ProfileServicewsEndpoint;
import org.sepro.inscriptionweb.serviceapi.InscriptionAuthentificationDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionStepfourDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptreeDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptwoDto;
import org.sepro.inscriptionweb.serviceimpl.InscriptionAuthServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionAuthServicewsEndpoint;
import org.sepro.inscriptionweb.serviceimpl.InscriptionStepfourServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionStepfourServicewsEndpoint;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteponeServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteponeServicewsEndpoint;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptreeServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptreeServicewsEndpoint;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptwoServicews;
import org.sepro.inscriptionweb.serviceimpl.InscriptionSteptwoServicewsEndpoint;
import org.sepro.parameterweb.serviceapi.CityDto;
import org.sepro.parameterweb.serviceapi.CountryDto;
import org.sepro.parameterweb.serviceapi.CurriculumDto;
import org.sepro.parameterweb.serviceapi.LanguageDto;
import org.sepro.parameterweb.serviceapi.PhoneFormatDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
import org.sepro.parameterweb.serviceimpl.CityServicews;
import org.sepro.parameterweb.serviceimpl.CityServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CountryServicews;
import org.sepro.parameterweb.serviceimpl.CountryServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CurriculumDtoServicews;
import org.sepro.parameterweb.serviceimpl.CurriculumDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.RegionServicews;
import org.sepro.parameterweb.serviceimpl.RegionServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ZipServicews;
import org.sepro.parameterweb.serviceimpl.ZipServicewsEndpoint;

import sepro.education.web.util.FormatNumberPhoneUtil;

@ManagedBean
@SessionScoped
public class InscriptionSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(InscriptionSearchServiceBean.class);

	private InscriptionAuthServicews inscriptionServicews = new InscriptionAuthServicews();
	private InscriptionAuthServicewsEndpoint inscriptionServicewsEndpoint;

	private InscriptionSteponeServicews inscriptionSteponeServicews = new InscriptionSteponeServicews();
	private InscriptionSteponeServicewsEndpoint inscriptionSteponeServicewsEndpoint;

	private InscriptionSteptwoServicews inscriptionSteptwoServicews = new InscriptionSteptwoServicews();
	private InscriptionSteptwoServicewsEndpoint inscriptionSteptwoServicewsEndpoint;

	private InscriptionSteptreeServicews inscriptionSteptreeServicews = new InscriptionSteptreeServicews();
	private InscriptionSteptreeServicewsEndpoint inscriptionSteptreeServicewsEndpoint;

	private InscriptionStepfourServicews inscriptionStepfourServicews = new InscriptionStepfourServicews();
	private InscriptionStepfourServicewsEndpoint inscriptionStepfourServicewsEndpoint;

	private InscriptionAuthentificationDto inscriptionDto = new InscriptionAuthentificationDto();
	private InscriptionAuthentificationDto inscriptioDto = new InscriptionAuthentificationDto();

	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;

	private InscriptionSteponeDto inscription1Dto = new InscriptionSteponeDto();
	private InscriptionSteponeDto inscriptio1Dto = new InscriptionSteponeDto();

	private InscriptionSteptwoDto inscription2Dto = new InscriptionSteptwoDto();
	private InscriptionSteptwoDto inscriptio2Dto = new InscriptionSteptwoDto();
	private InscriptionSteptwoDto inscriptio2supDto = new InscriptionSteptwoDto();
	private InscriptionSteptwoDto inscriptio2testformDto = new InscriptionSteptwoDto();
	private List<InscriptionSteptwoDto> listparent = new ArrayList<InscriptionSteptwoDto>();

	private InscriptionSteptreeDto inscriptionStep3Dto = new InscriptionSteptreeDto();
	private InscriptionSteptreeDto inscriptionStep3Dtos = new InscriptionSteptreeDto();
	private InscriptionSteptreeDto inscriptionStep3supDtos = new InscriptionSteptreeDto();
	private List<InscriptionSteptreeDto> listdocinscriptions = new ArrayList<InscriptionSteptreeDto>();

	private InscriptionStepfourDto inscriptionStep4Dto = new InscriptionStepfourDto();
	private InscriptionStepfourDto inscriptionStep4Dtos = new InscriptionStepfourDto();
	private InscriptionStepfourDto inscriptionStep4supDtos = new InscriptionStepfourDto();
	private List<InscriptionStepfourDto> listestablishment = new ArrayList<InscriptionStepfourDto>();

	private CurriculumDtoServicews curriculumDtoServicews = new CurriculumDtoServicews();
	private CurriculumDtoServicewsEndpoint curriculumDtoServicewsEndpoint;
	private CurriculumDto curriculumDto = new CurriculumDto();

	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;

	private List<RegionDto> listregion = new ArrayList<RegionDto>();

	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;
	private List<CityDto> listcity = new ArrayList<CityDto>();

	private ZipServicews zipServicews = new ZipServicews();
	private ZipServicewsEndpoint zipServicewsEndpoint;
	private List<ZipcodeDto> listzipcode = new ArrayList<ZipcodeDto>();

	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private List<CountryDto> listcountry = new ArrayList<CountryDto>();

	private ProfileServicews profileServicews = new ProfileServicews();
	private ProfileServicewsEndpoint profileServicewsEndpoint;
	private List<ProfileDto> listProfile = new ArrayList<ProfileDto>();

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;

	private List<PopuplistDto> listetatcivile = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listdocument = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listdocumentschool = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listlienparante = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listtypedecontact = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listnationalite = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listsexe = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listtypecontact = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listmention = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listacademiqueyear = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listyears = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listcursus = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listdocstatus = new ArrayList<PopuplistDto>();
	private List<ProgrammeCalendarDto> listeProgramme = new ArrayList<ProgrammeCalendarDto>();
	private List<CurriculumDto> listCursus = new ArrayList<CurriculumDto>();
	private String maskphonformat;
	private String maskphonformatparent;
	private boolean action = false;
	private boolean test = true;
	private boolean test2 = true;
	private boolean test3 = true;
	private boolean testmodifier = false;
	private boolean testparent = true;
	private boolean testmodifier2 = false;
	private boolean testmodifier3 = false;
	private boolean testcursus = true;
	private boolean testdoc = true;
	private boolean testlist = true;
	private boolean testlistparent = false;
	private boolean testlistcursus = false;
	private boolean testlistdoc = false;
	private boolean testmodif = true;
	private UploadedFile myfile;
	private Calendar now = Calendar.getInstance();
	private String filename;
	private String destination = "D:\\Test\\";
	File file;
	private static final int DEFAULT_BUFFER_SIZE = 10240; // 10KB.
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public void loadPDF() throws IOException {

        // Prepare.
		inscriptionStep3Dto = inscriptionStep3Dtos;
		
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
        String  gul = inscriptionStep3Dto.getNameOfDocument();
        
        
        File file = new File(gul);
        BufferedInputStream input = null;
        BufferedOutputStream output = null;

        try {
            // Open file.
            input = new BufferedInputStream(new FileInputStream(file), DEFAULT_BUFFER_SIZE);

            response.reset();
            response.setHeader("Content-Type", "application/pdf");
            response.setHeader("Content-Length", String.valueOf(file.length()));
            response.setHeader("Content-Disposition", "inline; filename=\"" + gul + "\"");
            output = new BufferedOutputStream(response.getOutputStream(), DEFAULT_BUFFER_SIZE);

            
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
    
  
    
	public InscriptionSteptreeDto getInscriptionStep3supDtos() {
		return inscriptionStep3supDtos;
	}

	public void setInscriptionStep3supDtos(
			InscriptionSteptreeDto inscriptionStep3supDtos) {
		this.inscriptionStep3supDtos = inscriptionStep3supDtos;
	}

	public InscriptionStepfourDto getInscriptionStep4supDtos() {
		return inscriptionStep4supDtos;
	}

	public void setInscriptionStep4supDtos(
			InscriptionStepfourDto inscriptionStep4supDtos) {
		this.inscriptionStep4supDtos = inscriptionStep4supDtos;
	}

	public boolean isTest2() {
		return test2;
	}

	public void setTest2(boolean test2) {
		this.test2 = test2;
	}

	public boolean isTest3() {
		return test3;
	}

	public void setTest3(boolean test3) {
		this.test3 = test3;
	}

	public boolean isTestmodifier2() {
		return testmodifier2;
	}

	public void setTestmodifier2(boolean testmodifier2) {
		this.testmodifier2 = testmodifier2;
	}

	public boolean isTestmodifier3() {
		return testmodifier3;
	}

	public void setTestmodifier3(boolean testmodifier3) {
		this.testmodifier3 = testmodifier3;
	}

	public boolean isTestcursus() {
		return testcursus;
	}

	public void setTestcursus(boolean testcursus) {
		this.testcursus = testcursus;
	}

	public boolean isTestlistcursus() {
		return testlistcursus;
	}

	public void setTestlistcursus(boolean testlistcursus) {
		this.testlistcursus = testlistcursus;
	}

	public boolean isTestlistdoc() {
		return testlistdoc;
	}

	public void setTestlistdoc(boolean testlistdoc) {
		this.testlistdoc = testlistdoc;
	}

	public InscriptionSteptwoDto getInscriptio2testformDto() {
		return inscriptio2testformDto;
	}

	public void setInscriptio2testformDto(
			InscriptionSteptwoDto inscriptio2testformDto) {
		this.inscriptio2testformDto = inscriptio2testformDto;
	}

	public String getMaskphonformatparent() {
		return maskphonformatparent;
	}

	public void setMaskphonformatparent(String maskphonformatparent) {
		this.maskphonformatparent = maskphonformatparent;
	}

	public String getMaskphonformat() {
		return maskphonformat;
	}

	public void setMaskphonformat(String maskphonformat) {
		this.maskphonformat = maskphonformat;
	}

	public boolean isTestlistparent() {
		return testlistparent;
	}

	public void setTestlistparent(boolean testlistparent) {
		this.testlistparent = testlistparent;
	}

	public boolean isTestmodifier() {
		return testmodifier;
	}

	public void setTestmodifier(boolean testmodifier) {
		this.testmodifier = testmodifier;
	}

	public InscriptionSteptwoDto getInscriptio2supDto() {
		return inscriptio2supDto;
	}

	public void setInscriptio2supDto(InscriptionSteptwoDto inscriptio2supDto) {
		this.inscriptio2supDto = inscriptio2supDto;
	}

	public boolean isTestmodif() {
		return testmodif;
	}

	public void setTestmodif(boolean testmodif) {
		this.testmodif = testmodif;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public boolean isTestdoc() {
		return testdoc;
	}

	public void setTestdoc(boolean testdoc) {
		this.testdoc = testdoc;
	}

	public boolean isTestlist() {
		return testlist;
	}

	public void setTestlist(boolean testlist) {
		this.testlist = testlist;
	}

	public boolean isTestparent() {
		return testparent;
	}

	public void setTestparent(boolean testparent) {
		this.testparent = testparent;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public List<PopuplistDto> getListdocumentschool() {
		return listdocumentschool;
	}

	public void setListdocumentschool(List<PopuplistDto> listdocumentschool) {
		this.listdocumentschool = listdocumentschool;
	}

	public InscriptionSteptreeDto getInscriptionStep3Dto() {
		return inscriptionStep3Dto;
	}

	public void setInscriptionStep3Dto(
			InscriptionSteptreeDto inscriptionStep3Dto) {
		this.inscriptionStep3Dto = inscriptionStep3Dto;
	}

	public InscriptionSteptreeDto getInscriptionStep3Dtos() {
		return inscriptionStep3Dtos;
	}

	public void setInscriptionStep3Dtos(
			InscriptionSteptreeDto inscriptionStep3Dtos) {
		this.inscriptionStep3Dtos = inscriptionStep3Dtos;
	}

	public CurriculumDto getCurriculumDto() {
		return curriculumDto;
	}

	public void setCurriculumDto(CurriculumDto curriculumDto) {
		this.curriculumDto = curriculumDto;
	}

	public List<PopuplistDto> getListacademiqueyear() {
		return listacademiqueyear;
	}

	public void setListacademiqueyear(List<PopuplistDto> listacademiqueyear) {
		this.listacademiqueyear = listacademiqueyear;
	}

	public List<PopuplistDto> getListfiliere() {
		return listfiliere;
	}

	public void setListfiliere(List<PopuplistDto> listfiliere) {
		this.listfiliere = listfiliere;
	}

	public List<PopuplistDto> getListyears() {
		return listyears;
	}

	public void setListyears(List<PopuplistDto> listyears) {
		this.listyears = listyears;
	}

	public List<PopuplistDto> getListcursus() {
		return listcursus;
	}

	public void setListcursus(List<PopuplistDto> listcursus) {
		this.listcursus = listcursus;
	}

	public List<PopuplistDto> getListdocstatus() {
		return listdocstatus;
	}

	public void setListdocstatus(List<PopuplistDto> listdocstatus) {
		this.listdocstatus = listdocstatus;
	}

	public List<ProgrammeCalendarDto> getListeProgramme() {
		return listeProgramme;
	}

	public void setListeProgramme(List<ProgrammeCalendarDto> listeProgramme) {
		this.listeProgramme = listeProgramme;
	}

	public List<CurriculumDto> getListCursus() {
		return listCursus;
	}

	public void setListCursus(List<CurriculumDto> listCursus) {
		this.listCursus = listCursus;
	}

	public UploadedFile getMyfile() {
		return myfile;
	}

	public void setMyfile(UploadedFile myfile) {
		this.myfile = myfile;
	}

	public Calendar getNow() {
		return now;
	}

	public void setNow(Calendar now) {
		this.now = now;
	}

	public InscriptionStepfourDto getInscriptionStep4Dto() {
		return inscriptionStep4Dto;
	}

	public void setInscriptionStep4Dto(
			InscriptionStepfourDto inscriptionStep4Dto) {
		this.inscriptionStep4Dto = inscriptionStep4Dto;
	}

	public InscriptionStepfourDto getInscriptionStep4Dtos() {
		return inscriptionStep4Dtos;
	}

	public void setInscriptionStep4Dtos(
			InscriptionStepfourDto inscriptionStep4Dtos) {
		this.inscriptionStep4Dtos = inscriptionStep4Dtos;
	}

	public List<InscriptionStepfourDto> getListestablishment() {

		logger.debug("debut getListestablishment ");
		if (inscriptionStep4Dto.getInscriptionAuthentification() != null) {
			logger.debug("getlistestablishment "
					+ inscriptionStep4Dto.getIdInscriptionStepfour());
			listestablishment = inscriptionStepfourServicewsEndpoint
					.searchInscriptionStepfourServicews(inscriptionStep4Dto);

			logger.debug("taille liste etablissement = "
					+ listestablishment.size());
		}
		logger.debug("fin getListestablishment ");
		return listestablishment;
	}

	public void setListestablishment(
			List<InscriptionStepfourDto> listestablishment) {
		this.listestablishment = listestablishment;
	}

	public void maskPhone() {
		
		if (inscription1Dto.getCountryAddress().getIdCountry() != null){
			
					regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
					countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
					RegionDto regionsearch = new RegionDto();
					regionsearch.setCountry(inscription1Dto.getCountryAddress());
					listregion = regionServicewsEndpoint.searchRegionServicews(regionsearch);
					
//					CityDto citysearch = new CityDto();
//					citysearch.setRegion(inscription1Dto.getRegionAddress());
//					logger.debug(" @@@@@@@@@@@ je vais en ville "+citysearch.getRegion().getRegionName());
//					listcity = cityServicewsEndpoint.searchCityServicews(citysearch);
//					logger.debug("la taille de la liste villlllle est "+listcity.size());
//					
//					ZipcodeDto zipcodesearch = new ZipcodeDto();
//					zipcodesearch.setCity(inscription1Dto.getCityAddress());
//					logger.debug("@@@@@@@@@@@@@@@@ je vais en code "+zipcodesearch.getCity().getCityName());
//					listzipcode = zipServicewsEndpoint.searchZipcodeServicews(zipcodesearch);
//					logger.debug("la taille de la liste zippppppppp est "+listzipcode.size());
		  }
		
	

		if (inscription1Dto.getCountryAddress().getIdCountry() != null) {
			maskphonformat = "("
					+ inscription1Dto.getCountryAddress()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (inscription1Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscription1Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		inscription1Dto.setPhoneNumber("221");
		logger.debug("maskphonformat:" + maskphonformat);

	}

	public void maskPhoneparent() {
          
		
		if (inscription2Dto.getCountryAddress().getIdCountry() != null){
			
			regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(inscription2Dto.getCountryAddress());
			listregion = regionServicewsEndpoint.searchRegionServicews(regionsearch);
	   
  }
		if (inscription2Dto.getCountryAddress().getIdCountry() != null) {
			maskphonformatparent = "("
					+ inscription2Dto.getCountryAddress()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (inscription2Dto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscription2Dto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		inscription1Dto.setPhoneNumber("221");
		logger.debug("maskphonformatparent:" + maskphonformatparent);

	}

	public List<InscriptionSteptreeDto> getListdocinscriptions() {
		logger.debug("debut getListdocinscription ");
		if (inscriptionStep3Dto.getInscriptionAuthentification() != null) {
			logger.debug("getListdocinscription "
					+ inscriptionStep3Dto.getIdInscriptionSteptree());
			listdocinscriptions = inscriptionSteptreeServicewsEndpoint
					.searchInscriptionSteptreeServicews(inscriptionStep3Dto);

			logger.debug("taille liste Listdocinscription = "
					+ listdocinscriptions.size());
		}
		logger.debug("fin getListdocinscription ");
		return listdocinscriptions;
	}

	public void setListdocinscriptions(
			List<InscriptionSteptreeDto> listdocinscriptions) {
		this.listdocinscriptions = listdocinscriptions;
	}

	public List<PopuplistDto> getListtypecontact() {
		return listtypecontact;
	}

	public void setListtypecontact(List<PopuplistDto> listtypecontact) {
		this.listtypecontact = listtypecontact;
	}

	public List<PopuplistDto> getListmention() {
		return listmention;
	}

	public void setListmention(List<PopuplistDto> listmention) {
		this.listmention = listmention;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public List<PopuplistDto> getListsexe() {
		return listsexe;
	}

	public void setListsexe(List<PopuplistDto> listsexe) {
		this.listsexe = listsexe;
	}

	public List<PopuplistDto> getListnationalite() {
		return listnationalite;
	}

	public void setListnationalite(List<PopuplistDto> listnationalite) {
		this.listnationalite = listnationalite;
	}

	public List<InscriptionSteptwoDto> getListparent() {
		logger.debug("debut getListparent ");
		if (inscription2Dto.getInscriptionAuthentification() != null) {
			logger.debug("getListparent "
					+ inscription2Dto.getIdInscriptionSteptwo());
			listparent = inscriptionSteptwoServicewsEndpoint
					.searchInscriptionSteptwoServicews(inscription2Dto);
			logger.debug("taille liste parent = " + listparent.size());
		}
		logger.debug("fin getListparent ");
		return listparent;
	}

	public void setListparent(List<InscriptionSteptwoDto> listparent) {
		this.listparent = listparent;
	}

	public List<PopuplistDto> getListtypedecontact() {
		return listtypedecontact;
	}

	public void setListtypedecontact(List<PopuplistDto> listtypedecontact) {
		this.listtypedecontact = listtypedecontact;
	}

	public List<PopuplistDto> getListlienparante() {
		return listlienparante;
	}

	public void setListlienparante(List<PopuplistDto> listlienparante) {
		this.listlienparante = listlienparante;
	}

	public InscriptionSteptwoDto getInscription2Dto() {
		return inscription2Dto;
	}

	public void setInscription2Dto(InscriptionSteptwoDto inscription2Dto) {
		this.inscription2Dto = inscription2Dto;
	}

	public InscriptionSteptwoDto getInscriptio2Dto() {
		return inscriptio2Dto;
	}

	public void setInscriptio2Dto(InscriptionSteptwoDto inscriptio2Dto) {
		this.inscriptio2Dto = inscriptio2Dto;
	}

	public List<RegionDto> getListregion() {
		return listregion;
	}

	public void setListregion(List<RegionDto> listregion) {
		this.listregion = listregion;
	}

	public List<CityDto> getListcity() {
		return listcity;
	}

	public void setListcity(List<CityDto> listcity) {
		this.listcity = listcity;
	}

	public List<ZipcodeDto> getListzipcode() {
		return listzipcode;
	}

	public void setListzipcode(List<ZipcodeDto> listzipcode) {
		this.listzipcode = listzipcode;
	}

	public List<PopuplistDto> getListdocument() {
		return listdocument;
	}

	public void setListdocument(List<PopuplistDto> listdocument) {
		this.listdocument = listdocument;
	}

	public List<PopuplistDto> getListetatcivile() {
		return listetatcivile;
	}

	public void setListetatcivile(List<PopuplistDto> listetatcivile) {
		this.listetatcivile = listetatcivile;
	}

	public List<CountryDto> getListcountry() {
		return listcountry;
	}

	public void setListcountry(List<CountryDto> listcountry) {
		this.listcountry = listcountry;
	}

	public List<ProfileDto> getListProfile() {
		return listProfile;
	}

	public void setListProfile(List<ProfileDto> listProfile) {
		this.listProfile = listProfile;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public InscriptionAuthentificationDto getInscriptionDto() {
		return inscriptionDto;
	}

	public void setInscriptionDto(InscriptionAuthentificationDto inscriptionDto) {
		this.inscriptionDto = inscriptionDto;
	}

	public InscriptionAuthentificationDto getInscriptioDto() {
		return inscriptioDto;
	}

	public void setInscriptioDto(InscriptionAuthentificationDto inscriptioDto) {
		this.inscriptioDto = inscriptioDto;
	}

	public InscriptionSteponeDto getInscription1Dto() {
		return inscription1Dto;
	}

	public void setInscription1Dto(InscriptionSteponeDto inscription1Dto) {
		this.inscription1Dto = inscription1Dto;
	}

	public InscriptionSteponeDto getInscriptio1Dto() {
		return inscriptio1Dto;
	}

	public void setInscriptio1Dto(InscriptionSteponeDto inscriptio1Dto) {
		this.inscriptio1Dto = inscriptio1Dto;
	}
	
	
	public void updateListville() {
	if (inscription1Dto.getRegionAddress().getIdRegion() != null){
	CityDto citysearch = new CityDto();
	citysearch.setRegion(inscription1Dto.getRegionAddress());
	listcity = cityServicewsEndpoint.searchCityServicews(citysearch);
	}
	}
	
	public void updateListzipcode() {
		if (inscription1Dto.getRegionAddress().getIdRegion() != null){
		ZipcodeDto zipcodesearch = new ZipcodeDto();
		zipcodesearch.setCity(inscription1Dto.getCityAddress());
		listzipcode = zipServicewsEndpoint.searchZipcodeServicews(zipcodesearch);
		}
		}
	
	public void updateListvilleparent() {
		if (inscription2Dto.getRegionAddress().getIdRegion() != null){
		CityDto citysearch = new CityDto();
		citysearch.setRegion(inscription2Dto.getRegionAddress());
		listcity = cityServicewsEndpoint.searchCityServicews(citysearch);
		}
		}
		
		public void updateListzipcodeparent() {
			if (inscription2Dto.getRegionAddress().getIdRegion() != null){
			ZipcodeDto zipcodesearch = new ZipcodeDto();
			zipcodesearch.setCity(inscription2Dto.getCityAddress());
			listzipcode = zipServicewsEndpoint.searchZipcodeServicews(zipcodesearch);
			}
			}
	public void testform() {
		
		
		if ((inscription1Dto != null && inscription1Dto.getName().length() != 0)
				&& (inscription1Dto != null && inscription1Dto.getFirstName()
						.length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getPlaceOfBirthday().length() != 0)
				&& (inscription1Dto != null && inscription1Dto.getPhoneNumber()
						.length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getIdentityNumber().length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getTypeOfDocument().getValue().length() != 0)
				&& (inscription1Dto != null && inscription1Dto.getSexe()
						.getValue().length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getMaritalStatus().getValue().length() != 0)
				&& (inscription1Dto != null && inscription1Dto.getNationality()
						.getValue().length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getCountryAddress().getCountryName().length() != 0)

				&& (inscription1Dto != null && inscription1Dto
						.getCountryOfBirthday().getCountryName().length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getRegionAddress().getRegionName().length() != 0)
				&& (inscription1Dto != null && inscription1Dto.getCityAddress()
						.getCityName().length() != 0)
				&& (inscription1Dto != null && inscription1Dto
						.getZipcodeAddress().getAreaName().length() != 0))
			

			test = false;
		else
			test = true;
		}
		
	

	public void upload(FileUploadEvent event) throws IOException {
		logger.debug("File name:" + event.getFile().getFileName());

		FacesMessage msg = new FacesMessage("Success! ", event.getFile()
				.getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, msg);

		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
		String fname = inscriptionDto.getIdInscription()
				+ fmt.format(new Date()) + event.getFile().getFileName();

		file = new File(destination + fname);

		filename = destination + fname;

		logger.debug("Le chemin acces est:" + filename);

		InputStream is = event.getFile().getInputstream();
		OutputStream out = new FileOutputStream(file);
		byte buf[] = new byte[1024];
		int len;
		while ((len = is.read(buf)) > 0)
			out.write(buf, 0, len);
		is.close();
		out.close();

	}
	
	public void upload2(FileUploadEvent event) throws IOException {
		logger.debug("File name:" + event.getFile().getFileName());

		FacesMessage msg = new FacesMessage("Success! ", event.getFile()
				.getFileName() + " is uploaded.");
		FacesContext.getCurrentInstance().addMessage(null, msg);

		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
		String fname = inscriptionDto.getIdInscription()
				+ fmt.format(new Date()) + event.getFile().getFileName();

		file = new File(destination + fname);

		filename = destination + fname;

		logger.debug("Le chemin acces est:" + filename);

		InputStream is = event.getFile().getInputstream();
		OutputStream out = new FileOutputStream(file);
		byte buf[] = new byte[1024];
		int len;
		while ((len = is.read(buf)) > 0)
			out.write(buf, 0, len);
		is.close();
		out.close();

	}
	
	
	
	
	public void testformListCursus() {
		logger.debug("@@@@@@@@@@@@ testlist");
		if ((inscriptionStep4Dto != null && inscriptionStep4Dto
				.getNameOfScool().length() != 0)
				&& (inscriptionStep4Dto != null && inscriptionStep4Dto
						.getContactName().length() != 0)
				&& (inscriptionStep4Dto != null && inscriptionStep4Dto
						.getContactTelephoneNumber().length() != 0)
				&& (inscriptionStep4Dto != null && inscriptionStep4Dto
						.getDiploma().length() != 0)
				&& (inscriptionStep4Dto != null && inscriptionStep4Dto
						.getContactEmail().length() != 0)
				&& (inscriptionStep4Dto != null && inscriptionStep4Dto
						.getGrade().getValue().length() != 0)
				&& (inscriptionStep4Dto != null && inscriptionStep4Dto
						.getTypeOfContact().getValue().length() != 0))

			testlist = false;

		else
			testlist = true;
	}

	public void testformTeleversement() {
		if ((inscriptionStep3Dto != null && inscriptionStep3Dto
				.getAcademicSector().getValue().length() != 0)
				&& (inscriptionStep3Dto != null && inscriptionStep3Dto
						.getAcademicYear().getValue().length() != 0)
				 && (inscriptionStep3Dto!= null &&
						 inscriptionStep3Dto.getTypeOfDocument().getValue().length() != 0)
				&& (inscriptionStep3Dto != null && inscriptionStep3Dto
						.getProgrammeCalendar().getProgramme()
						.getNameProgramme().length() != 0) && (inscriptionStep3Dto!= null &&
								 inscriptionStep3Dto.getDescription().length() != 0))

			testdoc = false;

		else
			testdoc = true;
	}

	public void initUpdate() {
		try {
			action = false;
			logger.debug("end initUpdate");

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listmention = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mention");
			
			listtypecontact = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typecontact");

			testmodif = false;

			logger.debug("fin dual");

			logger.debug("end init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateDocumentCurriculum() {
		logger.debug("DEBUT createListe ***********");
		FacesMessage msg = null;
		InscriptionSteptreeDto modifdocument = new InscriptionSteptreeDto();

		modifdocument
				.setAcademicSector(inscriptionStep3Dto.getAcademicSector());
		modifdocument.setAcademicYear(inscriptionStep3Dto.getAcademicYear());
		modifdocument
				.setNameOfDocument(inscriptionStep3Dto.getNameOfDocument());
		modifdocument.setProgrammeCalendar(inscriptionStep3Dto
				.getProgrammeCalendar());
		modifdocument.setStepStartDate(inscriptionStep3Dto.getStepStartDate());
		modifdocument
				.setTypeOfDocument(inscriptionStep3Dto.getTypeOfDocument());
		modifdocument.setDescription(inscriptionStep3Dto.getDescription());

		inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews
				.getInscriptionSteptreeServicewsImplPort();
		modifdocument.setIdInscriptionSteptree(inscriptionStep3Dto
				.getIdInscriptionSteptree());

		modifdocument = inscriptionSteptreeServicewsEndpoint
				.updateInscriptionSteptreeServicews(modifdocument);

		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN createListe ****************");
	}

	public void initCreate() {
		try {
			logger.debug("fin initCreate");
			action = true;

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			
			listmention = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mention");
			
			listtypecontact = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typecontact");
			
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {

			inscriptionStep4Dto = inscriptionStep4Dtos;
			listmention = new ArrayList<PopuplistDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			initUpdate();

		} else {

			inscriptionStep4Dto = new InscriptionStepfourDto();
			listmention = new ArrayList<PopuplistDto>();
			listtypecontact = new ArrayList<PopuplistDto>();

			initCreate();

		}
		logger.debug("FIN CREATE DOCUMENT INSCRIPTION+++++++++++++");
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");

			inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews
					.getInscriptionStepfourServicewsImplPort();

			inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews
					.getInscriptionSteptreeServicewsImplPort();

			profileServicewsEndpoint = profileServicews
					.getProfileServicewsImplPort();
			listProfile = profileServicewsEndpoint.getAllProfileServicews();

			curriculumDtoServicewsEndpoint = curriculumDtoServicews
					.getCurriculumDtoServicewsImplPort();

			programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews
					.getProgrammeCalendarDtoServicewsImplPort();

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			listcountry = countryServicewsEndpoint.getAllCountryServicews();

			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();

			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
            listzipcode = zipServicewsEndpoint.getAllZipcodeServicews();
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();
			
			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");

			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");
			
			listdocument = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");
			
			listtypedecontact = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("lien");
			
			listlienparante = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("lien");
			
			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");
			
			listmention = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mention");
			
			listtypecontact = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typecontact");
			
			listacademiqueyear = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			
			listfiliere = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("filiere");
			
			listyears = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("academic_years");
			
			listdocumentschool = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typedoc");
			
			listCursus = curriculumDtoServicewsEndpoint
					.getAllCurriculumDServicews();

			listeProgramme = programmeCalendarDtoServicewsEndpoint
					.getAllProgrammeCalendarServicews();

			listzipcode = zipServicewsEndpoint.getAllZipcodeServicews();

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String createCompte() {
		InscriptionAuthentificationDto compte = new InscriptionAuthentificationDto();
		try {

			compte.setEmailAdd(inscriptionDto.getEmailAdd());
			compte.setPassword(inscriptionDto.getPassword());
			compte.setProfile(inscriptionDto.getProfile());
			inscriptionServicewsEndpoint = inscriptionServicews
					.getInscriptionAuthServicewsImplPort();
			compte = inscriptionServicewsEndpoint
					.createInscriptionAuthServicews(compte);
			inscriptionDto = compte;
		} catch (Exception e) {
			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_compte")));
		return null;

	}

	public void testformparent() {
		
if(inscription2Dto.getRegionAddress().getIdRegion() != null ){
			
			CityDto citysearch = new CityDto();
			citysearch.setRegion(inscription2Dto.getRegionAddress());
			logger.debug("JE VAIS EN VILLE "+citysearch.getRegion().getRegionName());
			listcity = cityServicewsEndpoint.searchCityServicews(citysearch);
			logger.debug("la taille de la liste est "+listcity.size());
			
		if ((inscription2Dto != null && inscription2Dto.getName().length() != 0)
				&& (inscription2Dto != null && inscription2Dto
						.getEmailAddress().length() != 0)
				&& (inscription2Dto != null && inscription2Dto
						.getCountryAddress().getCountryName().length() != 0)
				&& (inscription2Dto != null && inscription2Dto.getCityAddress()
						.getCityName().length() != 0)
				&& (inscription2Dto != null && inscription2Dto
						.getRelationship().getValue().length() != 0)
				&& (inscription2Dto != null && inscription2Dto.getFirstName()
						.length() != 0)
				&& (inscription2Dto != null && inscription2Dto.getPhoneNumber()
						.length() != 0)
				&& (inscription2Dto != null && inscription2Dto
						.getRegionAddress().getRegionName().length() != 0)
				&& (inscription2Dto != null && inscription2Dto
						.getZipcodeAddress().getAreaName().length() != 0)
				&& (inscription2Dto != null && inscription2Dto
						.getTypeOfContact().getValue().length() != 0))

			testparent = false;

		else
			testparent = true;
	}
	
}

	public void redirect2(String chemin) {
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/declaration.xhtml")) {
			createCompte();
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void redirectionsuivant(String chemin) {
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/parent.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/listecurriculum.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void redirectionsuivant2(String chemin) {
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/televersement.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/validation.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void redirectionprecedent2(String chemin) {
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/parent.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/listecurriculum.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/televersement.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void redirectionprecedent(String chemin) {
		logger.debug("redirectionprecedent");
		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/declaration.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (chemin
				.equals("/sepro.education.portal/education/inscriptions/compte.xhtml")) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(chemin);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void enregistrerInscriptionstepone() {
		try {
			logger.debug("@@@@@@@@ debut enregistrement etape 1");
			InscriptionSteponeDto etape1 = new InscriptionSteponeDto();
			etape1.setBirthday(inscription1Dto.getBirthday());
			etape1.setCityAddress(inscription1Dto.getCityAddress());
			etape1.setCountryAddress(inscription1Dto.getCountryAddress());
			etape1.setCountryOfBirthday(inscription1Dto.getCountryOfBirthday());
			etape1.setFirstName(inscription1Dto.getFirstName());
			etape1.setIdentityNumber(inscription1Dto.getIdentityNumber());
			
			etape1.setMaritalStatus(inscription1Dto.getMaritalStatus());
			etape1.setName(inscription1Dto.getName());
			etape1.setNationality(inscription1Dto.getNationality());
			etape1.setPhoneNumber(inscription1Dto.getPhoneNumber());
			etape1.setPlaceOfBirthday(inscription1Dto.getPlaceOfBirthday());
			etape1.setRegionAddress(inscription1Dto.getRegionAddress());
			etape1.setSexe(inscription1Dto.getSexe());
			etape1.setTypeOfDocument(inscription1Dto.getTypeOfDocument());
			etape1.setZipcodeAddress(inscription1Dto.getZipcodeAddress());
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			etape1.setStepStartDate(nowGregorian);
			etape1.setStepIndicator(1L);
			logger.debug("@@@@@@@@ avant email");
			etape1.setInscriptionAuthentification(inscriptionDto);
			logger.debug("@@@@@@@@ aprés email");
			inscriptionSteponeServicewsEndpoint = inscriptionSteponeServicews
					.getInscriptionSteponeServicewsImplPort();
			logger.debug("@@@@@@@@ aprés ouverture port");
			etape1 = inscriptionSteponeServicewsEndpoint
					.createInscriptionSteponeServicews(etape1);
			logger.debug("@@@@@@@@ fin creation");

		} catch (Exception e) {

		}
	}
	
	public void enregistrerInscriptionSteponebrouillon() {
		try {
			InscriptionSteponeDto etape1 = new InscriptionSteponeDto();
			logger.debug("@@@@@@@@ debut enregistrement brouillon");
			etape1.setBirthday(inscription1Dto.getBirthday());
			etape1.setCityAddress(inscription1Dto.getCityAddress());
			etape1.setCountryAddress(inscription1Dto.getCountryAddress());
			etape1.setCountryOfBirthday(inscription1Dto.getCountryOfBirthday());
			etape1.setFirstName(inscription1Dto.getFirstName());
			etape1.setIdentityNumber(inscription1Dto.getIdentityNumber());
			etape1.setInscriptionAuthentification(inscriptionDto);
			etape1.setMaritalStatus(inscription1Dto.getMaritalStatus());
			etape1.setName(inscription1Dto.getName());
			etape1.setNationality(inscription1Dto.getNationality());
			etape1.setPhoneNumber(inscription1Dto.getPhoneNumber());
			etape1.setPlaceOfBirthday(inscription1Dto.getPlaceOfBirthday());
			etape1.setRegionAddress(inscription1Dto.getRegionAddress());
			etape1.setSexe(inscription1Dto.getSexe());
			etape1.setTypeOfDocument(inscription1Dto.getTypeOfDocument());
			etape1.setZipcodeAddress(inscription1Dto.getZipcodeAddress());
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			etape1.setStepStartDate(nowGregorian);
			etape1.setStepIndicator(0L);
			inscriptionSteponeServicewsEndpoint = inscriptionSteponeServicews
					.getInscriptionSteponeServicewsImplPort();
			etape1 = inscriptionSteponeServicewsEndpoint
					.createInscriptionSteponeServicews(etape1);
			logger.debug("@@@@@@@@ fin enregistrement brouillon");

		} catch (Exception e) {

		}
	}

	public void enregistrerInscriptionSteptwobrouillon() {
		try {
			InscriptionSteptwoDto etape2 = new InscriptionSteptwoDto();
			etape2.setCityAddress(inscription2Dto.getCityAddress());
			etape2.setCountryAddress(inscription2Dto.getCountryAddress());
			etape2.setEmailAddress(inscription2Dto.getEmailAddress());
			etape2.setFirstName(inscription2Dto.getFirstName());
			etape2.setInscriptionAuthentification(inscriptionDto);
			etape2.setName(inscription2Dto.getName());
			etape2.setPhoneNumber(inscription2Dto.getPhoneNumber());
			etape2.setRegionAddress(inscription2Dto.getRegionAddress());
			etape2.setRelationship(inscription2Dto.getRelationship());
			etape2.setStepIndicator(0L);
			etape2.setTypeOfContact(inscription2Dto.getTypeOfContact());
			etape2.setZipcodeAddress(inscription2Dto.getZipcodeAddress());
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			etape2.setStepStartDate(nowGregorian);
			inscriptionSteptwoServicewsEndpoint = inscriptionSteptwoServicews
					.getInscriptionSteptwoServicewsImplPort();

			if (testmodifier == false) {

				etape2 = inscriptionSteptwoServicewsEndpoint
						.createInscriptionSteptwoServicews(etape2);
				inscription2Dto = etape2;
				inscriptio2supDto = etape2;

				inscription2Dto = new InscriptionSteptwoDto();

				inscription2Dto.setInscriptionAuthentification(inscriptionDto);
			}

			else {
				etape2.setIdInscriptionSteptwo(inscription2Dto
						.getIdInscriptionSteptwo());
				etape2 = inscriptionSteptwoServicewsEndpoint
						.updateInscriptionSteptwoServicews(etape2);
				inscription2Dto = etape2;
				inscriptio2supDto = etape2;

				inscription2Dto = new InscriptionSteptwoDto();

				inscription2Dto.setInscriptionAuthentification(inscriptionDto);

			}
			test = true;
			testmodifier = false;

		} catch (Exception e) {

		}

	}
	
	public void enregistrerInscriptionsteptwo() {
		try {
			InscriptionSteptwoDto etape2 = new InscriptionSteptwoDto();
			etape2.setCityAddress(inscription2Dto.getCityAddress());
			etape2.setCountryAddress(inscription2Dto.getCountryAddress());
			etape2.setEmailAddress(inscription2Dto.getEmailAddress());
			etape2.setFirstName(inscription2Dto.getFirstName());
			etape2.setInscriptionAuthentification(inscriptionDto);
			etape2.setName(inscription2Dto.getName());
			etape2.setPhoneNumber(inscription2Dto.getPhoneNumber());
			etape2.setRegionAddress(inscription2Dto.getRegionAddress());
			etape2.setRelationship(inscription2Dto.getRelationship());
			etape2.setStepIndicator(2L);
			etape2.setTypeOfContact(inscription2Dto.getTypeOfContact());
			etape2.setZipcodeAddress(inscription2Dto.getZipcodeAddress());
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			etape2.setStepStartDate(nowGregorian);
			inscriptionSteptwoServicewsEndpoint = inscriptionSteptwoServicews
					.getInscriptionSteptwoServicewsImplPort();

			if (testmodifier == false) {

				etape2 = inscriptionSteptwoServicewsEndpoint
						.createInscriptionSteptwoServicews(etape2);
				inscription2Dto = etape2;
				inscriptio2supDto = etape2;

				inscription2Dto = new InscriptionSteptwoDto();

				inscription2Dto.setInscriptionAuthentification(inscriptionDto);
			}

			else {
				etape2.setIdInscriptionSteptwo(inscription2Dto
						.getIdInscriptionSteptwo());
				etape2 = inscriptionSteptwoServicewsEndpoint
						.updateInscriptionSteptwoServicews(etape2);
				inscription2Dto = etape2;
				inscriptio2supDto = etape2;

				inscription2Dto = new InscriptionSteptwoDto();

				inscription2Dto.setInscriptionAuthentification(inscriptionDto);

			}
			test = true;
			testmodifier = false;

		} catch (Exception e) {

		}

	}

	public void enregistrerInscriptionStepfour() {
		action = true;
		try {
			logger.debug("debut enregistrerInscriptionStepfour");
			InscriptionStepfourDto stepfour = new InscriptionStepfourDto();
			stepfour.setContactEmail(inscriptionStep4Dto.getContactEmail());
			stepfour.setContactName(inscriptionStep4Dto.getContactName());
			stepfour.setContactTelephoneNumber(inscriptionStep4Dto
					.getContactTelephoneNumber());
			stepfour.setDiploma(inscriptionStep4Dto.getDiploma());
			stepfour.setStartDate(inscriptionStep4Dto.getStartDate());
			stepfour.setEnDate(inscriptionStep4Dto.getEnDate());
			stepfour.setGrade(inscriptionStep4Dto.getGrade());
			stepfour.setNameOfScool(inscriptionStep4Dto.getNameOfScool());
			stepfour.setTypeOfContact(inscriptionStep4Dto.getTypeOfContact());
			stepfour.setInscriptionAuthentification(inscriptionDto);
			stepfour.setStepIndicator(1L);

			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			stepfour.setStepStartDate(nowGregorian);

			inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews
					.getInscriptionStepfourServicewsImplPort();
			
			
			if (testmodifier2 == false) {

				stepfour = inscriptionStepfourServicewsEndpoint.createInscriptionStepfourServicews(stepfour);
				inscriptionStep4Dto = stepfour;
				inscriptionStep4supDtos = stepfour;
						
				inscriptionStep4Dto = new InscriptionStepfourDto();
				inscriptionStep4Dto.setInscriptionAuthentification(inscriptionDto);
		
			}

			else {
				
				stepfour.setIdInscriptionStepfour(inscriptionStep4Dto.getIdInscriptionStepfour());
				stepfour = inscriptionStepfourServicewsEndpoint.updateInscriptionStepfourServicews(stepfour);
				
				inscriptionStep4Dto = stepfour;
				inscriptionStep4supDtos = stepfour;
				
				inscriptionStep4Dto = new InscriptionStepfourDto();
				inscriptionStep4Dto.setInscriptionAuthentification(inscriptionDto);


			}
			test2 = true;
			testmodifier2 = false;
		} catch (Exception e) {

		}
		
			
	}
	
	
	public void enregistrerbrouillonInscriptionStepfour() {
		action = true;
		try {
			InscriptionStepfourDto stepfour = new InscriptionStepfourDto();
			stepfour.setContactEmail(inscriptionStep4Dto.getContactEmail());
			stepfour.setContactName(inscriptionStep4Dto.getContactName());
			stepfour.setContactTelephoneNumber(inscriptionStep4Dto
					.getContactTelephoneNumber());
			stepfour.setDiploma(inscriptionStep4Dto.getDiploma());
			stepfour.setStartDate(inscriptionStep4Dto.getStartDate());
			stepfour.setEnDate(inscriptionStep4Dto.getEnDate());
			stepfour.setGrade(inscriptionStep4Dto.getGrade());
			stepfour.setNameOfScool(inscriptionStep4Dto.getNameOfScool());
			stepfour.setTypeOfContact(inscriptionStep4Dto.getTypeOfContact());
			stepfour.setInscriptionAuthentification(inscriptionDto);
			stepfour.setStepIndicator(0L);

			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			stepfour.setStepStartDate(nowGregorian);

			inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews
					.getInscriptionStepfourServicewsImplPort();
			
			
			if (testmodifier2 == false) {

				stepfour = inscriptionStepfourServicewsEndpoint.createInscriptionStepfourServicews(stepfour);
				inscriptionStep4Dto = stepfour;
				inscriptionStep4supDtos = stepfour;
						
				inscriptionStep4Dto = new InscriptionStepfourDto();
				inscriptionStep4Dto.setInscriptionAuthentification(inscriptionDto);
		
			}

			else {
				
				stepfour.setIdInscriptionStepfour(inscriptionStep4Dto.getIdInscriptionStepfour());
				stepfour = inscriptionStepfourServicewsEndpoint.updateInscriptionStepfourServicews(stepfour);
				
				inscriptionStep4Dto = stepfour;
				inscriptionStep4supDtos = stepfour;
				
				inscriptionStep4Dto = new InscriptionStepfourDto();
				inscriptionStep4Dto.setInscriptionAuthentification(inscriptionDto);


			}
			test2 = true;
			testmodifier2 = false;
		} catch (Exception e) {

		}
			
	}

	public void updateEnregistrerInscriptionStepfour() {
		FacesMessage msg = null;

		try {
			InscriptionStepfourDto updatestep4 = new InscriptionStepfourDto();

			updatestep4.setContactEmail(inscriptionStep4Dto.getContactEmail());
			updatestep4.setContactName(inscriptionStep4Dto.getContactName());
			updatestep4.setContactTelephoneNumber(inscriptionStep4Dto
					.getContactTelephoneNumber());
			updatestep4.setDiploma(inscriptionStep4Dto.getDiploma());
			updatestep4.setNameOfScool(inscriptionStep4Dto.getNameOfScool());
			updatestep4
					.setTypeOfContact(inscriptionStep4Dto.getTypeOfContact());
			updatestep4.setGrade(inscriptionStep4Dto.getGrade());
			updatestep4.setEnDate(inscriptionStep4Dto.getEnDate());
			updatestep4.setEnDate(inscriptionStep4Dto.getEnDate());
			updatestep4.setStepIndicator(1L);

			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;

			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			updatestep4.setStepStartDate(nowGregorian);

			updatestep4.setIdInscriptionStepfour(inscriptionStep4Dto
					.getIdInscriptionStepfour());

			updatestep4 = inscriptionStepfourServicewsEndpoint
					.updateInscriptionStepfourServicews(updatestep4);

			init();

		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}

	public void enregistrerInscriptionStepfive() {
		FacesMessage msg = null;
		try {
			InscriptionSteptreeDto insererdocument = new InscriptionSteptreeDto();
			insererdocument.setInscriptionAuthentification(inscriptionDto);
			logger.debug("id = " + inscriptionDto.getIdInscription());
			insererdocument.setAcademicSector(inscriptionStep3Dto
					.getAcademicSector());
			insererdocument.setAcademicYear(inscriptionStep3Dto
					.getAcademicYear());
			insererdocument.setProgrammeCalendar(inscriptionStep3Dto
					.getProgrammeCalendar());
			insererdocument.setNameOfDocument(file.getAbsolutePath());
			insererdocument.setDescription(inscriptionStep3Dto.getDescription());	
			insererdocument.setTypeOfDocument(inscriptionStep3Dto
					.getTypeOfDocument());
			insererdocument.setStepIndicator(1L);
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			insererdocument.setStepStartDate(nowGregorian);

			inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews
					.getInscriptionSteptreeServicewsImplPort();
					
			
			if (testmodifier3 == false) {
				insererdocument = inscriptionSteptreeServicewsEndpoint.createInscriptionSteptreeServicews(insererdocument);
				inscriptionStep3Dto = insererdocument;
				inscriptionStep3supDtos = insererdocument;
				
				inscriptionStep3Dto = new InscriptionSteptreeDto();
				inscriptionStep3Dto.setInscriptionAuthentification(inscriptionDto);
						
				
			}

			test3 = true;
			testmodifier3 = false;

			logger.debug("début enregistrerInscriptionstep3");
		} catch (Exception e) {

		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}
	
	
	public void enregistrerBrouillonInscriptionStepfive() {
		FacesMessage msg = null;
		try {
			InscriptionSteptreeDto insererdocument = new InscriptionSteptreeDto();
			insererdocument.setInscriptionAuthentification(inscriptionDto);
			logger.debug("id = " + inscriptionDto.getIdInscription());
			insererdocument.setAcademicSector(inscriptionStep3Dto
					.getAcademicSector());
			logger.debug("ACADEMIC SECTOR "
					+ inscriptionStep3Dto.getAcademicSector());
			insererdocument.setAcademicYear(inscriptionStep3Dto
					.getAcademicYear());
			logger.debug("ACADEMIC YEARS "
					+ inscriptionStep3Dto.getAcademicYear());
			insererdocument.setProgrammeCalendar(inscriptionStep3Dto
					.getProgrammeCalendar());
			insererdocument.setNameOfDocument(file.getAbsolutePath());
			logger.debug("DESCRIPTION DEBUT "
					+ inscriptionStep3Dto.getDescription());
			insererdocument.setDescription(inscriptionStep3Dto.getDescription());	
			logger.debug("DESCRIPTION FIN"
					+ inscriptionStep3Dto.getDescription());
			insererdocument.setTypeOfDocument(inscriptionStep3Dto
					.getTypeOfDocument());
			insererdocument.setStepIndicator(0L);
			GregorianCalendar gregory = new GregorianCalendar();
			gregory.setTime(now.getTime());
			XMLGregorianCalendar nowGregorian;
			nowGregorian = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(gregory);
			insererdocument.setStepStartDate(nowGregorian);

			inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews
					.getInscriptionSteptreeServicewsImplPort();
					
			
			if (testmodifier3 == false) {
				insererdocument = inscriptionSteptreeServicewsEndpoint.createInscriptionSteptreeServicews(insererdocument);
				inscriptionStep3Dto = insererdocument;
				inscriptionStep3supDtos = insererdocument;
				
				inscriptionStep3Dto = new InscriptionSteptreeDto();
				inscriptionStep3Dto.setInscriptionAuthentification(inscriptionDto);
						
				
			}

			test3 = true;
			testmodifier3 = false;

			logger.debug("début enregistrerInscriptionstep3");
		} catch (Exception e) {

		}
		logger.debug("fin enregistrerInscriptionstep3");
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}
	

	public void supprimerListcursus() {
		FacesMessage msg = null;
		inscriptionStepfourServicewsEndpoint
				.deleteInscriptionStepfourServicews(inscriptionStep4supDtos);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_warn"), rb.getString("label_warn"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}


	public void supprimerListdoc() {
		FacesMessage msg = null;
		logger.debug("DEBUT SuppressionInscriptionsteps3 +++++++++++++");
		inscriptionSteptreeServicewsEndpoint
				.deleteInscriptionSteptreeServicews(inscriptionStep3supDtos);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_warn"), rb.getString("label_warn"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}

	public void supprimerParent() {
		FacesMessage msg = null;
		inscriptionSteptwoServicewsEndpoint
				.deleteInscriptionSteptwoServicews(inscriptio2supDto);
		init();
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_warn"), rb.getString("label_warn"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}

	public void mis_a_jour_parent(InscriptionSteptwoDto parent) {

		inscriptio2supDto = parent;

	}

	public void mis_a_jour_bouton() {
		testmodifier = true;

	}

	public void mis_a_jour_2(InscriptionStepfourDto cursus) {

		inscriptionStep4supDtos = cursus;

	}

	public void mis_a_jour_bouton2() {
		testmodifier2 = true;

	}


	public void mis_a_jour_bouton3() {
		testmodifier3 = true;

	}

	

}

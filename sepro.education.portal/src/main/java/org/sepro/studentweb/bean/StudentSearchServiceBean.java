package org.sepro.studentweb.bean;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;
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
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.RegionDto;
import org.sepro.parameterweb.serviceapi.ZipcodeDto;
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
import org.sepro.studentweb.serviceapi.StudentCVDto;
import org.sepro.studentweb.serviceapi.StudentContactDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceimpl.StudentCVServicews;
import org.sepro.studentweb.serviceimpl.StudentCVServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentContactServicews;
import org.sepro.studentweb.serviceimpl.StudentContactServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;
import org.sepro.teacherweb.serviceapi.IdentityTeacherDto;
import org.sepro.teacherweb.serviceimpl.TeachedModuleServicews;
import org.sepro.teacherweb.serviceimpl.TeachedModuleServicewsEndpoint;

@ManagedBean
@ViewScoped
public class StudentSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(StudentSearchServiceBean.class);

	private StudentContactServicews studentContactServicews = new StudentContactServicews();
	private StudentContactServicewsEndpoint studentContactServicewsEndpoint;

	private InscriptionAuthServicews inscriptionAuthServicews = new InscriptionAuthServicews();
	private InscriptionAuthServicewsEndpoint inscriptionAuthServicewsEndpoint;
	private InscriptionAuthentificationDto inscAuthentificationDto = new InscriptionAuthentificationDto();
	private List<InscriptionAuthentificationDto> listInscripts = new ArrayList<InscriptionAuthentificationDto>();

	private InscriptionSteponeServicews inscriptionSteponeServicews = new InscriptionSteponeServicews();
	private InscriptionSteponeServicewsEndpoint inscriptionSteponeServicewsEndpoint;
	private InscriptionSteponeDto inscriptionSteponeDto = new InscriptionSteponeDto();
	private List<InscriptionSteponeDto> listStudentIdentity = new ArrayList<InscriptionSteponeDto>();
	
	private InscriptionSteptwoServicews inscriptionSteptwoServicews = new InscriptionSteptwoServicews();
	private InscriptionSteptwoServicewsEndpoint inscriptionSteptwoServicewsEndpoint;
	private InscriptionSteptwoDto inscriptionSteptwoDto = new InscriptionSteptwoDto();
	private List<InscriptionSteptwoDto> listInscriptionSteptwo = new ArrayList<InscriptionSteptwoDto>();
	
	private InscriptionSteptreeServicews inscriptionSteptreeServicews = new InscriptionSteptreeServicews();
	private InscriptionSteptreeServicewsEndpoint inscriptionSteptreeServicewsEndpoint;
	private InscriptionSteptreeDto inscriptionSteptreeDto = new InscriptionSteptreeDto();
	private List<InscriptionSteptreeDto> listInscriptionSteptree = new ArrayList<InscriptionSteptreeDto>();
	
	private InscriptionStepfourServicews inscriptionStepfourServicews = new InscriptionStepfourServicews();
	private InscriptionStepfourServicewsEndpoint inscriptionStepfourServicewsEndpoint;
	private InscriptionStepfourDto inscriptionStepfourDto = new InscriptionStepfourDto();
	private List<InscriptionStepfourDto> listInscriptionStepfour = new ArrayList<InscriptionStepfourDto>();
	

	private StudentServicews studentServicews = new StudentServicews();
	private StudentServicewsEndpoint studentServicewsEndpoint;

	private StudentCVServicews studentCVServicews = new StudentCVServicews();
	private StudentCVServicewsEndpoint studentCVServicewsEndpoint;

	private StudentContactDto studentContactDto = new StudentContactDto();
	private StudentContactDto studentContactDtos = new StudentContactDto();
	private List<StudentContactDto> liststudentcontact = new ArrayList<StudentContactDto>();

	private StudentCVDto studentCVDto = new StudentCVDto();
	private StudentCVDto studentCVDtos = new StudentCVDto();
	private List<StudentCVDto> listCVstudent = new ArrayList<StudentCVDto>();

	private StudentDto studentDto = new StudentDto();
	private StudentDto studentDtos = new StudentDto();
	private List<StudentDto> listStudents = new ArrayList<StudentDto>();

	private CityServicews cityServicews = new CityServicews();
	private CityServicewsEndpoint cityServicewsEndpoint;
	private List<CityDto> listCity = new ArrayList<CityDto>();

	private RegionServicews regionServicews = new RegionServicews();
	private RegionServicewsEndpoint regionServicewsEndpoint;
	private List<RegionDto> listRegion = new ArrayList<RegionDto>();

	private CountryServicews countryServicews = new CountryServicews();
	private CountryServicewsEndpoint countryServicewsEndpoint;
	private List<CountryDto> listCountry = new ArrayList<CountryDto>();

	private ZipServicews zipServicews = new ZipServicews();
	private ZipServicewsEndpoint zipServicewsEndpoint;
	private List<ZipcodeDto> listZipcode = new ArrayList<ZipcodeDto>();

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;
	
	

	public InscriptionSteptwoDto getInscriptionSteptwoDto() {
		return inscriptionSteptwoDto;
	}

	public void setInscriptionSteptwoDto(InscriptionSteptwoDto inscriptionSteptwoDto) {
		this.inscriptionSteptwoDto = inscriptionSteptwoDto;
	}

	public List<InscriptionSteptwoDto> getListInscriptionSteptwo() {
		return listInscriptionSteptwo;
	}

	public void setListInscriptionSteptwo(
			List<InscriptionSteptwoDto> listInscriptionSteptwo) {
		this.listInscriptionSteptwo = listInscriptionSteptwo;
	}

	public InscriptionSteptreeDto getInscriptionSteptreeDto() {
		return inscriptionSteptreeDto;
	}

	public void setInscriptionSteptreeDto(
			InscriptionSteptreeDto inscriptionSteptreeDto) {
		this.inscriptionSteptreeDto = inscriptionSteptreeDto;
	}

	

	public List<InscriptionSteptreeDto> getListInscriptionSteptree() {
		return listInscriptionSteptree;
	}

	public void setListInscriptionSteptree(
			List<InscriptionSteptreeDto> listInscriptionSteptree) {
		this.listInscriptionSteptree = listInscriptionSteptree;
	}

	public InscriptionStepfourDto getInscriptionStepfourDto() {
		return inscriptionStepfourDto;
	}

	public void setInscriptionStepfourDto(
			InscriptionStepfourDto inscriptionStepfourDto) {
		this.inscriptionStepfourDto = inscriptionStepfourDto;
	}
	
	
	

	public List<InscriptionStepfourDto> getListInscriptionStepfour() {
		return listInscriptionStepfour;
	}

	public void setListInscriptionStepfour(
			List<InscriptionStepfourDto> listInscriptionStepfour) {
		this.listInscriptionStepfour = listInscriptionStepfour;
	}




	private List<PopuplistDto> listetatcivile = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listnationalite = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listsexe = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listtypecontact = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listdocumentidentity = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listlienparante = new ArrayList<PopuplistDto>();

	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();

	public boolean status;
	private boolean action = false;

	private boolean render2 = false;

	private boolean render3 = true;
	private boolean render4 = true;
	private boolean render5 = true;

	private boolean testdetail = true;
	private String maskphonformatteacher;

	private UploadedFile myfile;
	private String filename;
	private String destination = "D:\\DossierCVStudent\\";
	File file;
	private static final int DEFAULT_BUFFER_SIZE = 10240;

	
	
	public List<InscriptionSteponeDto> getListStudentIdentity() {
		return listStudentIdentity;
	}

	public void setListStudentIdentity(
			List<InscriptionSteponeDto> listStudentIdentity) {
		this.listStudentIdentity = listStudentIdentity;
	}

	public List<InscriptionAuthentificationDto> getListInscripts() {
		return listInscripts;
	}

	public void setListInscripts(List<InscriptionAuthentificationDto> listInscripts) {
		this.listInscripts = listInscripts;
	}

	public InscriptionSteponeDto getInscriptionSteponeDto() {
		return inscriptionSteponeDto;
	}

	public void setInscriptionSteponeDto(
			InscriptionSteponeDto inscriptionSteponeDto) {
		this.inscriptionSteponeDto = inscriptionSteponeDto;
	}


	public InscriptionAuthentificationDto getInscAuthentificationDto() {
		return inscAuthentificationDto;
	}

	public void setInscAuthentificationDto(
			InscriptionAuthentificationDto inscAuthentificationDto) {
		this.inscAuthentificationDto = inscAuthentificationDto;
	}

	public List<PopuplistDto> getListlienparante() {
		return listlienparante;
	}

	public void setListlienparante(List<PopuplistDto> listlienparante) {
		this.listlienparante = listlienparante;
	}

	public List<PopuplistDto> getListdocumentidentity() {
		return listdocumentidentity;
	}

	public void setListdocumentidentity(List<PopuplistDto> listdocumentidentity) {
		this.listdocumentidentity = listdocumentidentity;
	}

	public StudentContactDto getStudentContactDto() {
		return studentContactDto;
	}

	public void setStudentContactDto(StudentContactDto studentContactDto) {
		this.studentContactDto = studentContactDto;
	}

	public StudentContactDto getStudentContactDtos() {
		return studentContactDtos;
	}

	public void setStudentContactDtos(StudentContactDto studentContactDtos) {
		this.studentContactDtos = studentContactDtos;
	}

	public List<StudentContactDto> getListstudentcontact() {
		return liststudentcontact;
	}

	public void setListstudentcontact(List<StudentContactDto> liststudentcontact) {
		this.liststudentcontact = liststudentcontact;
	}

	public StudentCVDto getStudentCVDto() {
		return studentCVDto;
	}

	public void setStudentCVDto(StudentCVDto studentCVDto) {
		this.studentCVDto = studentCVDto;
	}

	public StudentCVDto getStudentCVDtos() {
		return studentCVDtos;
	}

	public void setStudentCVDtos(StudentCVDto studentCVDtos) {
		this.studentCVDtos = studentCVDtos;
	}

	public List<StudentCVDto> getListCVstudent() {
		return listCVstudent;
	}

	public void setListCVstudent(List<StudentCVDto> listCVstudent) {
		this.listCVstudent = listCVstudent;
	}

	public StudentDto getStudentDto() {
		return studentDto;
	}

	public void setStudentDto(StudentDto studentDto) {
		this.studentDto = studentDto;
	}

	public StudentDto getStudentDtos() {
		return studentDtos;
	}

	public void setStudentDtos(StudentDto studentDtos) {
		this.studentDtos = studentDtos;
	}

	public List<StudentDto> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<StudentDto> listStudents) {
		this.listStudents = listStudents;
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

	public List<PopuplistDto> getListnationalite() {
		return listnationalite;
	}

	public void setListnationalite(List<PopuplistDto> listnationalite) {
		this.listnationalite = listnationalite;
	}

	public List<PopuplistDto> getListsexe() {
		return listsexe;
	}

	public void setListsexe(List<PopuplistDto> listsexe) {
		this.listsexe = listsexe;
	}

	public List<PopuplistDto> getListtypecontact() {
		return listtypecontact;
	}

	public void setListtypecontact(List<PopuplistDto> listtypecontact) {
		this.listtypecontact = listtypecontact;
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

	public boolean isTestdetail() {
		return testdetail;
	}

	public void setTestdetail(boolean testdetail) {
		this.testdetail = testdetail;
	}

	public String getMaskphonformatteacher() {
		return maskphonformatteacher;
	}

	public void setMaskphonformatteacher(String maskphonformatteacher) {
		this.maskphonformatteacher = maskphonformatteacher;
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

	public void initDualListDetail(String daction) {
		if (daction.equals("1")) {

			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			render2 = true;
			render5 = false;
			initCreateStudentDetail();

		} else {

			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			render2 = true;
			render5 = false;
			initUpdateStudentDetail();

		}

	}

	public void initCreateStudentDetail() {

	}

	public void initUpdateStudentDetail() {

	}

	public void createStudentDetail() {

	}

	public void updateStudentDetail() {

	}

	public void initDualList(String baction) {

		if (baction.equals("1")) {
			studentDto = studentDtos;
			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listsexe = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();
			listetatcivile = new ArrayList<PopuplistDto>();

			render2 = true;
			render3 = false;
			initUpdate();

		} else {
			studentDto = new StudentDto();
			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listsexe = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();
			listetatcivile = new ArrayList<PopuplistDto>();

			render2 = true;
			render3 = false;
			initCreate();
		}
	}

	public void initCreate() {
		action = true;
		try {
			logger.debug("fin initCreate");

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			inscriptionAuthServicewsEndpoint = inscriptionAuthServicews
					.getInscriptionAuthServicewsImplPort();

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			listCountry = countryServicewsEndpoint.getAllCountryServicews();
			
			listRegion = regionServicewsEndpoint.getAllRegionServicews();

			listZipcode = zipServicewsEndpoint.getAllZipcodeServicews();

			listCity = cityServicewsEndpoint.getAllCityServicews();

			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");

			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");
			listdocumentidentity = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");
			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");

			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initUpdate() {
		action = false;
		try {
			logger.debug("fin initCreate");

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			inscriptionAuthServicewsEndpoint = inscriptionAuthServicews
					.getInscriptionAuthServicewsImplPort();

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			listCountry = countryServicewsEndpoint.getAllCountryServicews();

			listZipcode = zipServicewsEndpoint.getAllZipcodeServicews();

			listCity = cityServicewsEndpoint.getAllCityServicews();
			
			listRegion = regionServicewsEndpoint.getAllRegionServicews();

			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");

			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");
			listdocumentidentity = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");
			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");

			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CreateStudent() {
		FacesMessage msg = null;

		try {

			StudentDto createstudent = new StudentDto();

			createstudent.setAddressLigne1(studentDto.getAddressLigne1());
			createstudent.setAddressLigne2(studentDto.getAddressLigne2());
			createstudent.setAddressLigne3(studentDto.getAddressLigne3());
			createstudent.setAddressLigne4(studentDto.getAddressLigne4());
			createstudent.setBirthday(studentDto.getBirthday());
			createstudent.setCityAddress(studentDto.getCityAddress());
			createstudent.setCountryAddress(studentDto.getCountryAddress());
			createstudent.setCountryOfBirthday(studentDto
					.getCountryOfBirthday());
			createstudent.setFirstName(studentDto.getFirstName());
			createstudent.setIdentityNumber(studentDto.getIdentityNumber());
			createstudent
					.setInscriptionAuthentification(inscAuthentificationDto);
			createstudent.setZipcodeAddress(studentDto.getZipcodeAddress());
			createstudent.setMaritalStatus(studentDto.getMaritalStatus());
			createstudent.setTypeOfDocument(studentDto.getTypeOfDocument());
			createstudent.setSexe(studentDto.getSexe());
			createstudent.setName(studentDto.getName());
			createstudent.setNationality(studentDto.getNationality());
			createstudent.setRegionAddress(studentDto.getRegionAddress());
			createstudent.setPhoneNumber(studentDto.getPhoneNumber());
			createstudent.setPlaceOfBirthday(studentDto.getPlaceOfBirthday());

			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();
			createstudent = studentServicewsEndpoint
					.createStudentServicews(createstudent);

			init();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}

	public void UpdateStudent() {
		FacesMessage msg = null;

		try {

			StudentDto updatestudent = new StudentDto();

			updatestudent.setAddressLigne1(studentDto.getAddressLigne1());
			updatestudent.setAddressLigne2(studentDto.getAddressLigne2());
			updatestudent.setAddressLigne3(studentDto.getAddressLigne3());
			updatestudent.setAddressLigne4(studentDto.getAddressLigne4());
			updatestudent.setBirthday(studentDto.getBirthday());
			updatestudent.setCityAddress(studentDto.getCityAddress());
			updatestudent.setCountryAddress(studentDto.getCountryAddress());
			updatestudent.setCountryOfBirthday(studentDto
					.getCountryOfBirthday());
			updatestudent.setFirstName(studentDto.getFirstName());
			updatestudent.setIdentityNumber(studentDto.getIdentityNumber());
			updatestudent.setInscriptionAuthentification(studentDto
					.getInscriptionAuthentification());
			updatestudent.setZipcodeAddress(studentDto.getZipcodeAddress());
			updatestudent.setMaritalStatus(studentDto.getMaritalStatus());
			updatestudent.setTypeOfDocument(studentDto.getTypeOfDocument());
			updatestudent.setSexe(studentDto.getSexe());
			updatestudent.setName(studentDto.getName());
			updatestudent.setNationality(studentDto.getNationality());
			updatestudent.setRegionAddress(studentDto.getRegionAddress());
			updatestudent.setPhoneNumber(studentDto.getPhoneNumber());
			updatestudent.setPlaceOfBirthday(studentDto.getPlaceOfBirthday());

			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();
			updatestudent.setIdStudent(studentDto.getIdStudent());
			updatestudent = studentServicewsEndpoint
					.createStudentServicews(updatestudent);

			init();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");

			inscriptionAuthServicewsEndpoint = inscriptionAuthServicews
					.getInscriptionAuthServicewsImplPort();
			inscriptionSteponeServicewsEndpoint = inscriptionSteponeServicews.getInscriptionSteponeServicewsImplPort();
			inscriptionSteptwoServicewsEndpoint = inscriptionSteptwoServicews.getInscriptionSteptwoServicewsImplPort();
			inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
			inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews.getInscriptionStepfourServicewsImplPort();

			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();

			listCountry = countryServicewsEndpoint.getAllCountryServicews();

			listZipcode = zipServicewsEndpoint.getAllZipcodeServicews();

			listCity = cityServicewsEndpoint.getAllCityServicews();

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

//			listStudents = studentServicewsEndpoint
//					.searchStudentServicews(studentDto);
			logger.debug("1111111111"+inscAuthentificationDto);
			inscriptionSteponeDto.setInscriptionAuthentification(inscAuthentificationDto);
			inscriptionSteptwoDto.setInscriptionAuthentification(inscAuthentificationDto);
			inscriptionSteptreeDto.setInscriptionAuthentification(inscAuthentificationDto);
			inscriptionStepfourDto.setInscriptionAuthentification(inscAuthentificationDto);
			logger.debug("22222222222"+inscriptionSteptwoDto);
			
			listStudentIdentity = inscriptionSteponeServicewsEndpoint.searchInscriptionSteponeServicews(inscriptionSteponeDto);
			listInscriptionSteptwo = inscriptionSteptwoServicewsEndpoint.searchInscriptionSteptwoServicews(inscriptionSteptwoDto);
			listInscriptionSteptree = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
			listInscriptionStepfour = inscriptionStepfourServicewsEndpoint.searchInscriptionStepfourServicews(inscriptionStepfourDto);
			
			listInscripts = inscriptionAuthServicewsEndpoint.searchInscriptionAuthServicews(inscAuthentificationDto);
			

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

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
import org.primefaces.event.SelectEvent;
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

import org.sepro.studentweb.bean.util.ProspectDto;
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

import sepro.education.web.util.FormatNumberPhoneUtil;

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
	private InscriptionSteponeDto inscriptionSteponeDtos = new InscriptionSteponeDto();
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
	
	
	private List<ProspectDto> listprospects = new ArrayList<ProspectDto>();
	private ProspectDto prospectDto = new ProspectDto();
	private ProspectDto prospectDtos = new ProspectDto();
	

	private StudentServicews studentServicews = new StudentServicews();
	private StudentServicewsEndpoint studentServicewsEndpoint;

	private StudentCVServicews studentCVServicews = new StudentCVServicews();
	private StudentCVServicewsEndpoint studentCVServicewsEndpoint;

	private StudentContactDto studentContactDto = new StudentContactDto();
	private StudentContactDto studentContactDtos = new StudentContactDto();
	private List<StudentContactDto> liststudentcontact = new ArrayList<StudentContactDto>();
	private List<StudentContactDto> liststudentcontact1 = new ArrayList<StudentContactDto>();

	private StudentCVDto studentCVDto = new StudentCVDto();
	private StudentCVDto studentCVDtos = new StudentCVDto();
	private List<StudentCVDto> listCVstudent = new ArrayList<StudentCVDto>();
	private List<StudentCVDto> listCVstudent1 = new ArrayList<StudentCVDto>();

	private StudentDto studentDto = new StudentDto();
	private StudentDto studentDtos = new StudentDto();
	private List<StudentDto> listStudents = new ArrayList<StudentDto>();
	private List<StudentDto> listStudents1 = new ArrayList<StudentDto>();

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
	private boolean action2 = false; 
	private boolean action3 = true;

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
	
	
	
	private String maskphonformat;
	private String maskphonformatparent;

	
	
	

	public List<StudentContactDto> getListstudentcontact1() {
		return liststudentcontact1;
	}

	public void setListstudentcontact1(List<StudentContactDto> liststudentcontact1) {
		this.liststudentcontact1 = liststudentcontact1;
	}

	public List<StudentCVDto> getListCVstudent1() {
		return listCVstudent1;
	}

	public void setListCVstudent1(List<StudentCVDto> listCVstudent1) {
		this.listCVstudent1 = listCVstudent1;
	}

	public List<StudentDto> getListStudents1() {
		return listStudents1;
	}

	public void setListStudents1(List<StudentDto> listStudents1) {
		this.listStudents1 = listStudents1;
	}

	public ProspectDto getProspectDtos() {
		return prospectDtos;
	}

	public void setProspectDtos(ProspectDto prospectDtos) {
		this.prospectDtos = prospectDtos;
	}

	public List<ProspectDto> getListprospects() {
		return listprospects;
	}

	public void setListprospects(List<ProspectDto> listprospects) {
		this.listprospects = listprospects;
	}

	public ProspectDto getProspectDto() {
		return prospectDto;
	}

	public void setProspectDto(ProspectDto prospectDto) {
		this.prospectDto = prospectDto;
	}

	public InscriptionSteponeDto getInscriptionSteponeDtos() {
		return inscriptionSteponeDtos;
	}

	public void setInscriptionSteponeDtos(
			InscriptionSteponeDto inscriptionSteponeDtos) {
		this.inscriptionSteponeDtos = inscriptionSteponeDtos;
	}

	public String getMaskphonformat() {
		return maskphonformat;
	}

	public void setMaskphonformat(String maskphonformat) {
		this.maskphonformat = maskphonformat;
	}

	public String getMaskphonformatparent() {
		return maskphonformatparent;
	}

	public void setMaskphonformatparent(String maskphonformatparent) {
		this.maskphonformatparent = maskphonformatparent;
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
	
	
	
	public void initDualListPro(String daction) {
		if (daction.equals("1")) {

			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			listsexe = new ArrayList<PopuplistDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();;
			listetatcivile = new ArrayList<PopuplistDto>();;
			listfiliere = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();
			
			action2 = true;
			action3 = false;
			logger.debug("*********DANS INIDUALIST*****"+inscAuthentificationDto.getIdInscription());
			initStudentDetail();

		} else {

			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			listsexe = new ArrayList<PopuplistDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();;
			listetatcivile = new ArrayList<PopuplistDto>();;
			listfiliere = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();
			
			action2 = true;
			action3 = false;
			initUpdateStudentDetail();
			
			
		}
		
	}
	public void initStudentDetail() {
		
		inscriptionAuthServicewsEndpoint = inscriptionAuthServicews
				.getInscriptionAuthServicewsImplPort();
		inscriptionSteponeServicewsEndpoint = inscriptionSteponeServicews.getInscriptionSteponeServicewsImplPort();
		inscriptionSteptwoServicewsEndpoint = inscriptionSteptwoServicews.getInscriptionSteptwoServicewsImplPort();
		inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
		inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews.getInscriptionStepfourServicewsImplPort();

		popuplistDtoServicewsEndpoint = popuplistDtoServicews
				.getPopuplistDtoServicewsImplPort();



		
		
//		logger.debug("**********NOUS SOMMES DANS LE INIT STUDENTDETAIL******"+inscAuthentificationDto.getIdInscription());
//		inscriptionSteponeDto.setInscriptionAuthentification(inscAuthentificationDto);
//		
//		listStudentIdentity = inscriptionSteponeServicewsEndpoint.searchInscriptionSteponeServicews(inscriptionSteponeDto);
//		logger.debug("******TAILLE DE LA LISTE ******"+listStudentIdentity.size());
		
		
		logger.debug("****++++ LE NUMERO DE PROSPECT+++******"+prospectDtos.getIdAuthentif());
		inscAuthentificationDto.setIdInscription(prospectDtos.getIdAuthentif());
		
		logger.debug("********NOUS VOILA 111111111 **********"+inscAuthentificationDto);
		
		inscriptionSteponeDto.setInscriptionAuthentification(inscAuthentificationDto);
		inscriptionSteptwoDto.setInscriptionAuthentification(inscAuthentificationDto);
		inscriptionSteptreeDto.setInscriptionAuthentification(inscAuthentificationDto);
		inscriptionStepfourDto.setInscriptionAuthentification(inscAuthentificationDto);
		
		
		logger.debug("********NOUS VOILA 2222222222**********"+inscriptionSteponeDto);
		logger.debug("********NOUS VOILA 3333333333**********"+inscriptionStepfourDto);
		
		listStudentIdentity = inscriptionSteponeServicewsEndpoint.searchInscriptionSteponeServicews(inscriptionSteponeDto);
		listInscriptionSteptwo = inscriptionSteptwoServicewsEndpoint.searchInscriptionSteptwoServicews(inscriptionSteptwoDto);
		listInscriptionSteptree = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
		listInscriptionStepfour = inscriptionStepfourServicewsEndpoint.searchInscriptionStepfourServicews(inscriptionStepfourDto);
		
		
		
		logger.debug("********NOUS VOILA 4444444444 **********"+listStudentIdentity.size());
		logger.debug("********NOUS VOILA 5555555555 **********"+listInscriptionSteptwo.size());
		logger.debug("********NOUS VOILA 5555555555 **********"+listInscriptionSteptree.size());
		logger.debug("********NOUS VOILA 5555555555 **********"+listInscriptionStepfour.size());
		
		for (int i = 0; i < listStudentIdentity.size(); i++){
    		logger.debug("+++++++affichage++++++++++++"+listStudentIdentity.get(i).getFirstName());
    		logger.debug("+++++++affichage++++++++++++"+listStudentIdentity.get(i).getName());
    		
    		
    	}
		for (int i = 0; i < listInscriptionSteptwo.size(); i++){
			
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getFirstName());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getAddressLigne1());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getAddressLigne2());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getAddressLigne3());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getAddressLigne4());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getEmailAddress());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getName());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getPhoneNumber());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getCityAddress().getCityName());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getZipcodeAddress().getZipCode());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getCountryAddress().getCountryName());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getRegionAddress().getRegionName());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getTypeOfContact().getValue());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptwo.get(i).getInscriptionAuthentification().getIdInscription());
    		
    		
    	}
		for (int i = 0; i < listInscriptionSteptree.size(); i++){
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptree.get(i).getDescription());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptree.get(i).getNameOfDocument());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptree.get(i).getAcademicSector().getValue());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptree.get(i).getAcademicYear().getValue());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptree.get(i).getProgrammeCalendar().getProgramme().getNameProgramme());
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionSteptree.get(i).getTypeOfDocument().getValue());
    		
    		
    	}
		for (int i = 0; i < listInscriptionStepfour.size(); i++){
    		logger.debug("+++++++affichage++++++++++++"+listInscriptionStepfour.get(i).getContactName());
    		
    		
    	}
		
		logger.debug("********NOUS VOILA 666666666 **********"+listInscriptionSteptree.get(1).getAcademicSector().getValue());
		logger.debug("********NOUS VOILA 777777777 **********"+listInscriptionSteptree.get(1).getAcademicYear().getValue());
		logger.debug("********NOUS VOILA 777777777 **********"+listInscriptionSteptree.get(1).getNameOfDocument());
//		
		
	//	logger.debug("IDENTITY ETUDIANT"+listStudentIdentity.size());
//		logger.debug("44444444"+listInscriptionSteptwo.size());
//		logger.debug("55555555"+listInscriptionSteptree.size());
//		logger.debug("66666666"+listInscriptionStepfour.size());
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
			
			inscriptionAuthServicewsEndpoint = inscriptionAuthServicews
					.getInscriptionAuthServicewsImplPort();
			inscriptionSteponeServicewsEndpoint = inscriptionSteponeServicews.getInscriptionSteponeServicewsImplPort();
			inscriptionSteptwoServicewsEndpoint = inscriptionSteptwoServicews.getInscriptionSteptwoServicewsImplPort();
			inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
			inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews.getInscriptionStepfourServicewsImplPort();

			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();


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
			
			
			logger.debug("33333333"+listStudentIdentity.size());
			logger.debug("44444444"+listInscriptionSteptwo.size());
			logger.debug("55555555"+listInscriptionSteptree.size());
			logger.debug("66666666"+listInscriptionStepfour.size());
			
			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CreateStudent() {
		FacesMessage msg = null;
		
		inscriptionAuthServicewsEndpoint = inscriptionAuthServicews
				.getInscriptionAuthServicewsImplPort();
		
		inscriptionSteponeServicewsEndpoint = inscriptionSteponeServicews.getInscriptionSteponeServicewsImplPort();
		inscriptionSteptwoServicewsEndpoint = inscriptionSteptwoServicews.getInscriptionSteptwoServicewsImplPort();
		inscriptionSteptreeServicewsEndpoint = inscriptionSteptreeServicews.getInscriptionSteptreeServicewsImplPort();
		inscriptionStepfourServicewsEndpoint = inscriptionStepfourServicews.getInscriptionStepfourServicewsImplPort();
			
       inscAuthentificationDto.setIdInscription(prospectDtos.getIdAuthentif());
		
		logger.debug("******** DANS LE CREATE STUDENT **********"+inscAuthentificationDto);
		
		inscriptionSteponeDto.setInscriptionAuthentification(inscAuthentificationDto);
		inscriptionSteptwoDto.setInscriptionAuthentification(inscAuthentificationDto);
		inscriptionSteptreeDto.setInscriptionAuthentification(inscAuthentificationDto);
		inscriptionStepfourDto.setInscriptionAuthentification(inscAuthentificationDto);
		
		
		logger.debug("******** DANS LE CREATE STUDENT 111 **********"+inscriptionSteponeDto);
		logger.debug("********DANS LE CREATE STUDENT 222 **********"+inscriptionStepfourDto);
		
		listStudentIdentity = inscriptionSteponeServicewsEndpoint.searchInscriptionSteponeServicews(inscriptionSteponeDto);
		listInscriptionSteptwo = inscriptionSteptwoServicewsEndpoint.searchInscriptionSteptwoServicews(inscriptionSteptwoDto);
		listInscriptionSteptree = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
		listInscriptionStepfour = inscriptionStepfourServicewsEndpoint.searchInscriptionStepfourServicews(inscriptionStepfourDto);
		
		logger.debug("********TAILLE LISTES STEP ONE**********"+listStudentIdentity.size());
		logger.debug("********TAILLE LISTES STEP TWO**********"+listInscriptionSteptwo.size());
		logger.debug("********TAILLE LISTES STEP THREE**********"+listInscriptionSteptree.size());
		logger.debug("********TAILLE LISTES STEP FOUR**********"+listInscriptionStepfour.size());
		
		try {
			
			for(int i = 0; i< listStudentIdentity.size(); i++ ) {
				StudentDto createstudent = new StudentDto();

				createstudent.setAddressLigne1(listStudentIdentity.get(i).getAddressLigne1());
				createstudent.setAddressLigne2(listStudentIdentity.get(i).getAddressLigne2());
				createstudent.setAddressLigne3(listStudentIdentity.get(i).getAddressLigne3());
				createstudent.setAddressLigne4(listStudentIdentity.get(i).getAddressLigne4());
				createstudent.setCityAddress(listStudentIdentity.get(i).getCityAddress());
				createstudent.setBirthday(listStudentIdentity.get(i).getBirthday());
				createstudent.setCityAddress(listStudentIdentity.get(i).getCityAddress());
				createstudent.setCountryAddress(listStudentIdentity.get(i).getCountryAddress());
				createstudent.setPhoneNumber(listStudentIdentity.get(i).getPhoneNumber());
				createstudent
						.setFirstName(listStudentIdentity.get(i).getFirstName());
				createstudent.setIdentityNumber(listStudentIdentity.get(i).getIdentityNumber());
				createstudent.setCountryOfBirthday(listStudentIdentity.get(i).getCountryOfBirthday());
				
				createstudent.setInscriptionAuthentification(listStudentIdentity.get(i).getInscriptionAuthentification());
				createstudent.setMaritalStatus(listStudentIdentity.get(i).getMaritalStatus());
				createstudent.setName(listStudentIdentity.get(i).getName());
				createstudent.setNationality(listStudentIdentity.get(i).getMaritalStatus());
				createstudent.setRegionAddress(listStudentIdentity.get(i).getRegionAddress());
				createstudent.setInscriptionAuthentification(listStudentIdentity.get(i).getInscriptionAuthentification());
				createstudent.setSexe(listStudentIdentity.get(i).getSexe());
				createstudent.setTypeOfDocument(listStudentIdentity.get(i).getTypeOfDocument());

				studentServicewsEndpoint = studentServicews
						.getStudentServicewsImplPort();
				createstudent = studentServicewsEndpoint.createStudentServicews(createstudent);

				init();
			}
				
				
			
			for(int i = 0; i< listInscriptionSteptwo.size(); i++ ) {
				StudentContactDto createstudentcontact = new StudentContactDto();
				
				studentDtos.setInscriptionAuthentification(inscAuthentificationDto);
				listStudents = studentServicewsEndpoint.searchStudentServicews(studentDtos);
				studentDto.setIdStudent(listStudents1.get(i).getIdStudent());
				
				createstudentcontact.setAddressLigne1(listInscriptionSteptwo.get(i).getAddressLigne1());
				createstudentcontact.setAddressLigne2(listInscriptionSteptwo.get(i).getAddressLigne2());
				createstudentcontact.setAddressLigne3(listInscriptionSteptwo.get(i).getAddressLigne3());
				createstudentcontact.setAddressLigne4(listInscriptionSteptwo.get(i).getAddressLigne4());
				createstudentcontact.setCityAddress(listInscriptionSteptwo.get(i).getCityAddress());
				createstudentcontact.setCountryAddress(listInscriptionSteptwo.get(i).getCountryAddress());
				createstudentcontact.setEmailAddress(listInscriptionSteptwo.get(i).getEmailAddress());
				createstudentcontact.setFirstName(listInscriptionSteptwo.get(i).getFirstName());
				createstudentcontact.setName(listInscriptionSteptwo.get(i).getName());
				createstudentcontact.setPhoneNumber(listInscriptionSteptwo.get(i).getPhoneNumber());
				createstudentcontact
						.setRegionAddress(listInscriptionSteptwo.get(i).getRegionAddress());
				createstudentcontact.setStudent(studentDto);
			
				createstudentcontact.setRelationship(listInscriptionSteptwo.get(i).getRelationship());
				createstudentcontact.setTypeOfContact(listInscriptionSteptwo.get(i).getTypeOfContact());
				createstudentcontact.setZipcodeAddress(listInscriptionSteptwo.get(i).getZipcodeAddress());
				
				studentContactServicewsEndpoint = studentContactServicews.getStudentContactServicewsImplPort();
				
				createstudentcontact = studentContactServicewsEndpoint.createStudentContactServicews(createstudentcontact);

				init();
			}
			
			
			for(int i = 0; i< listInscriptionStepfour.size(); i++ ) {
				StudentCVDto createstudentcv = new StudentCVDto();
				
				studentDtos.setInscriptionAuthentification(inscAuthentificationDto);
				listStudents = studentServicewsEndpoint.searchStudentServicews(studentDtos);
				studentDto.setIdStudent(listStudents1.get(i).getIdStudent());
				
				createstudentcv.setContactEmail(listInscriptionStepfour.get(i).getContactEmail());
				createstudentcv.setContactName(listInscriptionStepfour.get(i).getContactName());
				createstudentcv.setContactTelephoneNumber(listInscriptionStepfour.get(i).getContactTelephoneNumber());
				createstudentcv.setDiploma(listInscriptionStepfour.get(i).getDiploma());
				createstudentcv.setEnDate(listInscriptionStepfour.get(i).getEnDate());
				createstudentcv.setGrade(listInscriptionStepfour.get(i).getGrade());
				createstudentcv.setNameOfScool(listInscriptionStepfour.get(i).getNameOfScool());
				createstudentcv.setStartDate(listInscriptionStepfour.get(i).getStartDate());
				createstudentcv.setStudent(studentDto);
				createstudentcv.setTypeOfContact(listInscriptionStepfour.get(i).getTypeOfContact());
			
				studentCVServicewsEndpoint = studentCVServicews.getStudentCVServicewsImplPort();
				createstudentcv = studentCVServicewsEndpoint.createStudentCVServicews(createstudentcv);
				
				init();
				
			}
			
					

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
			
			listRegion = regionServicewsEndpoint.getAllRegionServicews();
			
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
	//		inscriptionSteponeDto.setInscriptionAuthentification(inscAuthentificationDto);
//			inscriptionSteptwoDto.setInscriptionAuthentification(inscAuthentificationDto);
	//		inscriptionSteptreeDto.setInscriptionAuthentification(inscAuthentificationDto);
//			inscriptionStepfourDto.setInscriptionAuthentification(inscAuthentificationDto);
//			logger.debug("22222222222"+inscriptionSteptwoDto);
//			
			listStudentIdentity = inscriptionSteponeServicewsEndpoint.searchInscriptionSteponeServicews(inscriptionSteponeDto);
			
			
//			listInscriptionSteptwo = inscriptionSteptwoServicewsEndpoint.searchInscriptionSteptwoServicews(inscriptionSteptwoDto);
			listInscriptionSteptree = inscriptionSteptreeServicewsEndpoint.searchInscriptionSteptreeServicews(inscriptionSteptreeDto);
			
			prospectDto.getInformations(listStudentIdentity, listInscriptionSteptree);
			
	    	listprospects = prospectDto.getInformations(listStudentIdentity, listInscriptionSteptree);
	    	
	    	for (int i = 0; i < listprospects.size(); i++){
	    		logger.debug("+++++++affichage++++++++++++"+listprospects.get(i).getNom());
	    		
	    		
	    	}
	    	logger.debug("@@@@@@@@TAILLE DES PROSPECTS @@@@@"+listprospects.size());
	    	logger.debug("@@@@@@@@TAILLE DES PROSPECTS @@@@@"+listprospects.size());
			
//			logger.debug("***********LISTE DES PROSPECTS*****"+listprospects.size());
			
//			listInscriptionStepfour = inscriptionStepfourServicewsEndpoint.searchInscriptionStepfourServicews(inscriptionStepfourDto);
			
			logger.debug("@@@@TAILLE step 1 EST DE "+listStudentIdentity.size());
			
			logger.debug("@@@@@@TAILLE step 3 "+listInscriptionSteptree.size());
			
			listInscripts = inscriptionAuthServicewsEndpoint.searchInscriptionAuthServicews(inscAuthentificationDto);
			
			
			

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
public void maskPhone() {
		
		if (inscriptionSteponeDto.getCountryAddress().getIdCountry() != null){
			
					regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
					countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
					RegionDto regionsearch = new RegionDto();
					regionsearch.setCountry(inscriptionSteponeDto.getCountryAddress());
					listRegion = regionServicewsEndpoint.searchRegionServicews(regionsearch);
					
//					CityDto citysearch = new CityDto();
//					citysearch.setRegion(inscriptionSteponeDto.getRegionAddress());
//					logger.debug(" @@@@@@@@@@@ je vais en ville "+citysearch.getRegion().getRegionName());
//					listcity = cityServicewsEndpoint.searchCityServicews(citysearch);
//					logger.debug("la taille de la liste villlllle est "+listcity.size());
//					
//					ZipcodeDto zipcodesearch = new ZipcodeDto();
//					zipcodesearch.setCity(inscriptionSteponeDto.getCityAddress());
//					logger.debug("@@@@@@@@@@@@@@@@ je vais en code "+zipcodesearch.getCity().getCityName());
//					listzipcode = zipServicewsEndpoint.searchZipcodeServicews(zipcodesearch);
//					logger.debug("la taille de la liste zippppppppp est "+listzipcode.size());
		  }
		
	

		if (inscriptionSteponeDto.getCountryAddress().getIdCountry() != null) {
			maskphonformat = "("
					+ inscriptionSteponeDto.getCountryAddress()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (inscriptionSteponeDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteponeDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		inscriptionSteponeDto.setPhoneNumber("221");
		logger.debug("maskphonformat:" + maskphonformat);

	}

	public void maskPhoneparent() {
          
		
		if (inscriptionSteptwoDto.getCountryAddress().getIdCountry() != null){
			
			regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(inscriptionSteptwoDto.getCountryAddress());
			listRegion = regionServicewsEndpoint.searchRegionServicews(regionsearch);
	   
  }
		if (inscriptionSteptwoDto.getCountryAddress().getIdCountry() != null) {
			maskphonformatparent = "("
					+ inscriptionSteptwoDto.getCountryAddress()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (inscriptionSteptwoDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(inscriptionSteptwoDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		inscriptionSteponeDto.setPhoneNumber("221");
		logger.debug("maskphonformatparent:" + maskphonformatparent);

	}
	
//	public void onRowSelect(SelectEvent event) {
//        FacesMessage msg = new FacesMessage("Proéspect Selectionné", ((InscriptionAuthentificationDto) event.getObject()).getIdInscription().toString());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//        action2 = true;
//        action3 = false;
//    }

}

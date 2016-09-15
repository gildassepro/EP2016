package org.sepro.studentweb.bean;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.model.UploadedFile;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteponeDto;
import org.sepro.inscriptionweb.serviceapi.InscriptionSteptwoDto;
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
import org.sepro.studentweb.serviceapi.StudentDataDto;
import org.sepro.studentweb.serviceapi.StudentDto;
import org.sepro.studentweb.serviceapi.StudentProgramDto;
import org.sepro.studentweb.serviceimpl.StudentCVServicews;
import org.sepro.studentweb.serviceimpl.StudentCVServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentContactServicews;
import org.sepro.studentweb.serviceimpl.StudentContactServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentDataDtoServicews;
import org.sepro.studentweb.serviceimpl.StudentDataDtoServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentProgramServicews;
import org.sepro.studentweb.serviceimpl.StudentProgramServicewsEndpoint;
import org.sepro.studentweb.serviceimpl.StudentServicews;
import org.sepro.studentweb.serviceimpl.StudentServicewsEndpoint;

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

	private StudentServicews studentServicews = new StudentServicews();
	private StudentServicewsEndpoint studentServicewsEndpoint;

	private StudentCVServicews studentCVServicews = new StudentCVServicews();
	private StudentCVServicewsEndpoint studentCVServicewsEndpoint;

	private StudentDataDtoServicews studentDataDtoServicews = new StudentDataDtoServicews();
	private StudentDataDtoServicewsEndpoint studentDataDtoServicewsEndpoint;
	
	private StudentProgramServicewsEndpoint studentProgramServicewsEndpoint;
	private StudentProgramServicews studentProgramServicews =  new StudentProgramServicews();
	
	private StudentDataDto studentDataDto = new StudentDataDto();
	private StudentDataDto studentDataDtos = new StudentDataDto();
	private List<StudentDataDto> listDataStudent = new ArrayList<StudentDataDto>();

	private StudentContactDto studentContactDto = new StudentContactDto();
	private StudentContactDto studentContactDtos = new StudentContactDto();
	private List<StudentContactDto> liststudentcontact = new ArrayList<StudentContactDto>();
	private List<StudentContactDto> liststudentcontact1 = new ArrayList<StudentContactDto>();

	private StudentCVDto studentCVDto = new StudentCVDto();
	private StudentCVDto studentCVDtos = new StudentCVDto();
	private List<StudentCVDto> listCVstudent = new ArrayList<StudentCVDto>();
	private List<StudentCVDto> listCVstudent1 = new ArrayList<StudentCVDto>();
	
	private StudentProgramDto studentProgramDto = new StudentProgramDto();
	private StudentProgramDto studentProgramDtos = new StudentProgramDto();
	private List<StudentProgramDto> listSearchStudent = new ArrayList<StudentProgramDto>();

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
	private List<PopuplistDto> listmention = new ArrayList<PopuplistDto>();

	private List<PopuplistDto> listfiliere = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listanneeacademique = new ArrayList<PopuplistDto>();

	public boolean status;
	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;

	private boolean render2 = false;
	private boolean render3 = false;

	private boolean render4 = true;

	private boolean render5 = true;

	private boolean testdetail = true;
	private String maskphonformatteacher;
	private Calendar now = Calendar.getInstance();

	private UploadedFile myfile;
	private String filename;
	private String destination = "D:\\DossierCVStudent\\";
	File file;
	private static final int DEFAULT_BUFFER_SIZE = 10240;

	private String maskphonformat;
	private String maskphonformatparent;
	private boolean testmodifier = true;

	
	
	public List<StudentProgramDto> getListSearchStudent() {
		return listSearchStudent;
	}

	public void setListSearchStudent(List<StudentProgramDto> listSearchStudent) {
		this.listSearchStudent = listSearchStudent;
	}

	public StudentProgramDto getStudentProgramDto() {
		return studentProgramDto;
	}

	public void setStudentProgramDto(StudentProgramDto studentProgramDto) {
		this.studentProgramDto = studentProgramDto;
	}

	public StudentProgramDto getStudentProgramDtos() {
		return studentProgramDtos;
	}

	public void setStudentProgramDtos(StudentProgramDto studentProgramDtos) {
		this.studentProgramDtos = studentProgramDtos;
	}

	public StudentDataDto getStudentDataDto() {
		return studentDataDto;
	}

	public void setStudentDataDto(StudentDataDto studentDataDto) {
		this.studentDataDto = studentDataDto;
	}

	public StudentDataDto getStudentDataDtos() {
		return studentDataDtos;
	}

	public void setStudentDataDtos(StudentDataDto studentDataDtos) {
		this.studentDataDtos = studentDataDtos;
	}

	public List<StudentDataDto> getListDataStudent() {
		return listDataStudent;
	}

	public void setListDataStudent(List<StudentDataDto> listDataStudent) {
		this.listDataStudent = listDataStudent;
	}

	public List<PopuplistDto> getListmention() {
		return listmention;
	}

	public void setListmention(List<PopuplistDto> listmention) {
		this.listmention = listmention;
	}

	public Calendar getNow() {
		return now;
	}

	public void setNow(Calendar now) {
		this.now = now;
	}

	public boolean isTestmodifier() {
		return testmodifier;
	}

	public void setTestmodifier(boolean testmodifier) {
		this.testmodifier = testmodifier;
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

	public List<StudentContactDto> getListstudentcontact1() {
		return liststudentcontact1;
	}

	public void setListstudentcontact1(
			List<StudentContactDto> liststudentcontact1) {
		this.liststudentcontact1 = liststudentcontact1;
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

	public List<StudentCVDto> getListCVstudent1() {
		return listCVstudent1;
	}

	public void setListCVstudent1(List<StudentCVDto> listCVstudent1) {
		this.listCVstudent1 = listCVstudent1;
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

	public List<StudentDto> getListStudents1() {
		return listStudents1;
	}

	public void setListStudents1(List<StudentDto> listStudents1) {
		this.listStudents1 = listStudents1;
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

	public List<PopuplistDto> getListdocumentidentity() {
		return listdocumentidentity;
	}

	public void setListdocumentidentity(List<PopuplistDto> listdocumentidentity) {
		this.listdocumentidentity = listdocumentidentity;
	}

	public List<PopuplistDto> getListlienparante() {
		return listlienparante;
	}

	public void setListlienparante(List<PopuplistDto> listlienparante) {
		this.listlienparante = listlienparante;
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

	public void initDualListPro(String daction) {
		if (daction.equals("1")) {
			studentDtos.setIdStudent(studentProgramDtos.getStudentDto().getIdStudent());
			studentDto = studentDtos;
			studentProgramDto = studentProgramDtos;
			action2 = true;
			action3 = false;

			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			listsexe = new ArrayList<PopuplistDto>();
			listanneeacademique = new ArrayList<PopuplistDto>();
			listdocumentidentity = new ArrayList<PopuplistDto>();
			listetatcivile = new ArrayList<PopuplistDto>();
			listfiliere = new ArrayList<PopuplistDto>();
			listnationalite = new ArrayList<PopuplistDto>();

			// logger.debug("****AFFICHAGE ETUDIANT ID********"+studentDto.getIdStudent());
			initUpdateStudent();

		} else {
			action2 = true;
			action3 = false;

		}

	}

	public void initDualListCo(String faction) {
		if (faction.equals("1")) {

			studentContactDto = studentContactDtos;
			action2 = true;
			action3 = false;

			listCountry = new ArrayList<CountryDto>();
			listRegion = new ArrayList<RegionDto>();
			listCity = new ArrayList<CityDto>();
			listZipcode = new ArrayList<ZipcodeDto>();
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			render2 = true;
			// logger.debug("****AFFICHAGE ETUDIANT CONTACT********"+studentContactDto.getName());
			// logger.debug("****AFFICHAGE ETUDIANT CONTACT********"+studentDto);

			initUpdateStudentCo();

		} else {
			action2 = true;
			action3 = false;
			render3 = true;

			studentCVDto = studentCVDtos;
			listtypecontact = new ArrayList<PopuplistDto>();
			listlienparante = new ArrayList<PopuplistDto>();
			listmention = new ArrayList<PopuplistDto>();
			initUpdateStudentCv();
			// logger.debug("****AFFICHAGE ETUDIANT CV********"+studentCVDto);
			// logger.debug("****AFFICHAGE ETUDIANT CV********"+studentDto);

		}

	}

	public void initUpdateStudentCv() {
		try {
			logger.debug("end initUpdate");

			studentCVServicewsEndpoint = studentCVServicews
					.getStudentCVServicewsImplPort();
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listtypecontact = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typecontact");

			listmention = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mention");

			logger.debug("fin dual2");

			logger.debug("end init initUpdate2");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enregistrerStudentCv() {

		StudentCVDto studentcv = new StudentCVDto();

		studentcv.setContactEmail(studentCVDto.getContactEmail());
		studentcv.setContactName(studentCVDto.getContactName());
		studentcv.setContactTelephoneNumber(studentCVDto
				.getContactTelephoneNumber());
		studentcv.setDiploma(studentCVDto.getDiploma());
		studentcv.setGrade(studentCVDto.getGrade());
		studentcv.setNameOfScool(studentCVDto.getNameOfScool());
		studentcv.setEnDate(studentCVDto.getEnDate());
		studentcv.setStartDate(studentCVDto.getStartDate());
		studentcv.setStudent(studentDto);
		studentcv.setTypeOfContact(studentCVDto.getTypeOfContact());

		studentCVServicewsEndpoint = studentCVServicews
				.getStudentCVServicewsImplPort();

		studentcv = studentCVServicewsEndpoint
				.createStudentCVServicews(studentcv);

		studentCVDto = new StudentCVDto();

	}

	public void updateStudentCv() {

		StudentCVDto updatestudentcv = new StudentCVDto();

		updatestudentcv.setContactEmail(studentCVDto.getContactEmail());
		updatestudentcv.setContactName(studentCVDto.getContactName());
		updatestudentcv.setContactTelephoneNumber(studentCVDto
				.getContactTelephoneNumber());
		updatestudentcv.setDiploma(studentCVDto.getDiploma());
		updatestudentcv.setGrade(studentCVDto.getGrade());
		updatestudentcv.setNameOfScool(studentCVDto.getNameOfScool());
		updatestudentcv.setEnDate(studentCVDto.getEnDate());
		updatestudentcv.setStartDate(studentCVDto.getStartDate());
		updatestudentcv.setStudent(studentDto);
		updatestudentcv.setTypeOfContact(studentCVDto.getTypeOfContact());

		studentCVServicewsEndpoint = studentCVServicews
				.getStudentCVServicewsImplPort();
		updatestudentcv.setIdStudentCV(studentCVDto.getIdStudentCV());

		updatestudentcv = studentCVServicewsEndpoint
				.updateStudentCVServicews(updatestudentcv);

		render3 = false;
		studentCVDto = new StudentCVDto();

	}

	public String supprimerStudentCv() {

		FacesMessage msg = null;
		logger.debug("DEBUT SuppressionCV +++++++++++++");
		try {
			studentCVServicewsEndpoint.deleteStudentCVServicews(studentCVDtos);
			init();
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"), rb.getString("label_warn"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

		}
		return null;
	}

	public String supprimerStudentContact() {

		FacesMessage msg = null;
		logger.debug("DEBUT SuppressionContact +++++++++++++");
		try {
			studentContactServicewsEndpoint
					.deleteStudentContactServicews(studentContactDtos);
			init();
		} catch (Exception e) {
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"), rb.getString("label_warn"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);

		}
		return null;
	}

	public void initUpdateStudentCo() {
		try {
			action2 = true;
			logger.debug("end initUpdate");
			studentContactServicewsEndpoint = studentContactServicews
					.getStudentContactServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			zipServicewsEndpoint = zipServicews.getZipServicewsImplPort();
			cityServicewsEndpoint = cityServicews.getCityServicewsImplPort();
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();

			listCountry = countryServicewsEndpoint.getAllCountryServicews();

			listRegion = regionServicewsEndpoint.getAllRegionServicews();

			listZipcode = zipServicewsEndpoint.getAllZipcodeServicews();

			listCity = cityServicewsEndpoint.getAllCityServicews();

			listetatcivile = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("etatcivile");

			listnationalite = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("nationnalite");

			listdocumentidentity = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("identite");

			listsexe = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("sexe");

			listlienparante = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("lien");

			listmention = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("mention");

			listtypecontact = popuplistDtoServicewsEndpoint
					.searchPopuplistDtoServicews("typecontact");

			logger.debug("fin dual");

			logger.debug("end init initUpdate");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initUpdateStudent() {
		studentServicewsEndpoint = studentServicews
				.getStudentServicewsImplPort();
		studentProgramServicewsEndpoint = studentProgramServicews.getStudentProgramServicewsImplPort();
		studentContactServicewsEndpoint = studentContactServicews
				.getStudentContactServicewsImplPort();
		studentCVServicewsEndpoint = studentCVServicews
				.getStudentCVServicewsImplPort();

		countryServicewsEndpoint = countryServicews
				.getCountryServicewsImplPort();
		regionServicewsEndpoint = regionServicews.getRegionServicewsImplPort();
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

		listmention = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("mention");

		listtypecontact = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("typecontact");
		listlienparante = popuplistDtoServicewsEndpoint
				.searchPopuplistDtoServicews("lien");

		//
		// logger.debug("***********STUDENT***************"+studentDtos.getIdStudent());
		// logger.debug("***********STUDENT***************"+studentDtos.getIdStudent());
		studentDtos.setIdStudent(studentProgramDtos.getStudentDto().getIdStudent());
		
		studentContactDtos.setStudent(studentDtos);
		studentCVDtos.setStudent(studentDtos);

		// logger.debug("***********STUDENT***************"+studentContactDtos);
		// logger.debug("***********STUDENT***************"+studentCVDtos);

		liststudentcontact = studentContactServicewsEndpoint
				.searchStudentContactServicews(studentContactDtos);
		listCVstudent = studentCVServicewsEndpoint
				.searchStudentCVServicews(studentCVDtos);
	}

	public void updateIdentityStudent() {
		FacesMessage msg = null;
		
		try {
			logger.debug("@@@@@@@@ debut student 1");
			StudentDto modifstudent = new StudentDto();
			modifstudent.setBirthday(studentProgramDto.getStudentDto().getBirthday());
			modifstudent.setCityAddress(studentProgramDto.getStudentDto().getCityAddress());
			modifstudent.setCountryAddress(studentProgramDto.getStudentDto().getCountryAddress());
			modifstudent
					.setCountryOfBirthday(studentProgramDto.getStudentDto().getCountryOfBirthday());
			modifstudent.setFirstName(studentProgramDto.getStudentDto().getFirstName());
			modifstudent.setIdentityNumber(studentProgramDto.getStudentDto().getIdentityNumber());
			modifstudent.setInscriptionAuthentification(studentProgramDto.getStudentDto()
					.getInscriptionAuthentification());
			modifstudent.setMaritalStatus(studentProgramDto.getStudentDto().getMaritalStatus());
			modifstudent.setName(studentProgramDto.getStudentDto().getName());
			modifstudent.setNationality(studentProgramDto.getStudentDto().getNationality());
			modifstudent.setPhoneNumber(studentProgramDto.getStudentDto().getPhoneNumber());
			modifstudent.setPlaceOfBirthday(studentProgramDto.getStudentDto().getPlaceOfBirthday());
			modifstudent.setRegionAddress(studentProgramDto.getStudentDto().getRegionAddress());
			modifstudent.setSexe(studentProgramDto.getStudentDto().getSexe());
			modifstudent.setTypeOfDocument(studentProgramDto.getStudentDto().getTypeOfDocument());
			modifstudent.setZipcodeAddress(studentProgramDto.getStudentDto().getZipcodeAddress());

			modifstudent.setIdStudent(studentProgramDto.getStudentDto().getIdStudent());
			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();

			modifstudent = studentServicewsEndpoint
					.updateStudentServicews(modifstudent);
			logger.debug("@@@@@@@@ fin modification student 1");

		} catch (Exception e) {

		}
		
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_student_updateidentity"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
	}

	public void enregistrerStudentContact() {
		logger.debug("@@@@@@@@  JE SUIS DANS LA METHODE ENREGISTRER CONTACT @@@@@@@@@@");
		FacesMessage msg = null;
		
		try {

			StudentContactDto contactstudent = new StudentContactDto();

			contactstudent.setCityAddress(studentContactDto.getCityAddress());
			logger.debug("********ADDRESSE CONTACT*******"
					+ studentContactDto.getCityAddress());
			contactstudent.setCountryAddress(studentContactDto
					.getCountryAddress());
			logger.debug("****************COUNTRY CONTACT**********"
					+ studentContactDto.getCountryAddress());
			contactstudent.setEmailAddress(studentContactDto.getEmailAddress());
			logger.debug("****************MAIL CONTACT**********"
					+ studentContactDto.getEmailAddress());
			contactstudent.setFirstName(studentContactDto.getFirstName());
			logger.debug("****************FIRST NAME CONTACT**********"
					+ studentContactDto.getFirstName());
			contactstudent.setStudent(studentDto);
			logger.debug("****************STUDENT CONTACT**********"
					+ studentDto.getName());
			contactstudent.setName(studentContactDto.getName());
			logger.debug("****************NAME CONTACT**********"
					+ studentContactDto.getName());
			contactstudent.setPhoneNumber(studentContactDto.getPhoneNumber());
			logger.debug("****************PHONE NUMBER CONTACT**********"
					+ studentContactDto.getPhoneNumber());
			contactstudent.setRegionAddress(studentContactDto
					.getRegionAddress());
			logger.debug("****************REGION CONTACT**********"
					+ studentContactDto.getRegionAddress());
			contactstudent.setRelationship(studentContactDto.getRelationship());
			logger.debug("****************RELATIONSHIP CONTACT**********"
					+ studentContactDto.getRelationship());
			contactstudent.setTypeOfContact(studentContactDto
					.getTypeOfContact());
			logger.debug("****************TYPEOFCONTACT CONTACT**********"
					+ studentContactDto.getTypeOfContact());
			contactstudent.setZipcodeAddress(studentContactDto
					.getZipcodeAddress());
			logger.debug("****************ZIPCODE CONTACT**********"
					+ studentContactDto.getZipcodeAddress());

			studentContactServicewsEndpoint = studentContactServicews
					.getStudentContactServicewsImplPort();

			contactstudent = studentContactServicewsEndpoint
					.createStudentContactServicews(contactstudent);
			init();

		} catch (Exception e) {

		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_student_createcontact"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);

	}

	public void updateStudentContact() {
			FacesMessage msg =  null;
			
		try {
			studentDtos.setIdStudent(studentContactDto.getStudent().getIdStudent());
			StudentContactDto updatecontactstudent = new StudentContactDto();

			updatecontactstudent.setCityAddress(studentContactDto.getCityAddress());
			logger.debug("********ADDRESSE CONTACT*******"
					+ studentContactDto.getCityAddress());
			updatecontactstudent.setCountryAddress(studentContactDto
					.getCountryAddress());
			logger.debug("****************COUNTRY CONTACT**********"
					+ studentContactDto.getCountryAddress());
			updatecontactstudent.setEmailAddress(studentContactDto
					.getEmailAddress());
			logger.debug("****************MAIL CONTACT**********"
					+ studentContactDto.getEmailAddress());
			updatecontactstudent.setFirstName(studentContactDto.getFirstName());
			logger.debug("****************FIRST NAME CONTACT**********"
					+ studentContactDto.getFirstName());
			updatecontactstudent.setStudent(studentDto);
			logger.debug("****************STUDENT CONTACT**********"
					+ studentDto.getName());
			updatecontactstudent.setName(studentContactDto.getName());
			logger.debug("****************NAME CONTACT**********"
					+ studentContactDto.getName());
			updatecontactstudent.setPhoneNumber(studentContactDto.getPhoneNumber());
			logger.debug("****************PHONE NUMBER CONTACT**********"
					+ studentContactDto.getPhoneNumber());
			updatecontactstudent.setRegionAddress(studentContactDto
					.getRegionAddress());
			logger.debug("****************REGION CONTACT**********"
					+ studentContactDto.getRegionAddress());
			updatecontactstudent.setRelationship(studentContactDto
					.getRelationship());
			logger.debug("****************RELATIONSHIP CONTACT**********"
					+ studentContactDto.getRelationship());
			updatecontactstudent.setTypeOfContact(studentContactDto
					.getTypeOfContact());
			logger.debug("****************TYPEOFCONTACT CONTACT**********"
					+ studentContactDto.getTypeOfContact());
			updatecontactstudent.setZipcodeAddress(studentContactDto
					.getZipcodeAddress());
			logger.debug("****************ZIPCODE CONTACT**********"
					+ studentContactDto.getZipcodeAddress());

			studentContactServicewsEndpoint = studentContactServicews
					.getStudentContactServicewsImplPort();

			updatecontactstudent.setIdStudentContact(studentContactDto
					.getIdStudentContact());
			updatecontactstudent = studentContactServicewsEndpoint
					.updateStudentContactServicews(updatecontactstudent);

			render2 = false;
			studentContactDto = new StudentContactDto();
			init();
		}catch(Exception ex){
			
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_student_updatecontact"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		
		
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");
			studentProgramServicewsEndpoint = studentProgramServicews.getStudentProgramServicewsImplPort();
			studentServicewsEndpoint = studentServicews
					.getStudentServicewsImplPort();
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

			listStudents = studentServicewsEndpoint
					.searchStudentServicews(studentDto);
			
			listSearchStudent = studentProgramServicewsEndpoint.searchStudentProgramDtoServicews();
			// listDataStudent =
			// studentDataDtoServicewsEndpoint.searchStudentDataDtoServicews();

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void maskPhone() {

		if (studentProgramDto.getStudentDto().getCountryAddress().getIdCountry() != null) {

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(studentProgramDto.getStudentDto().getCountryAddress());
			listRegion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}

		if (studentProgramDto.getStudentDto().getCountryAddress().getIdCountry() != null) {
			maskphonformat = "("
					+ studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
							.getIndicatif() + ")";
		}

		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (studentProgramDto.getStudentDto().getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformat = maskphonformat
					+ FormatNumberPhoneUtil.getFormat(studentProgramDto.getStudentDto()
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		studentProgramDto.getStudentDto().setPhoneNumber("221");
		logger.debug("maskphonformat:" + maskphonformat);

	}

	public void maskPhoneparent() {
		logger.debug("@@@@@PAYS@@@@@@"
				+ studentContactDto.getCountryAddress().getCountryName());
		logger.debug("@@@@@PAYS@@@@@@"
				+ studentContactDto.getCountryAddress().getCountryName());

		if (studentContactDto.getCountryAddress().getIdCountry() != null) {

			regionServicewsEndpoint = regionServicews
					.getRegionServicewsImplPort();
			countryServicewsEndpoint = countryServicews
					.getCountryServicewsImplPort();
			RegionDto regionsearch = new RegionDto();
			regionsearch.setCountry(studentContactDto.getCountryAddress());
			listRegion = regionServicewsEndpoint
					.searchRegionServicews(regionsearch);

		}
		if (studentContactDto.getCountryAddress().getIdCountry() != null) {
			maskphonformatparent = "("
					+ studentContactDto.getCountryAddress()
							.getMobilePhoneFormat().getIndicatif() + ")";
		}

		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc1() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc1());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc2() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc2());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc3() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc3());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc4() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc4());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc5() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc5());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc6() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc6());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc7() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc7());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc8() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc8());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc9() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc9());
		}
		if (studentContactDto.getCountryAddress().getMobilePhoneFormat()
				.getNbrOfDigitBloc10() > 0) {
			maskphonformatparent = maskphonformatparent
					+ FormatNumberPhoneUtil.getFormat(studentContactDto
							.getCountryAddress().getMobilePhoneFormat()
							.getNbrOfDigitBloc10());
		}
		studentContactDto.setPhoneNumber("221");
		logger.debug("maskphonformatparent:" + maskphonformatparent);

	}

	public void updateListville() {
		if (studentProgramDto.getStudentDto().getRegionAddress().getIdRegion() != null) {
			CityDto citysearch = new CityDto();
			citysearch.setRegion(studentProgramDto.getStudentDto().getRegionAddress());
			listCity = cityServicewsEndpoint.searchCityServicews(citysearch);
		}
	}

	public void updateListzipcode() {
		if (studentProgramDto.getStudentDto().getRegionAddress().getIdRegion() != null) {
			ZipcodeDto zipcodesearch = new ZipcodeDto();
			zipcodesearch.setCity(studentProgramDto.getStudentDto().getCityAddress());
			listZipcode = zipServicewsEndpoint
					.searchZipcodeServicews(zipcodesearch);
		}
	}

	public void updateListvilleparent() {
		if (studentContactDto.getRegionAddress().getIdRegion() != null) {
			CityDto citysearch = new CityDto();
			citysearch.setRegion(studentContactDto.getRegionAddress());
			listCity = cityServicewsEndpoint.searchCityServicews(citysearch);
		}
	}

	public void updateListzipcodeparent() {
		if (studentContactDto.getRegionAddress().getIdRegion() != null) {
			ZipcodeDto zipcodesearch = new ZipcodeDto();
			zipcodesearch.setCity(studentContactDto.getCityAddress());
			listZipcode = zipServicewsEndpoint
					.searchZipcodeServicews(zipcodesearch);
		}
	}

}

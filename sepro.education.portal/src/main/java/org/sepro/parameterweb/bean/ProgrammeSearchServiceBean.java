package org.sepro.parameterweb.bean;

import groovy.ui.text.FindReplaceUtility;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import javax.faces.application.FacesMessage;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.parameterweb.serviceapi.CurriculumDto;
import org.sepro.parameterweb.serviceapi.ModuleCalendarDto;
import org.sepro.parameterweb.serviceapi.PopuplistDto;
import org.sepro.parameterweb.serviceapi.ProgrammeCalendarDto;
import org.sepro.parameterweb.serviceapi.ProgrammeDto;
import org.sepro.parameterweb.serviceapi.ProgrammeDto.Academicmodule;
import org.sepro.parameterweb.serviceapi.SessionDto;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicews;
import org.sepro.parameterweb.serviceimpl.AcademicModuleDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.CurriculumDtoServicews;
import org.sepro.parameterweb.serviceimpl.CurriculumDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ModuleCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicews;
import org.sepro.parameterweb.serviceimpl.PopuplistDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeCalendarDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.ProgrammeDtoServicews;
import org.sepro.parameterweb.serviceimpl.ProgrammeDtoServicewsEndpoint;
import org.sepro.parameterweb.serviceimpl.SessionDtoServicews;
import org.sepro.parameterweb.serviceimpl.SessionDtoServicewsEndpoint;

import com.itextpdf.text.pdf.codec.Base64.InputStream;

@ManagedBean
@ViewScoped
public class ProgrammeSearchServiceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ProgrammeSearchServiceBean.class);
	private ProgrammeDtoServicews programmeDtoServicews = new ProgrammeDtoServicews();
	private ProgrammeDtoServicewsEndpoint programmeDtoServicewsEndpoint;

	private ProgrammeCalendarDtoServicews programmeCalendarDtoServicews = new ProgrammeCalendarDtoServicews();
	private ProgrammeCalendarDtoServicewsEndpoint programmeCalendarDtoServicewsEndpoint;
	private ProgrammeCalendarDto programmeCalendarDto = new ProgrammeCalendarDto();
	private ProgrammeCalendarDto programmeCalendarDtos = new ProgrammeCalendarDto();

	private SessionDtoServicews sessionDtoServicews = new SessionDtoServicews();
	private SessionDtoServicewsEndpoint sessionDtoServicewsEndpoint;
	private List<SessionDto> listSession = new ArrayList<SessionDto>();
	private SessionDto sessionDto = new SessionDto();

	private ModuleCalendarDtoServicews moduleCalendarDtoServicews = new ModuleCalendarDtoServicews();
	private ModuleCalendarDtoServicewsEndpoint moduleCalendarDtoServicewsEndpoint;
	private ModuleCalendarDto moduleCalendarDto = new ModuleCalendarDto();
	private List<ModuleCalendarDto> listModuleCalendar = new ArrayList<ModuleCalendarDto>();
	private List<ModuleCalendarDto> listModuleCalendarSelected = new ArrayList<ModuleCalendarDto>();

	private AcademicModuleDtoServicews academicModuleDtoServicews = new AcademicModuleDtoServicews();
	private AcademicModuleDtoServicewsEndpoint academicModuleDtoServicewsEndpoint;

	private PopuplistDtoServicews popuplistDtoServicews = new PopuplistDtoServicews();
	private PopuplistDtoServicewsEndpoint popuplistDtoServicewsEndpoint;

	private CurriculumDtoServicews curriculumDtoServicews = new CurriculumDtoServicews();
	private CurriculumDtoServicewsEndpoint curriculumDtoServicewsEndpoint;

	private ProgrammeDto programmeDto = new ProgrammeDto();
	private List<ProgrammeDto> listProgramme = new ArrayList<ProgrammeDto>();
	private ProgrammeDto programmeDtos = new ProgrammeDto();

	private CurriculumDto curriculumDto = new CurriculumDto();
	private List<CurriculumDto> listCurriculum = new ArrayList<CurriculumDto>();

	private List<PopuplistDto> listPopuplist = new ArrayList<PopuplistDto>();
	private PopuplistDto popuplistDto = new PopuplistDto();
	private List<PopuplistDto> listPopuplistAY = new ArrayList<PopuplistDto>();
	private List<PopuplistDto> listPopuplistFIL = new ArrayList<PopuplistDto>();

	private List<ProgrammeDto> listModuleAcademic = new ArrayList<ProgrammeDto>();

	private List<AcademicModuleDto> listDesModuleAcademicSource = new ArrayList<AcademicModuleDto>();
	private List<AcademicModuleDto> listDesModuleAcademicDestination = new ArrayList<AcademicModuleDto>();

	private List<AcademicModuleDto> selectedAcademicmodule = new ArrayList<AcademicModuleDto>();

	private AcademicModuleDto selectedAcademicmodul;

	private String field_name_programme;
	private String field_filiere_programme;
	private int field_academic_year;
	private String field_cursus;
	
	private boolean action = false;
	public boolean typeOfCourse;
	public static JasperDesign jasperDesign;
    public static JasperPrint jasperPrint;
    public static JasperReport jasperReport;
    public static String reportTemplateUrl = "D:\\EP\\trunk\\sepro.education.portal\\src\\main\\java\\org\\sepro\\report\\jrxml\\ListeProgramme.jrxml";

	

    
    
    
    
	public String getField_name_programme() {
		return field_name_programme;
	}

	public void setField_name_programme(String field_name_programme) {
		this.field_name_programme = field_name_programme;
	}

	public String getField_filiere_programme() {
		return field_filiere_programme;
	}

	public void setField_filiere_programme(String field_filiere_programme) {
		this.field_filiere_programme = field_filiere_programme;
	}

	public int getField_academic_year() {
		return field_academic_year;
	}

	public void setField_academic_year(int field_academic_year) {
		this.field_academic_year = field_academic_year;
	}

	public String getField_cursus() {
		return field_cursus;
	}

	public void setField_cursus(String field_cursus) {
		this.field_cursus = field_cursus;
	}

	public List<ModuleCalendarDto> getListModuleCalendar() {
		return listModuleCalendar;
	}

	public void setListModuleCalendar(List<ModuleCalendarDto> listModuleCalendar) {
		this.listModuleCalendar = listModuleCalendar;
	}

	public ModuleCalendarDto getModuleCalendarDto() {
		return moduleCalendarDto;
	}

	public void setModuleCalendarDto(ModuleCalendarDto moduleCalendarDto) {
		this.moduleCalendarDto = moduleCalendarDto;
	}

	public List<SessionDto> getListSession() {
		return listSession;
	}

	public void setListSession(List<SessionDto> listSession) {
		this.listSession = listSession;
	}

	public SessionDto getSessionDto() {
		return sessionDto;
	}

	public void setSessionDto(SessionDto sessionDto) {
		this.sessionDto = sessionDto;
	}

	public ProgrammeDto getProgrammeDto() {
		return programmeDto;
	}

	public void setProgrammeDto(ProgrammeDto programmeDto) {
		this.programmeDto = programmeDto;
	}

	public ProgrammeCalendarDto getProgrammeCalendarDtos() {
		return programmeCalendarDtos;
	}

	public void setProgrammeCalendarDtos(
			ProgrammeCalendarDto programmeCalendarDtos) {
		this.programmeCalendarDtos = programmeCalendarDtos;
	}

	public ProgrammeCalendarDto getProgrammeCalendarDto() {
		return programmeCalendarDto;
	}

	public void setProgrammeCalendarDto(
			ProgrammeCalendarDto programmeCalendarDto) {
		this.programmeCalendarDto = programmeCalendarDto;
	}

	public List<AcademicModuleDto> getListDesModuleAcademicSource() {
		return listDesModuleAcademicSource;
	}

	public void setListDesModuleAcademicSource(
			List<AcademicModuleDto> listDesModuleAcademicSource) {
		this.listDesModuleAcademicSource = listDesModuleAcademicSource;
	}

	public List<AcademicModuleDto> getListDesModuleAcademicDestination() {
		return listDesModuleAcademicDestination;
	}

	public void setListDesModuleAcademicDestination(
			List<AcademicModuleDto> listDesModuleAcademicDestination) {
		this.listDesModuleAcademicDestination = listDesModuleAcademicDestination;
	}

	public List<ProgrammeDto> getListModuleAcademic() {
		return listModuleAcademic;
	}

	public void setListModuleAcademic(List<ProgrammeDto> listModuleAcademic) {
		this.listModuleAcademic = listModuleAcademic;
	}

	public List<AcademicModuleDto> getSelectedAcademicmodule() {
		return selectedAcademicmodule;
	}

	public void setSelectedAcademicmodule(
			List<AcademicModuleDto> selectedAcademicmodule) {
		this.selectedAcademicmodule = selectedAcademicmodule;
	}

	public AcademicModuleDto getSelectedAcademicmodul() {
		return selectedAcademicmodul;
	}

	public void setSelectedAcademicmodul(AcademicModuleDto selectedAcademicmodul) {
		this.selectedAcademicmodul = selectedAcademicmodul;
	}

	
	public List<ProgrammeDto> getListProgramme() {
		return listProgramme;
	}

	public void setListProgramme(List<ProgrammeDto> listProgramme) {
		this.listProgramme = listProgramme;
	}

	public ProgrammeDto getProgrammeDtos() {
		return programmeDtos;
	}

	public void setProgrammeDtos(ProgrammeDto programmeDtos) {
		this.programmeDtos = programmeDtos;
	}

	public CurriculumDto getCurriculumDto() {
		return curriculumDto;
	}

	public void setCurriculumDto(CurriculumDto curriculumDto) {
		this.curriculumDto = curriculumDto;
	}

	public List<CurriculumDto> getListCurriculum() {
		return listCurriculum;
	}

	public void setListCurriculum(List<CurriculumDto> listCurriculum) {
		this.listCurriculum = listCurriculum;
	}

	public List<PopuplistDto> getListPopuplist() {
		return listPopuplist;
	}

	public void setListPopuplist(List<PopuplistDto> listPopuplist) {
		this.listPopuplist = listPopuplist;
	}

	public PopuplistDto getPopuplistDto() {
		return popuplistDto;
	}

	public void setPopuplistDto(PopuplistDto popuplistDto) {
		this.popuplistDto = popuplistDto;
	}

	public List<PopuplistDto> getListPopuplistAY() {
		return listPopuplistAY;
	}

	public void setListPopuplistAY(List<PopuplistDto> listPopuplistAY) {
		this.listPopuplistAY = listPopuplistAY;
	}

	public List<PopuplistDto> getListPopuplistFIL() {
		return listPopuplistFIL;
	}

	public void setListPopuplistFIL(List<PopuplistDto> listPopuplistFIL) {
		this.listPopuplistFIL = listPopuplistFIL;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public boolean isTypeOfCourse() {
		return typeOfCourse;
	}

	public void setTypeOfCourse(boolean typeOfCourse) {
		this.typeOfCourse = typeOfCourse;
	}
	
	
	private List<ModuleCalendarDto> getListModuleCalendarSelected(){
		listModuleCalendarSelected = new ArrayList<ModuleCalendarDto>();
		
		if(programmeCalendarDto.getProgramme() != null){
			ModuleCalendarDto modCal = new ModuleCalendarDto();
			modCal.setProgrammeCalendar(programmeCalendarDto);
			
			List<ModuleCalendarDto> listModuleP = moduleCalendarDtoServicewsEndpoint.getAllModuleCalendarServicews();
			
			for(ModuleCalendarDto m : listModuleP) {
				if(m.getProgrammeCalendar().getIdProgrammeCalendar() == programmeCalendarDto.getIdProgrammeCalendar()){
					listModuleCalendarSelected.add(m);
				}
			}
		}
		return listModuleCalendarSelected;
		
	}
			
	
	public void updateProgramme() {
		logger.debug("DEBUT Modification PROGRAMME");

		FacesMessage msg = null;
		ProgrammeDto programmemodif = new ProgrammeDto();
		ProgrammeCalendarDto programmeCalendarUp = new ProgrammeCalendarDto();
				

		Academicmodule academicmodule = new Academicmodule();
		academicmodule.getAcademicmodule().removeAll(selectedAcademicmodule);
		academicmodule.getAcademicmodule().addAll(selectedAcademicmodule);

		programmemodif.setNameProgramme(programmeDto.getNameProgramme());
		programmemodif.setAcademicmodule(academicmodule);
		programmemodif.setAcademicGrade(programmeDto.getAcademicGrade());
		programmemodif.setAcademiqueYear(programmeDto.getAcademiqueYear());
		programmemodif.setCurriculum(programmeDto.getCurriculum());
		
		programmeCalendarUp.setEndDate(programmeCalendarDto.getEndDate());
		programmeCalendarUp.setEndDate(programmeCalendarDto.getStartDate());
		programmeCalendarUp.setProgramme(programmeCalendarDto.getProgramme());

		programmeDtoServicewsEndpoint = programmeDtoServicews
				.getProgrammeDtoServicewsImplPort();
		programmeCalendarDtoServicewsEndpoint = programmeCalendarDtoServicews.getProgrammeCalendarDtoServicewsImplPort();
		
		programmemodif.setIdProgramme(programmeDto.getIdProgramme());
		programmeCalendarUp.setIdProgrammeCalendar(programmeCalendarDto.getIdProgrammeCalendar());

		programmemodif = programmeDtoServicewsEndpoint
				.updateProgrammeServicews(programmemodif);
		
		programmeCalendarUp = programmeCalendarDtoServicewsEndpoint.updateProgrammeCalendarServicews(programmeCalendarUp);

		init();

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_update_programme"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		logger.debug("FIN Modification PROGRAMME  ********");
	
	}

	public void createProgramme() {
		FacesMessage msg = null;
		
		Academicmodule academicmodule = new Academicmodule();
		academicmodule.getAcademicmodule().addAll(selectedAcademicmodule);

		ProgrammeDto programmecreate = new ProgrammeDto();

		programmecreate.setNameProgramme(programmeDto.getNameProgramme());
		programmecreate.setAcademicmodule(academicmodule);
		programmecreate.setAcademicGrade(programmeDto.getAcademicGrade());
		programmecreate.setAcademiqueYear(programmeDto.getAcademiqueYear());
		programmecreate.setCurriculum(programmeDto.getCurriculum());

		programmeDtoServicewsEndpoint = programmeDtoServicews
				.getProgrammeDtoServicewsImplPort();
		programmecreate = programmeDtoServicewsEndpoint
				.createProgrammeServicews(programmecreate);

		init();

		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_create_programme"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		
	}

	public String initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");
		if (baction.equals("1")) {
			programmeDto = programmeDtos;
			listDesModuleAcademicSource = new ArrayList<AcademicModuleDto>();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listPopuplistAY = new ArrayList<PopuplistDto>();
			listPopuplistFIL = new ArrayList<PopuplistDto>();
			listCurriculum = new ArrayList<CurriculumDto>();
			initUpdate();
			return null;

		} else {
			programmeDto = new ProgrammeDto();
			selectedAcademicmodule = new ArrayList<AcademicModuleDto>();
			listPopuplistAY = new ArrayList<PopuplistDto>();
			listPopuplistFIL = new ArrayList<PopuplistDto>();
			listCurriculum = new ArrayList<CurriculumDto>();
			initCreate();
		}
		logger.debug("FIN initDualList *********************");
		return null;
	}
	
	public void initUpdate() {
		action = false;
		try {
			logger.debug("BEGIN initUpdate");

			if (programmeDto != null) {
				programmeDtoServicewsEndpoint = programmeDtoServicews
						.getProgrammeDtoServicewsImplPort();
				academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
						.getAcademicModuleDtoServicewsImplPort();
				listDesModuleAcademicSource = academicModuleDtoServicewsEndpoint
						.getAllAcademicModuleServicews();

				if (programmeDto != null) {
					for (AcademicModuleDto programme : programmeDto
							.getAcademicmodule().getAcademicmodule()) {
						for (AcademicModuleDto modules : listDesModuleAcademicSource) {
							if (modules.getIdAcademicModule() == programme
									.getIdAcademicModule()) {
								selectedAcademicmodule.add(modules);
								break;
							}
						}
					}
				}

			}

			logger.debug("fin dual");

			logger.debug("END init initUpdate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		action = true;
		try {
			logger.debug("fin initCreate");
			popuplistDtoServicewsEndpoint = popuplistDtoServicews
					.getPopuplistDtoServicewsImplPort();	
			
			listPopuplistAY = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("academic_years");
			listPopuplistFIL = popuplistDtoServicewsEndpoint.searchPopuplistDtoServicews("filiere");			
			
			curriculumDtoServicewsEndpoint = curriculumDtoServicews
					.getCurriculumDtoServicewsImplPort();
			listCurriculum = curriculumDtoServicewsEndpoint
					.getAllCurriculumDServicews();

			academicModuleDtoServicewsEndpoint = academicModuleDtoServicews
					.getAcademicModuleDtoServicewsImplPort();
			listDesModuleAcademicSource = academicModuleDtoServicewsEndpoint
					.getAllAcademicModuleServicews();

			logger.debug("end init initCreate");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String supprimerProgramme() {
		FacesMessage msg = null;
		try {
			programmeDtoServicewsEndpoint.deleteProgrammeServicews(programmeDtos);
			init();
		}catch(Exception ex){
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					rb.getString("label_warn"),
					rb.getString("label_msg_warning_delete_programme"));
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, msg);
			
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_msg_delete_programme"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;
	}

	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {
			logger.debug("begin init ProgrammeServiceBean");
			programmeDtoServicewsEndpoint = programmeDtoServicews
					.getProgrammeDtoServicewsImplPort();
			listProgramme = programmeDtoServicewsEndpoint
					.getAllProgrammeServicews();

			moduleCalendarDtoServicewsEndpoint = moduleCalendarDtoServicews
					.getModuleCalendarDtoServicewsImplPort();
			listModuleCalendar = moduleCalendarDtoServicewsEndpoint
					.getAllModuleCalendarServicews();

			sessionDtoServicewsEndpoint = sessionDtoServicews
					.getSessionDtoServicewsImplPort();
			listSession = sessionDtoServicewsEndpoint.getAllSessionServicews();
			logger.debug("end init ProgrammeServiceBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public void generatereport(){
//		
//		logger.debug("ELLE VEUX GENERER");
//		try {
//			programmeDtoServicewsEndpoint = programmeDtoServicews
//					.getProgrammeDtoServicewsImplPort();
//			listProgramme = programmeDtoServicewsEndpoint
//					.getAllProgrammeServicews();
//			
//		
//			
//		}catch(Exception ex){
//			
//		}
//		
//	}
	 public void  print() {
		    
         
         try {
             
              FacesContext facesContext = FacesContext.getCurrentInstance();
                 HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
                 InputStream reportStream = (InputStream) facesContext.getExternalContext().getResourceAsStream("/org.sepro.report.jrxml/ListeProgrammeAcademique.jasper");

                 ServletOutputStream servletOutputStream = response.getOutputStream();

              
                 facesContext.responseComplete();
                 response.setContentType("application/pdf");

                 JasperRunManager.runReportToPdfStream(reportStream, servletOutputStream,
                         new HashMap(),new net.sf.jasperreports.engine.JREmptyDataSource());

                
                 servletOutputStream.flush();
                 servletOutputStream.close();
         
         
         } catch (IOException e) {
         System.out.print(e.getMessage());

         }
         
         catch (Exception e) {
             // TODO: handle exception
             e.printStackTrace();
         }

 
 }
	 
//	 public void goToReportPage(){
//		 try
//	        {
//	            InputStream resourceAsStream = (InputStream) Thread.currentThread().getContextClassLoader()
//	                    .getResourceAsStream(reportTemplateUrl);
//	            //get report file and then load into jasperDesign
//	            jasperDesign = JRXmlLoader.load(resourceAsStream);
//	            //compile the jasperDesign
//	            jasperReport = JasperCompileManager.compileReport(jasperDesign);
//	            
//	            ByteArrayOutputStream output = new ByteArrayOutputStream();
//	            OutputStream outputfile = new FileOutputStream(new File("c:/temp/ListeProgrammeAcademique.pdf"));
//	            
//	            //fill the ready report with data and parameter
//	            jasperPrint = JasperFillManager.fillReport(jasperReport, getParameters(), new JRBeanCollectionDataSource(programmeDtoServicewsEndpoint.getAllProgrammeServicews()));
//	            
//	            
//	            //coding for PDF
//	            JRPdfExporter exporterPdf = new JRPdfExporter();
//	            exporterPdf.setParameter(JRPdfExporterParameter.JASPER_PRINT, jasperPrint);
//	            exporterPdf.setParameter(JRPdfExporterParameter.OUTPUT_STREAM, output);
//	            exporterPdf.exportReport();
//	            outputfile.write(output.toByteArray());
//	            
//	        }
//	        catch (JRException e)
//	        {
//	            e.printStackTrace();
//	        }
//	    }
//	 
//	
//	 private static Map<String, Object> getParameters()
//	    {
//	        Map<String, Object> params = new HashMap<String, Object>();
//	        params.put("footerText", "Just to demonstrate how to pass parameters to report");
//	        return params;
//	    }


}

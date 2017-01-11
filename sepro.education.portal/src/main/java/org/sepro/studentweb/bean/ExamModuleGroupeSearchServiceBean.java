package org.sepro.studentweb.bean;

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

import org.sepro.studentweb.serviceapi.ExamGroupDto;
import org.sepro.studentweb.serviceapi.ExamModuleGroupDto;


import org.sepro.studentweb.serviceimpl.ExamModuleGroupServicews;
import org.sepro.studentweb.serviceimpl.ExamModuleGroupServicewsEndpoint;

@ManagedBean
@ViewScoped
public class ExamModuleGroupeSearchServiceBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(ExamModuleGroupeSearchServiceBean.class);


	private ExamModuleGroupServicewsEndpoint examModuleGroupServicewsEndpoint;
	private ExamModuleGroupServicews examModuleGroupServicews = new ExamModuleGroupServicews();

	private ExamModuleGroupDto examModuleGroupDto = new ExamModuleGroupDto();
	private ExamModuleGroupDto examModuleGroupDtos = new ExamModuleGroupDto();
	
	private List<ExamModuleGroupDto> listexamModuleGroup = new ArrayList<ExamModuleGroupDto>();
	
	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;
	
	

	



	public boolean isAction() {
		return action;
	}






	public void setAction(boolean action) {
		this.action = action;
	}






	public ExamModuleGroupDto getExamModuleGroupDtos() {
		return examModuleGroupDtos;
	}






	public void setExamModuleGroupDtos(ExamModuleGroupDto examModuleGroupDtos) {
		this.examModuleGroupDtos = examModuleGroupDtos;
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






	public ExamModuleGroupDto getExamModuleGroupDto() {
		return examModuleGroupDto;
	}






	public void setExamModuleGroupDto(ExamModuleGroupDto examModuleGroupDto) {
		this.examModuleGroupDto = examModuleGroupDto;
	}







	public List<ExamModuleGroupDto> getListexamModuleGroup() {
		return listexamModuleGroup;
	}






	public void setListexamModuleGroup(List<ExamModuleGroupDto> listexamModuleGroup) {
		this.listexamModuleGroup = listexamModuleGroup;
	}


	public String initDualList(String baction) {
		logger.debug("DEBUT initDualList +++++++++++++");

		if (baction.equals("1")) {

			examModuleGroupDto = examModuleGroupDtos;
			action2 = true;
			action3 = false;

			initUpdate();
			return null;
		} else {
			examModuleGroupDto = new ExamModuleGroupDto();
			action2 = true;
			action3 = false;
			

			initCreate();
			
			return null;
		}
		

	}
	
	public void initUpdate() {
		action = false;
		examModuleGroupServicewsEndpoint = examModuleGroupServicews.getExamModuleGroupServicewsImplPort();
		
		

	}
	
	public void initCreate() {
		action = true;
		examModuleGroupServicewsEndpoint = examModuleGroupServicews.getExamModuleGroupServicewsImplPort();

	}


	@PostConstruct
	public void init() {
		logger.setLevel(Level.DEBUG);
		try {

			logger.debug("begin init");

			examModuleGroupServicewsEndpoint = examModuleGroupServicews
					.getExamModuleGroupServicewsImplPort();


			listexamModuleGroup = examModuleGroupServicewsEndpoint
					.searchExamModuleGroupServicews(examModuleGroupDtos);

			logger.debug("end init");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addexammodulegroupe() {

		examModuleGroupServicewsEndpoint = examModuleGroupServicews
				.getExamModuleGroupServicewsImplPort();
		ExamModuleGroupDto createexammodulegroupe = new ExamModuleGroupDto();

		createexammodulegroupe.setTitle(examModuleGroupDto.getTitle());
		createexammodulegroupe.setAverageMark(null);
		createexammodulegroupe.setMaxMark(null);
		createexammodulegroupe.setMinimumMark(null);

		createexammodulegroupe = examModuleGroupServicewsEndpoint
				.createExamModuleGroupServicews(createexammodulegroupe);

	}
	
	public String updatexammodulegroupe() {
		
		ExamModuleGroupDto upfdateexammodulegroupe = new ExamModuleGroupDto();
		
		FacesMessage msg = null;
		try {
			
			upfdateexammodulegroupe.setTitle(examModuleGroupDto.getTitle());
			upfdateexammodulegroupe.setAverageMark(null);
			upfdateexammodulegroupe.setMaxMark(null);
			upfdateexammodulegroupe.setMinimumMark(null);
			
			examModuleGroupServicewsEndpoint = examModuleGroupServicews
					.getExamModuleGroupServicewsImplPort();
			upfdateexammodulegroupe.setIdExamModuleGroup(examModuleGroupDto.getIdExamModuleGroup());
			
			upfdateexammodulegroupe = examModuleGroupServicewsEndpoint.updateExamModuleGroupServicews(upfdateexammodulegroupe);
		
			init();
		} catch (Exception ex) {
			
			return null;
		}
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				rb.getString("label_succesful"),
				rb.getString("label_succesful"));
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, msg);
		return null;

	}

}

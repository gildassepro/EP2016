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
import org.apache.log4j.Logger;
import org.sepro.parameterweb.serviceapi.LanguageDto;
import org.sepro.parameterweb.serviceimpl.LanguageServicews;
import org.sepro.parameterweb.serviceimpl.LanguageServicewsEndpoint;

@ManagedBean
@ViewScoped
public class LanguageSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger.getLogger(LanguageSearchServiceBean.class);

	private LanguageServicews languageServicews = new LanguageServicews();
	private LanguageServicewsEndpoint languageServicewsEndpoint;
	private List<LanguageDto> listlanguage = new ArrayList<LanguageDto>();
	private LanguageDto languagesDto = new LanguageDto();
	private LanguageDto languageDto = new LanguageDto();

	private boolean action = false;
	private boolean action2 = false;
	private boolean action3 = true;

	
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

	public List<LanguageDto> getListlanguage() {
		return listlanguage;
	}

	public void setListlanguage(List<LanguageDto> listlanguage) {
		this.listlanguage = listlanguage;
	}

	public LanguageDto getLanguagesDto() {
		return languagesDto;
	}

	public void setLanguagesDto(LanguageDto languagesDto) {
		this.languagesDto = languagesDto;
	}

	public LanguageDto getLanguageDto() {
		return languageDto;
	}

	public void setLanguageDto(LanguageDto languageDto) {
		this.languageDto = languageDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			languageDto = languagesDto;
			action2 = true;
			action3= false;
			initUpdate();
		} else {
			languageDto = new LanguageDto();
			action2 = true;
			action3= false;
			initCreate();
		}
	}

	public void initUpdate() {
		try {
			action = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initCreate() {
		try {
			action = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createLanguage() {
		logger.debug("DEBUT createLanguage +++++++++++++");
		LanguageDto createLanguage = new LanguageDto();
		createLanguage.setLanguageCode(languageDto.getLanguageCode());
		createLanguage.setLanguageName(languageDto.getLanguageName());
		languageServicewsEndpoint = languageServicews
				.getLanguageServicewsImplPort();
		createLanguage = languageServicewsEndpoint
				.createLanguageServicews(createLanguage);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_language")));
	}

	public String updateLanguage() {
		LanguageDto languagemodif = new LanguageDto();
		try {
			languagemodif.setLanguageCode(languageDto.getLanguageCode());
			languagemodif.setLanguageName(languageDto.getLanguageName());
			languageServicewsEndpoint = languageServicews
					.getLanguageServicewsImplPort();
			languagemodif.setIdLanguage(languageDto.getIdLanguage());
			languagemodif = languageServicewsEndpoint
					.updateLanguageServicews(languagemodif);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_language")));
		return null;
	}

	public String supprimerLanguage() {
		try {
			languageServicewsEndpoint.deleteLanguageServicews(languagesDto);
			init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_language")));
			return null;

		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_language")));
		return null;
	}

	@PostConstruct
	public void init() {
		try {
			logger.debug("begin init LanguageSearchServiceBean");
			languageServicewsEndpoint = languageServicews
					.getLanguageServicewsImplPort();
			listlanguage = languageServicewsEndpoint.getAllLanguageServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

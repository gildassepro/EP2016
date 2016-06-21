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
import org.sepro.parameterweb.serviceapi.PhoneFormatDto;
import org.sepro.parameterweb.serviceimpl.PhoneFormatServicews;
import org.sepro.parameterweb.serviceimpl.PhoneFormatServicewsEndpoint;

@ManagedBean
@ViewScoped
public class PhoneFormatSearchServiceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale = FacesContext.getCurrentInstance()
			.getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle(
			"sepro.education.language.messages", locale);
	private Logger logger = Logger
			.getLogger(PhoneFormatSearchServiceBean.class);

	private PhoneFormatServicews phoneformatServicews = new PhoneFormatServicews();
	private PhoneFormatServicewsEndpoint phoneformatServicewsEndpoint;
	private List<PhoneFormatDto> listphoneformat = new ArrayList<PhoneFormatDto>();

	private PhoneFormatDto phoneformatDto = new PhoneFormatDto();
	private PhoneFormatDto phoneformaDto = new PhoneFormatDto();

	private boolean action = false;

	public List<PhoneFormatDto> getListphoneformat() {
		return listphoneformat;
	}

	public void setListphoneformat(List<PhoneFormatDto> listphoneformat) {
		this.listphoneformat = listphoneformat;
	}

	public PhoneFormatDto getPhoneformatDto() {
		return phoneformatDto;
	}

	public void setPhoneformatDto(PhoneFormatDto phoneformatDto) {
		this.phoneformatDto = phoneformatDto;
	}

	public PhoneFormatDto getPhoneformaDto() {
		return phoneformaDto;
	}

	public void setPhoneformaDto(PhoneFormatDto phoneformaDto) {
		this.phoneformaDto = phoneformaDto;
	}

	public boolean isAction() {
		return action;
	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void initDualList(String baction) {
		if (baction.equals("1")) {
			phoneformatDto = phoneformaDto;
			initUpdate();
		} else {
			phoneformatDto = new PhoneFormatDto();
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

	public void createPhone() {
		PhoneFormatDto phonefmt = new PhoneFormatDto();
		phonefmt.setDescription(phoneformatDto.getDescription());
		phonefmt.setIndicatif(phoneformatDto.getIndicatif());
		phonefmt.setNbrOfDigitBloc1(phoneformatDto.getNbrOfDigitBloc1());
		phonefmt.setNbrOfDigitBloc2(phoneformatDto.getNbrOfDigitBloc2());
		phonefmt.setNbrOfDigitBloc3(phoneformatDto.getNbrOfDigitBloc3());
		phonefmt.setNbrOfDigitBloc4(phoneformatDto.getNbrOfDigitBloc4());
		phonefmt.setNbrOfDigitBloc5(phoneformatDto.getNbrOfDigitBloc5());
		phonefmt.setNbrOfDigitBloc6(phoneformatDto.getNbrOfDigitBloc6());
		phonefmt.setNbrOfDigitBloc7(phoneformatDto.getNbrOfDigitBloc7());
		phonefmt.setNbrOfDigitBloc8(phoneformatDto.getNbrOfDigitBloc8());
		phonefmt.setNbrOfDigitBloc9(phoneformatDto.getNbrOfDigitBloc9());
		phonefmt.setNbrOfDigitBloc10(phoneformatDto.getNbrOfDigitBloc10());
		phoneformatServicewsEndpoint = phoneformatServicews
				.getPhoneFormatServicewsImplPort();
		phonefmt = phoneformatServicewsEndpoint
				.createPhoneFormatServicews(phonefmt);
		init();
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_create_phone")));
	}

	public String updatePhone() {
		PhoneFormatDto phonefmt = new PhoneFormatDto();
		try {
			phonefmt.setDescription(phoneformatDto.getDescription());
			phonefmt.setIndicatif(phoneformatDto.getIndicatif());
			phonefmt.setNbrOfDigitBloc1(phoneformatDto.getNbrOfDigitBloc1());
			phonefmt.setNbrOfDigitBloc2(phoneformatDto.getNbrOfDigitBloc2());
			phonefmt.setNbrOfDigitBloc3(phoneformatDto.getNbrOfDigitBloc3());
			phonefmt.setNbrOfDigitBloc4(phoneformatDto.getNbrOfDigitBloc4());
			phonefmt.setNbrOfDigitBloc5(phoneformatDto.getNbrOfDigitBloc5());
			phonefmt.setNbrOfDigitBloc6(phoneformatDto.getNbrOfDigitBloc6());
			phonefmt.setNbrOfDigitBloc7(phoneformatDto.getNbrOfDigitBloc7());
			phonefmt.setNbrOfDigitBloc8(phoneformatDto.getNbrOfDigitBloc8());
			phonefmt.setNbrOfDigitBloc9(phoneformatDto.getNbrOfDigitBloc9());
			phonefmt.setNbrOfDigitBloc10(phoneformatDto.getNbrOfDigitBloc10());
			phoneformatServicewsEndpoint = phoneformatServicews
					.getPhoneFormatServicewsImplPort();
			phonefmt.setIdPhoneFormat(phoneformatDto.getIdPhoneFormat());
			phonefmt = phoneformatServicewsEndpoint
					.updatePhoneFormatServicews(phonefmt);
			init();
		} catch (Exception ex) {

			return null;
		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_update_phone")));
		return null;

	}

	public String supprimerPhone() {
		try {
			phoneformatServicewsEndpoint
					.deletePhoneFormatServicews(phoneformaDto);
			logger.debug("FIN Suppression Phone +++++++++++++");
			init();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(
					"mesagesalert2",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
							.getString("label_warn_delete_phone")));
			return null;

		}
		FacesContext.getCurrentInstance().addMessage(
				"mesagesalert2",
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", rb
						.getString("label_msg_delete_phone")));
		return null;
	}

	@PostConstruct
	public void init() {
		try {
			phoneformatServicewsEndpoint = phoneformatServicews
					.getPhoneFormatServicewsImplPort();
			listphoneformat = phoneformatServicewsEndpoint
					.getAllPhoneFormatServicews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

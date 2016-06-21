package org.sepro.authentificationweb.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.Serializable;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.model.SortOrder;
import org.primefaces.model.LazyDataModel;
import org.sepro.authentificationweb.serviceapi.UserDto;
import org.sepro.authentificationweb.serviceimpl.UserServicews;
import org.sepro.authentificationweb.serviceimpl.UserServicewsEndpoint;

import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class UserListServiceBean  implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<UserDto> userList = new ArrayList<UserDto>();
	private LazyDataModel<UserDto> lazyAccSummaryDataModel;
	private Locale locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
	ResourceBundle rb = ResourceBundle.getBundle("sepro.education.language.messages",locale); 
	private Logger logger = Logger.getLogger(UserServiceBean.class);
	private UserServicews userServicews =  new UserServicews();
	private UserServicewsEndpoint userServicewsEndpoint ;

	@PostConstruct
	public void init() {
		lazyAccSummaryDataModel = new LazyDataModel<UserDto>() {
			@Override
			public List<UserDto> load(int first, int pageSize,
					String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {
				logger.setLevel(Level.DEBUG);
				logger.debug("begin load UserListServiceBean");
				userServicewsEndpoint = userServicews.getUserServicewsImplPort();
				logger.debug("end service load UserListServiceBean");
				String sortOrderValue = null;
				if (sortField == null) {
					sortField = "investorName";
				}
				if (sortOrder.ASCENDING.equals("A")) {
					sortOrderValue = "ASC";
				} else if (sortOrder.DESCENDING.equals("D")) {
					sortOrderValue = "DSC";
				} else {
					sortOrderValue = "default";
				}
				logger.debug("begin suserServicewsEndpoint getall first "+first+" pageSize "+pageSize);
				userList = userServicewsEndpoint.getPageAllUserServicews(first+1, pageSize);
				logger.debug("end suserServicewsEndpoint getall size = "+userList.size());
				this.setRowCount(2);
				return userList;
			}
		};
	}
	public LazyDataModel<UserDto> getLazyAccSummaryDataModel() {
		return lazyAccSummaryDataModel;
	}

	public void setLazyAccSummaryDataModel(
			LazyDataModel<UserDto> lazyAccSummaryDataModel) {
		this.lazyAccSummaryDataModel = lazyAccSummaryDataModel;
	}
}

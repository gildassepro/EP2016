package sepro.education.web.util;

import java.io.Serializable;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;


import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;
import org.sepro.parameterweb.serviceapi.AcademicModuleDto;
import org.sepro.planningweb.bean.PlanningSearchServiceBean;


public class DefaultScheduleEventExtends extends DefaultScheduleEvent  {
	
	public Long idStudentEvent;
	public AcademicModuleDto mod;
	public String typeStudentEvent;
	public XMLGregorianCalendar startDateEvent;
	public XMLGregorianCalendar endDateEvent;
	

	

	


	




	public AcademicModuleDto getMod() {
		return mod;
	}




	public void setMod(AcademicModuleDto mod) {
		this.mod = mod;
	}




	public XMLGregorianCalendar getStartDateEvent() {
		return startDateEvent;
	}




	public void setStartDateEvent(XMLGregorianCalendar startDateEvent) {
		this.startDateEvent = startDateEvent;
	}




	public XMLGregorianCalendar getEndDateEvent() {
		return endDateEvent;
	}




	public void setEndDateEvent(XMLGregorianCalendar endDateEvent) {
		this.endDateEvent = endDateEvent;
	}




	public String getTypeStudentEvent() {
		return typeStudentEvent;
	}




	public void setTypeStudentEvent(String typeStudentEvent) {
		this.typeStudentEvent = typeStudentEvent;
	}




	public Long getIdStudentEvent() {
		return idStudentEvent;
	}




	public void setIdStudentEvent(Long idStudentEvent) {
		this.idStudentEvent = idStudentEvent;
	}




	public DefaultScheduleEventExtends() {
		super();
		
	}
	

    public DefaultScheduleEventExtends(String string, Date date, Date date2) {
		super( string,  date,  date2);
		
		
	}


    public DefaultScheduleEventExtends(String string, Date date, Date date2,
			Boolean allDayInd) {
		super( string,  date,  date2,
				 allDayInd);
	}

	
	
	

}

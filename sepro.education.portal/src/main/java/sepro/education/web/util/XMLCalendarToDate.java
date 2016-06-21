package sepro.education.web.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.Map.Entry;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@FacesConverter(value = "dateConverter")
public class XMLCalendarToDate implements Converter {
	private Logger logger = Logger.getLogger(XMLCalendarToDate.class);
	
	@Override
    public String getAsString(FacesContext context, UIComponent component, Object entity) {
		SimpleDateFormat print = new SimpleDateFormat("MM/DD/YYYY", FacesContext.getCurrentInstance().getExternalContext().getRequestLocale());
		XMLGregorianCalendar  dateReceive = (XMLGregorianCalendar ) entity;
		if(dateReceive != null){
			logger.setLevel(Level.DEBUG);
			logger.debug("XMLCalendarToDate format = "+print.format(dateReceive.toGregorianCalendar().getTime()));
			return print.format(dateReceive.toGregorianCalendar().getTime());
		}else{
			logger.setLevel(Level.DEBUG);
			logger.debug("XMLCalendarToDate null");
			return null;
		}
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String uuid) {
    	SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY",FacesContext.getCurrentInstance().getExternalContext().getRequestLocale());
    	try {
        	Date date = formatter.parse(uuid);
        	if(date !=  null){
        		logger.setLevel(Level.DEBUG);
    			logger.debug("XMLCalendarToDate uuid = "+uuid);
        		return toXMLGregorianCalendar(date);
        	}else{
        		logger.setLevel(Level.DEBUG);
    			logger.debug("null ");
        		return null;
        	}
    	}catch (Exception e){
    		logger.setLevel(Level.DEBUG);
			logger.debug("exception ");
    		e.printStackTrace();
    		return null;
    	}

    }
    
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            ex.printStackTrace();
        }
        return xmlCalendar;
    }
  
    /*
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }
}

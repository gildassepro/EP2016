package sepro.education.web.util;

import java.util.Date;

public class DateConvert {

	
 public Date dateTime(Date date, Date time){
		
		
		return new Date(date.getYear(), date.getMonth(), date.getDay(), time.getHours(), time.getMinutes());
	}


}

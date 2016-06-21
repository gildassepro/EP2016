package sepro.education.web.util;

public class FormatNumberPhoneUtil {
	
	public  static String getFormat(Integer val){
		if (val==1){
			return ("(9)");
		}else if(val==2){
			return ("(99)");
		}else if(val==3){
			return ("(999)");
		}else if(val==4){
			return ("(9999)");
		}else if(val==5){
			return ("(99999)");
		}else if(val==6){
			return ("(999999)");
		}else{
			return null;
		}
	}
}

package JavaFeatures;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeStampWithDiffernetTimeZone {
	
	public static void main(String []args) {
		
		SimpleDateFormat getDataFormat=new SimpleDateFormat("mmmm dd, yyyy hh:mm:ss ");
		
		getDataFormat.setTimeZone(TimeZone.getTimeZone("EDT"));
		
		
		//current time zone in EDT
		System.out.println(getDataFormat.format(new Date()));
	}

}

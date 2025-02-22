import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Date_Class {
	
	public static void main(String[] args) {
		
		
		// 1628182800
		long time_in_sec = System.currentTimeMillis()/1000;
		
		long diff=1628182800 - time_in_sec;
		
		long s=diff % 60;
		
		long m=(diff / 60) % 60;
		
		long h=(diff/(60 * 60)) % 24;
		
		System.out.printf("%dh:%dm:%ds",h,m,s);
	}

}

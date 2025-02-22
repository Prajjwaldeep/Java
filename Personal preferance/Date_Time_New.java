import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Date_Time_New {
	
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		
		LocalDate zone_date=LocalDate.now(ZoneId.of("GMT"));
		
		LocalTime zone_time=LocalTime.now(ZoneId.of("GMT"));
		
		System.out.println("Zone Date: "+zone_date);
		
		System.out.println("Zone Time: "+zone_time);
		
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println("Date & Time: "+dt);
		
		System.out.println("Date: "+date);
		
		LocalDate d=LocalDate.of(2020, 7, 13);
		
		System.out.println("Leap Year: "+d.isLeapYear());
		
		LocalTime time=LocalTime.now();
		
		System.out.println("Time: "+time.withNano(0));//without Nanosecond
		
		DayOfWeek week=date.getDayOfWeek();
		
		int day_of_month=date.getDayOfMonth();
		
		int day_of_year=date.getDayOfYear();
		
		Month month=date.getMonth();
		
		int month1=date.getMonthValue();
		
		int year=date.getYear();
		
		int hour=time.getHour();
		
		int mins=time.getMinute();
		
		int secs=time.getSecond();
		
		int nanos=time.getNano();
		
		
		LocalDate plus_Days=date.plusDays(10);
		
		LocalDate plus_Weeks=date.plusWeeks(2);//2 weeks=14 days
		
		System.out.println("Hour: "+hour);
		
		System.out.println("Minutes: "+mins);
		
		System.out.println("Seconds: "+secs);
		
		System.out.println("Nanosecond: "+nanos);
		
		System.out.println("Day Of Week: "+week);
		
		System.out.println("Day Of Month: "+day_of_month);
		
		System.out.println("Day Of Year: "+day_of_year);
		
		System.out.println("Month : "+month);
		
		System.out.println("Month1: "+month);
		
		System.out.println("Year: "+year);
		
		System.out.println("Adding 10 to today's Date: "+plus_Days);
		
		System.out.println("Adding 2 to today's Week number: "+plus_Weeks);
	}

}

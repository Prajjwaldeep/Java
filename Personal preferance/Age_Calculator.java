import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Age_Calculator {

	public static void main(String[] args) throws ParseException {
		
		
		  System.out.println("-----------------------------------------------------------------------");
		
		  LocalDate bday = LocalDate.of(2000, 2, 5);
		  LocalDate now = LocalDate.now();
		  
		  Period diff = Period.between(bday, now);
		  
		  System.out.println(diff.getYears() + " years\n" + diff.getMonths() + " months\n" + diff.getDays() + " days");
		  
		  
		  System.out.println("-----------------------------------------------------------------------");
		  
		  
		  
		  String s = "2000/02/05";
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		  Date d1 = (Date) sdf.parse(s);
		  Calendar c = Calendar.getInstance();
		  c.setTime(d1);
		  int year = c.get(Calendar.YEAR);
		  int month = c.get(Calendar.MONTH) + 1;
		  int date = c.get(Calendar.DATE);
		  LocalDate l1 = LocalDate.of(year, month, date);
		  LocalDate now1 = LocalDate.now();
		  Period diff1 = Period.between(l1, now1);
		  System.out.println("age:" + diff1.getYears() + "years");
		  System.out.println("age:" + diff1.getMonths() + "years");
		  System.out.println("age:" + diff1.getDays() + "years");
		  
		  
		  System.out.println("-----------------------------------------------------------------------");
		  
		  
		  String arr[]=new String[3];
		  arr=s.split("/");
		  
		  int y=Integer.parseInt(arr[0]);
		  int m=Integer.parseInt(arr[1]);
		  int d=Integer.parseInt(arr[2]);
		  
		  //System.out.println("Years: "+y+"\nMonths: "+m+"\nDays: "+d);
		  
		  LocalDate l2 = LocalDate.of(y, m, d);
		  LocalDate now2 = LocalDate.now();
		  Period diff2 = Period.between(l2, now2);
		  System.out.println("age:" + diff2.getYears() + "years");
		  System.out.println("age:" + diff2.getMonths() + "years");
		  System.out.println("age:" + diff2.getDays() + "years");

		  
		  System.out.println("-----------------------------------------------------------------------");
		
	}
	
}

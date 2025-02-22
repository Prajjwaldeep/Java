/*
 * 
 * W R O N G
 * C O D E
 * 
 * 
 */


import java.time.LocalDate;
import java.util.*;
public class Date_Time {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int days=0,month=0,year=0;
		int c_days,c_month,c_year;
		int b_days,b_month,b_year;
		
		//Current Date
		LocalDate cday=LocalDate.now();//2021,7,12
		
		//Birthday Date
		LocalDate bday=LocalDate.of(2000, 4, 23);
		
		c_days=cday.getDayOfMonth();
		c_month=cday.getMonthValue();
		c_year=cday.getYear();
		
		b_days=bday.getDayOfMonth();
		b_month=bday.getMonthValue();
		b_year=bday.getYear();
		
		
		if(c_month==1 || c_month==3 || c_month==5 || c_month==7 || c_month==8 || c_month==10 || c_month==12)
		{
			c_month=31;
		}
		else if(c_month==4 || c_month==6 || c_month==9 || c_month==11)
		{
			c_month=30;
		}
		else
		{
			if(check(c_year))
			{
				c_month=29;
			}
			else
			{
				c_month=28;
			}
		}
		
		if(b_month==1 || b_month==3 || b_month==5 || b_month==7 || b_month==8 || b_month==10 || b_month==12)
		{
			b_month=31;
		}
		else if(b_month==4 || b_month==6 || b_month==9 || b_month==11)
		{
			b_month=30;
		}
		else
		{
			if(check(b_year))
			{
				b_month=29;
			}
			else
			{
				b_month=28;
			}
		}
		
		
		if((cday.getDayOfMonth() < bday.getDayOfMonth()))
		{
			if(cday.getMonthValue() > bday.getMonthValue())
			{
				days=cday.getDayOfMonth() + c_month - bday.getDayOfMonth() ;
				
			}
			else
			{
				days=cday.getDayOfMonth() +  c_month - bday.getDayOfMonth();
			}
			
		}
		else
		{
			days=cday.getDayOfMonth() - bday.getDayOfMonth();
		}
		
		if(cday.getMonthValue() < bday.getMonthValue())
		{
			year=cday.getYear() - bday.getYear()-1;
			if(cday.getDayOfMonth() > bday.getDayOfMonth())
			{
				month=cday.getMonthValue() + 12 - bday.getMonthValue();
			}
			else
			{
				month=cday.getMonthValue() + 12 - bday.getMonthValue() -1;
			}
		}
		else
		{
			year=cday.getYear() - bday.getYear();
			month=cday.getMonthValue() - bday.getMonthValue();
		}
		
		
		System.out.println(year+" Years");
		System.out.println(month+" Months");
		System.out.println(days+" Days");
		
		sc.close();
		
	}
	public static boolean check(int year)
	{
		boolean res=false;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					res=true;
				}
				else
				{
					res=false;
				}
			}
			else
			{
				res=true;
			}
		}
		return res;
	}
}
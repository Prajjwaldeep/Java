import java.util.*;
public class Date_2019
{
    static int daysInMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    static String monthName[]={"","JANURARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    public static boolean leap(int x)
    {
        if (x%4==0)
        return true;
        else
        return false;
    }
    public static int date_calculate(int day, int year)
    {
        if (leap(year)==true)
        {
            daysInMonth[2]++;
        }
        int month=1;
        while (day>daysInMonth[month])
        {
            day=day-daysInMonth[month];
            month++;
        }
        if (leap(year)==true)
        {
            daysInMonth[2]--;
        }
        return day;
    }
    public static int month_calculate(int day, int year)
    {
        if (leap(year)==true)
        {
            daysInMonth[2]++;
        }
        int month=1;
        while (day>daysInMonth[month])
        {
            day=day-daysInMonth[month];
            month++;
        }
        if (leap(year)==true)
        {
            daysInMonth[2]--;
        }
        return month;
    }
    public static String suffix(int q)
    {
        if (q==1 || q==21 || q==31)
        {
            return "ST";
        }
        else if (q==2 || q==22)
        {
            return "ND";
        }
        else if (q==3)
        {
            return "RD";
        }
        else
        {
            return "TH";
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N,y,after_n_days,date,finalyear,month;
        String s;
        System.out.print("DAY NUMBER : ");
        N=in.nextInt();
        System.out.print("YEAR : ");
        y=in.nextInt();
        System.out.print("DAY AFTER (N DAYS) : ");
        after_n_days=in.nextInt();
        if (N<1 || N>365)
        {
            System.out.println("DAY NUMBER OUT OF RANGE.");
        }
        else if (after_n_days<1 || after_n_days>100)
        {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE.");
        }
        else
        {
            date=date_calculate(N,y);
            s=suffix(date);
            month=month_calculate(N,y);
            int temp=after_n_days+N;
            if (temp>365)
            {
                temp=temp-365;
                finalyear=y+1;
            }
            else
            {
                finalyear=y;
            }
            int total_after_n_days=temp;
            int after_n_days_date=date_calculate(total_after_n_days,finalyear);
            int after_n_days_month=month_calculate(total_after_n_days,finalyear);
            String suffix_after_n=suffix(after_n_days_date);
            String str="";
            str=str+date+" "+s+" "+monthName[month]+", "+y;
            System.out.println("DATE : "+str);
            String str1="";
            str1=str1+after_n_days_date+" "+monthName[after_n_days_month]+", "+finalyear;
            System.out.println("DATE AFTER("+after_n_days+" DAYS) : "+str1);
        }
    }
}
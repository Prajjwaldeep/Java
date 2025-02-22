import java.util.*;
public class NextDate_01
{
    static int daysinmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    static String monthname[]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    public static boolean Leap(int year)
    {
        if (year%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int month_extract(int dayNumber, int year)
    {
        boolean ly;
        int month=1;
        ly=Leap(year);
        if (ly==true)
        {
            daysinmonth[2]++;
        }
        while (dayNumber>daysinmonth[month])
        {
            dayNumber=dayNumber-daysinmonth[month];
            month++;
        }
        if (ly==true)
        {
            daysinmonth[2]--;
        }
        return month;
    }
    public static int day_extract(int dayNumber, int year)
    {
        boolean ly;
        int month=1;
        ly=Leap(year);
        if (ly==true)
        {
            daysinmonth[2]++;
        }
        while (dayNumber>daysinmonth[month])
        {
            dayNumber=dayNumber-daysinmonth[month];
            month++;
        }
        if (ly==true)
        {
            daysinmonth[2]--;
        }
        return dayNumber;
    }
    public static String getsuffix(int date)
    {
        String suffix;
        if (date==1 || date==21 || date==31)
        suffix="ST";
        else if (date==2 || date==22)
        suffix="ND";
        else if (date==3)
        suffix="RD";
        suffix="TH";
        return suffix;
    }
    public static void printpresentdate(int date, int month, int year)
    {
        String suffix=getsuffix(date);
        String month_display=monthname[month];
        System.out.println("DATE : "+date+" "+suffix+" "+" "+month_display+", "+year);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int daynumber,year,n,date,month,merge,finalyear,finalday,finalmonth,m;
        String y="";
        System.out.print("DAY NUMBER : ");
        daynumber=in.nextInt();
        System.out.print("YEAR : ");
        year=in.nextInt();
        y=y+year;
        System.out.print("DATE AFTER (N DAYS) : ");
        n=in.nextInt();
        if (y.length()!=4)
        {
            System.out.println("YEAR IS NOT 4 DIGITS");
        }
        else if (daynumber<1 || daynumber>366)
        {
            System.out.println("DAY NUMBER OUT OF RANGE");
        }
        else if (n<1 || n>100)
        {
            System.out.println("DAYS AFTER (N DAYS) OUT OF RANGE.");
        }
        else
        {
            date=day_extract(daynumber,year);
            month=month_extract(daynumber,year);
            printpresentdate(date,month,year);
            merge=daynumber+n;
            if(merge>366 && Leap(year)==true)
            {
                finalyear=year+1;
                m=merge-366;
            }
            if(merge>365 && Leap(year)==false)
            {
                finalyear=year+1;
                m=merge-365;
            }
            else
            {
                finalyear=year;
                m=merge;
            }
            finalday=day_extract(m,year);
            finalmonth=month_extract(m,year);
            String suffix1=getsuffix(finalday);
            String month1=monthname[finalmonth];
            System.out.println("DATE AFTER "+n+" DAYS : "+finalday+" "+suffix1+" "+month1+", "+finalyear);
        }
    }
}
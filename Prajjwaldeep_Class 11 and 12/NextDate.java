/* A program to accept the day number from user to display the corresponding date.
 * Also, accept 'N; (1<=N<-100) from the user to compute also display the future date corresponding to 'N' days after the generated date
 * Dispay error message if the value of day number, year and N are not within limits or according to the condition
*/
import java.util.Scanner;
public class NextDate
{
    static int daysInMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31}; // An array that sets the number of days in month
    static String monthNames[]={"","January","February","March","April","May","June","July","August","September","October","November","December"}; //An array to store month names
    static boolean isLeapYear(int year) // A function to check if the input is a leap year or not
    {
        if (year%400==0) // If divisible by 400, return true
        return true;
        if (year%100==0) // If divisible by 100, return false
        return false;
        if (year%4==0) // If divisible by 4, return true
        return true;
        return false; // Finally return false
    }
    static int getMonthNumber(int dayNumber, int year) // A function to get month number, given number of dates and year
    {
        // Boolean to check if it is a leap year
        boolean isLeap=isLeapYear(year);
        if (isLeap) // Increase the number of days temporarily, if this is a leap year
        daysInMonth[2]++;
        // Start with month Janurary
        int month=1;
        // As long as the day number is greater than the number of days in current month, it increments
        while (dayNumber>daysInMonth[month])
        {
            // Reduce this month number of days from day number
            dayNumber=dayNumber-daysInMonth[month];
            month++;
        }
        if (isLeap)
        daysInMonth[2]--;
        // Set the number of days in February back to 28
        return month;
    }
    // Get the days for the given number
    static int getDay(int dayNumber, int year)
    {
        boolean isLeap=isLeapYear(year);
        if (isLeap)
        daysInMonth[2]++;
        int month=1;
        while (dayNumber>daysInMonth[month])
        {
            dayNumber=dayNumber-daysInMonth[month];
            month++;
        }
        if (isLeap)
        daysInMonth[2]--;
        return dayNumber;
    }
    /*A function to get suffix 
     * if day is 1 or day is 21 or day is 31 , print "ST"
     * if day is 2 or day is 22 , print "ND"
     * if day is 3 or day is 23 , print "RD"
     * for other days, print "TH"
     */
    static String getSuffix(int day)
    {
        if (day==1 || day==21 || day==31)
        return "ST";
        if (day==2 || day==22)
        return "ND";
        if (day==3 || day==23)
        return "RD";
        return "TH";
    }
    // A function to print the date
    static void printDate(int day, int month, int year)
    {
        System.out.print(day); // Print day number
        System.out.print(getSuffix(day)+" "); // Print suffix and space
        System.out.print(monthNames[month]+", "); // Print the month
        System.out.println(year); // Print the year
    }
    static int getNumDays(int year) // Methord to get number of days in previous year
    {
        if (isLeapYear(year))
        return 366;
        else
        return 365;
    }
    public static void main(String args[])
    {
        // Set scanner class to read input
        Scanner in=new Scanner(System.in);
        System.out.print("DAY NUMBER         : ");
        int dayNumber=in.nextInt(); // Read the day number
        System.out.print("YEAR               : ");
        int year=in.nextInt(); // Read the year
        System.out.print("DAY AFTER(N DAYS)  : ");
        int n=in.nextInt(); // Read the date after
        // Validate number of days
        if(dayNumber<1 || dayNumber>366)
        {
            System.out.println("DAY NUMBER OUT OF RANGE"); // Show message
            // Terminate
            return;
        }
        if (year<1000 || year>9999)
        {
            System.out.println("YEAR IS NOT 4 DIGITS"); // Show message
            // Terminate
            return;
        }
        if (n<1 || n>100)
        {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE"); // Show message
            // Terminate
            return;
        }
        // Get the current month and year
        int currentMonth=getMonthNumber(dayNumber,year);
        int currentDay=getDay(dayNumber,year);
        System.out.print("DATE               : ");
         // Print the current date first
        printDate(currentDay,currentMonth,year);
        // Get the number of days by adding the n
        int finalDayNumber=dayNumber+n;
        int finalYear=-1;
        // If this final day number within the number of days in the current year, the year is same
        if (finalDayNumber<= getNumDays(year))
        finalYear=year;
        else
        {
            finalYear=year+1;
            finalDayNumber=finalDayNumber-getNumDays(year);
        }
        int finalMonth=getMonthNumber(finalDayNumber,finalYear);
        int finalDay=getDay(finalDayNumber,finalYear);
        System.out.print("DATE AFTER "+n+" DAYS : ");
        printDate(finalDay,finalMonth,finalYear); // Print final date, final month, final year
        in.close();
    }
}
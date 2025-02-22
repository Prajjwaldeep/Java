/**
 * A sample program to display the date of a given day number
 * and display a future date after a given day number
 */
import java.util.*;
class generate_date
{
    public static void main(String args[])//declaration of main mehod
    {
        Scanner in=new Scanner(System.in);//declaration of scanner class
        int yr,day,i,n=0,m=0,d=0,r,yy,dm,mn,q,c,df;
        String temp;
        int dom[]={0,31,28,31,30,31,30,31,31,30,31,30,31};//integer array to store the number of days in all twelve months
        String mon[]={" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};//String array to store the names of all months
        System.out.println("Enter Day Number Between 1 And 366");
        day=in.nextInt();//accepting a day number 
        if(day>=1&&day<=366)//checking for validity of date
        {
            System.out.println("Valid day num");
        }
        System.out.println("Enter Year");
        yr=in.nextInt();//accepting year
        System.out.println("Enter days after which future date is to be generated");
        df=in.nextInt();//accepting days after which future date is to be genetrrated
        if((yr%4==0)||(yr%400==0))//checking for Leap Year
        dom[2]=29;
        else
        dom[2]=28;
        for(i=1;i<=12;i++)
        {
            d=d+dom[i];
            if(d>day)
            {
                n=i;
                break;
            }
        }
        d=0;
        for(i=1;i<n;i++)
        {
            d=d+dom[i];
        }
        day=day-d;
        r=day%10;
        System.out.println("The Desired Output:");
        if(day==0)
        {
            System.out.println(dom[n-1]+" "+mon[n-1]+" "+yr);
            dm=dom[n-1];
            mn=n-1;
        }
        else
        {
           System.out.println(day+" "+mon[n]+" "+yr);
           dm=day;
           mn=n;
        }
        yy=yr;
        c=0;
        while(c<df)
        {
           c++;
           dm++;
           if(dm>dom[mn])
           {
               dm=1;
               mn++;
           }
           if(mn>12)
           {
               mn=1;
               yy++;
               if((yy%4==0)||(yy%400==0))
               dom[2]=29;
               else
               dom[2]=28;
           }
        }
        System.out.println("The Future date after"+df+"days:");//displaying the future date
        System.out.println(dm+" "+mon[mn]+" "+yy);
    }//end of main method
}//end of class


    
        
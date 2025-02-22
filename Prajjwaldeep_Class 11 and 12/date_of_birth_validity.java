import java.util.*;
public class date_of_birth_validity
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int d,m,y;
        System.out.println("Enter the date : ");
        d=in.nextInt();
        System.out.println("Enter the month : ");
        m=in.nextInt();
        System.out.println("Enter the year : ");
        y=in.nextInt();
        int month[]={1,2,3,4,5,6,7,8,9,10,11,12};
        if((y<=2019) && (y%4!=0))
        {
            if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
            {
                if (d<=31)
                {
                    System.out.println("Date is valid");
                }
                else
                {
                    System.out.println("Date is invalid");
                }
            }
            else if (m==4 || m==6 || m==9 || m==11)
            {
                if (d<=30)
                {
                    System.out.println("Date is valid");
                }
                else
                {
                    System.out.println("Date is invalid");
                }
            }
            else
            {
                if (d<=28)
                {
                    System.out.println("Date is valid");
                }
                else
                {
                    System.out.println("Date is invalid");
                }
            }
        }
        else
        {
            System.out.println("Date is not valid");
        }
    }
}
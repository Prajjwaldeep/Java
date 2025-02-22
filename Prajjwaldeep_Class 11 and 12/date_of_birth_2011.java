import java.util.*;
public class date_of_birth_2011
{
    static int daysInMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int d,m,y;
        System.out.println("Enter your date of birth in dd mm yyyy format : ");
        d=in.nextInt();
        m=in.nextInt();
        y=in.nextInt();
        if (d<=0 || d>31 || m>12 || m<=0 || y<1000 || y>9999)
        {
            System.out.println("INVALID DATE");
        }
        else
        {
            System.out.println("VALID DATE");
            if (y%4==0)
            {
                daysInMonth[2]++;
            }
            int a,c=0,c1;
            for (a=1; a<=m; a++)
            {
                c=c+daysInMonth[(a-1)];
            }
            c1=c+d;
            System.out.println("Day Number : "+c1);
        }
    }
}
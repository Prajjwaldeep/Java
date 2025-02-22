import java.util.*;
public class series_2017_switch
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("Enter 1 for series 1 and 2 for series 2 : ");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            int a,x;
            double sum=0.0;
            x=2;
            for (a=1; a<=20; a++)
            {
                if (a%2==0)
                sum=sum-Math.pow(x,a);
                else
                sum=sum+Math.pow(x,a);
            }
            System.out.println("Sum of the series is : "+sum);
            break;
            case 2:
            int c,r;
            for (c=1; c<=5; c++)
            {
                for (r=1; r<=c; r++)
                {
                    System.out.print("1");
                }
                System.out.print(" ");
            }
            break;
            default :
            System.out.println("Wrong Choice");
        }
    }
}
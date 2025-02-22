//1+(1+2)+(1+2+3).....n
import java.util.Scanner;
public class series_2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a,b,sum=0;
        System.out.print("Enter the n term : ");
        n=in.nextInt();
        for (a=1; a<=n; a++)
        {
            for (b=1; b<=a; b++)
            {
                sum=sum+b;
            }
        }
        System.out.println("Value of sum is : "+sum);
    }
}
import java.util.*;
public class fact
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,q,fact=1;
        double sum=0.0;
        System.out.print("Enter the last term : ");
        n=in.nextInt();
        for (i=1; i<=n; i++)
        {
            fact=fact*i;
            sum=sum+((double)i)/fact;
        }
        System.out.println("Sum of the series is : "+sum);
    }
}
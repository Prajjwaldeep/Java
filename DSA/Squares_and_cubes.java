import java.util.*;
public class Squares_and_cubes
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the value of n : ");
        n=in.nextInt();
        for(i=1; i<=n; i++)
        {
            double temp1,temp2;
            temp1=Math.sqrt(i);
            temp2=Math.cbrt(i);
            int t1,t2;
            t1=(int)temp1;
            t2=(int)temp2;
            if(t1*t1==i && t1!=t2)
            {
                sum=sum+t1;
            }
            else if(t2*t2==i)
            {
                sum=sum+t2;
            }
        }
        System.out.println(sum);
    }
}
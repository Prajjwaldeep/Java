// 1/1+(1*2)/(1+2)+(1*2*3)/(1+2+3)+(1*2*3*4)/(1+2+3+4)....n
import java.util.Scanner;
public class series_3
{
   public static void main(String args[])
   {
       Scanner in=new Scanner(System.in);
       int a,b,n;
       double d=0.0,sum=0.0,mul=1.0;
       System.out.print("Enter the n term : ");
       n=in.nextInt();
       for(a=1; a<n; a++)
       {
           for (b=1; b<a; b++)
           {
               sum=sum+b;
               mul=mul*b;
               d=d+(mul/sum);
            }
        }
        System.out.println(d);
    }
}
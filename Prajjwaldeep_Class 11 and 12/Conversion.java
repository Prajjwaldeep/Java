/**
 * A sample program to convert a decimal number to Binary equivalent
 * Decimal number to Octal equivalent
 * Decimal number to Hexadecimal equivalent
 */
import java.util.Scanner;
class Conversion
{
    public static void main(String args[])//declaration of main method
    {
        int n,count=0,a;
        String x="",x1=" ";
        Scanner in=new Scanner(System.in);//declaration of scanner class
        System.out.println("Enter a Decimal number to be converted to other bases..");
        n=in.nextInt();//accepting a decimal number as input
        int n1=n;
        int n2=n;
        /*Converting tha Decimal number to Binary eqivalent*/
        while(n>0)
        {
            a=n%2;
            if(a==1)
            {
                count++;
            }
            x=a+x;
            n=n/2;
        }
        System.out.println("BINARY NO.:"+x);
        System.out.println("NO.OF 1S;"+count);
        /*Converting tha Decimal number to Octal eqivalent*/
        while(n1>0)
        {
            a=n1%8;
            n1=n1/8;
            x1=a+x1;
        }
        System.out.println("The Octal no.:-"+x1);
        /*Converting tha Decimal number to Hexadecimal eqivalent*/
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String x2=" ";
        while(n2!=0)
        {
           rem=n2%16;
           x2=ch[rem]+x2;
           n2=n2/16;
        }
        System.out.println("The Hexadecimal equivalent:-"+x2);
    }//end of main method
}//end of class
            
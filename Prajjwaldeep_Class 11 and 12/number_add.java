import java.util.*;
public class number_add
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int M,N,a,r;
        System.out.println("Enter the values of M and N respectively : ");
        M=in.nextInt();
        N=in.nextInt();
        if (M<100 || M>10000 || N>100)
        {
            System.out.println("Range is out of bound");
        }
        else
        {
            int p=M,t,sum,count;
            do
            {
                t=p++; // copy number and increment it for next number
                sum=0;
                count=0;
               //find the sum of digits of the number
               while(t>0)
               {
                   r=t%10;
                   sum=sum+r; //extract digit and calculate sum
                   t=t/10;
                   count++; //count digits
                }
            }
            while(sum!=N); // keep repeating until the sum is not equal to the number n
            System.out.println("The required number = "+(p-1));
            System.out.println("Total number of digits = "+count);
        }  
    }
}                
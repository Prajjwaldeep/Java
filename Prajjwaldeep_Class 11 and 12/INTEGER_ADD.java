/**
 * The class INTEGER_ADD inputs two 'm' and'n' and prints smallest integer
 * greater than 'm' whose som of digits is equal to 'n'
 */
import java.util.*;
class INTEGER_ADD
{
    int sumDig(long n)//Function to find the sum of digits of a number
    {
        int sum=0;
        int d;
        while(n>0)
        {
            d=(int)(n%10);
            sum=sum+d;
            n=n/10;
        }
        return(sum);
    }
    
    int countDig(long n)//Function to count the number of digits in a number
    {
        String s=Long.toString(n);
        int len=s.length();
        return(len);
    }
    
    public static void main(String args[])
    {
        INTEGER_ADD ob=new INTEGER_ADD();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a value of 'm' from 100 to 10000;");
        int m=in.nextInt();
        System.out.println("Enter a value of 'n' from 1 to 99;");
        int n=in.nextInt();
        if(m<100||m>10000||n<1||n>99)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            long i=(long)m;//Required number can be out of range of 'int
            /*The required number must be greater than'm',so loop will go on as long as that number is not obtained*/
            while(ob.sumDig(i)!=n)
            {
                i=i+1;
            }
            System.out.println("The required number is="+i);
            System.out.println("Total number of digits="+ob.countDig(i));
        }
    }
}

        
        
    
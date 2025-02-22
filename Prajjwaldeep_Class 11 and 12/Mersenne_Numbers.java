//program to check and generate Mersenne Numbers
import java.util.*;
public class Mersenne_Numbers
{
    long number;
    Mersenne_Numbers(long n)
    {
        number=n;
    }
    boolean isMersenne()
    {//function to check if a number is a mersenne number
        long n=0;
        for (int i=1; i<=20; i++)
        {
            n=(long)(Math.pow(2,i)-1);
            if (n==number)
            {
                return true;
            }
        }
        return false;
    }
    boolean isDoubleMersenne()
    {//function to check if a number is a double mersenne number
        long n=0;
        long pwr=0;
        for (int i=1; i<20; i++)
        {
            pwr=(long)(Math.pow(2,i)-1);
            n=(long)(Math.pow(2,pwr)-1);
            if (n==number)
            {
                return true;
            }
        }
        return false;
    }
    public void genMersenneNos()
    {//function to generate mersenne number
        long num=0;
        System.out.println("Generated Mersenne numbers are : ");
        for (int i=1; i<=10; i++)
        {
            num=(long)(Math.pow(2,i)-1);
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public void genDoubleMersenneNos()
    {//function to generate double mersenne number
        long num=0;
        long pwr=0;
        System.out.println("Generated double Mersenne numbers are : ");
        for (int i=1; i<=6; i++)
        {
            pwr=(long)Math.pow(2,i)-1;
            num=(long)(Math.pow(2,pwr)-1);
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long n;
        System.out.println("Enter a number : ");
        n=in.nextLong();//acceting the number
        Mersenne_Numbers numObject=new Mersenne_Numbers(n);
        if (numObject.isDoubleMersenne()==true)
        {
            System.out.println(n+" is a Double Mersenne Number.");
            numObject.genDoubleMersenneNos();
        }
        else if (numObject.isMersenne()==true)
        {
            System.out.println(n+" is a Mersenne Number.");
            numObject.genMersenneNos();
        }
        else
        System.out.println(n+" is neither a Mersenne nor a Double Mersenne number.");
    }
}
import java.util.*;
public class factorial
{
    public static int fact(int num)
    {
        if(num==1)
        {
            return num;
        }
        else
        {
            return num*fact(num-1);
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,f;
        System.out.print("Enter a number : ");
        n=in.nextInt();
        f=fact(n);
        System.out.println("Factorial of "+n+" is : "+f);
    }
}
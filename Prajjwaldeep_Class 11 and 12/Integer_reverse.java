import java.util.*;
public class Integer_reverse
{
    public static int rev(int n)
    {
        int rem,rnum=0;
        while (n!=0)
        {
            rem=n%10;
            rnum=rnum*10+rem;
            n=n/10;
        }
        return rnum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,p;
        System.out.print("Enter a number : ");
        num=in.nextInt();
        p=rev(num);
        System.out.println(p);
    }
}
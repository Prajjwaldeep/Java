import java.util.*;
public class Integer_reverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,rnum=0,rem;
        System.out.print("Enter a number : ");
        num=in.nextInt();
        while (num!=0)
        {
            rem=num%10;
            rnum=rnum*10+rem;
            num=num/10;
        }
        System.out.println("Reversed number : "+rnum);
    }
}
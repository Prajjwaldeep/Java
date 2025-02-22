import java.util.Scanner;
public class do_loop_while_sum
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int c,a,sum=0;
       System.out.print("Enter the first number: ");
       c=in.nextInt();
       System.out.print("Enter the last number: ");
       a=in.nextInt();
        do
       {
        System.out.println(c);
        c++;
        sum=sum+c;
       }
       
        while(c<=a);
       System.out.println("The sum of your loop is "+sum);
    }
}
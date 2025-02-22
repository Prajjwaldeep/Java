import java.util.Scanner;
public class Dowhile
{
   public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    {
        int a;
        System.out.println("Input a number to find your count");
        a=in.nextInt();
        do 
        {
            System.out.println("Count is: "+a);
            a++;
        } 
        while (a < 11);
    }
}
}
import java.util.Scanner;
public class concat_3
{
    public static void maiin(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a,b,c,d;
        System.out.println("Enter your first name");
        a=in.nextLine();
        System.out.println("Enter your last name");
        b=in.nextLine();
        c=a+" "+b;
        d=c.toUpperCase();
        System.out.println("Hi Mr. "+d);
    }
}
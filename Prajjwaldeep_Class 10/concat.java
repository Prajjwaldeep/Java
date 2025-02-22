import java.util.Scanner;
public class concat
{
    public static  void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        String a,b,c;
        System.out.print("Input first name : ");
        a=in.nextLine();
        System.out.print("Input sur name : ");
        b=in.nextLine();
        System.out.println();
        c=a+" "+b;
        String d=c.toUpperCase();
        System.out.println("Hi Mr.  "+d+".");
    }
}
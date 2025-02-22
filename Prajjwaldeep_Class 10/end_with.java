import java.util.Scanner;
public class end_with
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a,b;
        System.out.println("Input the full name");
        a=in.nextLine();
        System.out.println("Input last name");
        b=in.nextLine();
        boolean c=a.endsWith(b);
       
        System.out.println();
    }
}
        
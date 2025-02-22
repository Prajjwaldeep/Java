import java.util.Scanner;
public class replace
{
    public static void main(String arrgs[])
    {
        Scanner in=new Scanner(System.in);
        String a,b,c,d;
        System.out.println("Input your name : ");
        a=in.nextLine();
        b=a.replace('e','i');
        System.out.println("After change with e, is "+b);
    }
}
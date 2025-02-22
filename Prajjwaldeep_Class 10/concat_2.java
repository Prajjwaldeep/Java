import java.util.Scanner;
public class concat_2
{
    public static void main(String arrgs[])
    {
        Scanner in=new Scanner(System.in);
        String a,b,c,d;
        System.out.println("Input your first name : ");
        a=in.nextLine();
        System.out.println("Input your last name : ");
        b=in.nextLine();
        c=a+b;
        d=c.toUpperCase();
        System.out.println("hellow Mr. "+d+".");
    }
}
        
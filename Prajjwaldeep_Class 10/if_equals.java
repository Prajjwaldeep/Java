import java.util.Scanner;
public class if_equals
{
    public static void main(String arrgs[])
    {
        Scanner in=new Scanner(System.in);
        String a,b;
        System.out.println("Input your name : ");
        a=in.nextLine();
        System.out.println("Input last name : ");
        b=in.nextLine();
        if(a.equals(b))
        System.out.println("Both names are same");
        else
        System.out.println("Both names are not same");
    }
}
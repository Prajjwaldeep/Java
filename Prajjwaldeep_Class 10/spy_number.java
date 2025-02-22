import java.util.Scanner;
public class spy_number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,t,s=0,p=1;
        System.out.print("Enter a number : ");
        n=in.nextInt();
        while (n>0)
        {
            t=n%10;
            s=s+t;
            p=p*t;
            n=n/10;
        }
        if (s==p)
        System.out.println("Spy number");
        else
        System.out.println("Not a spy number");
    }
}
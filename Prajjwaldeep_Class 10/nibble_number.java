import java.util.*;
public class nibble_number
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
            n=n/10;
        }
        if (n/s==0)
        System.out.println("Nibble number");
        else
        System.out.println("Not a nibble number");
    }
}
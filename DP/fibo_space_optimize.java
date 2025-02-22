import java.util.*;
public class fibo_space_optimize
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the nth number to fetch fibonacci : ");
        n=in.nextInt();
        int i, curi, prev, prev2;
        prev2=0;
        prev=1;
        for(i=2; i<=n; i++)
        {
            curi=prev2+prev;
            prev2=prev;
            prev=curi;
        }
        System.out.println(n+" th fibonacci from the series : "+prev);
    }
}
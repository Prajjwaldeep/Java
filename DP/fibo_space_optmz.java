import java.util.*;
public class fibo_space_optmz
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the nth number to find fibonacci : ");
        n=in.nextInt();
        int prev2, prev, curri;
        prev2=0;
        prev=1;
        for(i=2; i<=n; i++)
        {
            curri=prev2+prev;
            prev2=prev;
            prev=curri;
        }
        System.out.println("Output : "+prev);
    }
}
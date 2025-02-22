import java.util.*;
public class fibo_tabu
{    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the nth number to find fibonacci : ");
        n=in.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        for(i=2; i<=n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println("Output : "+dp[n]);
    }
}
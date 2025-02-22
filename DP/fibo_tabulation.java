import java.util.*;
public class fibo_tabulation
{
    public static int fibonacci(int n, int dp[])
    {
        dp[0]=0;
        dp[1]=1;
        int i;
        for(i=2; i<=n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the nth number to fetch fibonacci : ");
        n=in.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int fibo=fibonacci(n,dp);
        System.out.println(n+" th fibonacci from the series : "+fibo);
    }
}
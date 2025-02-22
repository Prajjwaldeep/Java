import java.util.*;
public class fibonacci_memo
{
    public static int fibonacci(int n, int dp[])
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=fibonacci(n-1,dp)+fibonacci(n-2,dp);
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
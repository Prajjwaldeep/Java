import java.util.*;
public class fibo_prac_memo
{
    public static int fibo(int n, int dp[])
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the nth number to find it's fibonacci : ");
        n=in.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int fibonacci=fibo(n,dp);
        System.out.println("Required result : "+fibonacci);    
    }
}
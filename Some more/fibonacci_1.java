import java.util.*;
public class fibonacci_1
{/*
    public static int fibo(int n, int dp[])
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=fibo(n-1, dp)+fibo(n-2, dp);
    }*/
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the term for which you need fibonacci : ");
        n=in.nextInt();
        /*
        int dp[]=new int[n+1];
        //Arrays.fill(dp, -1);
        //System.out.println("Fibonacci number for "+n+" th term is : "+fibo(n, dp));
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);*/
        
        int prev1=0, prev=1, curr;
        for(int i=2; i<=n; i++)
        {
            curr=prev1+prev;
            prev1=prev;
            prev=curr;
        }
        System.out.println(prev);
    }
}
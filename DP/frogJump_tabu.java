import java.util.*;
public class frogJump_tabu
{
  public static int frog(int ind, int k, int heights[], int dp[])
  {
    int i,j;
    dp[0]=0;
    int jumping;
    for(i=1; i<ind; i++)
    {
        int maxSteps=Integer.MAX_VALUE;
        for(j=1; j<=k; j++)
        {
            if(i-j>=0)
            {
                jumping=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                maxSteps=Math.min(maxSteps,jumping);
            }
        }
        dp[i]=maxSteps;
    }
    return dp[ind-1];
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("n : ");
    int n;
    n=in.nextInt();
    int heights[]=new int[n];
    System.out.println("k : ");
    int k;
    k=in.nextInt();
    int i;
    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    System.out.println("heights : ");
    for(i=0; i<n; i++)
    {
      heights[i]=in.nextInt();
    }
    System.out.println(frog(n-1,k,heights,dp));
  }
}
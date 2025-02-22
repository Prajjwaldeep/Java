import java.util.*;
public class frogJump
{
  public static int frog(int ind, int k, int heights[], int dp[])
  {
    if(ind==0)
    {
      return 0;
    }
    int j,jumps,maxjump=Integer.MAX_VALUE;
    if(dp[ind]!=-1)
    {
        return dp[ind];
    }
    for(j=1; j<=k; j++)
    {
      if(ind-j>=0)
      {
        jumps=frog(ind-j,k,heights,dp)+Math.abs(heights[ind]-heights[ind-j]);
      	maxjump=Math.min(maxjump,jumps);
      }
    }
    return dp[ind]=maxjump;
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
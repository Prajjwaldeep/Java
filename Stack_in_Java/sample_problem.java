import java.util.*;
public class sample_problem
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,i,num,m,n,sum=0,div,ans;
        t=in.nextInt();
        for(i=0; i<t; i++)
        {
            n=in.nextInt();
            m=in.nextInt();
            num=in.nextInt();
            sum=sum+n;
            div=sum/m;
            ans=sum-(m*div);
            System.out.println(ans);
            n=0;
            sum=0;
        }
    }
}
import java.util.*;
public class abc
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j;
        System.out.print("n=");
        int n=in.nextInt();
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i==j || (i+j)==n+1)
                {
                    System.out.print(j+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.*;
public class Matrix_Sort_Assemble
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N,i,j,t;
        System.out.print("ENTER THE SIZE OF THE MATRIX : ");
        N=in.nextInt();
        if (N<=2 || N>=10)
        {
            System.out.println("ARRAY OUT OF SIZE.");
        }
        else
        {
            String b[][]=new String[N][N];
            String x="";
            int a[]=new int[N];
            System.out.println("ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY : ");
            for (i=0; i<N; i++)
            {
                a[i]=in.nextInt();
            }
            for (i=0; i<N; i++)
            {
                for (j=0; j<(N-1); j++)
                {
                    if (a[j]>a[j+1])
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            for (i=0; i<N; i++)
            {
                x=x+a[i];
            }
        }
    }
}
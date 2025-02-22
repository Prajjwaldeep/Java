import java.util.*;
public class matrix_2012
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,c,r,t=0,s=0,row=0,column=0,t1=0;
        System.out.println("Enter the number of rows and columns respectively : ");
        m=in.nextInt();
        n=in.nextInt();
        if (m<2 || m>20 || n<2 || n>20)
        {
            System.out.println("Limit out of range");
        }
        else
        {
            int A[][]=new int[m][n];
            System.out.println("Enter the elements of the matrix : ");
            for (c=0; c<m; c++)
            {
                for (r=0; r<n; r++)
                {
                    A[c][r]=in.nextInt();
                }
            }
            System.out.println("Required matrix : ");
            for (c=0; c<m; c++)
            {
                for (r=0; r<n; r++)
                {
                    System.out.print(A[c][r]+" ");
                }
                System.out.println();
            }
            for (c=0; c<m; c++)
            {
                for (r=0; r<n; r++)
                {
                    if (A[c][r]<s)
                    {
                        s=A[c][r];
                        row=c;
                        column=r;
                    }
                }
            }
            System.out.println("Smallest number "+s+" in row "+row+" and column "+column);
            for (c=0; c<m; c++)
            {
                for (r=0; r<n; r++)
                {
                    if (A[c][r]>s)
                    {
                        s=A[c][r];
                        row=c;
                        column=r;
                    }
                }
            }
            System.out.println("Largest number "+s+" in row "+row+" and column "+column);
            /*System.out.println("Re-arranged matrix : ");
            for (c=0; c<m; c++)
            {
                for (r=0; r<n; r++)
                {
                    System.out.print(A[c][r]+" ");
                }
                System.out.println();
            }*/
        }
    }
}
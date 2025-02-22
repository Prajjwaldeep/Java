// A program to check if both the matrix are equal or not.
import java.util.*;
class EqMat
{
    int a[][], m,n;
    EqMat( int mm, int nn)
    {
        // Parameterised constructor to initialise the data members.
        m=mm;
        n=nn;
        a=new int[m][n];
    }
    public void readarray() 
    {
        // Accepts elements in the array.
        Scanner in=new Scanner(System.in); // Declaring scanner class.
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) 
            {
                a[i][j]=in.nextInt(); // Accepting array input.
            }
        }
    }
    public int check(EqMat P, EqMat Q)
    {
        // Checks if the parameterised objects p and q are equal and returns 1 if true, otherwise returns 0.
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(P.a[i][j]!=Q.a[i][j])
                return 0;
            }
        }
        return 1; 
    }
    public void print() 
    {
        // Displays the array elements.
        for(int i=0;i<m;i++) 
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the row and column size for the array:");
        // Accepting the row and column size from the user.
        int a=in.nextInt();
        int b=in.nextInt();
        EqMat A =new EqMat(a,b);
        EqMat B=new EqMat(a,b);
        A.readarray();
        B.readarray();
        A.print();
        System.out.println();
        B.print();
        if(A.check(A,B)==1) // If both the matrix are same
        System.out.println("Both are equal matrix"); // Display's the message
        else // If the above condition isn't satisfied
        System.out.println("Both are unequal matrix"); // Display the message.
    }
}
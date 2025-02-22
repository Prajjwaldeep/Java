import java.util.*;
class SquareMatrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the matrix : ");
        int n = sc.nextInt();
         
        if(n<2 || n>10)
            System.out.println("Size out of Range");
        else
        {
            char M[][]=new char[n][n];
            System.out.print("Enter the 1st character : ");
            char c1 = sc.next().charAt(0);
            System.out.print("Enter the 2nd character : ");
            char c2 = sc.next().charAt(0);
            System.out.print("Enter the 3rd character : ");
            char c3 = sc.next().charAt(0);
             
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    if(i==j || (i+j)==(n-1))
                        M[i][j] = c3; // Filling the diagonals with 3rd character
                    else
                        M[i][j] = c2; // Filling all other positions with 2nd character
                }
            }
             
            for(int i=0; i<n/2; i++)
            {
                for(int j=i+1; j<n-1-i; j++)
                {
                    M[i][j] = c1; // Filling the upper positions formed by intersection of diagonals
                    M[n-1-i][j] = c1; // Filling the lower positions formed by intersection of diagonals
                }
            }
             
            // Printing the Matrix
            System.out.println("\nOutput : \n");
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(M[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
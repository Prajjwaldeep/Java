/**
 * A sample program to fill a matrix using various special characters with
 * different elements in two diagonals and remaining elements
 */
import java.util.*;
class Mat_Fill
{
    public static void main(String args[])//declaration of main method
    {
        int n,i,j;
        Scanner in=new Scanner(System.in);//declaration of scanner class
        //Accepting amatrix size
        System.out.println("Enter size of square matrix");
        n=in.nextInt();
        //Displaying the array after filling it
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                System.out.print("+");
                else if(j==(n-1)-i)
                System.out.print("+");
                else if(j>i&&j<(n-1)-i)
                System.out.print("#");
                else if(j>=n-i&&j<i)
                System.out.print("#");
                else
                System.out.print("@");
            }
            System.out.println();
        }
    }//end of main method
}//end of class
            
  
    
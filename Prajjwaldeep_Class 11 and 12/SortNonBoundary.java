/**
 * The class SortNonBoundary inputs a square matrix and
 * sorts the non-boundary elements in ascending order
 */
import java.util.*;
class SortNonBoundary
{
    int A[][],B[],m,n,sum=0;
    void input()//function for taking all the necessary inputs
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the square matrix :");
        m=sc.nextInt();
        if(m<4||m>10)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else
        {
            A=new int[m][m];
            n=(m-2)*(m-2);
            B=new int[n];//array to store non-boundary elements
            System.out.println("Enter the elements of the matrix:");
            for(int i=0;i<m;i++)
            {
               for(int j=0;j<m;j++)
               { 
                   System.out.println("Enter a value:");
                    A[i][j]=sc.nextInt();
               }
            }
        }
    }
    /*The below function stores Non-Boundary elements
     * from array A[][] to array B[] if s=1
     * else stores the Non-Boundary elements in array A[][] from array B[]
     */
    void convert(int s)
    {
        int x=0;
        for(int i=0;i<m;i++)
        {
               for(int j=0;j<m;j++)
               {
                   if(i!=0 && j!=0 && i!=m-1 && j!=m-1)
                   {
                       if(s==1)
                        System.out.print("\t");
                    }
                   System.out.println();
               }
               System.out.println("Sum of Diagonal Elements:"+sum);
        }
    }
    public static void main(String args[])
    { 
        SortNonBoundary ob=new SortNonBoundary();
        ob.input();
        System.out.println("The Original Matrix:");
       // ob.printArray();//Printing the original array
        ob.convert(1);//Sorting Non-Boundary elements to a 1-D array
       // ob.sortArray();//Sorting the 1-D array(i.e. Non-Diagonal Elements)
        ob.convert(2);//Sorting the sorted Non-Boundary elements back to original 2-D array
        System.out.println("The Diagonal Elements:");
       //ob.printDiagonal();//Printing the diagonal elements and their sum
    }
}
        
        
        
     
     
                
            
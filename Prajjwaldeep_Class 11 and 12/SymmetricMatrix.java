/**
 *The class SymmetricMatrix inputs a 2D array and checks whether it is Symmetric or not
 *It then finds the sum of the left and right diagonals
 */
import java.io.*;
class  SymmetricMatrix
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the number of elements:");
        int m=Integer.parseInt(br.readLine());
        int A[][]=new int[m][m];
        if(m>2&&m<10)//checking for valid inputs of rows and columns size
        {
            System.out.println("Inputting the elements in the matrix:");
            System.out.println("Enter the elements:");
            for(i=0;i<m;i++)
            {
               for(j=0;j<m;j++)
               { 
                    A[i][j]=Integer.parseInt(br.readLine());
               }
            }
            /*Printing the original matrix*/
            System.out.println("The Original matrix is:");
            for(i=0;i<m;i++)
            {
               for(j=0;j<m;j++)
               { 
                   System.out.print(A[i][j]+"\t");
               }
               System.out.println();
            }
            /*checking whether the matrix is symmetric or not*/
            int flag=0;
            for(i=0;i<m;i++)
            {
               for(j=0;j<m;j++)
               { 
                   if(A[i][j]!=A[j][i])
                   {
                       flag=1;//Setting flag=1 when elements do not match
                       break;
                    }
                }
            }
            if(flag==1)
            System.out.println("\nThe given matrix is Not Symmetric");
            else
            System.out.println("\nThe given matrix is Symmetric");
            /*Finding sum of diagonals*/
            int ld=0,rd=0;
            for(i=0;i<m;i++)
            {
               for(j=0;j<m;j++)
               { 
                   if(i==j)//condition for left diagonal
                   {
                       ld=ld+A[i][j];
                   }
                   if((i+j)==(m-1))//condition for the right diagonal
                   {
                       rd=rd+A[i][j];
                    }
                }
            }
            System.out.println("The sum of left diagonal:"+ld);
            System.out.println("The sum of right diagonal:"+rd);
        }
        else
        System.out.println("The matrix size is out of range");
    }//end of main method
}//end of class
                    
            
            
            
        
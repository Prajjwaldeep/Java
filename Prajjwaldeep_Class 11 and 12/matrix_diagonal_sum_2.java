import java.util.Scanner;
class matrix_diagonal_sum_2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input the row and column limit");
        int r2=in.nextInt();
        int c2=in.nextInt();
        int array[][]=new int[r2][c2];
        int array2[]=new int[100];
        int z,r,c=0,k,sum=0,sum2=0;
        System.out.println("Input the numbers in the array");
        for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                array[r][c]=in.nextInt();
            }
        }
        System.out.println("Displaying the matrix");
        for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Displaying the diagonals");
        for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                if(c==r)
                {
                    System.out.print(array[r][c]+" ");
                    sum=sum+array[r][c];
                }
                else if(c+r==r2-1)
                {
                    System.out.print(array[r][c]+" ");
                    sum2=sum2+array[r][c];
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Sum of right diagonal : "+ sum);
        System.out.println("Sum of left diagonal  : "+ sum2);
    }
}

                    
        
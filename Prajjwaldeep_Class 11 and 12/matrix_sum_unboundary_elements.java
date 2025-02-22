import java.util.Scanner;
class matrix_sum_unboundary_elements
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input the row and column limit");
        int r2=in.nextInt();
        int c2=in.nextInt();
        int array[][]=new int[r2][c2];
        int z,r,c,k,sum=0,sum2=0;
        System.out.println("Input the numbers in the array");
        for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                array[r][c]=in.nextInt();
            }
        }
        System.out.println("Displaying he matrix");
        for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        //the down part is for the summation of the totaL Matrix.
        /*for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                sum=sum+array[r][c];
            }
        }*/
        for(r=1;r<r2-1;r++)
        {
            for(c=1;c<c2-1;c++)
            {
                sum2=sum2+array[r][c];
            }
        }
        System.out.println("Sum of the out of boundary elements is : "+sum2);
    }
}
        
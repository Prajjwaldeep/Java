import java.util.Scanner;
class matrix_row_sort_part__2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input the row and column limit");
        int r2=in.nextInt();
        int c2=in.nextInt();
        int array[][]=new int[r2][c2];
        int z,r,c,k;
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
        //SORTING
        for(r=0;r<r2-1;r++)//here r is acting as column
        {
            for(c=0;c<c2;c++)//here c  is acting as row
            {
                for(k=0;k<(r2-1)-r;k++)
                {
                    if(array[c][k]>array[c][k+1])
                    {
                        z=array[c][k];
                        array[c][k]=array[c][k+1];
                        array[c][k+1]=z;
                    }
                }
            }
        }
         System.out.println("Matrix after sorting");
        for(r=0;r<r2;r++)
        {
            for(c=0;c<c2;c++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
    }
}

        
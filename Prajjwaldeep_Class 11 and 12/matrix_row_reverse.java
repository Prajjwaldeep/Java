import java.util.Scanner;
class matrix_row_reverse
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
        
        // a special case
        for(r=0;r<r2;r++)//r acts as column
        {
            for(c=0;c<c2-1;c++)//c acts as row
            {
                for(k=0;k<(c2-1)-c;k++)
                {
                    {
                        z=array[r][k];
                        array[r][k]=array[r][k+1];
                        array[r][k+1]=z;
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

        
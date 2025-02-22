import java.util.Scanner;
class matrix_transpose_practice
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the coulumn and row limit of the matrix");
        int c2=in.nextInt();
        int r2=in.nextInt();
        int array[][]=new int[c2][r2];
        int c,r;
        //taking input from user
        for(c=0;c<c2;c++)
        {
            for(r=0;r<r2;r++)
            {
                array[c][r]=in.nextInt();
            }
        }
        System.out.println("Displaying the  matrix");
        for(c=0;c<c2;c++)
        {
            for(r=0;r<r2;r++)
            {
                System.out.print(array[c][r]+" ");
            }
            System.out.println();
        }
        //transposing the inputed matrix
        System.out.println("Displaying the Matrix after Transpose");
        /*for(c=0;c<r2;c++)
        {
            for(r=0;r<c2;r++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }*/
        //System.out.println("Displaying the Matrix after Transpose");
         for(r=0;r<c2;r++)
        {
            for(c=0;c<r2;c++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        
    }
}

        
        
        
        
                
        
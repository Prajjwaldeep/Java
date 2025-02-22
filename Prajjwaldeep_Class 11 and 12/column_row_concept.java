import java.util.Scanner;
class column_row_concept
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       
        int array[][]=new int[4][3];// first row limit then column limit
        int r,c,sum=0,sum2=0;
        System.out.println("Enter the elements");
        //c=row and r=column
        for(c=0;c<4;c++)
        {
            for(r=0;r<3;r++)
            {
                array[c][r]=in.nextInt();
            }
        }
        System.out.println("Displaying the matrix");
          for(c=0;c<4;c++)
        {
            for(r=0;r<3;r++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        /*System.out.println("Displaying the diagonals");
        for(c=0;c<c2;c++)
        {
            for(r=0;r<r2;r++)
            {
                if(c==r)
                {
                    System.out.print(array[c][r]+" ");
                    sum=sum+array[c][r];
                }
                else if(c+r==c2-1)
                {
                    System.out.print(array[c][r]+" ");
                    sum2=sum+array[c][r];
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("The summation of the elements of the right dagonals"+sum);
        System.out.println("The summation of the elements of th left diagonals"+sum2);
        */
     }
}


    

        
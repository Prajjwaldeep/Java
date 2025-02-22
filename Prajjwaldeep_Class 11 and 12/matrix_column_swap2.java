import java.util.Scanner;
class matrix_column_swap2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int array[][]=new int[4][4];
        int r,c,sum=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,t;
        System.out.println("Enter the elements");
        for(r=0;r<4;r++)//c for row
        {
            for(c=0;c<3;c++)// r for column
            {
                array[r][c]=in.nextInt();
            }
        }
        System.out.println("Displaying the matrix");
        for(r=0;r<4;r++)//c for row
        {
            for(c=0;c<3;c++)// r for column
            {
               System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        for(r=0;r<4;r++)//c for row
        {
            t=array[r][0];
            array[r][0]=array[r][2];
            array[r][2]=t;
        }
        System.out.println("Displaying the matrix");
        for(r=0;r<4;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(array[r][c]);
            }
            System.out.println();
        }
    }
}
            
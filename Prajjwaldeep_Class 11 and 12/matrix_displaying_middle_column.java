import java.util.Scanner;
class matrix_displaying_middle_column
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int array[][]=new int[4][4];
        int r,c,sum=0,sum2=0;
        System.out.println("Enter the elements");
        for(c=0;c<4;c++)//c for row
        {
            for(r=0;r<3;r++)// r for column
            {
                array[c][r]=in.nextInt();
            }
        }
        System.out.println("Displaying the matrix");
        for(c=0;c<4;c++)//c for row
        {
            for(r=0;r<3;r++)// r for column
            {
                System.out.print(array[c][r]+" ");
            }
            System.out.println();
        }
        System.out.println("Displaying the middle column");
        for(c=0;c<4;c++)//c for row
        {
            {
                for(r=0;r<3;r++)// r for column
                {
                    if(r-1==0)
                    {
                        System.out.print(array[c][r]+" ");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}


    

        
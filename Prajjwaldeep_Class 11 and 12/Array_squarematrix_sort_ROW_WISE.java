import java.util.Scanner;
class Array_squarematrix_sort_ROW_WISE
{
    public static void main(String rgs[])
    {
        Scanner in=new Scanner(System.in);
        int array[][]=new int[4][4];
        int r,c,k,t;
        System.out.println("Enter the elements of the (4*4) matrix");
        for(c=0;c<4;c++)
        {
            for(r=0;r<4;r++)
            {
                array[c][r]=in.nextInt();
            }
        }
        System.out.println("Displaying the (4*4) matrix");
        for(c=0;c<4;c++)
        {
            for(r=0;r<4;r++)
            {
                System.out.print(array[c][r]+" ");
            }
            System.out.println();
        }
        for(c=0;c<4;c++)
        {
            for(r=0;r<3;r++)
            {
                for(k=0;k<3-r;k++)
                {
                    if(array[c][k]>array[c][k+1])
                    {
                        t=array[c][k];
                        array[c][k]=array[c][k+1];
                        array[c][k+1]=t;
                    }
                }
            }
        }
        System.out.println("Elements after sorting");
        for(   c=0;c<4;c++)
        {
            for(r=0;r<4;r++)
            {
                System.out.print(array[c][r]+" ");
            }
            System.out.println();
        }
    }
}

        


        
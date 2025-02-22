import java.util.Scanner;
class matrix_row_sort_2018_ISC
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        //inputing the limit of row and column
        System.out.println("Input the row and column limit");
        int M=in.nextInt();
        int N=in.nextInt();
        if((M>2 && M<10) && (N>2 && N<10))//Giving condition for the range of elements to be inputed 
        {
            int array[][]=new int[M][N];
            int z,r,c,k;
            System.out.println("Input the numbers in the array");//taking inputs of elements 
            for(r=0;r<M;r++)
            {
                for(c=0;c<N;c++)
                {
                    array[r][c]=in.nextInt();
                }
            }
            System.out.println("Displaying he matrix");//Displaying the inputed matrix
            for(r=0;r<M;r++)
            {
                for(c=0;c<N;c++)
                {
                    System.out.print(array[r][c]+" ");
                }
                System.out.println();
            }
            //SORTING  the inputed matrix ROW_WISE
            for(r=0;r<M;r++)
            {
                for(c=0;c<N-1;c++)
                {
                    for(k=0;k<(N-1)-c;k++)
                    {
                        if(array[r][k]>array[r][k+1])
                        {
                            z=array[r][k];
                            array[r][k]=array[r][k+1];
                            array[r][k+1]=z;
                        }
                    }
                }
            }
            //displaying the sorted matrix
            System.out.println("Matrix after sorting");
            for(r=0;r<M;r++)
            {
                for(c=0;c<N;c++)
                {
                    System.out.print(array[r][c]+" ");
                }
                System.out.println();
            }
        }
        //printing an else statement if the condition for the rang of elements do not match
        else
        {
            System.out.println("MARTIX SIZE OUT OF RANGE");
        }
    }
}


        
import java.util.Scanner;
class matrix_diagonal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        //taking the input for the limit of row and column
        System.out.println("Enter the row and column limits");
        int M=in.nextInt();
        int N=in.nextInt();
        int array[][]=new int[N][M];
        int r,c,sum=0,sum2=0;
        if((M>2 && M<10) && (N>2 && N<10))//Giving condition for the range of elements to be inputed 
        {
            System.out.println("Enter the elements");//taking input from user
            for(c=0;c<M;c++)
            {
                for(r=0;r<N;r++)
                {
                    array[c][r]=in.nextInt();
                }
            }
            System.out.println("Displaying the matrix");//Displaying the inputed matrix
            for(c=0;c<M;c++)
            {
                for(r=0;r<N;r++)
                {
                    System.out.print(array[c][r]+" ");
                }
                System.out.println();
            }
            System.out.println("Displaying the diagonals");//displaying diagonals and it's sum
            for(c=0;c<M;c++)
            {
                for(r=0;r<N;r++)
                {
                    if(c==r)//giving condition to display right diagonal
                    {
                        System.out.print(array[c][r]+" ");
                        sum=sum+array[c][r];
                    }
                    else if(c+r==M-1)//giving condition to display left diagonal
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
            System.out.println(" ");
            System.out.println("The summation of the elements of the right dagonals : "+sum);
            System.out.println("The summation of the elements of th left diagonals  : "+sum2);
        }
        //printing an else statement if the condition for the rang of elements do not match
        else
        {
            System.out.println("MARTIX SIZE OUT OF RANGE");
        }
    }
}


    

        
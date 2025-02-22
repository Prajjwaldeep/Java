import java.util.Scanner;
class matrix_2015_ISC
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the row  and coulumn limit of the matrix");
        int n=in.nextInt();//taking the input for the limit of row and column
        int array[][]=new int[n][n];
        int array2[][]=new int[n][n];
        int c,r,z,k=0;
        int sum=0;
        if(n<=2 || n>=10)//Giving condition for the range of elements to be inputed 
        {
            System.out.println("Size out of range");
        }
        else
        {
            //taking input from user
            System.out.println("Enter the data in a "+n+"by"+n+"matrix");
            for(r=0;r<n;r++)
            {
                for(c=0;c<n;c++)
                {
                    array[r][c]=in.nextInt();
                }
            }
            System.out.println("Displaying the  matrix");//displaying the inputed Matrix
            for(r=0;r<n;r++)
            {
                for(c=0;c<n;c++)
                {
                    System.out.print(array[r][c]+" ");
                }
                System.out.println();
            }
            //transposing the inputed matrix
            System.out.println(" ");
            for(r=0;r<n;r++)
            {
                for(c=0;c<n;c++)
                {
                    array2[c][r]=array[r][c];
                }
            }
            //rotating the transposed matrix to get the final output
            for(r=0;r<n;r++)
            {
                for(c=(n-1);c>=0;c--)
                {
                    array[r][k]=array2[r][c];
                    k++;
                }
                k=0;
            }
            System.out.println("Final matrix");//Displaying final matrix
            for(r=0;r<n;r++)
            {
                for(c=0;c<n;c++)
                {
                    System.out.print(array[r][c]+" ");
                }
                System.out.println();
            }
            //summation of the corner elements
            sum=sum+array[0][0]+array[0][n-1]+array[n-1][0]+array[n-1][n-1];
            System.out.println("sum of corner elements : "+sum);
        }
    }
}
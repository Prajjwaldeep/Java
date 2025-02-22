import java.util.Scanner;
public class array_matrix
{
    static void display(int matrix[][],int N)
    {
        for (int c=0; c<N; c++)
        {
            for (int r=0; r<N; r++)
            {
                System.out.print(matrix[c][r]+"\t");
            }
            System.out.println();
        }
    }
    
    static void sort(int array[], int N)
    {
        for (int c=0; c<N; c++)
        {
            for (int r=0; r<(N-1); r++)
            {
                if (array[r]>array[r+1])
                {
                    int temp=array[r];
                    array[r]=array[r+1];
                    array[r+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the length of the array : ");
        int N;
        N=in.nextInt();
        if(N<=2 || N>10)
        {
            System.out.println("Matrix size out of range");
            return;
        }
        System.out.print("Enter the elements of single dimensional array : ");
        int array[]=new int[N];
        for (int c=0; c<N; c++)
        array[c]=in.nextInt();
        sort(array,N);
        int matrix[][]=new int[N][N];
        for (int c=0;c<N; c++)
        {
            int index=0;
            for (int r=0; r<(N-c); r++)
            matrix [c][index++]=array[r];
            for (int r=0; r<c; r++)
            matrix [c][index++]=array[r];
        }
        System.out.print("Sorted array : ");
        for (int c=0; c<N; c++)
        System.out.print(array[c]+" ");
        System.out.println();
        System.out.println("Filled matrix");
        display(matrix,N);
        in.close();
    }
}
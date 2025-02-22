/**
 * A program to rotate a square matrix os any order by 90 degree clockwise
 */import java.util.*;
class Mat_Rotateclockwise
{
    public static void main(String args[])
    {
        int n,i,j,s=1,t,t1,t2,t3,sum=0;
        Scanner in=new Scanner(System.in);//declaring scanner class
        System.out.println("ENTER SIZE OF SQUARE MATRIX");
        n=in.nextInt();//accepting size of square matrix
        int arr[][]=new int[n][n];
        //Taking the matrix elements as Input
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("The array:");
        //Displaying Original Array
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix after rotation by 90 degree clockwise:");
        //Rotate Array by 90 degree Clockwise
        for(i=0;i<n/2;i++)
        {
            if(i%2!=0)
            {
                for(j=i;j<n-i-1;j++)
                {
                    t=arr[i][j];
                    arr[i][j]=arr[j][n-i-1];
                    t1=arr[n-i-s][i];
                    arr[n-i-s][i]=t;
                    t2=arr[n-i-s][n-i-s];
                    arr[n-i-s][n-i-s]=t1;
                    t3=arr[j][n-i-1];
                    arr[j][n-i-1]=t2;
                    s++;
                }
                s=1;
            }

            else
            {
                for(j=i;j<n-i-1;j++)
                {
                    t=arr[j][n-i-1];
                    arr[j][n-i-1]=arr[i][j];
                    t1=arr[n-i-1][n-i-s];
                    arr[n-i-1][n-i-s]=t;
                    t2=arr[n-i-s][i];
                    arr[n-i-s][i]=t1;
                    arr[i][j]=t2;
                    s++;
                }
            }
            s=1;
        }
        //Displaying Array after rotation
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }//end of main method
}//end of class
        
        
                
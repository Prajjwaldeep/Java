import java.util.*;
class arr_2d_col
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,c,r,sum=0;
        System.out.println("Enter the limit of the array :");
        c=in.nextInt();
        r=in.nextInt();
        int arr[][]=new int[c][r];
        System.out.println("Enter the element of the array :");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        //Array Element
        System.out.println("Array structure is :");
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(arr[i][j]+" ");              
            }
            System.out.println();
        }
        
        for(i=0;i<c;i++)
        {
            sum=0;
            for(j=0;j<r;j++)
            {
                sum=sum+arr[j][i];
             }
            System.out.println("Sum of element of col "+(j+1)+" is = "+sum);
        }
        System.out.println();
    }
}
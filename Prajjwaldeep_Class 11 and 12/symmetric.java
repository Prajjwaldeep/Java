import java.util.*;
class symmetric
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,l,sum=0;
        boolean s=true;
        System.out.println("Enter the limit of the array :");
        l=in.nextInt();
        if(l>2 || l<10)
        {
            System.out.println("Out of range");
        }
        else
        {
            int arr[][]=new int[l][l];
            System.out.println("Enter the element of the array :");
            for(i=0;i<l;i++)
            {
                for(j=0;j<l;j++)
                {
                    arr[i][j]=in.nextInt();
                }
            }
            //Array Element
            System.out.println("Array structure is :");
            for(i=0;i<l;i++)
            {
                for(j=0;j<l;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            //Operation
            for(i=0;i<l;i++)
            {
                for(j=0;j<l;j++)
                {
                    if(arr[j][i]!=arr[i][j])
                    s=false;
                    break;
                }
            }
            if (s==true)
            {
                System.out.println("Matrix is symmetric");
            }
            else
            {
                System.out.println("Matrix is not symmetric");
            }
        }
    }
}
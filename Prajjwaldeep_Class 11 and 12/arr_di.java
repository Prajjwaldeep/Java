import java.util.*;
public class arr_di
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,c,r,n=0;
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
    System.out.println("Array structure is :");
    for(i=0;i<c;i++)
    {
        for(j=0;j<r;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}
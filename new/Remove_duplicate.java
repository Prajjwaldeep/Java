import java.util.*;
public class Remove_duplicate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a,b=0;
        System.out.print("Enter the limit of array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        int unique[]=new int[n];
        System.out.println("Enter the elements of array : ");
        for(a=0; a<n; a++)
        {
            arr[a]=in.nextInt();
        }
        for(a=0; a<n-1; a++)
        {
            if(arr[a]!=arr[a+1])
            {
                unique[b++]=arr[a];
            }
        }
        unique[b++]=arr[n-1];
        for(a=0; a<n; a++)
        {
            arr[a]=unique[a];
        }
        System.out.println("Array after deletion : ");
        for(a=0; a<b; a++)
        {
            System.out.println(arr[a]);
        }
    }
}
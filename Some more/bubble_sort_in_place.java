import java.util.*;
public class bubble_sort_in_place
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array : ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]>arr[j])
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
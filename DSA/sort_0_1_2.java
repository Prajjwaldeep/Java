import java.util.*;
public class sort_0_1_2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array : ");
        n=in.nextInt();
        int a;
        int arr[]=new int[n];
        for(a=0; a<n; a++)
        {
            arr[a]=in.nextInt();
        }
        Arrays.sort(arr);
        for(a=0; a<n; a++)
        {
            System.out.print(arr[a]+" ");
        }
    }
}
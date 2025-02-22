import java.util.Scanner;
public class arr_5_selection_sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,b,min,p;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        for (a=0; a<l; a++)
        {
            min=a;
            for (b=(a+1); b<l; b++)
            {
                if(arr[b]<arr[min])
                min=b;
        }
        p=arr[a];
        arr[a]=arr[min];
        arr[min]=p;
    }
   System.out.println("Numbers arranged in assanding order are : ");
   for (a=0; a<l; a++)
   System.out.println(arr[a]);
}
}
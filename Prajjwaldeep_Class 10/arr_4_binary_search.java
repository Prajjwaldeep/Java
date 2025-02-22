import java.util.Scanner;
public class arr_4_binary_search
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,s,mid=0,ln=-1;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array in sorted format : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        } 
        System.out.println("Enter the number to be searched : ");
        s=in.nextInt();
        int lb=0,ub=l-1;
        while((lb<=ub) && ln==-1)
        {
            mid=(lb+ub)/2;
            if (s>arr[mid])
            lb=mid+1;
            if (s<arr[mid])
            ub=mid-1;
            if (arr[mid]==s)
            ln=1;
        }
        if (ln>=0)
            System.out.println("Number is present");
            else
            System.out.println("Number is not present");
        }
    }
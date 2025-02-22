import java.util.Scanner;
public class arr_4_binary_search2
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
        int lb=0,ub=l;
        mid=(lb+(ub-1))/2;
        
        while((lb<=ub))
        {
            if (s>arr[mid])
            lb=mid+1;
            else if (s<arr[mid])
            ub=mid-1;
            else
            ln=1;
        }
        if (ln==1)
            System.out.println("Number is present");
            else
            System.out.println("Number is not present");
        }
    }
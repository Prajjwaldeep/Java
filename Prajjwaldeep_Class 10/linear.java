import java.util.*;
public class linear
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,s,a,p=0;
        System.out.print("Enter the length of the array : ");
        l=in.nextInt();
        System.out.println("Enter the elements of array : ");
        int arr[]=new int[l];
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        System.out.println("Enter the value to be searched : ");
        s=in.nextInt();
        for (a=0; a<l; a++)
        {
            if (arr[a]==s)
            p=1;
        }
        if (p==1)
        System.out.println("Element is present");
        else
        System.out.println("Element is not present");
    }
}
import java.util.Scanner;
public class arr_3_linear_search
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,s,p=0;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        s=in.nextInt();
        for (a=0; a<l; a++)
        {
            if (arr[a]==s)
            p=1;
        }
        if(p==1)
        System.out.println("Number is present");
        else
        System.out.println("Number is not present");
    }
}
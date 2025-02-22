import java.util.Scanner;
public class arr_7_insertation
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int l,a,i,pos;
        System.out.print("Enter the limit of array : ");
        l=in.nextInt();
        int arr[]=new int[l+1];
        System.out.println("Enter the elements of array : ");
        for (a=0; a<l; a++)
        {
            arr[a]=in.nextInt();
        }
        System.out.println("Enter the element of insertation :");
        i=in.nextInt();
        System.out.println("Enter the position of insertation :");
        pos=in.nextInt();
        for(a=(l-1); a>=(pos-1); a--)
        {
            arr[a+1]=arr[a];
        }
        arr[pos-1]=i;
        System.out.println("After insertation :");
        for(a=0; a<l; a++)
        {
            System.out.println(arr[a]);
        }
        System.out.println(arr[l]);
    }
}
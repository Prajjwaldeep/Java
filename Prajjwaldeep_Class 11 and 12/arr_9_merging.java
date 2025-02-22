import java.util.Scanner;
public class arr_9_merging
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l1,l2,l3;
        System.out.print("Enter the limit of array 1 : ");
        l1=in.nextInt(); 
        System.out.print("Enter the limit of array 2 : ");
        l2=in.nextInt();
        l3=l1+l2;
        int arr1[]=new int[l1];
        int arr2[]=new int [l2];
        int arr3[]=new int [l3];
        System.out.println("Enter the elements of array 1 : ");
        for (a=0; a<l1; a++)
        {
            arr1[a]=in.nextInt();
        }
        System.out.println("Enter the elements of array 2 : ");
        for (a=0; a<l2; a++)
        {
            arr2[a]=in.nextInt();
        }
        for (a=0; a<l1; a++)
        {
            arr3[a]=arr1[a];
        }
        for (a=0; a<l2; a++)
        {
            arr3[a+l1]=arr2[a];
        }
       System.out.println("Elements of the merged array are : "); 
       for (a=0; a<l3; a++)
        System.out.println(arr3[a]);
    }
}
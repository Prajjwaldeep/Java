import java.util.Scanner;
class array_3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,l;
        System.out.println("How many ");
        l=in.nextInt();
        int arr[]=new int[100];
        System.out.println("Input numbers");
        for(a=0;a<l;a++)
        arr[a]=in.nextInt();
        System.out.println("Inputted numbers are as follows...");
        for(b=0;b<a;b++)
        System.out.println(arr[b]);
    }
}

        
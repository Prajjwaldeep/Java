import java.util.Scanner;
public class arr
{
    public static void main(String args[])
{
        Scanner in=new Scanner(System.in);
        int a,n,k;
        int arr[]=new int[7];
        
        System.out.println("Input five numbers");
        for (n=0; n<7; n++)
        arr [n]=in.nextInt();
        
        
        System.out.println("Input nuber is");
        for (k=0; k<n; k++)
        System.out.println(arr[k]);
    }
}
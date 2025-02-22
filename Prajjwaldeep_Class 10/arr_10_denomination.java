// Calculate the number of rupees required for a particular amount
import java.util.Scanner;
public class arr_10_denomination
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long arr[]={2000,500,100,50,20,10,5,1};
        long amt,n;
        int a;
        System.out.println("Input the amount : ");
        amt=in.nextLong();
        for (a=0; a<arr.length; a++)
        {
            n=amt/arr[a];
            if(n!=0)
            System.out.println("The number of "+arr[a]+" rupees is : "+n);
            amt=amt%arr[a];
        }
    }
}
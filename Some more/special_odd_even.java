import java.io.*;
class special_odd_even
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("You are checking whether the number you have enetered an odd or even number");
        System.out.println();
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        if(n%2==0)
        {
            System.out.println("It is an even number");
        }
       else if(n%1==0)
        {
            System.out.println("It is an odd number");
        }
    }
}
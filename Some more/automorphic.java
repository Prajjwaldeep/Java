import java.io.*;
class automorphic
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to check whether it is automorphic number or not");
        int n=Integer.parseInt(br.readLine());
        int a,b,c,d;
        a=n*n;
        b=a%10;
        c=a%100;
        d=a%1000;
        if((n==b)||(n==c)||(n==d))
        {
            System.out.println("It is an automorphic number");
        }
        else
        {
            System.out.println("It is not an automorphic number");
        }
    }
}
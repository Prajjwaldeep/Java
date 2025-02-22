import java.io.*;
class sum_of_digits
{
    public static void main(String args[]) throws IOException
    {
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a two digit number to find the sum of its digits");
        int n=Integer.parseInt(br.readLine());
        a=n/10;
        b=n%10;
        c=a+b;
        System.out.println("First Number= "+a);
        System.out.println("Second Number= "+b);
        System.out.println("Sum of the digits= "+c);
    }
}
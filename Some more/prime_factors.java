import java.io.*;
class prime_factors
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Remember you are finding the prime factors of the number you have entered");
        System.out.println();
        System.out.print("Enter a number:");
        int n=Integer.parseInt(br.readLine());
        int i=2;
        while(n>1)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
                n=n/i;
            }
            else
            i++;
        }
    }
}
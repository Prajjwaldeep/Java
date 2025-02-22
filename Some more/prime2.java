import java.io.*;
class prime2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int j=2;
        int result=0;
        while(j<=n/2)
        {
            if(n%j==0)
            {
                result=1;
            }
            j++;
        }
        if(result==1)
        {
            System.out.println("Number: "+n+" is not prime number");
        }
        else
        {
            System.out.println("Number: "+n+" is prime number");
        }
    }
}
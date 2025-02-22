import java.io.*;
class factors
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to find its factors");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Factors of "+n+" are:[excluding "+n+" ]");
        int a;
        for(a=1;a<n;a++)
        {
            if(n%a==0)
            {
                System.out.println(a);
            }
        }
        int b=a/10;
        int c=a%10;
        int d=b+c;
        if(d==n)
        {
            System.out.println("Yes it is a perfect number");
        }
        else
        {
            System.out.println("Yes it is not a perfect number");
        }
    }
}
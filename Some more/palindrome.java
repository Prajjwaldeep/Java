import java.io.*;
class palindrome
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number from 100 to 999 to check whether it is a palindorme number or not");
        int n=Integer.parseInt(br.readLine());
        int a,b;
        a=n/10;
        b=n%10;
        if((n/10==a)&&(n%10==b)||(n/100==a)&&(n%100==b)||(n/1000==a)&&(n%1000==b))
        {
            System.out.println("Yes! it is a palindrome number");
        }
        else
        {
            System.out.println("No! it is not a palindrome number");
        }
    }
}
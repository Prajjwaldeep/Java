import java.io.*;
class buzz
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        if((n%10==7)||(n%7==0))
        {
            System.out.println("Oh! The number you have entered is a buzz number");
        }
        else
        {
             System.out.println("Oh! The number you have entered is not a buzz number");
        }
    }
}
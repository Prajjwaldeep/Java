import java.io.*;
class magic_number
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a two digit number to check whether it is a magic number or not");
        int n=Integer.parseInt(br.readLine());
        int a,b,c,g,h,i;
        a=n/10;
        b=n%10;
        c=a+b;
        g=c/10;
        h=c%10;
        i=g+h;
        if(i==1)
        {
            System.out.println("It is a magic number");
        }
        else if(i!=1)
        {
            System.out.println("It is not a magic number");
        }
       else if(i>=100)
        {
            System.out.println("Please enter number between 1 and 100");
        }
    }
}
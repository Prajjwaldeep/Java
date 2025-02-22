import java.io.*;
class my_armstrong
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please only enter three digit number to check whether it is an armstrong number or not");
        int a=Integer.parseInt(br.readLine());
        int b,c,d,s,r,t;
        b=a/100;
        c=a/10;
        s=c%10;
        d=a%10;
        r=b+s+d;
        t=(b*b*b)+(s*s*s)+(d*d*d);
        if(a==t)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }
    }
}
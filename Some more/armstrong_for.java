import java.io.*;
class armstrong_for
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to find it is an armstrong number or not");
        int n=Integer.parseInt(br.readLine());
        int d,dup,sum=0;
        for(dup=n;n>0;n/=10)
        {
            d=n%10;
            sum=sum+d*d*d;
        }
        if(sum==dup)
        {
            System.out.println("Oh!You have entered "+dup+". It is an armstrong number");
        }
        else
        {
            System.out.println("Oh!You have entered "+dup+". It is not an armstrong number");
        }
    }
}
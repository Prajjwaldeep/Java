import java.io.*;
class days
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of days");
        int n=Integer.parseInt(br.readLine());
        int a,b,c,d;
        a=n/365;
        b=n%365;
        c=b/30;
        d=b%30;
        System.out.println("You have entered= "+n+" days");
        System.out.println("                            After Converting");
        System.out.println("Number of years= "+a+" yrs");
        System.out.println("Number of months= "+c+" months");
        System.out.println("Number of days "+d+" days");
    }
}
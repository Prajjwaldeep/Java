import java.io.*;
class time
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter time in seconds");
        int n=Integer.parseInt(br.readLine());
        int a,b,c,d;
        a=n/3600;
        b=n%3600;
        c=b/60;
        d=b%60;
        System.out.println("You have entered "+n+" sec");
        System.out.println("                            After Converting");
        System.out.println("Time in hours= "+a+" hrs");
        System.out.println("Time in minutes= "+c+" mins");
        System.out.println("Time in seconds= "+d+" sec");
    }
}
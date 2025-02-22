import java.io.*;
class math_min_max
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any two numbers to find the smallest number among them");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Math.min(a,b);
        System.out.println("Smallest number is: "+c);
        int d=Math.max(a,b);
        System.out.println("Largest number is: "+d);
    }
}
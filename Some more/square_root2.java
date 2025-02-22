import java.io.*;
class square_root2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Remember you are finding the square root of the number you ahve entered");
        System.out.println();
        System.out.print("Enter a number:");
        double n=Integer.parseInt(br.readLine());
        double a;
        a=Math.sqrt(n);
        System.out.println("Square root of "+n+" = "+a);
    }
}
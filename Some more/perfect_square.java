import java.io.*;
class perfect_square
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two numbers");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int sqrt=(int)
        Math.sqrt(a);
        Math.sqrt(b);
        if((sqrt*sqrt==a)&&(sqrt*sqrt==b))
        {
            System.out.println("They are perfect square");
        }
        else
        {
            System.out.println("They are not perfect square");
        }
    }
}
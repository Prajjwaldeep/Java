import java.io.*;
class switch_angles
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type 1 to check it is Complementary angles");
        System.out.println("Type 2 to check it is Suplementary angles");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1:
            if(a+b+c==90)
            {
                System.out.println("Yes they are Complementary angles");
            }
            else
            {
                System.out.println("No they are not Complementary angles");
            }
            System.out.println("Your Cohice: "+n);
            break;
            case 2:
            if(a+b+c==180)
            {
                System.out.println("Yes they are Suplementary angles");
            }
            else
            {
                System.out.println("Not they are not Suplementary angles");
            }
        }
    }
}
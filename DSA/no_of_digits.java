import java.util.Scanner;
public class no_of_digits
{
    public static int count(int x)
    {
        int c=0;
        if(x==0)
        {
            return c;
        }
        else
        {
            c++;
            return c+count(x/10);
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        System.out.println(count(n));
    }
}
import java.util.Scanner;
public class function_over
{
    public static int sum(int x, int y)
    {
        int z;
        z=x+y;
        return(z);
    }
    public static double sum(int x, double y)
    {
        double z;
        z=x+y;
        return(z);
    }
    public static double sum(double x, int y)
    {
        double z;
        z=x+y;
        return(z);
    }
    public static double sum(double x, double y)
    {
        double z;
        z=x+y;
        return(z);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double a,b,plus;
        System.out.println("Enter two values respectively : ");
        a=in.nextDouble();
        b=in.nextDouble();
        plus=sum(a,b);
        System.out.println("Additional value is "+plus);
    }
}
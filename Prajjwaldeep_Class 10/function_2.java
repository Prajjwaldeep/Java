import java.util.Scanner;
public class function_2
{
    
    public static int sum(int x, int y)
    {
        int z;
        z=x+y;
        return(z);
    }
    public static int sub(int x, int y)
    {
        int z;
        if(x>y)
        z=x-y;
        else
        z=y-x;
        return(z);
    }
    public static int multiply(int x,int y)
    {
       int z;
       z=x*y;
       return(z);
    }
    public static double division(int x, int y)
    {
        double z;
        if(x>y)
        z=x/y;
        else
        z=y/x;
        return(z);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,plus,minus,mul;
        double div;
        System.out.println("Enter two values respectively : ");
        a=in.nextInt();
        b=in.nextInt();
        plus=sum(a,b);
        minus=sub(a,b);
        mul=multiply(a,b);
        div=division(a,b);
        System.out.println("Additional value is "+plus);
        System.out.println("Substractional value is "+minus);
        System.out.println("Multiplicational value is "+mul);
        System.out.println("Divisional value is "+div);
    }
}
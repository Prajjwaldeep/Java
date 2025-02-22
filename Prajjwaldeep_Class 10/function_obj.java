import java.util.Scanner;
public class function_obj
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
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,plus,minus;
        System.out.println("Enter two values respectively : ");
        a=in.nextInt();
        b=in.nextInt();
        function_obj ob=new function_obj();
        plus=ob.sum(a,b);
        minus=sub(a,b);
        System.out.println("Additional value is "+plus+" and substractional value is "+minus);
    }
}
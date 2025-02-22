import java.util.Scanner;
public class function
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
        plus=sum(a,b);
        minus=sub(a,b);
        System.out.println("Additional value is "+plus+" substractional value is "+minus);
    }
}
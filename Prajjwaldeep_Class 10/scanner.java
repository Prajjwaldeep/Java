import java.util.Scanner;
class scanner
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Enter the first number");
        a=in.nextInt();
        
        System.out.println("Enter the second number");
        b=in.nextInt();
        
        c=a+b;
        
        System.out.println("Addition of two number is "+c);
    }
}

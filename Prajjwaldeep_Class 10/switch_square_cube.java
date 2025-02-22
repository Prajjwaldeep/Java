import java.util.Scanner;
class switch_square_cube
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,c,square,cube;
        System.out.println("Input the number");
        a=in.nextInt();
        System.out.println("Input 1 for its square and 2 for its cube");
        c=in.nextInt();
        switch (c)
        {
        case 1:
        square=a*a;
        System.out.println("Square of two number is "+square);
        break;
        case 2:
        cube=a*a*a;
        System.out.println("Cube of two number is "+cube);
        break;
        
        default:
        System.out.println("Wrong choice");
        break;
    }
}
}
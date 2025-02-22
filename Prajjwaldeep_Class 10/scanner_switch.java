import java.util.Scanner;
class scanner_switch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b, ch;
        double sum,mul,sub,div;
        
        System.out.println("Enter the first number");
        a=in.nextInt();
        
        System.out.println("Enter the second number");
        b=in.nextInt();
        
        System.out.println("Press 1 for addition,2 for multiplication, 3 for substraction,4 for division");
        ch=in.nextInt();
        switch(ch)
        
        {
        case 1:
        sum=a+b;
        System.out.println("Sum of two number is "+sum);
        break ;
        
        case 2:
        mul= a*b;
        System.out.println("Multiplication of two number is "+mul);
        break ;
        
        case 3:
        if (a>b)
        sub= a-b;
        else
        sub=b-a;
        System.out.println("Substraction of two number is "+sub);
        break;
        
        case 4:
        if (a>b)
        div = a/b;
        else
        div=b/a;
        System.out.println("division of two number is "+div);
        break;
        
        default:
        System.out.println("Wrong choice ");
        
    }
}
}

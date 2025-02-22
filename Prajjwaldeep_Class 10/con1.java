import java.util.Scanner;
public class con1
{
    int unit,amount,x;
    con1(int x)
    {
        unit=x;
    }
    void calculate()
    {
        amount=unit*10;
    }
    void display()
    {
        System.out.println("Your bill is "+amount);
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x;
        System.out.println("Input your elctric consumption unit: ");
        x=in.nextInt();
        con1 sc=new con1(x);
        sc.calculate();
        sc.display();
    }
}

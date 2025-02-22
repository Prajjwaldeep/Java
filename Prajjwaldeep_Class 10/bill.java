import java.util.Scanner;
public class bill
{
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
import java.util.Scanner;
public class ElectricBill
{
    String n;
    int units;
    double bill;
    ElectricBill()
    {
        n="";
        units=0;
        bill=0.0;
    }
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name and number of units consumed : ");
        n=in.nextLine();
        units=in.nextInt();
    }
    void calculate()
    {
        if (units<=100)
        bill=units*2;
        else if (100<units && units<=300)
        bill=units*3;
        else if (300<units)
        bill=units*5;
        bill=bill+(2.5*units)/100;
    }
    void print()
    {
        System.out.println("Name of the customer : "+n);
        System.out.println("Number of units consumed : "+units);
        System.out.println("Bill amount : "+bill);
    }
    public static void main(String args[])
    {
        ElectricBill ob=new ElectricBill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
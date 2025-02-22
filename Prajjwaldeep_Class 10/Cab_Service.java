import java.util.Scanner;
public class Cab_Service
{
    int taxino;
    String name;
    int d;
    int amt;
    Scanner in=new Scanner(System.in);
    Cab_Service()
    {
        taxino=0;
        name=" ";
        d=0;
        amt=0;
    }
    void Input()
    {
        System.out.println("Input taxino, name and d : ");
        taxino=in.nextInt();
        name=in.next();
        d=in.nextInt();
    }
    void Calculate()
    {
        if(d<=1)
        amt=25;
        if (d>1 && d<=5)
        amt=30;
        if (d>5 && d<=10)
        amt=35;
        if (d>10 && d<=20)
        amt=40;
        if (d<=25)
        amt=45;
    }
    void Display()
    {
        System.out.println("Taxi no.      Name      Distance     Amount ");
        System.out.println(taxino+"       "+name);
        System.out.println("Distant is : "+d);
        System.out.println("\"Amount\" is : "+amt);
    }
    public static void main(String args[])
    {
        Cab_Service ob=new Cab_Service();
        ob.Input();
        ob.Calculate();
        ob.Display();
    }
}
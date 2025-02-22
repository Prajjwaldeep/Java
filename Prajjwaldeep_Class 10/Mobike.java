import java.util.Scanner;
public class Mobike
{
    String bno;
    long phno;
    String name;
    int days;
    int charge;
    Scanner in=new Scanner(System.in);
    Mobike()
    {
        bno=" ";
        phno=0;
        name=" ";
        days=0;
        charge=0;
    }
    void input()
    {
        System.out.println("Enter bike number, phone number, name and days : ");
        bno=in.next();
        phno=in.nextLong();
        name=in.next();
        days=in.nextInt();
    }
    void calculate()
    {
        if (days<=5)
        charge=500;
        else if (days>5 && days<=10)
        charge=400;
        else if (days>10)
        charge=200;
    }
    void display()
    {
        System.out.println("Bike number is : "+bno);
        System.out.println("Phone number is : "+phno);
        System.out.println("Name is : "+name);
        System.out.println("No of days is : "+days);
        System.out.println("Charge : "+charge);
    }
    public static void main(String args[])
    {
        Mobike ob=new Mobike();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
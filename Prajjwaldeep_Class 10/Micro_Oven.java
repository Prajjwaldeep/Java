import java.util.Scanner;
public class Micro_Oven
{
    String name;
    String model;
    int price;
    String size;
    String data;
    int discount;
    int amt;
    Scanner in=new Scanner(System.in);
    Micro_Oven()
    {
        name=" ";
        model=" ";
        price=0;
        size=" ";
        data=" ";
        discount=0;
    }
    void get()
    {
        System.out.println("Enter name, model, price, size and data : ");
        name=in.next();
        model=in.next();
        price=in.nextInt();
        size=in.next();
        data=in.next();
    }
    void cal()
    {
        {
            if (price>10000)
        discount=5*price/100;
        else
        discount=0;
    }
    amt=price-discount;
    }
    void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Model is : "+model);
        System.out.println("Price is : "+price);
        System.out.println("Size is : "+size);
        System.out.println("Data is : "+data);
        System.out.println("Discount is : "+discount);
        System.out.println("Amount paid is : "+amt);
    }
    public static void main(String args[])
    {
        Micro_Oven ob=new Micro_Oven();
        ob.get();
        ob.cal();
        ob.display();
    }
}
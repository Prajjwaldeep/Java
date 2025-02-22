import java.util.Scanner;
public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    Scanner in=new Scanner(System.in);
    FruitJuice()
    {
        product_code=0;
        flavour=" ";
        pack_type=" ";
        pack_size=0;
        product_price=0;
    }
    void input()
    {
        System.out.println("Enter the product code, flavour, pack type, pack_size and product price : ");
        product_code=in.nextInt();
        flavour=in.next();
        pack_type=in.next();
        pack_size=in.nextInt();
        product_price=in.nextInt();
    }
    void discount()
    {
        product_price=product_price-10;
    }
    void display()
    {
        System.out.println("Product code is : "+product_code);
        System.out.println("Flavour is : "+flavour);
        System.out.println("Pack type : "+pack_type);
        System.out.println("Pack_size : "+pack_size);
        System.out.println("Product price : "+product_price);
    }
    public static void main(String args[])
    {
        FruitJuice ob=new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}
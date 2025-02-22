import java.util.Scanner;
public class Cuboid
{
    int l;
    int b;
    int h;
    int volume;
    int surface_area;
    double diagonal;
    Scanner in=new Scanner(System.in);
    Cuboid()
    {
        l=0;
        b=0;
        h=0;
        volume=0;
        surface_area=0;
        diagonal=0.0;
    }
    void input()
    {
        System.out.println("Enter length, breath and height : ");
        l=in.nextInt();
        b=in.nextInt();
        h=in.nextInt();
    }
    void calculate()
    {
        volume=l*b*h;
        surface_area=2*((l*b)+(b*h)+(l*h));
        diagonal=Math.sqrt(((l*l)+(b*b)+(h*h)));
    }
    void display()
    {
        System.out.println("Volume is : "+volume);
        System.out.println("Surface area is : "+surface_area);
        System.out.println("Diagonal : "+diagonal);
    }
    public static void main(String args[])
    {
        Cuboid ob=new Cuboid();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
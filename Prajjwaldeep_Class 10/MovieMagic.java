import java.util.Scanner;
public class MovieMagic
{
    int year;
    String title;
    float rating;
    Scanner in=new Scanner(System.in);
    MovieMagic()
    {
        year=0;
        title=" ";
        rating=0.0F;
    }
    void accept()
    {
        System.out.println("Input the year, title and rating : ");
        year=in.nextInt();
        title=in.next();
        rating=in.nextFloat();
    }
    void display()
    {
        if (rating<=2.0)
        System.out.println("Flop");
        if (rating>=2.1 && rating<=3.4)
        System.out.println("Semi-Hit");
        if (rating>=3.5 && rating<=4.5)
        System.out.println("Hit");
        if (rating>=4.6 && rating<=5.0)
        System.out.println("Super Hit");
    }
    public static void main(String args[])
    {
        MovieMagic ob=new MovieMagic();
        ob.accept();
        ob.display();
    }
}
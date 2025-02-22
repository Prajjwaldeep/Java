// to calculate the mid point between any two given points 
import java.util.*;
public class Point // invoking the class name
{
    Scanner in=new Scanner(System.in);// declaration of scanner class
    int x,y;
    Point()// constructor to initialize x=0 and y=0
    {
        x=0;
        y=0;
    }
    void readPoint()// accepts the coordinate x and y
    {
        System.out.println("Enter the x coordinate");
        x=in.nextInt();
        System.out.println("Enter the y coordinate");
        y=in.nextInt();
    }
    Point midPoint(Point a, Point b)// calculates and returns the midpoint of two point a and b
    {
        Point xy=new Point();
        xy.x=(a.x+b.x)/2;
        xy.y=(a.y+b.y)/2;
        return(xy);
    }
    void display()// displays the coordinate of a point
    {
        System.out.println("The x coordinate is="+x);
        System.out.println("The y coordinate is="+y);
    }
    public static void main(String[]args)// invoking the main method
    {
        Scanner in=new Scanner(System.in);
        Point ob=new Point();// object creation
        Point a=new Point();
        Point b=new Point();
        System.out.println("Enter the 1st point");
        a.readPoint();// accepting data for the first coordinate
        System.out.println("Enter the 2nd point");
        b.readPoint();// accepting data for the second coordinate
        ob=ob.midPoint(a,b);
        ob.display();
    }
}

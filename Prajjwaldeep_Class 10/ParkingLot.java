import java.util.Scanner;
public class ParkingLot
{
    int vno;
    int hours;
    double bill;
    Scanner in=new Scanner(System.in);
    ParkingLot()
    {
        vno=0;
        hours=0;
        bill=0.0;
    }
    void input()
    {
        System.out.println("Enter vehical number and hours : ");
        vno=in.nextInt();
        hours=in.nextInt();
    }
    void calculate()
    {
        if(hours<=1)
        bill=3;
        else if(hours>1)
        bill=3+1.5*(hours-1);
    }
    void display()
    {
        System.out.println("Vehical number "+"\t\t"+"Hours of parking"+"\t\t"+"Bill");
        System.out.println(vno+"\t\t\t"+hours+"\t\t\t\t"+bill);
        
    }
    public static void main(String args[])
    {
        ParkingLot ob=new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
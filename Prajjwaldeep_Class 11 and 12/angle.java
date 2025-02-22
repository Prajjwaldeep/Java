/**
 * A sample program to accept two angles in degrees and minutes and find the resulting sum of the angles
 */import java.util.*;
class angle//declaration of class angle
{
    int deg;//stores degree
    int min;//stores minutes
    int sum1,sum2=0,n;
    angle()//constructor to intialise the variables
    {
        int deg=0;
        int min=0;
    }
    void inputangle()//method to accept the value of degree and minutes
    {
       Scanner in=new Scanner(System.in);//declaration of scanner class
       System.out.println("ENTER THE VALUE OF  DEG AND MIN");
       deg=in.nextInt();//accpting degree
       min=in.nextInt();//accepting minutes
    }
    void display(angle ob1,angle ob2)
    {
        /*calculating the sum of the two values of degrees and minutes by declaring objects of class angle*/
        sum1=ob1.deg+ob2.deg;//calculating sum of degrees
        sum2=ob1.min+ob2.min;//calculating sum of minutes
        while(sum2>60)
        {
            n=sum2-60;
            sum1=sum1+1;
            sum2=n;
        }
        System.out.println("THE SUM IS:"+sum1+"Degree"+" "+sum2+"Minutes");//displaying the final sum
    }
     public static void main(String args[])//declaration of main method
    {
        angle ob=new angle();//creating object of class angle
        angle ob1=new angle();//creating object of class angle
        angle ob2=new angle();//creating object of class angle
        ob1.inputangle();//accepting angles as input
        ob2.inputangle();//accepting angles as input
        ob.display(ob1,ob2);//displaying the final sum
    }//end of main method
}//end of class
    
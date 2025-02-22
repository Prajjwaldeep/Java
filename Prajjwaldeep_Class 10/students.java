import java.util.*;
public class students
{
    String name;
    int age;
    int m1;
    int m2;
    int m3;
    int maximum;
    double average;
    students()
    {
        name="";
        m1=0;
        m2=0;
        m3=0;
    }
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name and marks of three subjects : ");
        name=in.nextLine();
        System.out.println("Enter your marks in three subjects respectively : ");
        m1=in.nextInt();
        m2=in.nextInt();
        m3=in.nextInt();
    }
    void compute()
    {
        {
            if (m1>m2 && m1>m3)
            maximum=m1;
            else if (m2>m1 && m2>m3)
            maximum=m2;
            else if (m3>m2 && m3>m1)
            maximum=m3;
            else if (m1==m2 && m2==m3)
            maximum=m1;
        }
        average=(m1+m2+m3)/3;
    }
    void display()
    {
        System.out.println("Maximum marks obtained : "+maximum);
        System.out.println("Average of three subjects : "+average);
    }
    public static void main(String args[])
    {
        students ob=new students();
        ob.input();
        ob.compute();
        ob.display();
    }
}
import java.util.Scanner;
public class Employee
{
    String name;
    String empno;
    int basic;
    int da;
    int hra;
    int gross;
    int tax;
    int annual_salary;
    Scanner in=new Scanner(System.in);
    Employee()
    {
        name=" ";
        empno=" ";
        basic=0;
        annual_salary=0;
    }
    void input()
    {
        System.out.println("Enter name, empno(Designation) and basic : ");
        name=in.next();
        empno=in.next();
        basic=in.nextInt();
    }
    void calculate()
    {
        da=30*basic/100;
        hra=15*basic/100;
        gross=basic+da+hra;
        annual_salary=12*gross;
    }
    void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Details of employee : "+empno);
        System.out.println("Da : "+da);
        System.out.println("Hra : "+hra);
        System.out.println("Gross : "+gross);
        System.out.println("Annual salary : "+annual_salary);
        if (annual_salary>180000)
        System.out.println("Income Tax to be paid");
        else
        System.out.println("No Income Tax");
    }
    public static void main(String args[])
    {
        Employee ob=new Employee();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
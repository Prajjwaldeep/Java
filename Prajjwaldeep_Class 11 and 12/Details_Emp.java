// A program to display employee's details using the process of inheritance.
import java.io.*;
import java.util.*;
class Details_Emp
{
    static String name; // Employee's name
    static String ft_nm; // Father's name
    static String dob; // Date of birth
    static long contact; // Phone number
    Details_Emp(String nm, String f, String db, long ph)
    {
        name=nm;
        ft_nm=f;
        dob=db;
        contact=ph;
    }
    void display() // Method to display personal details
    {
        System.out.println("Employee's name : "+name);
        System.out.println("Father's name : "+ft_nm);
        System.out.println("Date of birth : "+dob);
        System.out.println("Contact (Phone) : "+contact);
    }
}
class ID_Proof extends Details_Emp
{
    String Pan; // Pan Number
    String Adh; // Aadhar Number
    String add; // Adress of the employee
    long acc; // Account number
    int basic_pay; // Salary
    ID_Proof(String a, String b, String c, long d)
    {
        // Paramrterized constructor to iniialise dta members
        super(a,b,c,d);
        // Initilising the base class members
    }
    public void enter(String p, String ad, long ac, int py)
    {
        /* Method to input ID proof details
         * Parameterized constructor to initialise data members
         */
        Pan=p;
        Adh=ad;
        acc=ac;
        basic_pay=py;
    }
    public void display()
    {
        // Displaying ID details
        super.display();
        System.out.println("PAN Number : "+Pan);
        System.out.println("Aadhar Number : "+Adh);
        System.out.println("Account Number : "+acc);
        System.out.println("Monthly Salary : "+basic_pay);
    }
}
class Retire extends ID_Proof
{
    // Inherting class ID_Proof
    static int yrs; // Duration of service
    static double pf; // Provident fund
    static double grat; // Gratuity amount
    Retire(String a, String b, String c, long d, String p, String ad, long ac, int py, int y)
    {
        // Parameterized constructor to initialise data members
        super(a,b,c,d);
        super.enter(p,ad,ac,py);
        yrs=y;
    }
    public void provident()
    {
        // Calculating gratuity value
        pf=(2/100)*basic_pay*yrs;
    }
    public void gratuity()
    {
        // Calculating gratuity value
        if (yrs>=10)
        grat=12*basic_pay;
        else
        grat=0.0;
    }
    public void display()
    {
        // Displaying details
        super.display();
        System.out.println("Duration of service : "+yrs+" years.");
        System.out.println("Provident fund amount : "+pf);
        System.out.println("Gratuity amount : "+grat);
    }
    public static void main(String args[])throws IOException
    {
        // Defining main methord
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        /* Creating object 'in' to input data members
         * Entering details from the user
         */
        System.out.println("Enter personal details.");
        System.out.println("Enter Employee's name : ");
        String n=in.readLine();
        System.out.println("Enter Father's name : ");
        String f=in.readLine();
        System.out.println("Enter date of birth : ");
        String db=in.readLine();
        System.out.println("Enter contact number : ");
        long nm=Long.parseLong(in.readLine());
        System.out.println("Enter ID details : ");
        System.out.println("Enter PAN Number : ");
        String pn=in.readLine();
        System.out.println("Enter Aadhar Number : ");
        String ad=in.readLine();
        System.out.println("Enter account number : ");
        long ac=Long.parseLong(in.readLine());
        System.out.println("Enter the monthly salary amount : ");
        int bp=Integer.parseInt(in.readLine());
        System.out.println("Enter the duration of service : ");
        int y=Integer.parseInt(in.readLine());
        // Creating object to invoke methords
        Retire ob=new Retire(n,f,db,nm,pn,ad,ac,bp,y);
        ob.provident();
        ob.gratuity();
        ob.display();
    } // End of main method
} // End of class
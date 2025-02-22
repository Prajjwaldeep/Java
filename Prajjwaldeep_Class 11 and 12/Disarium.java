import java.util.*;
public class Disarium
{
    int num;
    int size;
    static Scanner in=new Scanner(System.in);
    Disarium(int nn) // function named as Disarium
    {
        num=nn; // the value of num is assigned as the value of nn
        size=0; // the value of size is assigned as 0
    }
    void countDigits() // function to count digit
    {
        int a=num; // the value of a is assigned as num
        while (a!=0) // when a is not equal to 0
        {
            a=a/10; // a is equal to a divided by 10
            size++; // size increments
        }
    }
    int sumofDigits(int n,int p) // function for sum of the digit
    {
        return(n==0)?0:sumofDigits(n/10,p-1)+(int)Math.pow(n%10,p);
    }
    void check() // function to check if the number is a disarium number
    {
        if(num==sumofDigits(num,size)) // if the number is a disarium number
        System.out.print("\n Disarium Number"); // print message as Disarium Number
        else // if the number is not a disarium number
        System.out.print("\n Not a Disarium Number"); // print message as not a Disarium Number
    }
    static void main()
    {
        System.out.println("Input a number : ");
        int m=in.nextInt(); // user input
        Disarium ob=new Disarium(m); // creating object
        ob.countDigits(); // assigning the object in the function countDigits
        ob.check(); // assigning the object in the function check
    }
}
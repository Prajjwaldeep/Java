/* A program to check whether a given input is a happy number or not.
 * A happy number is a number in which the eventual sum of the square of the digit of the number is 1.
 */
import java.util.*;
public class Happynumber
{
    int n;
    Happynumber() // Constructor to assign 0 to n
    {
        n=0;
    }
    void readnum(int x) // to assign the parameter value to n
    {
        n=x;
    }
    int sum_square_digit(int x) // return sum of the square of the digits of a number x, using recursive technique
    {
        int q,r;
        q=x%10;
        r=x/10;
        if (x!=0) // When the number isn't zero
        return ((q*q)+sum_square_digit(r)); // returns the square of the variable q multiplied with r in recursion
        else
        return 0; // if the above condition is not satisfied, 0 will be return
    }
    void ishappy() // to check if the given number is a happy number by using the function sum_square_digit() and display an appropiate message
    {
        int p;
        p=sum_square_digit(n); // calling the function sum_square_digit for the variable n
        while (p>9) // when p is grater than 0
        {
            p=sum_square_digit(p); // applying the function sum_square_digit for the variable p itself
        }
        if (p==1) // if p returns the value 1
        System.out.println("Input is a happy number"); // Display message for the user
        else // // if p does not return the value 1
        System.out.println("Input is not a happy number"); // Display an alternate message for the user
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Scanner class to read inputs
        int z;
        System.out.print("Enter the number : ");
        z=in.nextInt(); // Taking user input
        Happynumber ob=new Happynumber(); // Creating object
        ob.readnum(z);
        ob.ishappy();
    }
}
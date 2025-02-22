// A program to check weather a number is a positive palindrome or not.
import java.util.*;
public class Palin
{
    int num; // user input
    int revnum; // store the reverse value
    public Palin() // constructor to initilize data members with legal initial values to accept the number
    {
        num=0;// initialization of the variable 'num'
        revnum=0; // initialization of the variable 'revnum'
    }
    void accept() // to accept the user input
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=in.nextInt();
    }
    int reverse(int y) // reverse the parameterized  arguments 'y' and stores it in 'revnum' using recursive technique
    {
        // recursive methord
        if (y==0) // when the value of y is '0'
        {
            return (revnum); // the initial value of revnum is returned
        }
        else // when the value of y is any integer except '0'
        {
            revnum=revnum*10+y%10; // the value of revnum is defined as the initial value multiplied with 10 added with 10 modolous of y
            return (reverse(y/10)); // return the reverse value for 'y/10'
        }
    }
    void check() // Check weather a number is a palindrome by invoking the function reverse() and display the results with appropiate message
    {
        if (reverse(num)==num) //when both the values are same
        {
            System.out.println("Palindrome"); // display the message 'palindrome'
        }
        else // when both tthe values are different
        {
            System.out.println("Not a palindrome"); // dispkay the message not a palindrome
        }
    }
    public static void main(String args[])
    {
        Palin ob=new Palin(); // Creating object
        ob.accept(); // passing the value
        ob.check(); // passing the value
    }
}
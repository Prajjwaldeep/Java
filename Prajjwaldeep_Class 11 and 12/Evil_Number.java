/* a program to accept a positive whole number ‘N’ where N>2 and N<100.
 * Find the binary equivalent of the number and count the number of 1s in it and display whether it is an Evil number or not with an appropriate message. 
 */
import java.util.*;
public class Evil_Number
{
    public static void main(String[] args) 
    {
        int n,count=0,a;
        String x ="";
        Scanner in=new Scanner(System.in); // Invoking scanner class
        System.out.print("Enter the number : "); // Asking for user input
        n=in.nextInt(); // Accepting input from the user
        if (n<2 || n>100)
        { // Check if the input is within the given range or not
            System.out.println("NUMBER OUT OF RANGE"); // If the number is not within given range, print appropriate mesage
        }
        else
        { // When the number is in range
            while(n>0) // when the value of n is greater than 0
            {
                a=n%2; // the value of n modulo 2 is assigned in the variable a
                if(a==1) // When the value of 'a' is 1
                {
                    count++; // count vsriable increments
                }
                x=x+""+a;
                n=n/2;
            }
            System.out.println("BINARY EQUIVALENT : "+x); // Printing the binary equivalent
            if (count%2==0) // If the value assigned in the variable 'count' is divisible by 2
            {
                System.out.println("EVIL NUMBER"); // Display the message
            }
            else // If the value assigned in the variable 'count' is not divisible by 2
            {
                System.out.println("NOT AN EVIL NUMBER"); // Display message
            }
        }
    }
}
/* A program to check whether a number is a magic number or not.
 * A magic number is a number in which the eventual sum of the digits of the number is equal to 1.
 */
import java.util.*;
public class MagicNumber
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in); // Scanner class for user input.
        System.out.println("Enter the number:"); // Displaying message to accept input from the user.
        int n=ob.nextInt(); // Accepting the input
        int sum=0,num=n;
        while(num>9)
        { // While loop which iterates until 'num' is less than 9.
            sum=num; // Assigning the value of 'num' in 'sum' variable.
            int s=0;
            while(sum!=0)
            { // When the value of sum is not equal to zero, the following occurance takes place.
                s=s+(sum%10);
                sum=sum/10;
            }
            num=s;
        }
        if(num==1) // If the value of 'num' is equal to 1
        {
            System.out.println(n+" is a Magic Number."); // Display the message.
        }
        else // If the above condition is not satisfied
        {
            // Display message.
            System.out.println(n+" is not a Magic Number.");
        }
    }
}
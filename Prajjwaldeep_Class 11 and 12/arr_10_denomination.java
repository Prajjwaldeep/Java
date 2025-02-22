/* A program to accept the amount from the user and display the break-up in descending
 * order of denomination with the bank are of rupees 1000, 500, 100, 50, 20, 10, 5, 2, 1
 */
import java.util.Scanner;
public class arr_10_denomination
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking scanner class
        long arr[]={1000,500,100,50,20,10,5,2,1}; // Declaring array and assigning the variables in that array
        long amt,n;
        int a;
        System.out.println("Input the amount : "); // Displaying message to accept i nput from the user
        amt=in.nextLong(); // Accepting user input
        for (a=0; a<9; a++)
        {
            // Taking a variable a which iterates from 0 to 9
            n=amt/arr[a]; // Assigning the number of rupee(s) found for a particular amount
            if(n!=0)
            // When n is not equal to zero
            System.out.println("The number of "+arr[a]+" rupee(s) is : "+n); // Display the message along with amount and the number of rupee(s)
            amt=amt%arr[a]; // The process continues until amount is divisable by the variable provided rupee(s)
        }
    }
}
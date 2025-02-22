// A program to convert a given decimal number to binary.
import java.util.Scanner;
public class Decimal_to_Binary
{
    public static void main(String[] args) 
    {
        int n, count=0,a;
        String x="";
        Scanner s=new Scanner(System.in); // Scanner class for user input.
        System.out.print("Enter any decimal number : "); // Displaying message to accept user input.
        n=s.nextInt(); // Accepting user input.
        while(n>0)
        { // While loop iterates until the value of 'n' is not equal to 0
            a=n%2;
            if(a==1)
            {
                /* When the value of 'a' is equal to 1,
                   count variable starts to increment */
                count++;
            }
            x=x+""+a; // Assiging the value of variable 'a' in variable 'x'.
            n=n/2;
        }
        System.out.println("Binary number : "+x); // Printing the binary value.
        System.out.println("No. of '1's : "+count); // Printing the number of '1' obtained.
    }
}
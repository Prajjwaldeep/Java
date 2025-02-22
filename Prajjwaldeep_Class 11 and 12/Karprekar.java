/* A program in Java to input a range and check for Kaprekar numbers.
 * A positive whole number ‘n’ that has ‘d’ number of digits is squared and split into two pieces, a right-hand piece that has ‘d’ digits and a left-hand piece that has remaining ‘d’ or ‘d-1’ digits.
 * If the sum of the two pieces is equal to the number, then ‘n’ is a Kaprekar number. The first few Kaprekar numbers are: 9, 45, 297 ……..
 */
import java.util.*;
public class Karprekar
{
    public static int number_of_digits(int x)
    {// Function to  find the number of digits
        int y=1;
        while (x!=0)
        {
            y=y*10;
            x=x/10;
        }
        return y;
    }
    public static boolean Karprekar(int x)
    {// Function to check for Karprekar number
        int r,s,s1,s2,sum=0,c=0;
        r=number_of_digits(x);
        s=(x*x);
        s1=s%r;
        s2=s/r;
        sum=s1+s2;
        if (sum==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking Scanner class
        int p,q,c=0;
        System.out.println("Enter the range (It is to be assumed that p<5000 and q<5000) : ");
        // Taking user input, the range to find the karprekar numbers.
        p=in.nextInt();
        q=in.nextInt();
        if (p<5000 && q<5000)
        { // As per instruction, the range should be both the limit must be greater than 5000
            int a;
            System.out.println("THE KAPREKAR NUMBERS ARE :-");
            for (a=p; a<=q; a++)
            {
                boolean r=Karprekar(a);
                if (r==true)
                {
                    c++;
                    System.out.println(a);// Print the Karprekar numbers
                }
            }
            System.out.println("FREQUENCY OF KAPREKAR NUMBER : "+c);
        }
        else
        {
            System.out.println("Number out of range"); // If the above condition is not satisfied, print message
        }
    }
}
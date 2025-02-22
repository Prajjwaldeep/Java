/* A program to check for fascinating number.
   A fascinating number is one whch when multiplied by 2 and 3, and then, 
   after the results are concatened with the original number, the new number contains
   all the duguts from 1 to 9 exactly once */
import java.util.*;
public class Fascinating_number
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking scanner class
        int n,n1,n2,a,l;
        System.out.print("Enter the nummber : "); // Asking input from user
        n=in.nextInt(); // Accepting the input
        // Multiplying the original number with 2 and 3
        n1=n*2;
        n2=n*3;
        String str="";
        char ch,i;
        boolean fascinating=true;
        str=str+n+n1+n2; // Concating the original number along with it's values when multiplied with 1 and 2
        System.out.println(str); // Displaying the concated value
        l=str.length(); // Obtaining the length
       for (i='1'; i<='9'; i++)
        {
            // Taking a loop which iterates from 1 to 9, where variable 'i' is character type
            int count=0;
            for (a=0; a<l; a++)
            {
                // Taking a loop which iterates from 0 to the value of the variable 'l'
                ch=str.charAt(a); // Taking out the characters from the string
                if (i==ch) // Checking if the characters assigned in 'i' are equal to ch
                {
                    count++; // If they are equal, the count value increments
                }
            }
            if (count>1)
            {
                // When the value of count is greater than 1
                fascinating=false; // Assiging the variable 'fascinating' as false
                break; // Applying break statement
            }
       }
       if (fascinating==true)
       {
           // If the value of 'fascinating' results in true, display appropriate message.
           System.out.println("It is a fascinating number");
        }
        else
        {
            // If the above condition is not satisfied, display appropriate message
            System.out.println("It is not a fascinating number");
        }
    }
}
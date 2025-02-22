/* A program to accept a plain text of length L,
 * where L must be greater than 3 and less than 100.
 
 * Encrypt the text if valid as per the Caesar Cipher. */
import java.util.*;
public class Caesar_Cipher
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking scanner class
        String str,nstr="";
        int l,a,x,y;
        char ch,ch1;
        System.out.print("Enter the string : "); // Asking for user input
        str=in.nextLine(); // Accepting input from the user
        l=str.length(); //  calculating the length of the string input
        if (l<=3 || l>=100)
        {// If the length is less than 3 or more than equal to 100
            System.out.println("Invalid length"); // Print message
        }
        else
        { // If the above condition is not satisfied
            for (a=0; a<l; a++)
            { // Loop which iterates from 0 and iterates until the length of the string
                ch=str.charAt(a); // the character at position 'a' will be assigned in the character ch
                if((ch>='A' && ch<'N') || (ch>='a' && ch<'n'))
                { // When the value of ch is between 'A' and 'N' or is between 'a' and 'n'
                    x=(int)ch; // Convert all characters to it's ASCII value and store it in integer x
                    y=x+13; // Add 13 with the value(s) assigned in x and store it in the variable y
                }
                else if ((ch>='N' && ch<='Z') || (ch>='n' && ch<='z'))
                { // When the value of ch is between 'N' and 'Z' or is between 'n' and 'z'
                    x=(int)ch; // Convert all characters to it's ASCII value and store it in integer x
                    y=x-13; // Add 13 with the value(s) assigned in x and store it in the variable y
                }
                else
                { // If none of the above condition satisfies
                    y=(int)ch; // Convert all characters to integer(explicit type conversion) and store in variable y
                }
                ch1=(char)y; // Convert all integer stored in variable y to characters(explicit type conversion) and store in variable ch1
                nstr=nstr+ch1; // Concat all the characters of ch1 with nstr variable
            }
            System.out.println(nstr); // Print the value as nstr
        }
    }
}
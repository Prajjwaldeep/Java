/*A program in Java to input a string and print its anagrams along with the total number of anagram obtained.
 * Anagrams are strings made up of all the characters present in the original strings by re-arranging the characters.
 */
import java.util.*;
public class Anagrams
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Invoking Scanner class
        int a,l,count=0;
        String str,nstr,temp;
        char ch;
        System.out.print("Enter the string : "); // Displaying message for user input
        // Taking user input
        str=in.next();
        temp=str; // Making a copy of user input in variable 'temp'
        l=str.length(); // Taking out the length of the string
        for (a=0; a<l; a++)
        { // Loop which starts from zero and iterates until the length of the string
            ch=str.charAt(0); // Taking out the character at zero position
            nstr=str.substring(1,l)+ch; // Bringing the first character at last by string iteration, every time the loop iterates
            if (temp!=(nstr)) // Until the value of temp variable is not equal to str
            {
                System.out.println(nstr); // print the values assigned in nstr
                count++; // Count number of times the loop iterates
            }
            str=nstr; // After the display, assigning the value of nstr in str variable
        }
        System.out.println("Total number of anagram(s) : "+count); // Print the number of times the loop itertares which is the number of anagram(s)
    }
}
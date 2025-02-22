// A program to count the number of double alphabets in java.
import java.util.*;
public class double_alpha
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Scanner class to accept input
        int a,l,count=0;
        String str;
        char ch,ch1;
        System.out.print("Enter the string: "); // Displaying message to accept input from user
        str=in.nextLine(); // Accepting the string
        str=str.toUpperCase(); // Converting the string to uppercase
        l=str.length(); // Caluculating the length of the string
        for(a=0; a<l; a++)
        {
            ch=str.charAt(a); // Taking out the character in'a' position.
            if (a==l-1) // When a becomes equal to 1 less than length
            break; // breaks.
            ch1=str.charAt(a+1); // The characters at 1 more than 'a' position is assigned in 'ch1'
            if (ch==ch1) // When the value(s) of ch becomes equal with ch1
            count++; // 'count' variable increments
        }
        System.out.println("Number of double alphabet : "+count); // Displaying the number of double alphabets
    }
}
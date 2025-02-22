/* A program to accept a sentence which may be terminated by either '.' or '?' only. The words are to be separated by a single blank space. 
 * Print an error message if the input does not terminate with '.' or '?'
 * You can assume that no word in the sentence exceeds 15 characters, so that you get a proper formatted output.
 * Perform the following tasks:
 * (i) Convert the first letter of each word to uppercase.
 * (ii) Find the number of vowels and consonants in each word and display them with proper headings along with the words. */
import java.util.*;
public class word_vowel_consonants
{
    public static void display(String w)
    {
        int v=0;
        int c=0;
        w=w.toUpperCase();
        for(int i=0; i <w.length(); i++)
        {
            char ch = w.charAt(i);
            switch(ch)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                v++;
                break;
                default:
                c++;
            }
        }
        System.out.println(w+"\t\t"+v+"\t\t"+"\t"+c);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // Declaring scanner class
        System.out.print("Enter the sentence : ");
        String s=in.nextLine(); // Accept user input
        s=s.trim();
        int len=s.length();
        char last=s.charAt(len-1);
        if(last != '.' && last != '?')
        {
            System.out.println("Invalid input."); // Check the last character upon which the termination of the program depends
            return;
        }
        String t=new String();
        for(int i=0; i<len; i++)
        { // For converting to Uppercase (the first letter of every word)
            char ch=s.charAt(i);
            if(i==0)
            t=t+Character.toUpperCase(ch);
            else if(ch==' ')
            {
                t =t+" "+Character.toUpperCase(s.charAt(i + 1));
                i++;
            }
            else
            {
                t=t+Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(t); // Printing the sentence which each word starting with uppercase
        System.out.println("Word\t\tVowels\t\tConsonants");
        // Print the frequency
        String word = new String();
        for(int i=0; i <len; i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ' || ch == '.' || ch == '?')
            {
                display(word);
                word = new String();
            }
            else
            word += ch;
        }
    }
}
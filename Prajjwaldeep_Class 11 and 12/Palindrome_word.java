import java.util.*;
public class Palindrome_word
{
    static boolean isPalindrome(String word) // function to check if palindrome
    {
        int i;
        for (i=0; i<word.length()/2; i++) // i increments from 0 and proceed until the half of word length.
        {
            if (word.charAt(i)!=word.charAt(word.length()-i-1)) // if character at i position is not equal to the character at, i and 1 substracted from word length.
            {
                return false; // return boolean value as false
            }
        }
        return true; // return true for other all default casses
    }
    static String getPalindromeForRepeatingLastCharacters(String word) // function to get palindrome for repeating last characters
    {
        String palindrome=word;
        char ch;
        int i=word.length()-1;
        while(i>=1 && word.charAt(i)==word.charAt(i-1)) // when becomes greater than 1 and word at character i becomes equal with the character at i-1
        {
            i--; // i decrements
        }
        i--; // the entire process iterates until the defined value of i
        while(i>=0) // when i is greater than equal to 0
        {
            palindrome=palindrome+word.charAt(i--); //the value of palindrome is assigned as the sum of palindrome itself and charcter at i decrementing position of the word
        }
        return palindrome; // return palindrome value
    }
    static String convertToPalindrome(String word) // function to convert into palindrome
    {
        if (word.charAt(word.length()-1)==word.charAt(word.length()-2)) // if character at 1 substracted from word length position i equal to the character at 2 substracted from word length.
        return getPalindromeForRepeatingLastCharacters(word); // invoking getPalindromeForRepeatingLastCharacters function and getting the return value for word
        String palindrome=word;
        int i=word.length()-2; // the value of i is assigned as 2 substracted from word length
        while (i>=0) // when i becomes greater than equal to 0
        palindrome=palindrome+word.charAt(i--); //the value of palindrome is assigned as the sum of palindrome itself and charcter at i decrementing position of the word
        return palindrome; // return the value assigned in palindrome
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String sentence;
        System.out.print("Enter the sentence : ");
        sentence=in.nextLine();
        char c=sentence.charAt(sentence.length()-1); // the value of c is assigned as character at 1 substracted from sentence length
        if (!(c=='.' || c=='?' || c=='!')) // terminating condition for c
        {
            System.out.println("Invalid Input"); // display the message
            return; // return the value
        }
        System.out.println(sentence); // print the sentence
        sentence=sentence.substring(0,(sentence.length()-1)); // the value of sentence is assigned as substring value of 0 and 1 substracted from the length of the previous value of the sentence
        String words[]=sentence.split(" ");
        for (String word : words)
        {
            if (isPalindrome(word)) // invoking is palindrome function and checking word is a palindrome or not
            System.out.print(word+" "); // if the above conditrion satisfies, print word
            else // if the above conditrion satisfies, invoking convertToPalindrome function and  print the value
            System.out.print(convertToPalindrome(word)+" "); // printing the value
        }
        System.out.println();
        in.close(); // closing the object
    }
}
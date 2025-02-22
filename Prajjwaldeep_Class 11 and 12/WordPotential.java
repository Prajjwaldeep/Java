/* A program to accept a sentence which is terminated by ".","?"or"!".
 * Each word of sentence which is seperated by a sngle space.
 * Decode the word as per their potential and arrange in ascending order
 */
import java.util.*;
public class WordPotential
{
    int findPotential(String s) // Function to find potential of a word
    {
        s=s.toUpperCase(); // Converting the value of s into uppercase
        int p=0,l=s.length(); // Assigning initial value such p=0 and l= =length of the string
        char ch;
        for(int i=0; i<l; i++) // for loop to find word potential
        {
            ch = s.charAt(i);
            p = p + (ch-64); // if ch = 'A', then 'A'-64 = ASCII value of 'A' - 64 = 65-64 = 1
        }
        return p; // return the value of p
    }
    // Function to sort the words in ascending order of their potential
    void sortPotential(String w[], int p[]) // Function to sort the potential 
    {
        int n=w.length,t1=0;
        String t2 = "";
        //Arranging the word potential in ascending order
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(p[i]>p[j])
                {
                    t1 = p[i];
                    p[i] = p[j];
                    p[j] = t1;
                    t2 = w[i];
                    w[i] = w[j];
                    w[j] = t2;
                }
            }
        }
        // Printing of the value
        printResult(w,p);
    }
    void printResult(String w[], int p[]) // Function to print the final result
    {
        int n = w.length;
        String ans = "";
        for(int i=0; i<n; i++)
        {
            ans=ans+" "+w[i];
        }
        ans = ans.trim();
        System.out.println("\nOutput\t\t :  \t"+ans); // Print message and value of ans variable
    }
    public static void main(String args[])
    {
        WordPotential ob=new WordPotential();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence : \t");
        String s=sc.nextLine();
        StringTokenizer str = new StringTokenizer(s," .,?!");
        int n = str.countTokens();
        String words[] = new String[n];
        int potential[] = new int[n];
        for(int i=0; i<n; i++)
        {
            words[i] = str.nextToken(); // Saving words one by one in an array
            potential[i] = ob.findPotential(words[i]); // Saving potential of every word
        }
        // Printing the words along with their potential
        System.out.print("\nPotential\t : \t");
        for(int i=0; i<n; i++)
        {
            System.out.println(words[i]+"\t= "+potential[i]);
            System.out.print("\t\t\t");
        }
        ob.sortPotential(words,potential);
    }
}
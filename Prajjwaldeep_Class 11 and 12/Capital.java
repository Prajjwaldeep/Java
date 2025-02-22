import java.util.*;
public class Capital
{
    String sent;
    int freq;
    Capital() // Constructor Capital to initilise the variables
    {
        sent="";
        freq=0;
    }
    void input() // Input block
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        sent=in.nextLine(); // Taking user input
    }
    boolean isCap(String w) // boolean to check if string starts with an uppercase 
    {
        char ch=w.charAt(0); // character in first position is assigned in the variable ch
        int c=(int)(ch); // Explicit conversion from character to integer assigned in variable c
        if (c>=65 && c<=90) // check if the variable c is in uppercase
        return true; // if the above condition is satisfied boolean returns true
        else // if the above condition is not satisfied
        return false; // returns a false value
    }
    void display()
    {
        System.out.println("The sentence is : "+sent); // displaying the sentence
        String str=" "+sent; // adding a space before the string
        int a,l=str.length(); // taking integer inputs, assigning the value in l variable
        char ch; 
        for (a=0; a<l; a++)
        {
            if (str.charAt(a)==' ') // if the character in a position is space
            {
                ch=str.charAt(a+1); // the next character after space is assigned in variable ch
                String temp=""; // taking string input temp
                temp=temp+ch; //charcater ch is added with temp variable
                if (isCap(temp)==true) // to call the function isCap() and check whether it returns true value or not
                freq++; // if the function is true, freq variable increments
                else // if the above condition is not satisfied
                freq=freq+0; // No increment of any variable.
            }
        }
        System.out.println("No of words beginning with capital letter : "+freq);
    }
    public static void main(String args[])
    {
        Capital ob=new Capital(); // Creating an object for the class Capital
        ob.input();
        ob.display();
    }
}
import java.util.*;
public class ISBN // declaring class name
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); // declaring in as object
        System.out.print("Enter a 10 digit code : ");
        String s=in.nextLine(); // user input
        int l=s.length(); // taking out the length of the given input
        if(l!=10) // if lengrh is not 10
            System.out.println("Output : Invalid Input"); // display message
        else // if length is 10
        {
            String ch;
            int a=0, sum=0, k=10;
            for(int i=0; i<l; i++) // i increments from 0 and proceed until l
            {
                ch=Character.toString(s.charAt(i)); // converting character to string
                if(ch.equalsIgnoreCase("X")) // X woun't be case sensative
                    a=10; // the value of a is assigned as 10
                else // if X is not found
                    a=Integer.valueOf(ch); // assigning integer value of ch in the varible a
                sum=sum+a*k;  //a is multiplied with k and added with sum to get an ISBN value
                k--; // k decrements
            }
            System.out.println("Output : Sum = "+sum); // print messgae
            if(sum%11==0) // if sum is divisibe by 11
                System.out.println("Leaves No Remainder - Valid ISBN Code");
            else // if sum is not divisible by 11
                System.out.println("Leaves Remainder - Invalid ISBN Code");
        }
    }
}

// A program to input a number less than 1000 and display it in words
import java.util.*;
public class money_count_01
{
    public static String three(char x)
    {
        // Function which is to be invoked if the amount is three digit
        int q;
        q=Integer.valueOf(x);
        if (q=='1')
        return "ONE HUNDRED";
        else if (q=='2')
        return "TWO HUNDRED";
        else if (q=='3')
        return "THREE HUNDRED";
        else if (q=='4')
        return "FOUR HUNDRED";
        else if (q=='5')
        return "FIVE HUNDRED";
        else if (q=='6')
        return "SIX HUNDRED";
        else if (q=='7')
        return "SEVEN HUNDRED";
        else if (q=='8')
        return "EIGHT HUNDRED";
        else if (q=='9')
        return "NINE HUNDRED";
        else
        return "AND";
    }
    public static String two(char x)
    {
        // Function which is to be invoked if the amount is two digit
        int q;
        q=Integer.valueOf(x);
        if (q=='1')
        return "TEN";
        else if (q=='2')
        return "TWENTY";
        else if (q=='3')
        return "THIRTY";
        else if (q=='4')
        return "FOURTY";
        else if (q=='5')
        return "FIFTY";
        else if (q=='6')
        return "SIXTY";
        else if (q=='7')
        return "SEVENTY";
        else if (q=='8')
        return "EIGHTY";
        else if (q=='9')
        return "NINETY";
        else
        return "";
    }
    public static String one(char x)
    {
        // Function which is to be invoked if the amount is one digit
        int q;
        q=Integer.valueOf(x);
        if (q=='1')
        return "ONE";
        else if (q=='2')
        return "TWO";
        else if (q=='3')
        return "THREE";
        else if (q=='4')
        return "FOUR";
        else if (q=='5')
        return "FIVE";
        else if (q=='6')
        return "SIX";
        else if (q=='7')
        return "SEVEN";
        else if (q=='8')
        return "EIGHT";
        else if (q=='9')
        return "NINE";
        else
        return "";
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); //Invoking scanner class
        int n,l;
        String str="";
        System.out.print("Enter the number : "); // Asking for user input the amount which is to be converted into words
        n=in.nextInt(); // Taking user input
        str=str+n; // Concating the value with a string str
        l=str.length(); // Taking out the length of the string
        if (n<0 || n>=1001)
        {
            // Number needs to be within 1 to 1000, else display appropriate message
            System.out.println("OUT OF RANGE");
        }
        else
        {
            if (l==4)
            {
                // When the length of the string str is 4 digit, display the message
                System.out.println("ONE THOUSAND");
            }
            else if (l==3)
            {
                char c0,c1,c2;
                c0=str.charAt(0);
                c1=str.charAt(1);
                c2=str.charAt(2);
                String d3=three(c0);
                String d2=two(c1);
                String d1=one(c2);
                // Display the appropriate amount, as per the value of c1 and c2
                if (c1==0 && c2==0)
                {
                    System.out.print(d3); 
                }
                else if (c1!=0 && c2==0)
                {
                    String finish=d3+d2;
                    System.out.println(finish);
                }
                else if (c1!=0 && c2==0)
                {
                    String finish=d3+" AND "+d2;
                    System.out.println(finish);
                }
                else if (c1!=0 && c2!=0 && c1!=1 && c2!=1 && c1!=2 && c2!=2 && (c1==c2))
                {
                    String finish=d3+" AND "+d3+"TEEN";
                    System.out.println(finish);  // Display the output
                }
                else if (c1!=0 && c2!=0 && c1==1 && c2==1 && (c1==c2))
                {
                    String finish=d3+" AND ELEVEN";
                    System.out.println(finish);  // Display the output
                }
                else if (c1!=0 && c2!=0 && c1==2 && c2==2 && (c1==c2))
                {
                    String finish=d3+" AND TWELVE";
                    System.out.println(finish);  // Display the output
                }
                else// if (c1!=0 && c2!=0)
                {
                    String finish=d3+" AND "+d2+" "+d1;
                    System.out.println(finish);  // Display the output
                }
            }
            else if (l==2)
            {
                char c0,c1;
                c0=str.charAt(0);
                c1=str.charAt(1);
                String d2=two(c0);
                String d1=one(c1);
                // Display the appropriate amount, as per the value of c0 and c1
                if (c0!=0 && c1==0)
                {
                    System.out.print(d2); // Display the output
                }
                else if (c0!=0 && c1!=0)
                {
                    String finish=d2+" "+d1;
                    System.out.println(finish); // Display the output
                }
            }
            else if (l==1)
            {
                char ch=str.charAt(0);
                String finish=one(ch); // Invoke the function, extract the value and store in the respective variable
                System.out.println(finish); // Display the output
            }
        }
    }
}
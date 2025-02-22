import java.util.*;
public class palindrome_check
{
    public static boolean check_palindrome(String str, int start, int len)
    {
        if(len<=1)
        {
            return true;
        }
        int i=start;
        if(i<len/2)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
            {
                return false;
            }
            return true;
        }
        return check_palindrome(str,start+1,len-1);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("Enter a string : ");
        str=in.nextLine();
        int len=str.length();
        boolean c=check_palindrome(str,0,len);
        if(c==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
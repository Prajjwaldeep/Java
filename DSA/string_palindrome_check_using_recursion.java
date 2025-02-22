import java.util.*;
public class string_palindrome_check_using_recursion
{
    public static void palindrome(String str, int start, int end)
    {
        String nstr="";
        if(start>=end/2)
        {
            return;
        }
        char temp;
        char arr[]=str.toCharArray();
        temp=arr[start];
        arr[start]=arr[end-start-1];
        arr[end-start-1]=temp;
        palindrome(str,start+1,end);
        int i;
        for(i=0; i<end; i++)
        {
            nstr=nstr+arr[i];
        }
    }
    public static void check(String str1, String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println(str1+" is palindrome");
        }
        else
        {
            System.out.println(str1+" is not palindrome");
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,nstr;
        int l;
        System.out.println("Enter the string : ");
        str=in.next();
        nstr=str;
        l=str.length();
        palindrome(str,0,l);
        check(str,nstr);
    }
}
import java.util.*;
public class upper_lower
{
    public static String lwup(String str)
    {
        int l=str.length(),a;
        char ch,ch1;
        String Str="";
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            if (Character.isLowerCase(ch))
            {
                ch1=Character.toUpperCase(ch);
            }
            else
            {
                ch1=Character.toLowerCase(ch);
            }
            Str=Str+ch1;
        }
        return Str;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a,b;
        System.out.print("Enter the String : ");
        a=in.nextLine();
        b=lwup(a);
        System.out.println(b);
    }
}
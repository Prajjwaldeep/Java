import java.util.*;
public class string_subs
{
    public static void generate_subs(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String rest=str.substring(1);
        generate_subs(rest, ans+ch);
        generate_subs(rest, ans+"");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.println("Enter the string : ");
        str=in.nextLine();
        generate_subs(str,"");
    }
}
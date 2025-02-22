import java.util.*;
public class subsequence_string_optimize
{
    public static void generate_subsequence(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch;
        ch=str.charAt(0);
        String nstr=str.substring(1);
        generate_subsequence(nstr,""+ans);
        generate_subsequence(nstr,ch+ans);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("Enter the string : ");
        str=in.next();
        generate_subsequence(str,"");
    }
}
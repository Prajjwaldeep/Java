import java.util.*;
public class subs_of_string_1
{
    public static List<String> generate_subsequence(String str)
    {
        List<String> subs=new ArrayList<>();
        if(str.length()==0)
        {
            List<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String nstr=str.substring(1);
        List<String> rest=generate_subsequence(nstr);
        for (String it: rest)
        {
            subs.add(""+nstr);
            subs.add(ch+nstr);
        }
        return subs;
    }
    public static void main(String  args[])
    {
        Scanner in=new Scanner(System.in);
        List<String> subs=new ArrayList<String>();
        String str;
        System.out.print("Enter the string : ");
        str=in.next();
        subs=generate_subsequence(str);
        for (String i : subs)
        {
            System.out.println(i);
        }
    }
}
    
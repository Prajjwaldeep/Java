import java.util.*;
public class subs_of_string
{
    public static List<String> generate_subsequence(String str)
    {
        List<String> subs=new ArrayList<String>();
        if(str.length()==0)
        {
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String nstr=str.substring(1);
        String t="";
        List<String> rest=generate_subsequence(nstr);
        int i;
        for(String it : rest)
        {
            subs.add(""+it);
        }
        for(String it : rest)
        {
            subs.add(ch+it);
        }
        return subs;
    }
    public static void main(String args[])
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
    
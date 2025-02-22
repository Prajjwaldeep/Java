import java.util.*;
public class highest_freq_char
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        System.out.print("Enter the string : ");
        str=in.next();
        HashMap<Character, Integer> hm=new HashMap<>();
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            if(hm.containsKey(ch))
            {
                int old=hm.get(ch);
                old++;
                hm.put(ch,old);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        char mfc=str.charAt(0);
        for(Character key: hm.keySet())
        {
            if(hm.get(key)>hm.get(mfc))
            {
                mfc=key;
            }
        }
        System.out.println(mfc);
    }
}
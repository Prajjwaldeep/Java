import java.util.*;
public class abcd
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int z;
        int t;
        System.out.println("Test Case : ");
        t=in.nextInt();
        System.out.println("Enter "+t+" string(s)");
        for(z=0; z<t; z++)
        {
            String str,nstr="";
            str=in.next();
            int k=0,a,l=str.length();
            ArrayList<Character> ch=new ArrayList<>();
            char letters;
            for(a=0; a<l; a++)
            {
                letters=str.charAt(a);
                ch.add(letters);
            }
            Collections.sort(ch);
            for(a=0; a<ch.size(); a++)
            {
                nstr=nstr+ch.get(a);
            }
            System.out.println(nstr);
        }
    }
}
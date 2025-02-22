import java.util.*;
public class word_alphabet_count
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,nstr;
        int a,l,fs=0,ns=0,ls;
        char ch;
        System.out.print("Enter the sentence : ");
        str=in.nextLine();
        str=str+" ";
        ls=str.lastIndexOf(' ');
        while (fs!=ls)
        {
            ns=str.indexOf(' ');
            nstr=str.substring(fs,ns);
            //System.out.println(nstr+" word length is "+nstr.length());
            System.out.println(nstr);
            fs=ns;
        }
    }
}
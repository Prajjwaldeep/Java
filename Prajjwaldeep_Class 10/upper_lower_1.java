/*ASCII-
 * 0-9-48-57
 * A-Z-65-90
 * a-z=97-122
 */
import java.util.Scanner;
public class upper_lower_1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,l,n1;
        String str,str1="";
        char ch,n2=' ';
        System.out.print("Enter the string : ");
        str=in.next();
        l=str.length();
        for (a=0; a<l; a++)
        {
            ch=str.charAt(a);
            n1=(int)(ch);
            {
                if (n1>=65 && n1<=90)
                n1=n1+32;
                else
                n1=n1-32;
            }
            n2=(char)(n1);
            str1=str1+n2;
        }
        System.out.println(str1);
    }
}
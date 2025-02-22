import java.util.Scanner;
public class vowel_consonent
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,nstr="";
        int l,a,i;
        char ch,j;
        System.out.print("Enter the string : ");
        str=in.nextLine();
        l=str.length();
        for(a=0; a<l; a++)
        {
            ch=str.charAt(a);
            i=(int)(ch);
            if (i==65 || i==69 || i==73 || i==79 || i==85 || i==97 || i==101 || i==105 || i==111 || i==117)
            i=i+1;
            else
            i=i-1;
            j=(char)(i);
            nstr=nstr+j;
        }
        System.out.println(nstr);
    }
}
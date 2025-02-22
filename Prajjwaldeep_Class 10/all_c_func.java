import java.io.*;
public class all_c_func
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        char ch,t3,t5;
        System.out.print("Enter a character : ");
        ch=(char)(in.read());
        boolean t,t1,t2,t4;
        t=Character.isLetterOrDigit(ch);
        t1=Character.isWhitespace(ch);
        t2=Character.isLowerCase(ch);
        t3=Character.toLowerCase(ch);
        t4=Character.isUpperCase(ch);
        t5=Character.toUpperCase(ch);
        System.out.println("Character is LetterOrDigit : "+t);
        System.out.println("Character is WhiteSpace : "+t1);
        System.out.println("Character is LowerCase : "+t2);
        System.out.println("Character to LowerCase : "+t3);
        System.out.println("Character is UpperCase : "+t4);
        System.out.println("Character to UpperCase : "+t5);
    }
}
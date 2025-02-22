import java.io.*;
public class alphabet_numeric_special
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        char ch;
        int i;
        System.out.print("Enter anything from the keyboard : ");
        ch=(char)(in.read());
        i=(int)(ch);
        if (i>=65 && i<=90)
        System.out.println("Input is an alphabet in uppercase");
        else if (i>=97 && i<=122)
        System.out.println("Input is an alphabet in lowercase");
        else if (i>=48 && i<=57)
        System.out.println("Input is a numeric");
        else
        System.out.println("Input is a special");
    }
}
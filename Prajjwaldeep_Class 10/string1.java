import java.util.Scanner;
public class string1
{
    public static void main(String args[])
    {
    String str,ustr,lstr;
    char ch,ch1,ch2,ch3;
    int len;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your name");
    str=in.nextLine();
    ch=str.charAt(0);
    len=str.length();
    boolean t=Character.isLetter(ch);
    boolean f=Character.isDigit(ch);
    System.out.println("First character of string is :"+ch);
    System.out.println("Length of string is :"+len);
    System.out.println("First letter is character is :"+t);
    System.out.println("First letter is digit is :"+f);
}
}

    
    
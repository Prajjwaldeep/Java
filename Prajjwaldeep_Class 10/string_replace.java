import java.util.Scanner;
class string_replace
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        String s1,s2;
        System.out.print("Enter your name : ");
        s1=in.nextLine();
        s2=s1.replace('a','x');
        System.out.println("After replace "+s2);
    }
}

import java.util.Scanner;
public class string_input_type
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char a;
        System.out.println("Input anything to check its nature");
        a=(char)in.next().charAt(0);
        if (Character.isLetter(a)==true)
        {
                System.out.println(a+" is letter");
                if(Character.isUpperCase(a)==true)
                System.out.println(a+" is in uppercase letter");
                if(Character.isLowerCase(a)==true)
                System.out.println(a+" is in lowercase letter");
            }
            else
            {
                if(Character.isDigit(a)==true)
                System.out.println(a+" is a digit");
            else
            System.out.println(a+" is Special Character");
        }
    }
}
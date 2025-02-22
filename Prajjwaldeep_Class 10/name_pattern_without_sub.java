import java.util.*;
public class name_pattern_without_sub
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str;
        int l,c,r;
        System.out.print("Enter the string : ");
        str=in.nextLine();
        l=str.length();
        for (c=0; c<=l; c++)
        {
            for (r=0; r<c; r++)
            {
                System.out.print(str.charAt(r));
            }
            System.out.println();
        }
    }
}
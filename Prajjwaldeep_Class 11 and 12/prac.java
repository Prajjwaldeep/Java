import java.util.*;
public class prac
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String sent=in.nextLine();
        sent=" "+sent;
        int i,freq=0,conv;
        String w="";
        boolean isCap;
        for(i=0;i<sent.length();i++)
        {
            char x=sent.charAt(i);
            if(x==' ')
            {
                w=w+" ";
                char y=sent.charAt(i+1);
                w=w+Character.toUpperCase(y);
                i++;
            }
            else
            {
                w=w+x;
            }
        }
        System.out.println(w);
        System.out.println(freq);
        if (sent.equals(w)) 
        {
            isCap=true;
            System.out.println(isCap);
        }
        else
        {
           isCap=false;
           System.out.println(isCap);
        }
    }
}
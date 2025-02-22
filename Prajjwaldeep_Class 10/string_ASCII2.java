import java.io.*;
class string_ASCII2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        char c;
        System.out.println("Input character to find out the ascii code");
        c=(char)in.read();
        int n=(int)c;
        
        System.out.println("code is "+n);
        
    }
}
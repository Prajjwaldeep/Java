import java.io.*;
class reverse
{
    public static void main(String args[]) throws IOException
    {
        String str;
        int no,k,rev;
        rev=0;
        try
        {
            BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number to find its sum of digits:");
            System.out.flush();
            str=obj.readLine();
            no=Integer.parseInt(str);
            while(no>0)
            {
                k=no%10;
                rev=rev*10+k;
                no=no/10;
            }
            System.out.println("Reversing the number "+str+" becomes "+rev);
        }
        catch(Exception o){
        }
    }
}
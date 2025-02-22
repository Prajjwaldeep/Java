import java.io.*;
class count
{
    public static void main(String args[]) throws IOException
    {
        String str;
        int no,k,count=0;
        
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
                count++;
                no=no/10;
            }
            System.out.println("Total digit "+count);
        }
        catch(Exception o){
        }
    }
}
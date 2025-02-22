import java.io.*;
class for_3
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter you name");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        int a,num;
        num=st.length();
        for(a=0;a<=num;a++)
        {
            System.out.println(st.substring(0,a));
        }
    }
}
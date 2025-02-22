import java.io.*;
class for_2
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter your name");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        int a,num,b,c=1;
        num=st.length();
        for(a=num;a>=0;a--)
        {
            for(b=1;b<=c;b++)
            {
                System.out.println("");
            }
            System.out.println(st.substring(0,a));
            c++;
        }
    }
}
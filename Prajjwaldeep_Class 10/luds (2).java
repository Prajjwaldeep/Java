import java.io.*;
class luds
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter Something");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int uc=0,lc=0,spc=0,dig=0;
        int len=str.length();
        char ch;
        for(int num=0;num<len;num++)
        {
            ch=str.charAt(num);
            if(ch>='A'&&ch<='Z')
            {
                uc=uc+1;
            }
            if(ch>='a'&&ch<='z')
            {
                lc=uc+1;
            }
            else
            {
                spc=spc+1;
            }
            System.out.println("No. of Upper Case Characters are: "+uc);
            System.out.println("No. of Lower Case Characters are: "+lc);
            System.out.println("No. of Special Case Characters are: "+spc);
        }
    }
}
import java.util.Scanner;
public class path_file_name_extention
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str,extention,f_n,path;
        int l,lf,ls;
        System.out.print("Enter the full path : ");
        str=in.next();
        l=str.length();
        lf=str.lastIndexOf('.');
        extention=str.substring(lf,l);
        ls=str.lastIndexOf('/');
        f_n=str.substring(ls,lf);
        path=str.substring(0,ls);
        System.out.println("Path : "+path);
        System.out.println("File name : "+f_n);
        System.out.println("Extention : "+extention);
    }
}
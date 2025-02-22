import java.util.*;
public class Bank_2010
{
    public static String words(char i)
    {
        if (i=='1')
        return "ONE";
        else if (i=='2')
        return "TWO";
        else if (i=='3')
        return "THREE";
        else if (i=='4')
        return "FOUR";
        else if (i=='5')
        return "FIVE";
        else if (i=='6')
        return "SIX";
        else if (i=='7')
        return "SEVEN";
        else if (i=='8')
        return "EIGHT";
        else if (i=='9')
        return "NINE";
        else if (i=='0')
        return "ZERO";
        else
        return "";
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("INPUT"+"\t"+":"+"\t");
        n=in.nextInt();
        String str="";
        str=str+n;
        int l=str.length();
        if (l>5)
        {
            System.out.println("INVALID AMOUNT");
        }
        else
        {
            int rupees[]={1000,500,100,50,20,10,5,2,1};
            int a,x;
            int y;
            System.out.print("OUTPUT    :   ");
            for (y=0; y<l; y++)
            {
                char ch=str.charAt(y);
                String r;
                r=words(ch);
                System.out.print(r+" ");
            }
            int count=0,count1=0;
            System.out.println();
            System.out.println("DENOMINATION"+"\t"+"="+"\t");
            for (a=0; a<9; a++)
            {
                x=n/rupees[a];
                int temp=x*rupees[a];
                if (x!=0)
                {
                    System.out.println(rupees[a]+"\t"+"x "+x+"\t"+"="+"\t"+temp);
                }
                count=count+temp;
                count1=count1+x;
                n=n%rupees[a];
                temp=0;
            }
            System.out.println("TOTAL"+"\t"+"="+"\t"+count);
            System.out.println("TOTAL NUMBER OF NOTES"+"\t"+"="+"\t"+count1);
        }
    }
}
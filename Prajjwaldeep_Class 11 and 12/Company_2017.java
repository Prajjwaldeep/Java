import java.util.*;
public class Company_2017
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a,box,temp,count1=0,count=0;
        System.out.print("N=");
        n=in.nextInt();
        int temp1=0;
        int arr[]={48,24,12,6};
        int r=n;
        for (a=0; a<4; a++)
        {
            box=n/arr[a];
            temp=box*arr[a];
            r=r-temp;
            temp1=temp1+box;
            System.out.println(arr[a]+"x"+box+"="+temp);
            count=count+temp;
            count1=count1+box;
            temp=0;
            n=n%arr[a];
        }
        int total,total1;
        if (temp1<6 && temp1!=0)
        {
            System.out.println("Remaining boxes =   "+r+"    x   "+1+"   =   "+r);
            total=count+2;
            total1=temp1+1;
        }
        else
        {
            System.out.println("Remaining boxes =   "+0);
            total=count;
            total1=temp1;
        }
        System.out.println("Total number of boxes   =   "+total);
        System.out.println("Total number of cartons   =   "+total1);
    }
}
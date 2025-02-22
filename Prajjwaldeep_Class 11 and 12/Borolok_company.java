import java.util.*;
public class Borolok_company
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int c,n,a,arr[]={48,24,12,6},sum=0,temp=0,rem,total=0,temp1=0;
        System.out.print("Enter the number of boxes to be packed : ");
        n=in.nextInt();
        rem=n;
        for (a=0; a<4; a++)
        {
            c=n/arr[a];
            if(c!=0)
            temp=arr[a]*c;
            if (temp!=0)
            {
                System.out.println(arr[a]+" X "+c+" = "+temp);
            }
            sum=sum+c;
            n=n%arr[a];
            total=total+c;
            rem=rem-temp;
            temp1=temp1+temp;
            temp=0;
        }
        if (rem!=0)
        {
            System.out.println("Remaining boxes = "+rem+ " X 1 = "+rem);
            int x=sum+1,y=total+1,z=temp1+rem;
            System.out.println("Total number of boxes : "+z);
            System.out.println("Total number of cartons : "+y);
        }
        else
        {
            System.out.println("Remaining boxes = "+rem);
            System.out.println("Total number of boxes : "+temp1);
            System.out.println("Total number of cartons : "+total);
        }
    }
}
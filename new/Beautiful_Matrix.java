import java.util.*;
public class Beautiful_Matrix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[][]=new int[5][5];
        System.out.println("Enter array elements :");
        int c,r,val1,val2,mid,sum=0;
        val1=val2=0;
        mid=2;
        for(c=0; c<5; c++)
        {
            for(r=0; r<5; r++)
            {
                arr[c][r]=in.nextInt();
            }
        }
        System.out.println("Array matrix :");
        for(c=0; c<5; c++)
        {
            for(r=0; r<5; r++)
            {
                System.out.print(arr[c][r]);
            }
            System.out.println();
        }
        for(c=0; c<5; c++)
        {
            for(r=0; r<5; r++)
            {
                if(arr[c][r]==1)
                {
                    val1=c;
                    val2=r;
                }
            }
        }
        System.out.println("Index of 1 : "+val1+", "+val2);
        if(mid>val1)
        {
            sum=mid-val1;
        }
        else
        {
            sum=val1-mid;
        }
        if(mid>val2)
        {
            sum+=(mid-val2);
        }
        else
        {
            sum+=(val2-mid);
        }
        System.out.println("Minimum steps : "+sum);
    }
}
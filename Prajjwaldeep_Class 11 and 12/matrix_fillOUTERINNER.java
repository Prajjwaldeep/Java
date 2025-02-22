import java.util.*;
class matrix_fillOUTERINNER
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,c,r,sum=0;
        char ch1, ch2,ch3;
        System.out.println("Enter the limit of the array :");
        c=in.nextInt();
        System.out.println("Enter three characters respectively :");
        ch1=in.next().charAt(0);
        ch2=in.next().charAt(0);
        //ch3=in.next().charAt(0);
        char arr[][]=new char[c][c];
        for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=ch1;
            }
        }
        for(i=1;i<c-1;i++)
            {
                for(j=1;j<c-1;j++)
                {
                    arr[i][j]=ch2;
                }
            }
        for(i=0;i<c;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");              
            }
            System.out.println();
        }
    }
}
import java.util.*;
public class matrix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[][]=new int[3][4];
        int i,j;
        System.out.println("Insert");
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=3; j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix : ");
        for(i=0; i<=2; i++)
        {
            for(j=0; j<=3; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[3-1][4-1]+" "+arr[3-1][2-1]);
    }
}
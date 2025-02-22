import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j;
        int arr[][]=new int[3][4];
        System.out.println("Input ");
        for(i=0; i<3; i++)
        {
            for(j=0; j<4; j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Rows: "+arr.length+" "+"Cols: "+arr[0].length);
        for(i=0; i<3; i++)
        {
            for(j=0; j<4; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
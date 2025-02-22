import java.util.*;
class for_pascal
{
    static void pascal(int rows)
    {
        int i,j,space;
        int c;
        c=1;
        for(i=0; i<rows; i++)
        {
            for(space=1; space<=rows-i; space++)
            System.out.print(" ");
            for(j=0; j<=i; j++)
            {
                if (j==0 || i==0)
                c=1;
                else
                c=c*(i-j+1)/j;
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value : ");
        int r=in.nextInt();
        pascal(r);
    }
}
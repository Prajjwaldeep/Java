import java.util.Scanner;
class Array_sum_diagonal
{
    public static void main(String rgs[])
    {
        Scanner in=new Scanner(System.in);
        int r,c,k,t,l1,l2,sum=0, s=0;
        System.out.println("Enter the row and column");
        l1=in.nextInt();
        l2=in.nextInt();
        
        int array[][]=new int[l1][l2];
        
        System.out.println("Enter the elements of the (2*2) matrix");
        for(c=0;c<l1;c++)
        {
            for(r=0;r<l2;r++)
            {
                array[c][r]=in.nextInt();
            }
        }
        
        System.out.println("Displaying the  matrix");
        for(c=0;c<l1;c++)
        {
            for(r=0;r<l2;r++)
            {
                System.out.print(array[c][r]+" ");
            }
            System.out.println();
        }
         System.out.println("Displaying the  Diagonal elements of matrix");
        for(c=0;c<l1;c++)
        {
            for(r=0;r<l2;r++)
            {
                if(c==r)
                {
                    System.out.print(array[c][r]+" ");
                    sum=sum+array[c][r];
                }
                else if (c+r==l1-1)
                {
                    System.out.print(array[c][r]+" ");
                    s=s+array[c][r];
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Sum of Left Digonal elements is =  "+sum);
        System.out.println("Sum of Right Digonal elements is =  "+s);
    }
}
        
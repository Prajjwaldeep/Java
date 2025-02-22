import java.util.Scanner;
class Array_squarematrix_TRANSPOSE
{
    public static void main(String rgs[])
    {
        Scanner in=new Scanner(System.in);
        int r=0,c=0,k,t,l1,l2;
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

        System.out.println("Transose of the  matrix");
         for(c=0;c<l2;c++)
        {
            for(r=0;r<l1;r++)
            {
                System.out.print(array[r][c]+" ");
            }
            c=0;
            r=0;
            System.out.println();
        }
        
        /*System.out.println("Transose of the  matrix");
         for(r=0;r<l1;r++)
        {
            for(c=0;c<l2;c++)
            {
                System.out.print(array[c][r]+" ");
            }
            System.out.println();
        }
        */
        System.out.println("Sum of row");
         for(r=0;r<l1;r++)
        {
            int sum=0;
            for(c=0;c<l2;c++)
            {
                //System.out.print(array[c][r]+" ");
                sum=sum+array[c][r];
            }
            System.out.println("Sum of row "+ (r+1)+" is = "+sum);
            
        }
    }
}

        


        
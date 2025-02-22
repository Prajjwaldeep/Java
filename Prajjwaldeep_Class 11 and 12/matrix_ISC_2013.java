import java.util.Scanner;
class matrix_ISC_2013
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n2=0;
        System.out.println("Enter the row amd column limit");
        int n=in.nextInt();
        n2=n;
        int r2,c2,z;
        int Array[][]=new int[n][n2];
        System.out.println("Enter the elements in the " +n+ "by "+n2+" matrix");
        for(r2=0;r2<n;r2++)
        {
            for(c2=0;c2<n2;c2++)
            {
                Array[r2][c2]=in.nextInt();
            }
        }
        //Dislaying the matrix
        System.out.println("Original Matrix");
        for(r2=0;r2<n;r2++)
        {
            for(c2=0;c2<n2;c2++)
            {
                 System.out.print(Array[r2][c2]+" ");
            }
            System.out.println();
        }
        //performing the miror image
        
        for(r2=0;r2<n;r2++)
        {
            z=Array[r2][0];
            Array[r2][0]=Array[r2][n2-1];
            Array[r2][n2-1]=z;
        }
    
       //displaying the matrix
        System.out.println("Mirror image matrix");
        for(r2=0;r2<n;r2++)
        {
            for(c2=0;c2<n;c2++)
            {
                 System.out.print(Array[r2][c2]+" ");
            }
            System.out.println();
        }
    }
}
        
        
            
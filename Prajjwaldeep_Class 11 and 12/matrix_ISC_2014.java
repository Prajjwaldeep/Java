import java.util.Scanner;
class matrix_ISC_2014
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);   
        System.out.println("Input the limit for the square matrix");
        int n=in.nextInt();
        if(n>2 && n<10)
        {
        int array[][]=new int[n][n];
        int z,r,c,k=0,sum=0,sum2=0,l=0;
        System.out.println("Input the numbers in the array");
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                array[r][c]=in.nextInt();
            }
        }
        System.out.println("Original matrix");
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(r=0;r<n;r++)
        {
            for(c=n;c>=0;c--)
            {
                if(array[r][c]==array[c][r])
                {
                    k=1;
                }
               
                else
                {
                    l=1;
                }
                
            }
            k=0;
            l=0;
            k++;
            l++;
            System.out.println();
        }
        if(k==1)
        {
            System.out.println("This is a symmetric matrix");
        }
        else if(l==1)
        {
            System.out.println("This is not a symmetric matrix");
        }
        
        for(r=0;r<n;r++)
        {
            for(c=0;c<n;c++)
            {
                if(r==c)
                {
                    sum=sum+array[r][c];
                   
                }
                else if(r+c==n-1)
                {
                    sum2=sum2+array[r][c];
                    
                }
                else
                {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        System.out.println("sum of right diagonal : "+sum);
        System.out.println("sum of lef diagonal   : "+sum2);
    }
    else
    System.out.println("out of range");
}
}


            
        
        
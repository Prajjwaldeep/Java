import java.util.Scanner;
class magic_square_school
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of N");
        int n=in.nextInt();
        int array[][]=new int[n][n];
        int r,c,sum=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0;
        int s1=0,s2=0,flag=0;
        boolean k;
        System.out.println("Enter the elements of a " +n+"by"+n+" matrix");
        for(r=0;r<n;r++)//c for row
        {
            for(c=0;c<n;c++)// r for column
            {
                array[r][c]=in.nextInt();
            }
        }
        System.out.println("Displaying the matrix");
        for(r=0;r<n;r++)//c for row
        {
            for(c=0;c<n;c++)// r for column
            {
               System.out.print(array[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println(" ");
        while(n>0)
        {
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
                }
                System.out.println();
            }
            if(sum==sum2)
            {
                for(r=0;r<n;r++)
                {
                    for(c=0;c<n;c++)
                    {
                        s1=s1+array[r][c];
                        s2=s2+array[c][r];
                    }
                }
            }
            if(s1 == s2 )  
            {
                 flag=1;
            }
            if(flag==1)
            {
                System.out.print("The matrix is a square matrix");
            }
        }
    }
}
    
        

       
    


    
            
        
        
            
    

        
import java.util.Scanner;
class isc_specimen
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,c,r; 
        char fc,sc,tc;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        char array[][]=new char[n][n];
        if(n<3 || n>10)
        {
            System.out.println("size out of range");
        }
        else
        {
            System.out.println("first character");
            fc=(char)in.next().charAt(0);
            System.out.println("Seconde character");
            sc=(char)in.next().charAt(0);
            System.out.println("Third character");
            tc=(char)in.next().charAt(0);
            //third character
            for(r=1;r<n-1;r++)
            {
                for(c=1;c<n;c++)
                {
                    array[r][c]=tc;
                }
            }
            //2nd character
            for(r=0;r<n;r++)
            {
                array[0][r]=sc;
                array[n-1][r]=sc;
                array[r][0]=sc;
                array[r][n-1]=sc;
            }
            //1st character
            array[0][0]=fc;
            array[0][n-1]=fc;
            array[n-1][0]=fc;
            array[n-1][n-1]=fc;
            System.out.println("final matrix");
            for(r=0;r<n;r++)
            {
                for(c=0;c<n;c++)
                {
                    System.out.print(array[r][c]+"   ");
                }
                System.out.println();
            }
        }
    }
}
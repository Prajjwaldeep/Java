class for_diamond
{
    public static void main(String args[])
    {
        int c,r,k,r2,k2;
        for(c=1;c<=4;c++)
        {
            for(r=3;r>=c;r--)
            {
            System.out.print(" ");
        }
            for(k=1;k<=c*2-1;k++)
            {
            System.out.print(k);
        }
        System.out.println( );
    }
    
            for(r2=3;r2>=1;r2--)
            {
            System.out.print(r2);
        }
          for(k2=1;k2<=c+1;k2++)
            {
            System.out.print(k2);
        }
        System.out.println( );
    }
}


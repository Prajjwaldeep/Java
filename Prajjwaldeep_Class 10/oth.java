class oth
{
    public static void main(String args[])
    {
        int a[][]={{12345,56975,56874,65789,24596}};
        int b,c;
        for(b=0;b<a.length;b++)
        {
            for(c=0;c<a[b].length;c++)
            if(b<=c)
            System.out.println(a[b][c]+" ");
            else
            System.out.print(" ");
            System.out.println();
        }
    }
}
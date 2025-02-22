class mersenne
{
    public static void main(String args[])
    {
        double a,n;
        for(n=1;n<=10;n++)
        {
            a=Math.pow(2,n)-1;
            System.out.println("Mersenne Numbers are: "+a);
        }
    }
}
public class series_1
{
    public static void main(String args[])
    {
        int a,l;
        double sum=0;
        l=10;
        for (a=1; a<=l; a++)
        {
            sum=sum+(a/a*3);
        }
        System.out.println("Sum of series is : "+sum);
    }
}
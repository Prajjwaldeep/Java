public class find_numbers_that_divide_from_oneton
{
    public static int func(int ind, int n)
    {
        int cnt=0;
        for(int i=ind; i<=n; i++)
        {
            if(n%i==0)
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static int func1(int ind, int n)
    {
        if(n%ind==0)
        {
            return 1+ func1(ind + 1, n);
        }
        if(ind>n)
        {
            return 0;
        }
        return func1(ind+1, n);
    }
    public static void main(String args[])
    {
        int n=25;
        System.out.println(func1(1,n));
    }
}
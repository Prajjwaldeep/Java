public class sol
{
    public int isPalindrome(int x)
    {
        int rem,rnum=0;
        while(x!=0)
        {
            rem=x%10;
            rnum=rnum*10+rem;
            x=x/10;
        }
        return rnum;
    }
}
public class add
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        int a=2, b=5;
        add ob=new add();
        int ans=ob.sum(a,b);
        System.out.println(ans);
    }
}
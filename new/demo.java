public class demo
{
    private String name="abc";
    private int roll=0;
    public void set(int r)
    {
        if(r>=100)
        {
            roll=r;
        }
    }
    public int get()
    {
        return roll;
    }
}
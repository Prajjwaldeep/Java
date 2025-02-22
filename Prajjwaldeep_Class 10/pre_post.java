public class pre_post
{
    public static void main(String args[])
    {
        int x,y,z;
        x=20;
        y=10;
        z=++x*(y--)-y;
        System.out.println("Z is : "+z);
    }
}
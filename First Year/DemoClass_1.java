import java.util.*;
public class DemoClass_1
{
    public static void main(String args[])
    {
        Collection <Integer> values=new ArrayList<Integer>();
        values.add(3);
        values.add(77);
        values.add(88);
        values.add(9);
        /*Iterator i=values.iterator();
        // Instead of writing System.out.println(i.next()); n times
        while(i.hasNext())
        {
            System.out.println(i.next());
        } */
        for (int i : values)
        {
            System.out.println(i);
        }
    }
}
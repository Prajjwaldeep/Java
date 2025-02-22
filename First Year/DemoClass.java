import java.util.*;
public class DemoClass
{
    public static void main(String args[])
    {
        /* int values[]=new int[4];
        Object values1[]=new Object[4];
        values1[0]="Prajjwaldeep";
        values1[1]=7; */
        
        Collection values=new ArrayList();
        values.add(3);
        values.add("PG");
        values.add(5.8f);
        Iterator i=values.iterator();
        // Instead of writing System.out.println(i.next()); n times
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
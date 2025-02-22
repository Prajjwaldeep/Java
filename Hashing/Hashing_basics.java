import java.util.*;
public class Hashing_basics
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        for(int i=10; i<=30; i++)
        {
            set.add(i);
        }
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
import java.util.*;
public class llist
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        LinkedList <Integer> numbers=new LinkedList<>();
        int i,x;
        System.out.println("Enter 5 numbers :");
        for(i=0; i<5; i++)
        {
            x=in.nextInt();
            numbers.add(x);
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("After sort : "+numbers);
    }
}
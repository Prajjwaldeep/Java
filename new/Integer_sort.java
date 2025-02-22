import java.util.*;
public class Integer_sort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println("Enter some numbers and then enter any terminating string once done : ");
        while(in.hasNextInt())
        {
            numbers.add(in.nextInt());
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
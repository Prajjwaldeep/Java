import java.util.*;
public class MyArrayList_User_input
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println("Enter some numbers : ");
        while(in.hasNextInt())
        {
            numbers.add(in.nextInt());
        }
        System.out.println(numbers);
    }
}
import java.util.*;
public class Unique_in_each_input
{
    public static int unique(List<Integer> arr)
    {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<arr.size(); i++)
        {
            if(map.containsKey(arr.get(i)))
            {
                map.put(arr.get(i), map.get(arr.get(i))+1);
            }
            else
            {
                map.put(arr.get(i), 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int key=entry.getKey();
            int value=entry.getValue();
            if(value==1)
            {
                return key;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        List<Integer> arr=new ArrayList<>();
        System.out.print("Enter number of elements : ");
        int n=in.nextInt();
        System.out.println("Enter the elements of the array : ");
        int var;
        for(int i=0; i<n; i++)
        {
            var=in.nextInt();
            arr.add(var);
            System.out.println("Elements are : "+unique(arr));
        }
    }
}
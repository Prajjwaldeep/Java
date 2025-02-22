import java.util.*;
public class MyArrayList_2
{
    public static void main(String args[])
    {
        List<String> fruits=new LinkedList<>();
        List<String> vegetables=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Hi");
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Carrot");
        fruits.addAll(vegetables);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits);
        fruits.set(1,"Banana");
        System.out.println(vegetables.get(1));
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        fruits.removeAll(vegetables);
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
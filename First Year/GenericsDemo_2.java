import java.util.*;
class Container<T>
{
    T value;
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
}
public class GenericsDemo_2
{
    public static void main(String args[])
    {
        Container<Double> obj=new Container<>();
        obj.value=9.887;
        obj.show();
    }
}
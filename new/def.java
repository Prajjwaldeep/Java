import java.util.*;
public class def extends abc
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        abc ob=new abc();
        System.out.println(ob.name);
        int k;
        System.out.print("Enter new roll : ");
        k=in.nextInt();
        ob.setrollnumber(k);
        System.out.println("New roll number is :");
        System.out.println(ob.getrollnumber());
    }
}
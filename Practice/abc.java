import java.util.*;
public class abc
{
    static int num1;
    static int num2;
    abc(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    static void cal_out()
    {
        int sum=num1+num2;
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        abc ob=new abc(25,4);
        abc.cal_out();
    }
}
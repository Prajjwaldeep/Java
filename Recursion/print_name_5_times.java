public class print_name_5_times
{
    static int cnt=0;
    public static void print()
    {
        System.out.println("Prajjwaldeep");
        cnt++;
        if(cnt==5)
        {
            return;
        }
        print();
    }
    public static void main(String args[])
    {
        print();
    }
} 
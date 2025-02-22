public class arr_di_rough
{
    public static void main(String args[])
    {
        int c,r;
        //System.out.print("Enter the length of rows and columbs : ");
        int arr[][]=new int[3][10];
        /*for (c=0; c<3; c++)
        {
            for (r=0; r<10; r++)
            {
                arr[c][r];
            }
        }*/
        System.out.println("Array elements : ");
        for (c=0; c<3; c++)
        {
            for (r=0; r<10; r++)
            {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
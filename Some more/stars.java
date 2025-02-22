class stars
{
    public static void main(String args[]) 
    {
        for(int row=1;row<=5;row++)
        {
            for(int space=4;space<=row;space++)
            {
                System.out.println("");
            }
            for(int star=1;star<=6-row;row++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
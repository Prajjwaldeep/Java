import java.io.*;
class switch_week
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for Sunday");
        System.out.println("Enter 2 for Monday");
        System.out.println("Enter 3 for Tuesday");
        System.out.println("Enter 4 for Wednesday");
        System.out.println("Enter 5 for Thursday");
        System.out.println("Enter 6 for Friday");
        System.out.println("Enter 7 for Saturday");
        System.out.println();
        int w=Integer.parseInt(br.readLine());
        System.out.println("Your Choice: "+w);
        switch(w)
        {
            case 1:
            System.out.println("1st day of week is Sunday");
            break;
            case 2:
            System.out.println("2nd day of week is Mondayday");
            break;
            case 3:
            System.out.println("3rd day of week is Tuesday");
            break;
            case 4:
            System.out.println("4th day of week is Wednesday");
            break;
            case 5:
            System.out.println("5th day of week is Thursday");
            break;
            case 6:
            System.out.println("6th day of week is Friday");
            break;
            case 7:
            System.out.println("7th day of week is Saturday");
            break;
            default:
            System.out.println("You are a foolish");
        }
    }
}
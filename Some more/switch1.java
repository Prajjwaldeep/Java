import java.io.*;
class switch1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type 1-2 for Good Morning");
        System.out.println("Type 3-4 for Good Afternoon");
        System.out.println("Type 5-6 for Good Evening");
        System.out.println("Type 7-8 for Good Night");
        System.out.println();
        int n=Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1:
            case 2:
            System.out.println("Good Morning");
            break;
            case 3:
            case 4:
            System.out.println("Good Afternoon");
            break;
            case 5:
            case 6:
            System.out.println("Good Evening");
            break;
            case 7:
            case 8:
            System.out.println("Good Night");
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
}
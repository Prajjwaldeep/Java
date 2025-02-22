import java.io.*;
class switch_month
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for January");
        System.out.println("Enter 2 for February");
        System.out.println("Enter 3 for March");
        System.out.println("Enter 4 for April");
        System.out.println("Enter 5 for May");
        System.out.println("Enter 6 for June");
        System.out.println("Enter 7 for July");
        System.out.println("Enter 8 for August");
        System.out.println("Enter 9 for September");
        System.out.println("Enter 10 for October");
        System.out.println("Enter 11 for November");
        System.out.println("Enter 12 for Decmber");
        System.out.println();
        int m=Integer.parseInt(br.readLine());
        System.out.println("Your Choice: "+m);
        switch(m)
        {
            case 1:
            System.out.println("1st month of year is January");
            break;
            case 2:
            System.out.println("2nd month of year is February");
            break;
            case 3:
            System.out.println("3rd month of year is March");
            break;
            case 4:
            System.out.println("4th month of year is April");
            break;
            case 5:
            System.out.println("5th month of year is May");
            break;
            case 6:
            System.out.println("6th month of year is June");
            break;
            case 7:
            System.out.println("7th month of year is July");
            break;
            case 8:
            System.out.println("8th month of year is August");
            break;
            case 9:
            System.out.println("9th month of year is September");
            break;
            case 10:
            System.out.println("10th month of year is October");
            break;
            case 11:
            System.out.println("11th month of year is November");
            break;
            case 12:
            System.out.println("12th month of year is December");
            default:
            System.out.println("You are a foolish");
        }
    }
}
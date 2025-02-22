 import java.util.Scanner;
    class celcius_to_farenheit_and_vice_versa_switch
    {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a;
        double z,t;
        System.out.println("Enter the temperature you want to convert");
        t=in.nextDouble();
        System.out.println("Enter 1 for converting it into celcius value, 2 for converting it into farenheit value");
        a=in.nextInt();
        switch (a)
        {
            case 1:
            z=(t-32)/9*5;
            System.out.println("Converted temperature is "+z+" degree C");
            break;
            
            case 2:
            z=(t*1.8)+32;;
            System.out.println("Converted temperature is "+z+" degree F");
            break;
            
           
            default:
            System.out.println("Out of choice");
            break;
        }
    }
    }
            
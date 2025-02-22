import java.io.*;
class my_switch
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 for area of square");
        System.out.println("Enter 2 for perimeter of square");
        int side=Integer.parseInt(br.readLine());
        System.out.println("Side= "+side+" cm");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Your Choice is: "+a);
        int area,peri;
        switch(a)
        {
            case 1:
            area=side*side;
            System.out.println("Area of square is: "+area);
        break;
            case 2:
            peri=4*side;
            System.out.println("Perimeter of square is: "+peri);
    }
}
}
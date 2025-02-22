/**
 * A sample program to create a banner consisting of names of different teams displayed sidewise
 */
import java.io.*;
class Teams
{
    public static void main(String args[])throws IOException//declaration of main method
    {
        int c,i,len=0,j;
        InputStreamReader read=new InputStreamReader(System.in);//declaration of buffered reader
        BufferedReader in=new BufferedReader(read); 
        System.out.println("Enter the num of teams you want to enter");
        int n=Integer.parseInt(in.readLine());//accepting number of teams
        if(n<=2||n>=9)//displaying error message if n is less than or equals to two or if n is greater than or equals to nine
        {
            System.out.println("Invalid Input");
        }
        else
        {
            String b[]=new String[n];//initialising string array of size n
            System.out.println("Enter the teams:");//accepting the names of the teams
            for(i=0;i<n;i++)
            {
                System.out.println("Team"+" "+(i+1)+":");
                b[i]=in.readLine();
                System.out.println("The teams are:");
                if(len<b[i].length())
                {
                    len=b[i].length();
                }
            }
            //putting the names of the teams as required in the banner
            for(i=0;i<len;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i<b[j].length())
                    System.out.print(b[j].charAt(i)+"\t");
                    else
                    System.out.print("\t");
                }
                System.out.println();
            }
        }
    }//end of main method
}//end of class
            
            
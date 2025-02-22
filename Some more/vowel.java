import java.io.*;
class vowel
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an alphabet to check it is a vowel or not");
        char v=(char)(br.read());
            if((v=='a')||(v=='e')||(v=='i')||(v=='o')||(v=='u'))
            {
                System.out.println("Yes it is a vowel");
            }
            else
            {
                System.out.println("No it is not a vowel");
            }
        }
    }
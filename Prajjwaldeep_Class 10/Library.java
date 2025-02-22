import java.util.Scanner;
public class Library
{
    int acc_num;
    String title;
    String author;
    int l;
    int f;
    Scanner in=new Scanner(System.in);
    Library()
    {
        acc_num=0;
        title=" ";
        author=" ";
        l=0;
        f=0;
    }
    void input()
    {
        System.out.println("Enter accession number, title and author of the book : ");
        acc_num=in.nextInt();
        title=in.next();
        author=in.next();
        System.out.println("Enter the number of days you are late : ");
        l=in.nextInt();
    }
    void calculate()
    {
        f=l*2;
    }
    void display()
    {
        System.out.println("Accession number is : "+acc_num);
        System.out.println("Title of the book is : "+title);
        System.out.println("Author of the book is : "+author);
        System.out.println("Number of days late : "+l);
        System.out.println("Late fine is : Rs "+f);
    }
    public static void main(String args[])
    {
        Library ob=new Library();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
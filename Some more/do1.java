import java.io.*;
class do1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter principal,rate and time");
        double p=Double.parseDouble(br.readLine());
        double r=Double.parseDouble(br.readLine());
        double t=Double.parseDouble(br.readLine());
        double si,amt,ci;;
        do
        {
            si=(p*r*t)/100;
            amt=si+p;
            ci=p*((Math.pow((1+r/100),(t))-1));
            System.out.println("You hava entered: ");
            System.out.println("Pricipal= "+p);
            System.out.println("Rare= "+r);
            System.out.println("Time= "+t);
            System.out.println("Simple Interest(SI)= "+si);
            System.out.println("Amount= "+amt);
            System.out.println("Compound Interest(CI)= "+ci);
        }
    while((p<=0)||(r<=0)||(t<=0));
    {
}
}
}
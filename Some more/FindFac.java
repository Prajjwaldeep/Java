class FindFac
{
public static void main(String args[])
{
for(int i=1; i <= 40; i++)
{
System.out.print("Factors of " + i + ": ");
for(int j = 1; j < i; j++)
if((i%j) == 0) 
System.out.print(j + " ");
System.out.println();
}
}
}
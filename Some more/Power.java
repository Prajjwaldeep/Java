class Power
{
public static void main(String args[])
{
int b;
int result;
for(int i=0; i<10;i++)
{
result = 1;
b = i;
while(b > 0)
{
result *= 2;
b--;
}
System.out.println("2 to the power of " + i + " is " + result);
}
}
}
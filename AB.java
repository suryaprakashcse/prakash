public class AB
{
public static void pyramidPattern(intn)
{
for(int i=0;i<n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print("");
}
for(int j=0;j<=1;j++)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[])
{
int n=5;
pyramidpattern(n);
}
}
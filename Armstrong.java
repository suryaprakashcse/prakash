class Armstrong
{
public static void main(String args[])
{
int num=371,orinum,result;
result=0;
orinum=num;
while(orinum!=0)
{
result=orinum%10;
result+=(result*result*result);
orinum/=10;
}
if(result==num)
System.out.println(num+"is an Armstrong number");
else
System.out.println(num+"is not an Armstrong number");
}
}
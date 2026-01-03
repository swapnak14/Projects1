class Armstrong
{
public static void main(String[] args)
{
int num=453,rev,temp,sum=0;
temp=num;
while(num>0)
{
rev=num%10;
sum=sum+(rev*rev*rev);
num=num/10;
}
if(temp==sum)
{
System.out.println("Armstrong");
}
else
{
System.out.println("not Armstrong");
}
}
}

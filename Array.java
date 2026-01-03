import java.util.*;
class Array
{
public static void main(String[] args)
{
int arr[]={3,7,5,8};
int result=0,maxsize=11;
for(int i=1;i<arr.length;i++)
{
result=arr[0]+arr[i];
}
if(maxsize==result)
{
System.out.println("return="+result);
}
}
}
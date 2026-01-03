import java.util.*;
class Array2
{
public static void main(String[] args)
{
int arr[]={3,7,5,8,10};
int result=0;
for(int i=1;i<arr.length;i++)
{
result=arr[0]+arr[i+1];
i=i+2;
}
System.out.println("return="+result);
}
}

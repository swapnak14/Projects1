import java.util.*;
class Bubblesort
{
public static void main(String[] args)
{
String[] s={"subbareddy","obullamma"};
String temp;
for(int i=0;i<s.length;i++)
{
for(int j=0;j<s.length-1-i;j++)
{
if(s[j].compareTo(s[j+1])>0)
{
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]+"");
}
}
}

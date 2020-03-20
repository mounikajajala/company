public class Fibonacci
{
public static void main(String args[])
{
int f=0,s=1,t=0;
for(int i=0;i<=9;i++)
{
    f=s;
    s=t;
    t=f+s;
    System.out.print(s+" ");
    
}
}
}
 
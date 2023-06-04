import java.util.Scanner;
class P403
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a,b;
a=scob.nextInt();
b=scob.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+" "+b);
}
}
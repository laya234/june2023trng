import java.util.Scanner;
class Swap1
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
System.out.print(a+" "+b)
}
}
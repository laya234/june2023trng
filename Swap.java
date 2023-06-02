import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
int t;
t=num1;
num1=num2;
num2=t;
System.out.println(num1+"\n"+num2);
}
}
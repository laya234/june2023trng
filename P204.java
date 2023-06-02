import java.util.*;
public class P204{
static int diff(int a,int b){return a-b;}
static int prod(int a,int b){return a*b;}
static int smallest(int a,int b){
if(a<b)return a;
if(b<a)return b;
return 0;}
static int largest(int a,int b){
if(a>b)return a;
if(b>a)return b;
return 0;}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,d,e,f,g;
System.out.println("Enter a number");
num1=sc.nextInt();
System.out.println("Enter a number");
num2=sc.nextInt();
d=diff(num1,num2);
e=prod(num1,num2);
f=smallest(num1,num2);
g=largest(num1,num2);
System.out.println("Difference is"+d);
System.out.println("Product is"+e);
System.out.println("Smallest is"+f);
System.out.println("largest is"+g);
}
}

 
import java.util.Scanner;
class P1201{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0,b=1;
System.out.println("Enter nth value: ");
n=sc.nextInt();
System.out.println("Fibonacci series: ");
while(sum<=n){
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}
}
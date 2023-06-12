import java.util.Scanner;
class Factorial{
public static int calculateFactorial(int n){
if(n==0) 
returnn 1;
else
return n*calculateFactorial(n-1);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num<0) {
System.out.print("INVALID");}
else {
System.out.print(calculateFactorial(int num));}
}
}
import java.util.*;
public class P202{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=scob.nextInt();
if(n/2*2==n)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}
}
}
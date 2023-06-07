import java.util.Scanner;
public class P602{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i,rev=0;
int j=a;
while(a>0){
i=a%10;
rev=(rev*10)+i;
a=a/10;
}
if(j==rev)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
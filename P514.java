import java.util.Scanner;
class P514{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int rd=0;
while(b>0){
rd=(rd*10)+(b%10);
b=b/10;
}
System.out.print(rd);
}
}
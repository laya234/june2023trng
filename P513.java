import java.util.Scanner;
class P513{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int pd=1;
while(b>0){
pd=pd*(b%10);
b=b/10;
}
System.out.print(pd);
}
}
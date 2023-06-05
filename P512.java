import java.util.Scanner;
class P512{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int sd=0;
while(b>0){
sd=sd+b%10;
b=b/10;
}
System.out.print(sd);
}
}
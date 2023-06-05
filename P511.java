import java.util.Scanner;
class P511{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
int p=sc.nextInt();
int r=1;
for(int k=1;k<=p;k++)
r=r*b;
System.out.print(r);
}
}
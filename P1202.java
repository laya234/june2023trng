import java.util.Scanner;
class P1202{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
pattern(n);
rpattern(n);
}
public static void pattern(int n){
for(int i=1;i<=n;i++)
line(i);
}
public static void line(int i){
for(int j=1;j<=i;j++)
System.out.print(j);
System.out.println("");
}
public static void rpattern(int n){
for(int i=n;i>=1;i--)
line(i);
}
}
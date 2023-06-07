import java.util.Scanner;
class P613{
public static void stars(int i,char c){
for(int k=0;k<i;k++){
System.out.println();
for(int j=0;j<=k;j++)
System.out.print(c);}}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String d=sc.next();
char e=d.charAt(0);
int l=sc.nextInt();
stars(l,e);
}
}
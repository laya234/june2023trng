import java.util.Scanner;
class P609{
public static void stars(int i,char c){
int k=0;
for(k=1;k<=i;k++)
System.out.println(c);}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
String d=sc.next();
char e=d.charAt(0);
stars(l,e);
}
}
import java.util.Scanner;
class P614{
public static void line(char c,int col){
System.out.println();
for(int j=1;j<=col;j++)System.out.print(c);
}
public static void stars(char c,int l){
for(int i=1;i<=l;i++)
line(c,i);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int l=sc.nextInt();
stars(c,l);
}
}

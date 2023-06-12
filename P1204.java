import java.util.Scanner;
class P1204{
public static void line(char c,int nh,int na){
char ch=' ';
for(int j=1;j<=nh;j++)System.out.print(ch);
for(int j=1;j<=na;j++)System.out.print(c);
for(int j=1;j<=nh;j++)System.out.print(ch);
System.out.println();
}
public static void pattern(char c,int l){
for(int i=l/2,j=1;i>0 && j<l;i--,j=j+2)
line(c,i,j);
}
public static void rpattern(char c,int l){
for(int i=0,j=l;i<=l/2 && j>=1;i++,j=j-2)
line(c,i,j);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int l=sc.nextInt();
pattern(c,l);
rpattern(c,l);
}
}
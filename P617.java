import java.util.Scanner;
class P617{
public static void line(char c,int nc1,int nc2){
System.out.println();
char ch=' ';
for(int j=0;j<=nc1;j++)System.out.print(ch);
for(int j=0;j<=nc2;j++)System.out.print(c);
for(int j=0;j<=nc1;j++)System.out.print(ch);
}
public static void pattern(char c,int l){
for(int i=l/2,j=1;j<=l;i--,j+=2)
line(c,i,j);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int l=sc.nextInt();
pattern(c,l);
}
}
import java.util.Scanner;
class P616{
public static void line(char c,int col){
System.out.println();
for(int j=1;j<=col;j++)System.out.print(c);
}
public static void pattern(char c,int l){
for(int i=1;i<=l;i++)
line(c,i);
}
public static void rpattern(char c,int l){
for(int k=l;k>=1;k--)
line(c,k);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int l=sc.nextInt();
int x,y;
if((l/2)==0){
x=l/2;
y=l/2;
pattern(c,x);
rpattern(c,y);
}
else{
x=l/2;
y=(l/2)+1;
pattern(c,x);
rpattern(c,y);
}
}
}
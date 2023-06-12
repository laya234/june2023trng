import java.util.Scanner;
class P1203{
static int x=0;
public static void pattern(int n){
for(int i=0;x<=n;i++){
line(i);
System.out.println("");
}
}
public static void line(int stop){
for(int i=0;i<=stop;i++){
System.out.print(x++);
if(i<stop)
System.out.print(",");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
pattern(n);
}
}
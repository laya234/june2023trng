import java.util.Scanner;
class P608{
public static void stars(int i){
int k;
for(k=1;k<=i;k++)
System.out.println("*");}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
stars(l);
}
}
import java.util.Scanner;
class P402{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
String str="";
for(int d=0;d<=a;d=d+b){
str=str+d+",";
}
for(int d=0;d<str.length()-1;d++)
System.out.print(str.charAt(d));
}
}
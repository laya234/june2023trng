import java.util.Scanner;
class P515{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1;
String rs="";
System.out.println("Enter string: ");
s1=sc.next();
int l=s1.length()-1;
for(int i=l;i>=0;i--){
rs=rs+s1.charAt(i);
}
System.out.print(rs);
}
}
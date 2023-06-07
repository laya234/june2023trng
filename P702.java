import java.util.Scanner;
class P702{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1;
String rs="";
System.out.println("Enter string: ");
s1=sc.nextLine();
for(int i=0;i<=s1.length()-1;i++)
{
if(s1.charAt(i)>='0'&& s1.charAt(i)<='9')
{rs=rs+s1.charAt(i);}
}
System.out.print(rs);
}
}

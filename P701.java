import java.util.Scanner;
class P701{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1;
String rs="";
String temp="";
int ascii;
System.out.println("Enter string: ");
s1=sc.next();
int l=s1.length()-1;
for(int i=l;i>=0;i--){
if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
ascii=s1.charAt(i);
ascii=ascii+32;
temp=temp+(char)ascii;
}
else
{
temp=temp+s1.charAt(i);}
}
System.out.println("temp "+temp);
s1=temp;
for(int i=l;i>=0;i--)
rs=rs+s1.charAt(i);
if(s1.equals(rs))
System.out.print("YES");
else
System.out.print("NO");
}
}
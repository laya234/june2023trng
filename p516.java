import java.util.Scanner;
class p516{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1;
String rs="";
System.out.println("Enter string: ");
s1=sc.next();
int l=s1.length()-1;
int h=0;
int x=0;
while(l>h){
if(s1.charAt(h++)==s1.charAt(l--))
{x++;}}
if(x==s1.length()){
System.out.println("String is palindrome");}
else{
System.out.println("String is not palindrome");}
}}


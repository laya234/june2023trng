import java.util.*;
public class P206{
public static void main(String args[]){
char ch;
System.out.print("Enter a digit");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
System.out.println();
if(ch>='0'&&ch<='9')
System.out.println(ch+"is an digit");
else
System.out.println(ch+"is not an digit");
}
}
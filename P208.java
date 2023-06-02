import java.util.*;
public class P208
{
public static void main(String args[])
{
char ch;
System.out.println("Enter the character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int y=(int)ch;
System.out.println("The ascii value of "+ch+" is " +y);
}
}
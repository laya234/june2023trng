import java.util.Scanner;
class P503{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
if(i>j){
System.out.println("Maximum number is "+i);
System.out.println("Minimum number is "+j);
}
else{
System.out.println("Maximum number is "+j);
System.out.println("Minimum number is "+i);
}
}
}
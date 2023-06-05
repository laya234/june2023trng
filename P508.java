import java.util.Scanner;
class P508{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int count=0;
while(count<i+1){
System.out.print(count);
if(count<i)
System.out.print(",");
count++;
}
}
}
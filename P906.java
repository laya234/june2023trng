import java.util.Scanner;
class P906{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int k=0;
int count=0;
for(int i=1;i<=c;i++){
if(c%i==0){
System.out.print(i);
count++;
if(i!=c)
System.out.print(",");
else
System.out.println("");
}
}
System.out.println("count: "+count);
if(count==2)
System.out.println("PRIME");
else
System.out.println("NOT PRIME");
}
}
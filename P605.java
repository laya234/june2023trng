import java.util.Scanner;
class P605{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int k=sc.nextInt();
if((i<j)&&(i<k))
System.out.println(i+" is smallest");
else if((j<i)&&(j<k))
System.out.println(j+" is smallest");
else
System.out.println(k+" is smallest");


}
}
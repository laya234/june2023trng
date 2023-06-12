import java.util.Scanner;
class P914{
public static void main(String args[]){
int n,i=0,j=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter no of elements you want in array: ");
n=s.nextInt();
int a[]=new int[n];
System.out.print("Enter all the elements");
for(i=0;i<n;i++){
a[i]=s.nextInt();}
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
int tem=0;
if(a[i]<a[j]){
tem=a[i];
a[i]=a[j];
a[j]=tem;
}
}

System.out.print(a[i]+" ");
}
System.out.print("Largest element is "+a[0]);
}
}


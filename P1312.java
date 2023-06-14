class P1312{
public static void main(String args[]){
int a[]=new int[5];
a[0]=0;a[1]=5;a[2]=10;a[3]=15;a[4]=55;
try{
for(int i=0;i<=5;i++)
System.out.println(100/a[i]);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
catch(Exception e)
{
System.out.println("Parent Exception occurs");
}
System.out.println("Rest of Code");
}
}

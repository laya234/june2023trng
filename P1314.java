class P1314{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=80/0;
}
catch(Exception e)
{
System.out.println("task2 completed");
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfBoundsException occurs");
}
System.out.println("Rest of Code");
}
}

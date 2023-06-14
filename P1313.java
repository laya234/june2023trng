class P1313{
public static void main(String args[]){
String s=null;
try{
System.out.println(s.length());
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

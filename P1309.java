class P1309{
public static void main(String args[]){
try{
int a[]={1,2,3,4};
System.out.println(a[10]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("Rest of code");
}
}

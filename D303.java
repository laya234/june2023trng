class D303{
public static void main(String args[]){
String s1="Sachin";
String s2="Sachin";
String s3=new String("SAchin");
String s4="Laya";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s4));
}
}
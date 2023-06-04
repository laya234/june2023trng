class D309{
public static void main(String args[]){
StringBuilder s1=new StringBuilder("Hello");
StringBuilder s2=new StringBuilder("World");
StringBuilder s3=s1.append(s2);
System.out.println(s3.toString());
}
}
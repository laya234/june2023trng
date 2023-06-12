class P807{
static int data=30;
static class Inner{
void msg(){System.out.println("data is "+data);}
}
public static void main(String args[]){
P807.Inner obj=new P807.Inner();
obj.msg();
}
}
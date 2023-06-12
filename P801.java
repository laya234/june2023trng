class P801{
void m(P801 obj){
System.out.println("method is invoked");
}
void p(){
m(this);
}
public static void main(String args[]){
P801 s1=new P801();
s1.p();
}
}
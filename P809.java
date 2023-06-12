class P809{
void run(){System.out.println("running");}
}
class Honda extends P809{
void run(){
System.out.println("running safely with 100kmph");}
public static void main(String args[])
{
Honda obj=new Honda();
obj.run();
}
}
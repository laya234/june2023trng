public class P1206 extends Thread{
public static void main(String args[]){
P1206 pob=new P1206();
pob.start();
System.out.println("Thread inside main are very helpful in java");
}
public void run(){
System.out.print("Threads from overridden rum method is important");
}
}

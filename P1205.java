public class P1205 extends Thread{
public static void main(String args[]){
P1205 tob=new P1205();
tob.start();
System.out.println("This code is outside of thread");
}
public void run(){
System.out.print("This code is running in thread");
}
}

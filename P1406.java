class P1406{
public static void main(String args[])throws Exception{
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new MyThread(){
public void run(){
System.out.println("Shut down task has completed");
}
}
);
System.out.println("Now main sleeping..press ctrl+c to exit");
try{Thread.sleep(3000);}
catch(Exception e){}
}
}



import java.util.*;
class P1315 extends Exception{
String msg;
P1315(String msg){
super(msg);+
this.msg=msg;
}
public String toString(){
return msg;
}
}
class P1316{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int roll=sc.nextInt();
String name=sc.next();
int marks=sc.nextInt();
try{
if(marks<0){
throw new P1315("Marks should not be negative,Marks=0");
}
}
catch(P1315 ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}

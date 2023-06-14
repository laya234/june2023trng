import java.util.*;
class P1315 extends Exception{
String msg;
P1315(String msg){
super(msg);
this.msg=msg;
}
public String toString(){
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
try{
if(age<18){
throw new P1315("entered age does not fulfill required age limit");
}
}
catch(P1315 ex){
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}

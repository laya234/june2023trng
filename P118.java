import java.io.*;
class P118{
public static void main(String args[]) throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name="";
while(!name.equals("stop")){
System.out.println("Enter data: ");
name=br.readLine();
System.out.println(name+" is an idiot");
}
br.close();
r.close();
}
}
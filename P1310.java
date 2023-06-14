import java.io.FileNotFoundException;
import java.io.PrintWriter;
class P1310{
public static void main(String args[]){
PrintWriter pw;
try{
pw=new PrintWriter("xcd.txt");
pw.println("saved");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("File Saved Successfully");
}
}

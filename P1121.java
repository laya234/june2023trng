import java.io.CharArrayWriter;
import java.io.FileWriter;
class P1121{
public static void main(String args[]) throws Exception{
CharArrayWriter out=new CharArrayWriter();
out.write("laya you did it");
FileWriter f1=new FileWriter ("D:\\fh\\a.txt");
FileWriter  f2=new FileWriter ("D:\\fh\\b.txt");
FileWriter f3=new FileWriter ("D:\\fh\\c.txt");
FileWriter f4=new FileWriter ("D:\\fh\\d.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);
out.writeTo(f4);
f1.close();
f2.close();
f3.close();
f4.close();
System.out.print("Successs");
}
}
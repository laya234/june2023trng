import java.io.*;
class P1123{
public static void main(String args[]) throws Exception{
FileReader fr=new FileReader("D:\\fh\\demo2.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDig=0;
while((i=br.read())!=-1)
if((char)i>='0' && (char)i<='9')
{countDig++;}
System.out.print(countDig);
br.close();
fr.close();

}
}
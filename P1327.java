import java.util.Iterator;
import java.util.Vector;
class P1327{
public static void main(String args[]){
Vector<String> animals=new Vector<String>();
animals.add("Dog");
animals.add("Cat");
animals.add("Horse");
String element=animals.get(2);
System.out.println("Element at index 2:"+element);
Iterator<String> iterate=animals.Iterator();
System.out.println("Vector: ");
while(iterate.hasNext()){
System.out.print(iterate.next());
System.out.print(",");
}
}
}

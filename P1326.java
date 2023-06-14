import java.util.Vector;
class P1326{
public static void main(String args[]){
Vector<String> mammals=new Vector<String>();
mammals.add("Dog");
mammals.add("Cat");
mammals.add("Horse");
System.out.println("Vector: "+mammals);
Vector<String> animals=new Vector<String>();
animals.add("Crocodile");
animals.addAll(mammals);
System.out.println("New Vector: "+animals);
}
}

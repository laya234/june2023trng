import java.util.ArrayList;
class P1325{
public static void main(String args[]){
ArrayList<String> animals=new ArrayList<String>();
animals.add("Dog");
animals.add("Cat");
animals.add("Horse");
System.out.println("ArrayList: "+animals);
System.out.println("Accessing individual elements: ");
for(String temp : animals){
System.out.print(temp);
System.out.print(",");
}
}
}
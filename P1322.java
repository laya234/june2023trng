import java.util.ArrayList;
class P1324{
public static void main(String args[]){
ArrayList<String> languages=new ArrayList<String>();
languages.add("Java");
languages.add("Python");
languages.add("C");
System.out.println("ArrayList: "+languages);
languages.set(2,"HTML");
System.out.println("Modified ArrayList: "+languages);
}
}
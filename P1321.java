import java.util.List;
import java.util.ArrayList;
class P1321{
public static void main(String args[]){
List<Integer> numbers=new LinkedList<Integer>();
numbers.add(7);
numbers.add(4);
numbers.add(6);
System.out.println("list: "+numbers);
int number=numbers.get(2);
System.out.println("Accessed element: "+number);
int index=numbers.indexOf(2);
System.out.println("Position of 3 is: "+index);

int removedNumber=numbers.remove(1);
System.out.println("Removed element: "+removednumber);
}
}


import java.util.List;
import java.util.ArrayList;
class P1320{
public static void main(String args[]){
List<Integer> numbers=new ArrayList<Integer>();
numbers.add(7);
numbers.add(4);
numbers.add(6);
System.out.println("list: "+numbers);
int number=numbers.get(2);
System.out.println("Accessed element: "+numbers);
int removedNumber=numbers.remove(1);
System.out.println("Removed element: "+removedNumber);
System.out.println("list: "+numbers);
}
}


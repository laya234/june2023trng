import java.util.Scanner;
class Student5{
int id;
String name;
int age;
Students5(int i,String n){
id=i;
name=n;
}
Students5(int i,String n,int a)
id=i;
name=n;
age=a;
}
void display(){
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[]){
Student5 s1=new Student5(111,"Laya");
Student5 s2=new Student5(101,"Chaitu",54);
s1.display();
s2.display();
}
}

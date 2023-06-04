import java.util.Scanner;
class Student{
int id;
String name;
void insert(int r,String n){
id=r;
name=n;
}
void display(){System.out.println(id+" "+name);}
}
class P408{
public static void main(String args[]){
Student s1=new Student();
Student s2=new Student();
s1.insert(563,"Laya");
s2.insert(523,"Gayi");
s1.display();
s2.display();
}
}

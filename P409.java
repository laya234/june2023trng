
class Student{
int id;
String name;
Student(){id=0;name=null;}
Student(int r,String n){
id=r;
name=n;
}
void display(){System.out.println(id+" "+name);}
}
class P409{
public static void main(String args[]){
Student s1;
s1=new Student(111,"test");

Student s2=new Student(523,"Gayi");
s1.display();
s2.display();
}
}

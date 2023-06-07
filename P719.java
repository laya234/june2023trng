class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){
System.out.println(this.rollno+" "+this.name+" "+this.fee);
}
}
class P719{
public static void main(String args[]){
Student s1=new Student(111,"Laya",30000);
Student s2=new Student(222,"Chaitu",30000);
s1.display();
s2.display();
}
}
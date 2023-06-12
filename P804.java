class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="IIT";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){
System.out.println(rollno+" "+name+" "+college);
}
}
public class P804{
public static void main(String args[]){
Student.change();
Student s1=new Student(101,"Laya");
Student s2=new Student(102,"Kavya");
Student s3=new Student(102,"Anoop");
s1.display();
s2.display();
s3.display();
}
}
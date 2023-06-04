class Employee{
int id;
String name;
float salary;
void insert(int r,String n,float s){
id=r;
name=n;
salary=s;
}
void display(){System.out.println(id+" "+name+" "+salary);}
}
class P410{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(101,"Laya",5200);
e2.insert(523,"Gayi",65.600f);
e3.insert(103,"Chaitu",58);
e1.display();
e2.display();
e3.display();
}
}

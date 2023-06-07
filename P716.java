class Animal{
void eat(){System.out.print("Eating");}
}
class Dog extends Animal{
void bark(){System.out.println("Barking");}
}
class P616{
public static void main(String args[]){
Dog d=new Dog();
d.bark();
d.eat();
}
}
      
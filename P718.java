class Animal{
void eat(){System.out.println("Eating");}
}
class Dog extends Animal{
void bark(){System.out.println("Barking");}
}
class Cat extends Dog{
void meow(){System.out.println("meowing");}
}
class P618{
public static void main(String args[]){
Dog d=new Dog();
Cat c=new Cat();
d.bark();
d.eat();
c.meow();
c.eat();
}
}
      
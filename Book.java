public class Book{
String name;
int price;
Author author;
Book(String n,int p,Author author){
this.name=name;
this.price=price;
this.author=author;
}
public static void main(String args[]){
Author author=new Author("Laya",19,"USA");
Book b=new Book("Java for Beginner",800,author);
System.out.println("Book name "+b.name);
System.out.println("Book price "+b.price);
System.out.println("Author Details");
System.out.println("Author name "+b.author.authorName);
System.out.println("Author age "+b.author.age);
System.out.println("Author place "+b.author.place);
}
}

class Rectangle{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void Area(){System.out.println(length*width);}
}
class P411{
public static void main(String args[]){
Rectangle R1=new Rectangle();
Rectangle R2=new Rectangle();
R1.insert(10,52);
R2.insert(5,6);
R1.Area();
R2.Area();
}
}

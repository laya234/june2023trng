class P412{
void fact(int n){
int fact=1;
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial is  "+fact);
}
public static void main(String args[]){
new P412().fact(5);
}
}

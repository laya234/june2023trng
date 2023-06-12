import java.util.Scanner;
class P908{
public static void main(String args[]){
int sum=0;
int[] numbers={12,5,7,-7,2,1,4,5};
int arraylength=numbers.length;
System.out.println("Using for each loop");
for(int number:numbers){
sum=sum+number;
double average=((double)sum/(double)arraylength);
System.out.println("Sum = "+sum);
System.out.println("Average = "+average);
}
}
}

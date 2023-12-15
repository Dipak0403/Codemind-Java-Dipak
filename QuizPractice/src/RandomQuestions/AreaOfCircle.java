package RandomQuestions;
import java.util.Scanner;

public class AreaOfCircle {
public static void main(String Args[]) {
    final double pi=3.14;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of circle :");
    double r=sc.nextDouble();
    double Area=pi*r*r;
    System.out.println("Area of circle is :"+Area);
    sc.close();
}
}

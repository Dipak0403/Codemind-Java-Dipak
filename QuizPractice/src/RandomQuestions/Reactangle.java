package RandomQuestions;
import java.util.Scanner;

public class Reactangle {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Length of Rectangle :");
	    double l=sc.nextDouble();
	    System.out.println("Enter Breadth of Rectangle :");
	    double b=sc.nextDouble();
	    System.out.println("Enter Height of Rectangle :");
	    double h=sc.nextDouble();
	    double Area=l * b * h;
	    System.out.println("Area of Rectangle is :"+Area);
	    sc.close();
	}
	}


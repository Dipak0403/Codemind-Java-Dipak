package calculator;
import java.util.Scanner;

public class Calculator {
  public static void main(String args[]) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your Obtain Marks :");
	  double obtainMarks=sc.nextDouble();
	  System.out.println("Enter Total Marks :");
	  double totalMarks=sc.nextDouble();
	  double percentage=(obtainMarks/totalMarks)*100;
	  System.out.println("Your Percentage is :");  
	  System.out.println(percentage);
	  sc.close();
	  }
}

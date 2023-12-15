package RandomQuestions;
import java.util.Scanner;

public class Addition {
  public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a :");
	 int a=sc.nextInt();
	System.out.println("Enter value of b :");
	int b=sc.nextInt();
	//Addition
	{
	   int sum= a + b;
	   System.out.println("Addition is"+sum);
	}
	//Multiplication
	{
	   int mul=a * b;
	   System.out.println("Multiplication is"+mul);
	}
	//Division
	{
	   int Div= a / b;
	   System.out.println("Division is"+Div);
	}
	//Modulo operator = return reminder
	{
		int mod= a % b;
		System.out.println("Reminder is"+mod);
	}
	sc.close();
  }
}

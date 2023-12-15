package Project;

import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	Library library=new Library();
	Scanner scanner=new Scanner(System.in);
	String loginStudentId=null;
	String loginAdminId=null;
	
	while(true) {
		if(loginStudentId==null && loginAdminId==null) {
			System.out.println("1:Register as Student.");
			System.out.println("2:Login as Student.");
			System.out.println("3:Register as Admin.");
			System.out.println("4:Login as Admin.");
			System.out.println("5: Logout");
			System.out.println("Enter your Choice :");
			int choice=scanner.nextInt();
			scanner.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter your Id :");
			String id=scanner.nextLine();
			System.out.println("Enter your Password");
			String password=scanner.nextLine();
			library.registerStudent(id, password);
			System.out.println("Register successfully");
			break;
		case 2:
			System.out.println("Enter your Id :");
		    id=scanner.nextLine();
			System.out.println("Enter your Password");
		    password=scanner.nextLine();
			if(library.loginStudent(id, password)) {
				loginStudentId=id;
				System.out.println("Login Successfully!");
			}else {
				System.out.println("You Enter Invalid Id or Password");
			}break;
		case 3:
			System.out.println("Enter Your Id :");
			id=scanner.nextLine();
			System.out.println("Enter your Password :");
		    password=scanner.nextLine();
			library.registerAdmin(id, password);
			System.out.println("Register Successfully");
			break;
		case 4:
			System.out.println("Enter your Admin Id :");
		    id=scanner.nextLine();
			System.out.println("Enter your Password");
		    password=scanner.nextLine();
			if(library.loginAdmin(id, password)) {
				loginAdminId=id;
				System.out.println("Login Successfully!");
			}else {
				System.out.println("You Enter Invalid Id or Password");
			}break;
		case 5:
			scanner.close();
			System.exit(0);
			
			default:
				System.out.println("Invalid Choice!please Enter Valid Option");
		}
		}else if(loginAdminId !=null){
			System.out.println("1:Add Book.");
			System.out.println("2:Display Book.");
			System.out.println("3:Logout.");
			System.out.println("Enter your Choice :");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter Book ID :");
				String id=scanner.nextLine();
				System.out.println("Enter Book Title :");
				String title=scanner.nextLine();
				library.addBook(id,title);
				break;
			case 2:
				library.displayBook();
				break;
			case 3:
				loginAdminId=null;
				break;
				default:
					System.out.println("Invalid Choice! Enter valid option");
				}
			}else {
				System.out.println("1:Issue Book");
				System.out.println("2:Return Book");
				System.out.println("3:Display Books");
				System.out.println("4:Logout");
				System.out.println("Enter your Choice :");
				int choice=scanner.nextInt();
				scanner.nextLine();
				
				switch(choice) {
				case 1:
					System.out.println("Enter Book Id to isssue :");
					String id=scanner.nextLine();
					library.issueBook(id, loginStudentId);
					break;
				case 2:
					System.out.println("Enter Book Id to return :");
					id=scanner.nextLine();
					library.returnBook(id, loginStudentId);
					break;
				case 3:
					library.displayBook();
					break;
				case 4:
					loginStudentId=null;
					break;
					default:	
						System.out.println("Invalid Choice! Enter valid option");
					
				}
			}
		}
	}
}

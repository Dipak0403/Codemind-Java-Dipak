package Project;

public class Library extends Main {
Book[]books=new Book[100];
int bookCount=0;
Student[]students=new Student[100];
int studentCount=0;
Admin[]admins=new Admin[100];
int adminCount=0;

void registerAdmin(String id,String password) {
if(adminCount<admins.length) {
	admins[adminCount++]=new Admin(id,password);
}else {
	System.out.println("Admin Registration reached its limit.");
}
}

boolean loginAdmin(String id,String password) {
	for(int i=0;i<adminCount;i++) {
		if(admins[i].id.equals(id) && admins[i].password.equals(password)) {
			return true;
		}
	}
	return false;
}

void registerStudent(String id,String password) {
	if(studentCount<students.length) {     //if studentCount is less than students array length then students array Increaments means new id pass can be store.
	students[studentCount++]=new Student(id,password);
	}else {
		System.out.println("Student Registration reached its limit.");
	}
}	
 boolean loginStudent(String id,String password) {
    for(int i=0;i<studentCount;i++) {
    	if(students[i].id.equals(id) && students[i].password.equals(password)) {
    		return true;
    	}
     }
     return false;
 }	 
void addBook(String id,String title) {
	if(bookCount<books.length) {
		books[bookCount++]=new Book(id,title);
	}else {
		System.out.println("Books storage reached its limit.");
	}
}

void issueBook(String bookId,String studentId) {
	for(int i=0;i<bookCount;i++) {
		if(books[i].id.equals(bookId)) {
			if(books[i].issuedto==null) {               //== means equals to.
				books[i].issuedto=studentId;            //if null then book issued to studentId
				System.out.println("Book issued succesfully");
				return;     //we use here void hence we use return type to return ther answer.
			}else {
			System.out.println("Book is already issued");
			return;
			}
		  } 
		} 
	     System.out.println("Book not found.");
}

void returnBook(String bookId,String studentId) {
	for(int i=0;i<bookCount;i++) {
		if(books[i].id.equals(bookId)) {
			if(books[i].issuedto!=null && books[i].issuedto.equals(studentId)) {
				books[i].issuedto=null;   //assigned to null value.
				System.out.println("Book return Succesfully");
				return;
		}else {
			System.out.println("Book is not issued to you");
			return;
		}
	  }
   }
	 System.out.println("Book not found.");
}
void displayBook() {
	for(int i=0;i<bookCount;i++) {
		System.out.println("ID:"+ books[i].id +", Title:"+ books[i].title + ", Issuedto:"+(books[i].issuedto==null ? " none": books[i].issuedto));
	}
}
}

























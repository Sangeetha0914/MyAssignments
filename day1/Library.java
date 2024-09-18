package week1.day1;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book added Successfully");
		return bookTitle;
	}
	public void issuebook() {
		System.out.println("Book issued Successfully");
	}
	public static void main(String[]args) {
		Library lib=new Library();
		lib.addBook("bookTitle");
		lib.issuebook();
				
		
		
	}
	}



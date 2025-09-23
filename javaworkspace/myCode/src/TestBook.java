//import java.util.Iterator;
import java.util.Scanner;
class Book{
	int bookId;
	String bookName;
	String authorName;
	String category;
	double rating;
	double price;
	Book() {
		this.bookId = 100;
		this.bookName = "Not Given";
		this.authorName = "Not Given";
		this.category = "Not Given";
		this.rating = 0;
		this.price = 0;
	}
	Book(int bookId, String bookName, String authorName, String category, double rating, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.category = category;
		this.rating = rating;
		this.price = price;
	}
	int getBookId() {
		return bookId;
	}
	void setBookId(int bookId) {
		this.bookId = bookId;
	}
	String getBookName() {
		return bookName;
	}
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	String getAuthorName() {
		return authorName;
	}
	void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	String getCategory() {
		return category;
	}
	void setCategory(String category) {
		this.category = category;
	}
	double getRating() {
		return rating;
	}
	void setRating(double rating) {
		this.rating = rating;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("ID: "+this.bookId);
		System.out.println("Name: "+this.bookName);
		System.out.println("Author: "+this.authorName);
		System.out.println("Price: "+this.price);
		System.out.println("Rating: "+this.rating);
		System.out.println("Category: "+this.category);
	}
	
	
}
class Library{
	Scanner sc = new Scanner(System.in);
	int counter=0;
	Book[] bookArr=new Book[3];
	public Library() {
		// TODO Auto-generated constructor stub
		hardcodedBooks();
	}
	void addBook() {
		System.out.println("Enter a book details ");
		for(int i=0;i<bookArr.length;i++) {
			
			System.out.println("Enter a ID : ");
			int id = sc.nextInt();
			
			System.out.println("Enter a Book Name : ");
			String bookName = sc.next();
			
			System.out.println("Enter a Book category : ");
			String category = sc.next();
			
			System.out.println("Enter a Auther Name : ");
			String AuthName = sc.next();
			
			System.out.println("Enter a Rating  : ");
			double rating = sc.nextInt();
			
			System.out.println("Enter a Price : ");
			double Price = sc.nextInt();
			
			
			
		}
		
		
		
		
		
		bookArr[counter++] =new Book(1,"Atomic Habits","James Clear","Self-Help",4.5,200);
		bookArr[counter++] = new Book(2,"physics", "bill section","physics",5,444);
		bookArr[counter++] = new Book(3,"soft skills", "sukrut","skills",4,745);

		
		
	}
	void displayBooks() {
		for(int i=0;i<bookArr.length;i++) {
			bookArr[i].display();
		}
	}
	
class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"Atomic Habits","James Clear","Self-Help",200,4.5);
		b1.display();
		
		Library l1=new Library();
		l1.addBook();
		l1.displayBooks();
	}

}
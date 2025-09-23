import java.util.Scanner;

class Book {
	Book[] brr = new Book[100];
	String bookName, authorName, category;
	int rating, bid, price;

	public Book() {
		super();
		this.bid = 100;
		this.bookName = "math";
		this.rating = 4;
		this.price = 500;
		this.authorName = "seol";
		this.category = "mathematicean";
	}

	Book(String bookName, String authorName, int rating, int bid, int price, String category) {
		super();

		this.bookName = bookName;
		this.authorName = authorName;
		this.rating = rating;
		this.bid = bid;
		this.price = price;
		this.category = category;
	}

	public Book[] getBrr() {
		return brr;
	}

	public void setBrr(Book[] brr) {
		this.brr = brr;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	void display() {
		System.out.println("ID: " + this.bid);
		System.out.println("Name: " + this.bookName);
		System.out.println("Author: " + this.authorName);
		System.out.println("Price: " + this.price);
		System.out.println("Rating: " + this.rating);
		System.out.println("Category: " + this.category);
	}

}

class Liabrary {
	Scanner sc = new Scanner(System.in);

	Book[] bookArr = new Book[2];

	Liabrary() {
		for (int i = 0; i < bookArr.length; i++) {
			System.out.println("Enter book name:");

			String bookName = sc.next();
			System.out.println("Enter auther name:");
			String authorName = sc.next();
			System.out.println("Enter book price :");
			int price = sc.nextInt();
			System.out.println("Enter book id:");
			int bid = sc.nextInt();
			System.out.println("Enter book rating:");
			int rating = sc.nextInt();
			System.out.println("Enter book category:");
			String category = sc.next();

			bookArr[i] = new Book(bookName, authorName, rating, bid, price, category);
		}

	}

	void display() {
		for (int i = 0; i < bookArr.length; i++) {
			bookArr[i].display(); // this line called book class array because bookArr is object of book class and
									// we not "this" for current invoking object
		}
	}

	// search book by name
	boolean searchbookByNamehint(String hint) {
		boolean found = false;

		for (int i = 0; i < bookArr.length; i++) {
			if (bookArr[i] != null && bookArr[i].bookName.toLowerCase().contains(hint.toLowerCase())) {
				System.out.println("The book is "+ bookArr[i].bookName+bookArr[i].bid+bookArr[i].price+ bookArr[i].category+bookArr[i].rating);

				found = true;
			}
		}

		if (!found) {
			System.out.println("No matching book found.");
		}
		return found;
	}// function end here

	boolean searchbookByid() {
		System.out.println("Enter the book id you want to search book");
		int newId = sc.nextInt();

		for (int i = 0; i < bookArr.length; i++) {
			if (bookArr[i].bid == newId) {
				System.out.println("The book is "+ bookArr[i].bookName+bookArr[i].bid+bookArr[i].price+ bookArr[i].category+bookArr[i].rating);

				return true;

			}
		}
		return false;
	}
	
	
	
	boolean deletebookbyname(String newhint){
	boolean deletecount = false;
	
	for (int i = 0; i < bookArr.length; i++){
		if (bookArr[i] != null && bookArr[i].bookName.toLowerCase().contains(newhint.toLowerCase())) {
			System.out.println("The book is "+ bookArr[i].bookName);
			bookArr[i] = bookArr[i++];
			
			deletecount = true;
		}
	}

	if (!deletecount) {
		System.out.println("No matching book found.");
	}
	return deletecount;
}


boolean updateBook() {
	String newName = sc.next();
	String newAuther = sc.next();
	int newPrice = sc.nextInt();
	int newId = sc.nextInt();
	int newRating = sc.nextInt();
	boolean ud = false;
	for(int i = 0; i <bookArr.length; i++) {
		
		if(bookArr[i] != null && bookArr[i].bookName.equals(newName)) {

			bookArr[i].bookName = newName;
			bookArr[i].authorName = newAuther;
			bookArr[i].price = newPrice;
			bookArr[i].bid =newId;
			bookArr[i].rating =newRating;
			
			return ud = true;
		}
	}
	return ud; //  not found  
}

boolean deletebookbyid() {
	
		System.out.println("Enter the book id you want to search book");
		int newId = sc.nextInt();

		for (int i = 0; i < bookArr.length; i++) {
			if (bookArr[i].bid == newId) {
				System.out.println("The book is "+ bookArr[i].bookName);
				bookArr[i] = bookArr[i++];
				return true;

			}
		}
		return false;           // not found 
}
	           

}

class BookTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Book b = new Book();
		b.display();

		Liabrary l = new Liabrary();
		l.display();

		System.out.println("search book here By Name");
		String hint = sc.next();
		boolean found = l.searchbookByNamehint(hint); // capture return
		if (found) {
			System.out.println("✔ Book search successful");
		} else {
			System.out.println("✘ Book not found");
		}

		
		
		boolean searchBid = l.searchbookByid();
		if (!searchBid) {
			System.out.println("Book is not found");
		} else {
			System.out.println("book is found ");
		}

		
		System.out.println("delete book here By Name");
		String newhint = sc.next();
		boolean delete = l.deletebookbyname(newhint);
		if (!delete) {
			System.out.println("Book is not found");
		} else {
			System.out.println("book was deleted successfully ");
		}
	
		boolean deletebid = l.deletebookbyid();
		if(deletebid) {
			System.out.println("book was deleted ");
		}else {
			System.out.println("book is not found");
			
		}
	
	}

}

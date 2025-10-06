import java.util.Scanner;

class Book {
	int size = 100;
	
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
		

		this.bookName = bookName;
		this.authorName = authorName;
		this.rating = rating;
		this.bid = bid;
		this.price = price;
		this.category = category;
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
	
	int size = 5;
	Book[] bookArr = new Book[size];
    int count =5;
    
	Liabrary() {

	  
		int length =0;
		for (int i = 0; i < length; i++) {
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
			count++;
		}


//		   Hardcoded books instead of asking user
	    
	}
	void hardcoded()
	{
		int length = 5;
		for(int i = 0;i<length;i++)
		bookArr[count++] = new Book("Math", "John", 5, 101, 500, "Science");
	    bookArr[count++] = new Book("English", "Mary", 4, 102, 300, "Language");
	    bookArr[count++] = new Book("Math", "John", 5, 101, 500, "Science");
	    bookArr[count++] = new Book("English", "Mary", 4, 102, 300, "Language");
	    bookArr[count++] = new Book("Math", "John", 5, 101, 500, "Science");
	}
	
	void addbook() {
		
		if(count>=size) {
			size = size +5;
			Book[] bookArr2 = new Book[size];
			for(int i=0;i<count;i++) {
				bookArr2[i] = bookArr[i]; 
				
			}
		System.out.println("size reallocated ");
		bookArr = bookArr2;
		}
			
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
		
		bookArr[count] = new Book(bookName, authorName, rating, bid, price, category);
		count++;
	
	}
	void display() {
		 if (count == 0) {
	            System.out.println("No books in library yet.");
	            return;
	        }
		for (int i = 0; i < count; i++) {
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
		
		int newId = sc.nextInt();

		for (int i = 0; i < bookArr.length; i++) {
			if (bookArr[i] != null && bookArr[i].bid == newId) {
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
			bookArr[i] = bookArr[i+1];
			 
			  for (int j = i; j < count - 1; j++) {
	                bookArr[j] = bookArr[j + 1];
	            }
			bookArr[count-1] = null;
			deletecount = true;
			count--;
			break;
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
	
		System.out.println("Enter the book id you want to delete book");
		int newId = sc.nextInt();

		for (int i = 0; i < bookArr.length; i++) {
			if (bookArr[i] != null &&bookArr[i].bid == newId) {
				System.out.println("The book is "+ bookArr[i].bookName);
				bookArr[i] = bookArr[i++];
				return true;

			}
		}
		return false;           // not found 
}

void sortbyprice() {
	 Book temp;

	for(int i=0; i<bookArr.length; i++) {
		for(int j=0; j<count-1; j++) {
			if(bookArr[j] != null&&bookArr[j].price>bookArr[j+1].price) {
				temp = bookArr[j];
				bookArr[j] = bookArr[j + 1];
				bookArr[j + 1] = temp;
			}
		}
		
	}
}          

}

class BookTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Liabrary l = new Liabrary();
		// TODO Auto-generated method stub
		 boolean exit = false;

	        while (!exit) {
	            System.out.println("\n--- Library Menu ---");
	            System.out.println("1. Display all books");
	            System.out.println("2. Add a book");
	            System.out.println("3. Search book by name");
	            System.out.println("4. Search book by ID");
	            System.out.println("5. Delete book by name");
	            System.out.println("6. Delete book by ID");
	            System.out.println("7. Update a book");
	            System.out.println("8. Sort books by price");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    l.display();
	                    break;
	                case 2:
	                    l.addbook();
	                    break;
	                case 3:
	                    System.out.print("Enter book name to search: ");
	                    String nameHint = sc.nextLine();
	                    if (l.searchbookByNamehint(nameHint)) {
	                        System.out.println("✔ Book search successful");
	                    } else {
	                        System.out.println("✘ Book not found");
	                    }
	                    break;
	                case 4:
	                    if (!l.searchbookByid()) {
	                        System.out.println("Book not found by ID");
	                    } else {
	                        System.out.println("Book found by ID");
	                    }
	                    break;
	                case 5:
	                    System.out.print("Enter book name to delete: ");
	                    String deleteName = sc.nextLine();
	                    if (!l.deletebookbyname(deleteName)) {
	                        System.out.println("Book not found to delete");
	                    } else {
	                        System.out.println("Book deleted successfully");
	                    }
	                    break;
	                case 6:
	                    if (!l.deletebookbyid()) {
	                        System.out.println("Book not found to delete by ID");
	                    } else {
	                        System.out.println("Book deleted successfully by ID");
	                    }
	                    break;
	                case 7:
	                    System.out.println("Enter new book details (name, author, price, id, rating, category):");
	                    if (l.updateBook()) {
	                        System.out.println("Book updated successfully");
	                    } else {
	                        System.out.println("Book not found to update");
	                    }
	                    break;
	                case 8:
	                    l.sortbyprice();
	                    System.out.println("Books sorted by price:");
	                    l.display();
	                    break;
	                case 9:
	                    exit = true;
	                    System.out.println("Exiting library menu...");
	                    break;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }

	    }
	}
	
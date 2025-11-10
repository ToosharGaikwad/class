import java.util.Scanner;

class Book {
    String bookName, authorName, category;
    int rating, bid, price;

    // Default constructor
    public Book() {
        this.bid = 100;
        this.bookName = "Math";
        this.rating = 4;
        this.price = 500;
        this.authorName = "Seol";
        this.category = "Mathematician";
    }

    // Parameterized constructor
    Book(String bookName, String authorName, int rating, int bid, int price, String category) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.rating = rating;
        this.bid = bid;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("ID: " + bid);
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Category: " + category);
    }
}

class Library {
    Scanner sc = new Scanner(System.in);
    int size = 5;
    Book[] bookArr = new Book[size];
    int count = 0;

    // Constructor
    Library() {
        hardcoded(); // start with some default books
    }

    // Preload some books
    void hardcoded() {
        bookArr[count++] = new Book("Math", "John", 5, 101, 500, "Science");
        bookArr[count++] = new Book("English", "Mary", 4, 102, 300, "Language");
        bookArr[count++] = new Book("Physics", "Albert", 5, 103, 600, "Science");
        bookArr[count++] = new Book("History", "Emma", 3, 104, 250, "Social");
        bookArr[count++] = new Book("Chemistry", "Liam", 4, 105, 450, "Science");
    }

    // Add a new book
    void addBook() {
        if (count >= size) {
            size += 5;
            Book[] temp = new Book[size];
            for (int i = 0; i < count; i++) {
                temp[i] = bookArr[i];
            }
            bookArr = temp;
            System.out.println("Size reallocated to " + size);
        }

        System.out.println("Enter book name:");
        String bookName = sc.next();

        System.out.println("Enter author name:");
        String authorName = sc.next();

        System.out.println("Enter book price:");
        int price = sc.nextInt();

        System.out.println("Enter book ID:");
        int bid = sc.nextInt();

        System.out.println("Enter book rating:");
        int rating = sc.nextInt();

        System.out.println("Enter book category:");
        String category = sc.next();

        bookArr[count++] = new Book(bookName, authorName, rating, bid, price, category);
        System.out.println("Book added successfully!");
    }

    // Display all books
    void display() {
        if (count == 0) {
            System.out.println("No books in library yet.");
            return;
        }

        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            if (bookArr[i] != null)
                bookArr[i].display();
        }
    }

    // Search by book name
    boolean searchBookByName(String hint) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (bookArr[i] != null && bookArr[i].bookName.equalsIgnoreCase(hint)) {
                bookArr[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found.");
        }

        return found;
    }

    // Search by book ID
    boolean searchBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (bookArr[i] != null && bookArr[i].bid == id) {
                bookArr[i].display();
                return true;
            }
        }
        return false;
    }

    // Delete book by name
    boolean deleteBookByName(String name) {
        for (int i = 0; i < count; i++) {
            if (bookArr[i] != null && bookArr[i].bookName.equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    bookArr[j] = bookArr[j + 1];
                }
                bookArr[--count] = null;
                System.out.println("Book deleted successfully!");
                return true;
            }
        }
        System.out.println("No matching book found.");
        return false;
    }

    // Delete book by ID
    boolean deleteBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (bookArr[i] != null && bookArr[i].bid == id) {
                for (int j = i; j < count - 1; j++) {
                    bookArr[j] = bookArr[j + 1];
                }
                bookArr[--count] = null;
                System.out.println("Book deleted successfully by ID!");
                return true;
            }
        }
        System.out.println("Book not found with that ID.");
        return false;
    }

    // Update book by name
    boolean updateBook() {
        System.out.print("Enter the name of the book to update: ");
        String name = sc.next();

        for (int i = 0; i < count; i++) {
            if (bookArr[i] != null && bookArr[i].bookName.equalsIgnoreCase(name)) {
                System.out.println("Enter new author, price, id, rating, category:");
                String newAuthor = sc.next();
                int newPrice = sc.nextInt();
                int newId = sc.nextInt();
                int newRating = sc.nextInt();
                String newCategory = sc.next();

                bookArr[i].authorName = newAuthor;
                bookArr[i].price = newPrice;
                bookArr[i].bid = newId;
                bookArr[i].rating = newRating;
                bookArr[i].category = newCategory;

                System.out.println("Book updated successfully!");
                return true;
            }
        }
        System.out.println("Book not found to update.");
        return false;
    }

    // Sort books by price
    void sortByPrice() {
        Book temp;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (bookArr[j] != null && bookArr[j + 1] != null &&
                    bookArr[j].price > bookArr[j + 1].price) {
                    temp = bookArr[j];
                    bookArr[j] = bookArr[j + 1];
                    bookArr[j + 1] = temp;
                }
            }
        }
        System.out.println("Books sorted by price successfully!");
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

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

            switch (choice) {
                case 1:
                    lib.display();
                    break;
                case 2:
                    lib.addBook();
                    break;
                case 3:
                    System.out.print("Enter book name to search: ");
                    lib.searchBookByName(sc.next());
                    break;
                case 4:
                    System.out.print("Enter book ID to search: ");
                    if (!lib.searchBookById(sc.nextInt())) {
                        System.out.println("Book not found by ID.");
                    }
                    break;
                case 5:
                    System.out.print("Enter book name to delete: ");
                    lib.deleteBookByName(sc.next());
                    break;
                case 6:
                    System.out.print("Enter book ID to delete: ");
                    lib.deleteBookById(sc.nextInt());
                    break;
                case 7:
                    lib.updateBook();
                    break;
                case 8:
                    lib.sortByPrice();
                    lib.display();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}

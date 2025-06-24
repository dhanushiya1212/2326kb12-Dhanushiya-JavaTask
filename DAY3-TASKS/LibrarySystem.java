package task.corejava;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issue() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isIssued ? " [Issued]" : " [Available]");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    public void removeBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                books.remove(b);
                System.out.println("Book removed: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isIssued) {
                    b.issue();
                    System.out.println("Book issued: " + title);
                } else {
                    System.out.println("Book already issued: " + title);
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nBooks in Library:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. List Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    library.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeTitle = sc.nextLine();
                    library.removeBook(removeTitle);
                    break;

                case 3:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                    library.issueBook(issueTitle);
                    break;

                case 4:
                    library.listBooks();
                    break;

                case 0:
                    System.out.println("Exiting Library System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}




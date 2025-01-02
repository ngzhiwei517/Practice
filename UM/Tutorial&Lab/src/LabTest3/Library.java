package LabTest3;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Cannot add a null book to the library.");
            return;
        }
        books.add(book);
    }

    public void findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("Book with title " + title + ":");
                System.out.println(book);
                return;
            }
        }
        System.out.println("No book found with title:" + title);
    }

    public void findBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                found = true;
                System.out.println("Book by author " + author + ":");
                System.out.println(book);
            }
        }
        if (!found) {
            System.out.println("No book found by " + author);
        }
    }

    public void removeBook(String ISBN) {
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                System.out.println("Book with ISBN " + ISBN + " has been removed.");
                books.remove(i);
                removed = true;
                break; // Exit the loop after removing the book.
            }
        }
        if (!removed) {
            System.out.println("No book found with ISBN " + ISBN + " to remove.");
        }
    }

    public boolean borrowBook(String ISBN) {
        int lastTwoDigit = Integer.parseInt(ISBN) % 100;
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (lastTwoPrimeDigit(lastTwoDigit)) {
                    return false;
                } else {
                    books.remove(book); // Remove the book from the library
                    return true;
                }
            }
        }
        System.out.println("Book with " + ISBN + " not found!");
        return false;
    }

    public void sortBooks() {
        Collections.sort(books, new SortBookByTitle());
        System.out.println("Book in the library sort by title:");
        displayLibrary();
    }

    public void displayLibrary() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private boolean lastTwoPrimeDigit(int digit) {
        int firstDigit = digit / 10;
        int secondDigit = digit % 10;

        // If the first digit is not prime, no need to check the second digit
        if (!isPrime(firstDigit)) {
            return false; // First digit is not prime, return false immediately
        }

        // Check if the second digit is prime
        return isPrime(secondDigit);
    }


    private boolean isPrime(int digit) {
        if (digit <= 1) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(digit); i++) {
                if (digit % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

    class SortBookByTitle implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return (o1.getTitle().compareTo(o2.getTitle()));
        }
    }

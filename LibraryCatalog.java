import java.util.*;

class LibraryCatalog {

    private Set<String> books = new TreeSet<>();

    public void addBook(String title) {
        if (books.add(title)) {
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Duplicate book: " + title);
        }
    }

    public void displaySortedBooks() {
        System.out.println("Books in alphabetical order:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}

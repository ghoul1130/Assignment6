public class Main {
    public static void main(String[] args) {
        // Q1: Student Registration
        System.out.println("\n--- Q1: Student Registration ---");
        StudentRegistration reg = new StudentRegistration();
        reg.addStudent("S1", "Alice");
        reg.addStudent("S2", "Bob");
        reg.addStudent("S3", "Charlie");
        reg.addStudent("S4", "Diana");
        reg.addStudent("S5", "Eve");
        System.out.println("Find S3: " + reg.findStudent("S3"));
        System.out.println("Find S6: " + reg.findStudent("S6"));

        // Q2: Library Book Catalog
        System.out.println("\n--- Q2: Library Catalog ---");
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addBook("Java Programming");
        catalog.addBook("Data Structures");
        catalog.addBook("Algorithms");
        catalog.addBook("Python Basics");
        catalog.addBook("Web Development");
        catalog.displaySortedBooks();

        // Q3: Shopping Cart
        System.out.println("\n--- Q3: Shopping Cart ---");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");
        cart.addItem("Monitor");
        cart.addItem("Headphones");
        cart.addItem("USB Cable");
        cart.displayCart();
        System.out.println("Get item at index 2: " + cart.getItem(2));
        cart.removeItem(3);
        cart.displayCart();

        // Q4: Task Priority Manager
        System.out.println("\n--- Q4: Task Manager ---");
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Fix Bug", 2));
        manager.addTask(new Task("Write Report", 3));
        manager.addTask(new Task("Deploy App", 1));
        manager.addTask(new Task("Code Review", 4));
        manager.addTask(new Task("Update Docs", 5));
        manager.processNextTask();
        manager.processNextTask();

        // Q5: Custom LinkedList
        System.out.println("\n--- Q5: Custom LinkedList ---");
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.display();
        System.out.println("Element at index 2: " + myList.get(2));
        myList.remove(1);
        myList.display();
        System.out.println("Size: " + myList.size());
    }
}
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

---OUTPUT---
--- Q1: Student Registration ---
Added: Alice (ID: S1)
Added: Bob (ID: S2)
Added: Charlie (ID: S3)
Added: Diana (ID: S4)
Added: Eve (ID: S5)
Find S3: Charlie
Find S6: Student not found.

--- Q2: Library Catalog ---
Book added: Java Programming
Book added: Data Structures
Book added: Algorithms
Book added: Python Basics
Book added: Web Development
Books in alphabetical order:
Algorithms
Data Structures
Java Programming
Python Basics
Web Development

--- Q3: Shopping Cart ---
Laptop added to cart.
Mouse added to cart.
Keyboard added to cart.
Monitor added to cart.
Headphones added to cart.
USB Cable added to cart.
Current Cart: [Laptop, Mouse, Keyboard, Monitor, Headphones, USB Cable]
Get item at index 2: Keyboard
Removed: Monitor
Current Cart: [Laptop, Mouse, Keyboard, Headphones, USB Cable]

--- Q4: Task Manager ---
Added Task: Fix Bug (Priority 2)
Added Task: Write Report (Priority 3)
Added Task: Deploy App (Priority 1)
Added Task: Code Review (Priority 4)
Added Task: Update Docs (Priority 5)
Processing Task: Deploy App (Priority 1)
Processing Task: Fix Bug (Priority 2)

--- Q5: Custom LinkedList ---
One -> Two -> Three -> Four -> null
Element at index 2: Three
One -> Three -> Four -> null
Size: 3

import java.util.*;

class ShoppingCart {

    private List<String> cart = new ArrayList<>();

    public void addItem(String item) {
        cart.add(item);
        System.out.println(item + " added to cart.");
    }

    public void removeItem(int index) {
        if (index >= 0 && index < cart.size()) {
            String removed = cart.remove(index);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public String getItem(int index) {
        if (index >= 0 && index < cart.size()) {
            return cart.get(index);
        }
        return "Invalid index.";
    }

    public void displayCart() {
        System.out.println("Current Cart: " + cart);
    }
}


import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Cart> carts; // Composition

    public Customer(String name) {
        this.name = name;
        this.carts = new ArrayList<>();
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cart> getCarts() {
        return carts;
    }
}
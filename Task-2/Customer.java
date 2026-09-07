import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Cart> carts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

    public String getName() { return name; }
    public ArrayList<Cart> getCarts() { return carts; }
}
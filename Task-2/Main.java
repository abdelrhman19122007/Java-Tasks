public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Abdelrahman");
        Cart cart = new Cart();

        cart.addItem(new Item("Gaming Mouse", 45.00));
        cart.addItem(new Item("Mechanical Keyboard", 90.00));
        cart.addItem(new Item("Headset", 65.00));

        customer.addCart(cart);

        System.out.println("Customer Name: " + customer.getName());
        Bill bill = new Bill(cart);
        bill.printBill();
    }
}
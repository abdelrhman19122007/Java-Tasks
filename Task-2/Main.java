

public class Main {
    public static void main(String[] args) {
        // 1. إنشاء زبون وعربة تسوق
        Customer customer = new Customer("Abdelrahman");
        Cart cart = new Cart();

        // 2. إضافة منتجات للعربة
        cart.addItem(new Item("Gaming Mouse", 45.00));
        cart.addItem(new Item("Mechanical Keyboard", 90.00));
        cart.addItem(new Item("Headset", 65.00));

        // 3. ربط العربة بالزبون
        customer.addCart(cart);

        // 4. إصدار الفاتورة وطباعتها
        System.out.println("Customer Name: " + customer.getName());
        Bill bill = new Bill(cart);
        bill.printBill();
    }
}

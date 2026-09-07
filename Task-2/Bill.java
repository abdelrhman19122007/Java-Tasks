public class Bill {
    private Cart cart;

    public Bill(Cart cart) {
        this.cart = cart;
    }

    public void printBill() {
        System.out.println("\n==================================");
        System.out.println("          PURCHASE RECEIPT        ");
        System.out.println("==================================");
        for (Item item : cart.getItems()) {
            System.out.printf("- %-20s : $%.2f\n", item.getName(), item.getPrice());
        }
        System.out.println("----------------------------------");
        System.out.printf("TOTAL AMOUNT TO PAY    : $%.2f\n", cart.calculateTotal());
        System.out.println("==================================");
    }
}
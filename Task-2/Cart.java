

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items; // Composition: كلاس Item مستخدم جوه ArrayList

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    // ميثود لحساب السعر الإجمالي للمنتجات داخل العربة
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
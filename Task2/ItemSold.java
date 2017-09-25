/**
 * Created by jc428209 on 25/09/17.
 */
public class ItemSold {
    int invoiceNumber;
    String description;
    double price;

    ItemSold(int invoiceNumber, String description, double price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }
    void display() {
        System.out.println("Invoice number: " + invoiceNumber);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
    }
}

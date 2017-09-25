/**
 * Created by jc428209 on 25/09/17.
 */
public class PetSold extends ItemSold {
    Boolean vaccinated;
    Boolean neutered;
    Boolean housebroken;
    PetSold(int invoiceNumber, String description, double price, Boolean vaccinated, Boolean neutered, Boolean housebroken) {
        super(invoiceNumber, description, price);
        this.vaccinated = vaccinated;
        this.neutered = neutered;
        this.housebroken = housebroken;

    }
    @Override
    void display() {
        System.out.println("Invoice number: " + invoiceNumber);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Vaccinated: " + vaccinated);
        System.out.println("Neutered: " + neutered);
        System.out.println("Housebroken: " + housebroken);
    }
}

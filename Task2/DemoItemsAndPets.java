/**
 * Created by jc428209 on 25/09/17.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item = new ItemSold(1,"Chocolate",3.50);
        PetSold pet = new PetSold(2,"Cat",150.00, true, true, false);
        item.display();
        System.out.println("-------------------------------");
        pet.display();
    }

}

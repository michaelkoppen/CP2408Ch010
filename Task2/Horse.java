/**
 * Created by jc428209 on 25/09/17.
 */
public class Horse {

    String name;
    String colour;
    int birthYear;
    Horse(String name, String colour, int birthYear) {
        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }

    public void display() {
        System.out.println(name + " the horse is " + colour + " and born in " + birthYear);
    }
}

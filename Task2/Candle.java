/**
 * Created by jc428209 on 25/09/17.
 */
public class Candle {
    String colour;
    double height;
    double price;
    Candle(String colour, double height) {
        this.colour = colour;
        this.height = height;
        this.price = height*2;

    }
    public void display() {
        System.out.println(colour + " candle that stands " + height + " inches tall costs $" + price);
    }
}

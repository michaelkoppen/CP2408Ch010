/**
 * Created by jc428209 on 25/09/17.
 */
public class ScentedCandle extends Candle {
    double price;
    String scent;
    ScentedCandle(String colour, double height, String scent) {
        super(colour, height);
        this.price = height*3;
        this.scent = scent;
    }
    @Override
    public void display() {
        System.out.println(colour + " candle that stands " + height + " inches tall and smells like" + scent + " costs $" + price);
    }

}

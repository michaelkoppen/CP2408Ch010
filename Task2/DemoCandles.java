/**
 * Created by jc428209 on 25/09/17.
 */
public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle("blue", 6);
        ScentedCandle scentedCandle = new ScentedCandle("red", 4, "rose");
        candle.display();
        scentedCandle.display();
    }

}

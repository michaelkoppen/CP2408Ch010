/**
 * Created by jc428209 on 25/09/17.
 */
public class DemoHorses {
    public static void main(String[] args) {
        Horse horse = new Horse("John", "Blue", 2000);
        RaceHorse raceHorse = new RaceHorse("LightnightMcJohnny", "Red", 2006, 25);
        horse.display();
        raceHorse.display();
    }

}

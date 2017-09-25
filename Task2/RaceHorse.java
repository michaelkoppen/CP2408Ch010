/**
 * Created by jc428209 on 25/09/17.
 */
public class RaceHorse extends Horse{
    private int numberRaces;
    RaceHorse(String name, String colour, int birthYear, int numberRaces) {
        super(name, colour, birthYear);
        this.numberRaces = numberRaces;
    }

    @Override
    public void display() {
        System.out.println(name + " the horse is " + colour + " and born in " + birthYear + " and has competed in " + numberRaces + " races.");
    }
}